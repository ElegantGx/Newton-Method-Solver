@echo off 
if not "%1"=="min" start /min cmd /c "%~0" min & exit
cd  /d "%~dp0"

msg * "正在检查java环境"
java -version >nul 2>&1
if %errorlevel% neq 0 (
    msg * "检测到未安装Java环境"
    msg * "请手动安装并配置JDK，或者下载完整版"
    exit
)
msg * "java环境正常"
if exist "com\gx\*.class" (
   del /q com\gx\*.class
)
if exist "*.txt" (
   del /q *.txt 
)
copy "File\*.txt""" 
msg * "正在编译源码"
msg * "Loading......"
timeout /t 5 /nobreak >nul
start run.bat
exit