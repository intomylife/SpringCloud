#!/bin/bash
## $() - 方法，${} - 变量

## 开始
echo [INFO] ----------------------------- start --------------------------------------

## 进入到 Nacos 源码目录
cd config-service/config-master-service/nacos-1.2.1

## 构建
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U

## 进入到打包目录中的启动目录
cd distribution/target/nacos-server-1.2.1/nacos/bin

## 获取当前 Nacos 进程
PID=`ps aux | grep nacos.nacos | grep -v grep | grep -v /bin/bash | awk '{ print $2 }'`

## 为空才能启动
if [ $PID ];
then

    ## 已经启动过了
    echo [INFO] ----------------------------- stop --------------------------------------

else

    ## 单机启动
    sh startup.sh -m standalone

    ## 结束
    echo [INFO] ----------------------------- end --------------------------------------

fi