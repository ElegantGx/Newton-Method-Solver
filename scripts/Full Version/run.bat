@echo off
cd /d "%~dp0"
setlocal enabledelayedexpansion
for /f "tokens=1 delims=:" %%h in ("%time%") do set "hour=%%h"
set "hour=%hour: =%"
if %hour% geq 6 if %hour% lss 22 (
    color f0
)else (
    color 07
)
mode con: cols=70 lines=30

javac -encoding UTF-8 -d . -cp . com\gx\*.java
msg * "编译完成"
msg * "如果你非正常退出，这可能是系统版本差异导致"
msg * "文件请存放于File文件夹内"
start File
java -cp . com.gx.Main
msg * "程序已退出"
exit
