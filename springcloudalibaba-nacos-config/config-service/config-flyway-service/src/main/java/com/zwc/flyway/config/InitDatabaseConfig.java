package com.zwc.flyway.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName InitDatabaseConfig
 * @Desc TODO   自动创建数据库
 * @Date 2020/6/21 8:38 PM
 * @Version 1.0
 */
@Configuration
public class InitDatabaseConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitDatabaseConfig.class);

    /**
     * 读取配置文件中数据库的连接信息
     */
    /**
     * 驱动名称
     */
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    /**
     * 地址
     */
    @Value("${spring.datasource.url}")
    private String url;
    /**
     * 用户名
     */
    @Value("${spring.datasource.username}")
    private String username;
    /**
     * 密码
     */
    @Value("${spring.datasource.password}")
    private String password;


    /*
      * @ClassName InitDatabaseConfig
      * @Desc TODO  创建数据库
      * @Date 2020/6/22 8:58 AM
      * @Version 1.0
     */
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        LOGGER.info("==================================== InitDatabaseConfig -> dataSource -> 开始创建数据库 ====================================");
        // 数据库连接对象
        Connection connection = null;
        Statement statement = null;
        try {

            // 如果尝试去连接不存在的数据库会报错，所以这里连接的时候不带数据库名称
            String connectionUrl = url.replace(("/" + (url.substring(0, url.indexOf("?"))).substring(((url.substring(0, url.indexOf("?"))).lastIndexOf("/")) + 1)), "");
            // 从连接地址中截取出数据库名称
            String databaseName = (url.substring(0, url.indexOf("?"))).substring(((url.substring(0, url.indexOf("?"))).lastIndexOf("/")) + 1);

            // 设置驱动
            Class.forName(driverClassName);
            // 连接数据库
            connection = DriverManager.getConnection(connectionUrl, username, password);
            statement = connection.createStatement();

            // 创建数据库
            statement.executeUpdate("create database if not exists `" + databaseName + "` default character set utf8mb4 COLLATE utf8mb4_general_ci");

        }catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("==================================== InitDatabaseConfig -> dataSource -> 创建数据库出错：" + e.getMessage() + " ====================================");
        }finally {
            try {
                // 关闭连接
                statement.close();
                connection.close();
            }catch (SQLException e) {
                LOGGER.info("==================================== InitDatabaseConfig -> dataSource -> 关闭数据库出错：" + e.getMessage() + " ====================================");
            }
            LOGGER.info("==================================== InitDatabaseConfig -> dataSource -> 创建数据库结束 ====================================");
        }

        // 创建数据源
        DruidDataSource druidDataSource = new DruidDataSource();
        // 设置数据源
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        // 返回数据源
        return druidDataSource;
    }

}
