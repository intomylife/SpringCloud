#!/bin/bash
## $() - 方法，${} - 变量

## 开始
echo [INFO] ----------------------------- start --------------------------------------

## 获取当前 Nacos 进程
PID=`ps aux | grep nacos.nacos | grep -v grep | grep -v /bin/bash | awk '{ print $2 }'`

## 为空才能启动
if [ $PID ];
then

    ## 已经启动过了
    echo [INFO] ----------------------------- stop --------------------------------------

else

    ## 单机启动
    sh config-service/config-master-service/nacos-1.2.1/distribution/target/nacos-server-1.2.1/nacos/bin/startup.sh -m standalone

    ## 结束
    echo [INFO] ----------------------------- end --------------------------------------

fi

