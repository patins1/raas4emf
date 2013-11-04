package au.com.smartservicescrc.raas.codegen.jaxws.jet;

import au.com.smartservicescrc.raas.codegen.jaxws.wizard.*;
import java.util.*;

public class Sun_Jaxws_Generator 
 {
 
  protected static String nl;
  public static synchronized Sun_Jaxws_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    Sun_Jaxws_Generator result = new Sun_Jaxws_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<endpoints version=\"2.0\" xmlns=\"http://java.sun.com/xml/ns/jax-ws/ri/runtime\">";
  protected final String TEXT_2 = NL + "  <endpoint name=\"";
  protected final String TEXT_3 = "\"" + NL + "    implementation=\"";
  protected final String TEXT_4 = "\"" + NL + "    url-pattern=\"/";
  protected final String TEXT_5 = "\" />";
  protected final String TEXT_6 = "\t" + NL + "</endpoints>";
  protected final String TEXT_7 = NL;

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(List<String> implementors, boolean enableLogging)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     for (String implementor: implementors) { 
         String serviceId=implementor.substring(implementor.lastIndexOf(".")+1, implementor.lastIndexOf("Impl")).toLowerCase(); 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(implementor);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(serviceId);
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
