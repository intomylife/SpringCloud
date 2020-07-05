@echo off

REM ## 开始
echo [INFO] ----------------------------- start --------------------------------------

REM ## 获取当前 Nacos 进程
for /f "tokens=1" %%i in ('jps -m ^| find "nacos.nacos"') do set PID=%%i

REM ## 非空判断
if defined PID (

    REM ## 结束
    echo [INFO] -------------------------- stop -------------------------------------

) else (

    REM ## 启动
    config-service\config-master-service\nacos-1.2.1\distribution\target\nacos-server-1.2.1\nacos\bin\startup.cmd

    REM ## 结束
    echo [INFO] ----------------------------- end --------------------------------------

)