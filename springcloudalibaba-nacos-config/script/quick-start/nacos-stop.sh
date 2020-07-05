#!/bin/bash
## $() - 方法，${} - 变量

## 开始
echo [INFO] ----------------------------- start --------------------------------------

## 停止
sh config-service/config-master-service/nacos-1.2.1/distribution/target/nacos-server-1.2.1/nacos/bin/shutdown.sh

## 结束
echo [INFO] ----------------------------- end --------------------------------------