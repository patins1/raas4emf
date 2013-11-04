REM ################################### Kill server processes
start /WAIT /D C:\bim\NOLServer\apache-tomcat\bin\ shutdown.bat
REM ################################### Update NOLServer from subversion repository
svn cleanup c:\bim\NOLServer
REM svn update c:\bim\NOLServer
REM ################################### Remove web applications
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\webapps\org.raas4emf.service
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\webapps\qut.bim.raas
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\webapps\qut.bim.fileserver
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\webapps\raascms
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\work\Catalina\localhost\org.raas4emf.service
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\work\Catalina\localhost\qut.bim.raas
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\work\Catalina\localhost\qut.bim.fileserver
rmdir /S /Q C:\bim\NOLServer\apache-tomcat\work\Catalina\localhost\raascms
REM ################################### Start database server
REM start /D C:\bim\NOLServer\bimserver\ bimserver.exe -debug
REM ################################### Start web server
start /D C:\bim\NOLServer\apache-tomcat\bin\ startup.bat
REM ################################### Finished! But note, don't use the NOL server before the database server prints "Application Started" and the web server prints "Server startup" in their console windows!
timeout /T 30