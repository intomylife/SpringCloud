@echo off

REM ## 开始
echo [INFO] ----------------------------- start --------------------------------------

REM ## 进入到 Nacos 源码目录
cd config-service\config-master-service\nacos-1.2.1

REM ## 构建
call mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U

REM ## 进入到打包目录中的启动目录
cd distribution\target\nacos-server-1.2.1\nacos\bin

REM ## 获取当前 Nacos 进程
for /f "tokens=1" %%i in ('jps -m ^| find "nacos.nacos"') do set PID=%%i

REM ## 非空判断
if defined PID (

    REM ## 结束
    echo [INFO] -------------------------- stop -------------------------------------

) else (

    REM ## 启动
    startup.cmd

    REM ## 结束
    echo [INFO] ----------------------------- end --------------------------------------

)

