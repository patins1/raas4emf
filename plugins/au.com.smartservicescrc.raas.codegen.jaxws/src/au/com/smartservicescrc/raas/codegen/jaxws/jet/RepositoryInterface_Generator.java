package au.com.smartservicescrc.raas.codegen.jaxws.jet;

import au.com.smartservicescrc.raas.codegen.jaxws.wizard.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.util.CodeGenUtil;

public class RepositoryInterface_Generator 
 {
 
  protected static String nl;
  public static synchronized RepositoryInterface_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    RepositoryInterface_Generator result = new RepositoryInterface_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "    " + NL + "package ";
  protected final String TEXT_3 = ";" + NL + " " + NL + "import javax.jws.WebParam;" + NL + "import javax.jws.WebService;";
  protected final String TEXT_4 = NL + "import javax.ws.rs.*;";
  protected final String TEXT_5 = NL + "import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;";
  protected final String TEXT_6 = NL + "import ";
  protected final String TEXT_7 = ".jaxb.";
  protected final String TEXT_8 = "RefAdapter;";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "@Path(\"/";
  protected final String TEXT_12 = "\")";
  protected final String TEXT_13 = NL + "@WebService" + NL + "public interface ";
  protected final String TEXT_14 = " {" + NL + "  ";
  protected final String TEXT_15 = "    ";
  protected final String TEXT_16 = NL + "\t// RepositoryRoot operations for ";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "\t@GET" + NL + "\t@Path(\"/Get";
  protected final String TEXT_19 = "/{id}\")" + NL + "\t@Produces(";
  protected final String TEXT_20 = ")";
  protected final String TEXT_21 = NL + "\t";
  protected final String TEXT_22 = " Get";
  protected final String TEXT_23 = "(@WebParam(name=\"";
  protected final String TEXT_24 = "_ROOTID\") @PathParam(\"id\") @XmlJavaTypeAdapter(";
  protected final String TEXT_25 = "RefAdapter.class) ";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = "_ROOTID) throws Exception;" + NL;
  protected final String TEXT_28 = NL + "\t@PUT" + NL + "\t@Path(\"/Set";
  protected final String TEXT_29 = "/{id}";
  protected final String TEXT_30 = "/{value:[^/]*}";
  protected final String TEXT_31 = "\")" + NL + "\t@Produces(";
  protected final String TEXT_32 = ")" + NL + "\t@Consumes(";
  protected final String TEXT_33 = ")";
  protected final String TEXT_34 = NL + "\tvoid Set";
  protected final String TEXT_35 = "(@WebParam(name=\"";
  protected final String TEXT_36 = "_ROOTID\") @PathParam(\"id\") @XmlJavaTypeAdapter(";
  protected final String TEXT_37 = "RefAdapter.class) ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = "_ROOTID, ";
  protected final String TEXT_40 = "@WebParam(name=\"";
  protected final String TEXT_41 = "_VALUE\") @PathParam(\"value\") ";
  protected final String TEXT_42 = " ";
  protected final String TEXT_43 = "_VALUE";
  protected final String TEXT_44 = "@WebParam(name=\"";
  protected final String TEXT_45 = "_ID\")  @XmlJavaTypeAdapter(";
  protected final String TEXT_46 = "RefAdapter.class) ";
  protected final String TEXT_47 = " ";
  protected final String TEXT_48 = "_ID";
  protected final String TEXT_49 = ") throws Exception;" + NL;
  protected final String TEXT_50 = NL + "\t// CRUD operations for ";
  protected final String TEXT_51 = NL;
  protected final String TEXT_52 = NL + "\t@POST" + NL + "\t@Path(\"/Create";
  protected final String TEXT_53 = "\")" + NL + "\t@Produces(";
  protected final String TEXT_54 = ")" + NL + "\t@Consumes(";
  protected final String TEXT_55 = ")";
  protected final String TEXT_56 = NL + "\t@XmlJavaTypeAdapter(";
  protected final String TEXT_57 = "RefAdapter.class)" + NL + "\t";
  protected final String TEXT_58 = " Create";
  protected final String TEXT_59 = "(@WebParam(name=\"";
  protected final String TEXT_60 = "_VALUE\") ";
  protected final String TEXT_61 = " ";
  protected final String TEXT_62 = "_VALUE) throws Exception;" + NL;
  protected final String TEXT_63 = "\t    " + NL + "\t@Path(\"/Get";
  protected final String TEXT_64 = "/{id}/\")";
  protected final String TEXT_65 = NL + "\t";
  protected final String TEXT_66 = " Get";
  protected final String TEXT_67 = "AndGotoSubresource(@WebParam(name=\"";
  protected final String TEXT_68 = "_ID\") @PathParam(\"id\") @XmlJavaTypeAdapter(";
  protected final String TEXT_69 = "RefAdapter.class) ";
  protected final String TEXT_70 = " ";
  protected final String TEXT_71 = "_ID) throws Exception;" + NL + "    ";
  protected final String TEXT_72 = NL + "\t@GET" + NL + "\t@Path(\"/Get";
  protected final String TEXT_73 = "/{id}\")" + NL + "\t@Produces(";
  protected final String TEXT_74 = ")";
  protected final String TEXT_75 = NL + "\t";
  protected final String TEXT_76 = " Get";
  protected final String TEXT_77 = "(@WebParam(name=\"";
  protected final String TEXT_78 = "_ID\") @PathParam(\"id\") @XmlJavaTypeAdapter(";
  protected final String TEXT_79 = "RefAdapter.class) ";
  protected final String TEXT_80 = " ";
  protected final String TEXT_81 = "_ID) throws Exception;" + NL;
  protected final String TEXT_82 = NL + "\t@PUT" + NL + "\t@Path(\"/Update";
  protected final String TEXT_83 = "/{id}\")" + NL + "\t@Consumes(";
  protected final String TEXT_84 = ")";
  protected final String TEXT_85 = NL + "\tvoid Update";
  protected final String TEXT_86 = "(@WebParam(name=\"";
  protected final String TEXT_87 = "_ID\") @PathParam(\"id\") @XmlJavaTypeAdapter(";
  protected final String TEXT_88 = "RefAdapter.class) ";
  protected final String TEXT_89 = " ";
  protected final String TEXT_90 = "_ID, @WebParam(name=\"";
  protected final String TEXT_91 = "_VALUE\") ";
  protected final String TEXT_92 = " ";
  protected final String TEXT_93 = "_VALUE) throws Exception;" + NL;
  protected final String TEXT_94 = NL + "\t@DELETE" + NL + "\t@Path(\"/Delete";
  protected final String TEXT_95 = "/{id}\")";
  protected final String TEXT_96 = NL + "\tvoid Delete";
  protected final String TEXT_97 = "(@WebParam(name=\"";
  protected final String TEXT_98 = "_ID\") @PathParam(\"id\") @XmlJavaTypeAdapter(";
  protected final String TEXT_99 = "RefAdapter.class) ";
  protected final String TEXT_100 = " ";
  protected final String TEXT_101 = "_ID) throws Exception;" + NL;
  protected final String TEXT_102 = NL + "\t@GET" + NL + "\t@Path(\"/GetAll";
  protected final String TEXT_103 = "\")" + NL + "\t@Produces(";
  protected final String TEXT_104 = ")";
  protected final String TEXT_105 = NL + "\tList<";
  protected final String TEXT_106 = "> GetAll";
  protected final String TEXT_107 = "() throws Exception;" + NL + "\t";
  protected final String TEXT_108 = NL + "    ";
  protected final String TEXT_109 = NL + "\t@GET" + NL + "\t@Path(\"/Query/{queryString}\")" + NL + "\t@Produces(";
  protected final String TEXT_110 = ")";
  protected final String TEXT_111 = NL + "\tList<?> Query(@WebParam(name=\"QueryString\") @PathParam(\"queryString\") String queryString) throws Exception;" + NL + "\t" + NL + "}";

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(Collection<GenClass> genRepositoryRoots, Collection<GenClass> genTopClasses, String targetPackage, String serviceName, String itfPackage)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     GenModel genModel = genRepositoryRoots.iterator().next().getGenModel(); 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(targetPackage);
    stringBuffer.append(TEXT_3);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
     for (GenClass genTopClass: genTopClasses) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genTopClass.getGenPackage().getQualifiedPackageName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genTopClass.getName());
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_10);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_11);
    stringBuffer.append(serviceName.substring(0,"Repository".length()));
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(serviceName);
    stringBuffer.append(TEXT_14);
     for (GenClass genRepositoryRoot: genRepositoryRoots) { 
    stringBuffer.append(TEXT_15);
     String repositoryRootName = genRepositoryRoot.getImportedInterfaceName(); 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_17);
     for (GenFeature genFeature: genRepositoryRoot.getAllGenFeatures()) { 
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_27);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_29);
     if (!(genFeature.getEcoreFeature().getEType() instanceof EClass)) { 
    stringBuffer.append(TEXT_30);
     } 
    stringBuffer.append(TEXT_31);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_33);
     } 
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_39);
     if (!(genFeature.getEcoreFeature().getEType() instanceof EClass)) { 
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getRawListItemType());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getRawListItemType());
    stringBuffer.append(TEXT_43);
     } 
     if (genFeature.getEcoreFeature().getEType() instanceof EClass) { 
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genFeature.getRawListItemType());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getRawListItemType());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getRawListItemType());
    stringBuffer.append(TEXT_48);
     } 
    stringBuffer.append(TEXT_49);
     } 
     } 
     for (GenClass genTopClass: genTopClasses) { 
         String topClassName=genTopClass.getImportedInterfaceName(); 
    stringBuffer.append(TEXT_50);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_51);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_52);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_55);
     } 
    stringBuffer.append(TEXT_56);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_61);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_62);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_63);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_64);
     } 
    stringBuffer.append(TEXT_65);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_71);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_72);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_74);
     } 
    stringBuffer.append(TEXT_75);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_81);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_82);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_84);
     } 
    stringBuffer.append(TEXT_85);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_93);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_94);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_95);
     } 
    stringBuffer.append(TEXT_96);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_101);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_102);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_103);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_104);
     } 
    stringBuffer.append(TEXT_105);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_107);
     } 
    stringBuffer.append(TEXT_108);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_109);
    stringBuffer.append(GenerateJAXWS.mimeTypes);
    stringBuffer.append(TEXT_110);
     } 
    stringBuffer.append(TEXT_111);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
