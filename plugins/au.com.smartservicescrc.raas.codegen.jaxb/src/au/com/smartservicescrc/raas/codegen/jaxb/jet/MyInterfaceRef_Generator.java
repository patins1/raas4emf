
package au.com.smartservicescrc.raas.codegen.jaxb.jet;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

import org.eclipse.emf.ecore.EAttribute;
import au.com.smartservicescrc.raas.codegen.jaxb.util.MetamodelUtil;

public class MyInterfaceRef_Generator 
 {
 
  protected static String nl;
  public static synchronized MyInterfaceRef_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    MyInterfaceRef_Generator result = new MyInterfaceRef_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".jaxb;" + NL + "" + NL + "import javax.xml.bind.annotation.*;" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "@XmlRootElement(name = \"";
  protected final String TEXT_6 = "RefElement\")";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = "abstract ";
  protected final String TEXT_9 = "public class ";
  protected final String TEXT_10 = "Ref";
  protected final String TEXT_11 = " extends ";
  protected final String TEXT_12 = " ";
  protected final String TEXT_13 = " extends ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = " implements EObjectRef";
  protected final String TEXT_16 = " {" + NL + "" + NL + "\t";
  protected final String TEXT_17 = NL + "\tprivate String id;" + NL + "" + NL + "\t@XmlValue" + NL + "\t@Override" + NL + "\tpublic String getID() {" + NL + "\t\treturn id;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void setID(String id) {" + NL + "\t\tthis.id = id;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_18 = NL + NL + "\t";
  protected final String TEXT_19 = NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_20 = " createInstance() {" + NL + "\t\treturn ";
  protected final String TEXT_21 = ".create";
  protected final String TEXT_22 = "();" + NL + "\t}" + NL + "\t" + NL + "\tpublic static ";
  protected final String TEXT_23 = "Ref valueOf(String id) {" + NL + "\t\t";
  protected final String TEXT_24 = "Ref result = new ";
  protected final String TEXT_25 = "Ref();" + NL + "\t\tresult.setID(id);" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic String toString() {" + NL + "\t\treturn getID();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_26 = NL + NL + "}";

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(GenClass genClass, String jaxbUtilPackage)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genClass.getGenPackage().getQualifiedPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(jaxbUtilPackage);
    stringBuffer.append(TEXT_3);
    genClass.getGenModel().markImportLocation(stringBuffer, genClass.getGenPackage());
    stringBuffer.append(TEXT_4);
     EAttribute idAttribute = genClass.getEcoreClass().getEIDAttribute(); 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_6);
     boolean definesID = idAttribute!=null && idAttribute.getEContainingClass()==genClass.getEcoreClass(); 
    stringBuffer.append(TEXT_7);
     if (genClass.isAbstract()) { 
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_10);
     if (genClass.getBaseGenClass()==null) { 
    stringBuffer.append(TEXT_11);
    stringBuffer.append(MetamodelUtil.getRefClass(genClass.getGenModel().getRootExtendsInterface()));
    stringBuffer.append(TEXT_12);
     } else if (genClass.getBaseGenClass()!=null && !genClass.getBaseGenClass().isEObject()) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(MetamodelUtil.getRefClass(genClass.getBaseGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_14);
     } else { 
    stringBuffer.append(TEXT_15);
     } 
    stringBuffer.append(TEXT_16);
     if (definesID) { 
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
     if (!genClass.isAbstract()) { 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genClass.getGenPackage().getQualifiedFactoryInstanceAccessor());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
    genClass.getGenModel().emitSortedImports();
    return stringBuffer.toString();
  }
}
