#!/bin/bash
## $() - 方法，${} - 变量

## 开始
echo [INFO] ----------------------------- start --------------------------------------

## 当前 Nacos 进程有哪些
PID=`ps aux | grep nacos | grep -v grep | grep -v /bin/bash | awk '{ print $2 }'`

## 为空才能启动
if [ $PID ];
then

    ## 已经启动过了
    echo [INFO] ----------------------------- stop --------------------------------------

else

    ## 进入 bin 目录
    cd /Users/zouwencong/Tools/nacos-1.2.1/bin/

    ## 启动
    sh startup.sh -m standalone

    ## 结束
    echo [INFO] ----------------------------- end --------------------------------------

fi

