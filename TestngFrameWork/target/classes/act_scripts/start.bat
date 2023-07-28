@echo off
setlocal & pushd
set APP_ENTRY=Project.AppEntry
set BASE=%~dp0
set CP=%BASE%\classes;%BASE%\lib\*
title Running TestngFrameWork-0.0.1-SNAPSHOT powered by actframework-1.9.2
javaw -server -Xms128M -Xmx1G -XX:MaxPermSize=128M  -Dapp.mode=prod -Dprofile=%PROFILE% -cp "%CP%" %APP_ENTRY%
endlocal & popd
