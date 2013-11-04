sudo chmod +x /bim/NOLServer/apache-tomcat/bin/*.sh
sudo chmod +x /bim/NOLServer/blender/blender
#sudo /bim/NOLServer/apache-tomcat/bin/shutdown.sh
pgrep java | xargs kill -9
pgrep blender | xargs kill -9
sudo rm -r /bim/NOLServer/apache-tomcat/webapps/org.raas4emf.service
sudo rm -r /bim/NOLServer/apache-tomcat/webapps/qut.bim.raas
sudo rm -r /bim/NOLServer/apache-tomcat/webapps/qut.bim.ui
sudo rm -r /bim/NOLServer/apache-tomcat/webapps/qut.bim.fileserver
sudo rm -r /bim/NOLServer/apache-tomcat/webapps/raascms
sudo rm -r /bim/NOLServer/apache-tomcat/work/Catalina/localhost/org.raas4emf.service
sudo rm -r /bim/NOLServer/apache-tomcat/work/Catalina/localhost/qut.bim.raas
sudo rm -r /bim/NOLServer/apache-tomcat/work/Catalina/localhost/qut.bim.ui
sudo rm -r /bim/NOLServer/apache-tomcat/work/Catalina/localhost/qut.bim.fileserver
sudo rm -r /bim/NOLServer/apache-tomcat/work/Catalina/localhost/raascms
sudo /bim/NOLServer/apache-tomcat/bin/startup.sh