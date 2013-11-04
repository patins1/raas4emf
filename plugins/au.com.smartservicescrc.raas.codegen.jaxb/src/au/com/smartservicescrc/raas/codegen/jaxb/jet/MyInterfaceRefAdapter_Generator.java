
package au.com.smartservicescrc.raas.codegen.jaxb.jet;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

public class MyInterfaceRefAdapter_Generator 
 {
 
  protected static String nl;
  public static synchronized MyInterfaceRefAdapter_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    MyInterfaceRefAdapter_Generator result = new MyInterfaceRefAdapter_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".jaxb;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".EObjectRefAdapter;";
  protected final String TEXT_4 = NL + NL + "public class ";
  protected final String TEXT_5 = "RefAdapter extends EObjectRefAdapter<";
  protected final String TEXT_6 = "Ref,";
  protected final String TEXT_7 = "> {" + NL + "}";

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
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_7);
    genClass.getGenModel().emitSortedImports();
    return stringBuffer.toString();
  }
}
