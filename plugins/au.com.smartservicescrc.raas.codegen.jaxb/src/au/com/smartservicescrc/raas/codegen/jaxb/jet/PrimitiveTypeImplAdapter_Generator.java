
package au.com.smartservicescrc.raas.codegen.jaxb.jet;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;


public class PrimitiveTypeImplAdapter_Generator 
 {
 
  protected static String nl;
  public static synchronized PrimitiveTypeImplAdapter_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    PrimitiveTypeImplAdapter_Generator result = new PrimitiveTypeImplAdapter_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".jaxb;" + NL;
  protected final String TEXT_3 = NL + NL + "import javax.xml.bind.annotation.adapters.XmlAdapter;";
  protected final String TEXT_4 = NL + "\t";
  protected final String TEXT_5 = NL + "import ";
  protected final String TEXT_6 = ";" + NL + "\t";
  protected final String TEXT_7 = NL + "\t";
  protected final String TEXT_8 = NL + "\t";
  protected final String TEXT_9 = NL + "\t";
  protected final String TEXT_10 = NL + NL + "public class ";
  protected final String TEXT_11 = "ImplAdapter extends XmlAdapter<";
  protected final String TEXT_12 = ", ";
  protected final String TEXT_13 = "> {" + NL + "" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_14 = " unmarshal(";
  protected final String TEXT_15 = " v) throws Exception {" + NL + "\t\t";
  protected final String TEXT_16 = " result = ";
  protected final String TEXT_17 = ".create";
  protected final String TEXT_18 = "();" + NL + "\t\tresult.setValue(";
  protected final String TEXT_19 = ".get(v)";
  protected final String TEXT_20 = "v";
  protected final String TEXT_21 = ");" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_22 = " marshal(";
  protected final String TEXT_23 = " v) throws Exception {" + NL + "\t\treturn v.";
  protected final String TEXT_24 = "()";
  protected final String TEXT_25 = ".getLiteral()";
  protected final String TEXT_26 = ";" + NL + "\t}" + NL + "" + NL + "}" + NL;

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(GenClass genClass, String jaxbUtilPackage)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genClass.getGenPackage().getQualifiedPackageName());
    stringBuffer.append(TEXT_2);
    genClass.getGenModel().markImportLocation(stringBuffer, genClass.getGenPackage());
    stringBuffer.append(TEXT_3);
     GenFeature f = genClass.getGenFeatures().get(0); 
     String _type = f.getType(); 
    stringBuffer.append(TEXT_4);
     if (_type.contains(".")) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(_type);
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
     String BoxedType = _type.contains(".") || _type.contains("[]") ? _type.substring(_type.lastIndexOf(".")+1) : "int".equals(_type) ? "Integer" : _type.substring(0,1).toUpperCase()+_type.substring(1); 
    stringBuffer.append(TEXT_8);
     GenClassifier t = f.getTypeGenClassifier(); 
    stringBuffer.append(TEXT_9);
     String ValueType = t instanceof GenEnum ? "String" : BoxedType; 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(ValueType);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ValueType);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genClass.getGenPackage().getQualifiedFactoryInstanceAccessor());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_18);
     if (t instanceof GenEnum) {
    stringBuffer.append(BoxedType);
    stringBuffer.append(TEXT_19);
     } else { 
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ValueType);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genClass.getGenFeatures().get(0).getGetAccessor());
    stringBuffer.append(TEXT_24);
     if (t instanceof GenEnum) {
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
    genClass.getGenModel().emitSortedImports();
    return stringBuffer.toString();
  }
}
