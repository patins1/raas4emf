package au.com.smartservicescrc.raas.codegen.jaxws.jet;

import au.com.smartservicescrc.raas.codegen.jaxws.wizard.*;
import java.util.*;

public class CXF_Servlet_Generator 
 {
 
  protected static String nl;
  public static synchronized CXF_Servlet_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    CXF_Servlet_Generator result = new CXF_Servlet_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<beans xmlns=\"http://www.springframework.org/schema/beans\"" + NL + "\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:jaxrs=\"http://cxf.apache.org/jaxrs\" xmlns:jaxws=\"http://cxf.apache.org/jaxws\"" + NL + "\txmlns:soap=\"http://cxf.apache.org/bindings/soap\"" + NL + "\txsi:schemaLocation=\"" + NL + "\thttp://www.springframework.org/schema/beans " + NL + "\thttp://www.springframework.org/schema/beans/spring-beans-2.5.xsd " + NL + "\thttp://cxf.apache.org/bindings/soap " + NL + "\thttp://cxf.apache.org/schemas/configuration/soap.xsd " + NL + "\thttp://cxf.apache.org/core" + NL + "    http://cxf.apache.org/schemas/core.xsd" + NL + "\thttp://cxf.apache.org/jaxrs " + NL + "\thttp://cxf.apache.org/schemas/jaxrs.xsd" + NL + "\thttp://cxf.apache.org/jaxws " + NL + "\thttp://cxf.apache.org/schemas/jaxws.xsd\">" + NL;
  protected final String TEXT_2 = NL + "    <!-- Load CXF modules from cxf.jar -->" + NL + "    <import resource=\"classpath:META-INF/cxf/cxf.xml\"/>" + NL + "    <import resource=\"classpath:META-INF/cxf/cxf-extension-soap.xml\"/>" + NL + "    <import resource=\"classpath:META-INF/cxf/cxf-servlet.xml\"/>" + NL + "" + NL + "    <bean id=\"jaxbBean\"" + NL + "          class=\"org.apache.cxf.jaxb.JAXBDataBinding\"" + NL + "          scope=\"prototype\"/>" + NL + "" + NL + "    <bean id=\"jaxws-and-aegis-service-factory\"" + NL + "          class=\"org.apache.cxf.jaxws.support.JaxWsServiceFactoryBean\"" + NL + "          scope=\"prototype\">" + NL + "        <property name=\"dataBinding\" ref=\"jaxbBean\"/>" + NL + "        <property name=\"serviceConfigurations\">" + NL + "            <list>" + NL + "                <bean class=\"org.apache.cxf.jaxws.support.JaxWsServiceConfiguration\"/>" + NL + "                <bean class=\"org.apache.cxf.aegis.databinding.AegisServiceConfiguration\"/>" + NL + "                <bean class=\"org.apache.cxf.service.factory.DefaultServiceConfiguration\"/>" + NL + "            </list>" + NL + "        </property>" + NL + "    </bean>" + NL + "" + NL + " \t<jaxrs:server id=\"RestServer\" address=\"/\">" + NL + "\t\t<jaxrs:serviceBeans>";
  protected final String TEXT_3 = NL + "            <!-- Exposing the ";
  protected final String TEXT_4 = " service as a rest service -->" + NL + " \t\t\t<ref bean=\"";
  protected final String TEXT_5 = "Bean\" />" + NL + " \t";
  protected final String TEXT_6 = " \t\t\t" + NL + "\t\t</jaxrs:serviceBeans>" + NL + "\t</jaxrs:server>" + NL + "\t";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + NL + "    <!-- The ";
  protected final String TEXT_9 = " service -->" + NL + "\t<bean id=\"";
  protected final String TEXT_10 = "Bean\" class=\"";
  protected final String TEXT_11 = "\" autowire=\"autodetect\" />" + NL + "\t" + NL + "    <!-- Exposing the ";
  protected final String TEXT_12 = " service as a SOAP service -->" + NL + "\t<jaxws:endpoint id=\"";
  protected final String TEXT_13 = "\"" + NL + "\t\timplementor=\"#";
  protected final String TEXT_14 = "Bean\"" + NL + "\t\taddress=\"/";
  protected final String TEXT_15 = "\">";
  protected final String TEXT_16 = NL + "        <jaxws:serviceFactory>" + NL + "            <ref bean=\"jaxws-and-aegis-service-factory\"/>" + NL + "        </jaxws:serviceFactory>\t\t";
  protected final String TEXT_17 = "\t\t" + NL + "\t\t<jaxws:features>" + NL + "\t\t\t<bean class=\"org.apache.cxf.feature.LoggingFeature\" />" + NL + "\t\t</jaxws:features>";
  protected final String TEXT_18 = "\t" + NL + "\t</jaxws:endpoint>" + NL + "\t";
  protected final String TEXT_19 = "\t" + NL + "</beans>";
  protected final String TEXT_20 = NL;

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(List<String> implementors, boolean enableLogging)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_2);
     for (String implementor: implementors) { 
         String serviceIdOriginalCase=implementor.substring(implementor.lastIndexOf(".")+1, implementor.lastIndexOf("Impl")); 
         String serviceId=implementor.substring(implementor.lastIndexOf(".")+1, implementor.lastIndexOf("Impl")).toLowerCase(); 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
     for (String implementor: implementors) { 
         String serviceIdOriginalCase=implementor.substring(implementor.lastIndexOf(".")+1, implementor.lastIndexOf("Impl")); 
         String serviceId=implementor.substring(implementor.lastIndexOf(".")+1, implementor.lastIndexOf("Impl")).toLowerCase(); 
    stringBuffer.append(TEXT_8);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(implementor);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_15);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_16);
     } 
     if (enableLogging) { 
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
     } 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    return stringBuffer.toString();
  }
}
