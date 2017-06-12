REM ################################### Kill server processes
start /WAIT /D .\apache-tomcat\bin\ shutdown.bat
REM ################################### Update NOLServer from subversion repository
svn cleanup c:\bim\NOLServer
REM svn update c:\bim\NOLServer
REM ################################### Remove web applications
rmdir /S /Q .\apache-tomcat\webapps\org.raas4emf.service
rmdir /S /Q .\apache-tomcat\webapps\qut.bim.raas
rmdir /S /Q .\apache-tomcat\webapps\qut.bim.fileserver
rmdir /S /Q .\apache-tomcat\webapps\raascms
rmdir /S /Q .\apache-tomcat\work\Catalina\localhost\org.raas4emf.service
rmdir /S /Q .\apache-tomcat\work\Catalina\localhost\qut.bim.raas
rmdir /S /Q .\apache-tomcat\work\Catalina\localhost\qut.bim.fileserver
rmdir /S /Q .\apache-tomcat\work\Catalina\localhost\raascms
REM ################################### Start database server
REM start /D .\bimserver\ bimserver.exe -debug
REM ################################### Start web server
start /D .\apache-tomcat\bin\ startup.bat
REM ################################### Finished! But note, don't use the NOL server before the database server prints "Application Started" and the web server prints "Server startup" in their console windows!
timeout /T 30