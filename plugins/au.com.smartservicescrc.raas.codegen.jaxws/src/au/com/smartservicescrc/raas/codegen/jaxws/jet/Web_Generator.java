package au.com.smartservicescrc.raas.codegen.jaxws.jet;

import au.com.smartservicescrc.raas.codegen.jaxws.wizard.*;
import java.util.*;

public class Web_Generator 
 {
 
  protected static String nl;
  public static synchronized Web_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    Web_Generator result = new Web_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"ASCII\"?>" + NL + "<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\" version=\"3.0\">" + NL + "  <display-name>";
  protected final String TEXT_2 = "</display-name>" + NL + "  <welcome-file-list>" + NL + "    <welcome-file>index.html</welcome-file>" + NL + "    <welcome-file>index.htm</welcome-file>" + NL + "    <welcome-file>index.jsp</welcome-file>" + NL + "    <welcome-file>default.html</welcome-file>" + NL + "    <welcome-file>default.htm</welcome-file>" + NL + "    <welcome-file>default.jsp</welcome-file>" + NL + "  </welcome-file-list>";
  protected final String TEXT_3 = NL + "  <context-param>" + NL + "    <param-name>contextConfigLocation</param-name>" + NL + "    <param-value>WEB-INF/cxf-servlet.xml</param-value>" + NL + "  </context-param>" + NL + "  <listener>" + NL + "    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>" + NL + "  </listener>";
  protected final String TEXT_4 = NL + "  <servlet>" + NL + "    <description>Apache CXF Endpoint</description>" + NL + "    <display-name>cxf</display-name>" + NL + "    <servlet-name>cxf</servlet-name>" + NL + "    <servlet-class>org.apache.cxf.transport.servlet.CXFServlet</servlet-class>" + NL + "    <load-on-startup>1</load-on-startup>" + NL + "  </servlet>" + NL + "  <servlet-mapping>" + NL + "    <servlet-name>cxf</servlet-name>" + NL + "    <url-pattern>/services/*</url-pattern>" + NL + "  </servlet-mapping>" + NL + "  <session-config>" + NL + "    <session-timeout>60</session-timeout>" + NL + "  </session-config>";
  protected final String TEXT_5 = " " + NL + "  <listener>" + NL + "    <listener-class>com.sun.xml.ws.transport.http.servlet.WSServletContextListener</listener-class>" + NL + "  </listener>" + NL + "  <servlet>" + NL + "    <servlet-name>JaxWsServlet</servlet-name>" + NL + "    <servlet-class>com.sun.xml.ws.transport.http.servlet.WSServlet</servlet-class>" + NL + "    <load-on-startup>1</load-on-startup>" + NL + "  </servlet>" + NL + "  <servlet-mapping>" + NL + "    <servlet-name>JaxWsServlet</servlet-name>" + NL + "    <url-pattern>/</url-pattern>" + NL + "  </servlet-mapping>";
  protected final String TEXT_6 = NL + "</web-app>";

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(String displayName, boolean useCXF)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(displayName);
    stringBuffer.append(TEXT_2);
     if (useCXF) { 
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_3);
     } 
    stringBuffer.append(TEXT_4);
     } else { 
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
