@echo off

REM ## 开始
echo [INFO] ----------------------------- start --------------------------------------

REM ## 停止
discovery-service\discovery-master-service\nacos-1.2.1\distribution\target\nacos-server-1.2.1\nacos\bin\shutdown.cmd

REM ## 结束
echo [INFO] ----------------------------- end --------------------------------------