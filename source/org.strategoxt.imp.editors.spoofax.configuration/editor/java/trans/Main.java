package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class Main  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const17893;

  protected static IStrategoTerm const17892;

  protected static IStrategoTerm const17891;

  protected static IStrategoTerm const17890;

  protected static IStrategoTerm const17889;

  protected static IStrategoTerm const17888;

  protected static IStrategoTerm const17887;

  protected static IStrategoTerm const17886;

  protected static IStrategoTerm constCons8531;

  protected static IStrategoTerm constMARKER0;

  protected static IStrategoTerm const17885;

  protected static IStrategoTerm const17884;

  protected static IStrategoTerm constCons8530;

  protected static IStrategoTerm const17883;

  protected static IStrategoTerm const17882;

  protected static IStrategoTerm const17881;

  protected static IStrategoTerm const17880;

  protected static IStrategoTerm constCons8529;

  protected static IStrategoTerm const17879;

  protected static IStrategoTerm const17878;

  protected static IStrategoTerm const17877;

  protected static IStrategoTerm const17876;

  protected static IStrategoTerm const17875;

  protected static IStrategoTerm const17874;

  protected static IStrategoTerm const17873;

  protected static IStrategoTerm const17872;

  protected static IStrategoTerm const17871;

  public static IStrategoTerm getSpoofaxConfigurationPpAf()
  { 
    return constSpoofaxConfigurationPpAf;
  }

  protected static ImportTerm constSpoofaxConfigurationPpAf;

  public static IStrategoTerm getSpoofaxConfigurationGeneratedPpAf()
  { 
    return constSpoofaxConfigurationGeneratedPpAf;
  }

  protected static ImportTerm constSpoofaxConfigurationGeneratedPpAf;

  public static IStrategoTerm getSpoofaxConfigurationTbl1()
  { 
    return constSpoofaxConfigurationTbl1;
  }

  protected static ImportTerm constSpoofaxConfigurationTbl1;

  public static IStrategoTerm getSpoofaxConfigurationTbl0()
  { 
    return constSpoofaxConfigurationTbl0;
  }

  protected static ImportTerm constSpoofaxConfigurationTbl0;

  public static IStrategoTerm getSpoofaxConfigurationTbl()
  { 
    return constSpoofaxConfigurationTbl;
  }

  protected static ImportTerm constSpoofaxConfigurationTbl;

  protected static IStrategoTerm const17870;

  protected static IStrategoTerm constCons8528;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const17869;

  protected static IStrategoTerm const17868;

  protected static IStrategoTerm const17867;

  protected static IStrategoTerm constCons8527;

  protected static IStrategoTerm const17866;

  protected static IStrategoTerm const17865;

  protected static IStrategoTerm const17864;

  protected static IStrategoTerm const17863;

  protected static IStrategoTerm const17862;

  protected static IStrategoTerm const17861;

  protected static IStrategoTerm constCons8526;

  protected static IStrategoTerm const17860;

  protected static IStrategoTerm const17859;

  protected static IStrategoTerm const17858;

  protected static IStrategoTerm const17857;

  protected static IStrategoTerm const17856;

  protected static IStrategoTerm const17855;

  protected static IStrategoTerm const17854;

  protected static IStrategoTerm const17853;

  protected static IStrategoTerm const17852;

  protected static IStrategoTerm constCons8525;

  protected static IStrategoTerm const17851;

  protected static IStrategoTerm const17850;

  protected static IStrategoTerm const17849;

  protected static IStrategoTerm const17848;

  protected static IStrategoTerm const17847;

  protected static IStrategoTerm const17846;

  protected static IStrategoTerm constNil14;

  protected static IStrategoTerm const17845;

  protected static IStrategoTerm const17844;

  protected static IStrategoTerm const17843;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consConfiguration_1;

  public static IStrategoConstructor _consIncludes_1;

  public static IStrategoConstructor _consSpxProjects_1;

  public static IStrategoConstructor _consDebug_1;

  public static IStrategoConstructor _consTemplateLang_1;

  public static IStrategoConstructor _consCodeGeneration_1;

  public static IStrategoConstructor _consSource_2;

  public static IStrategoConstructor _consTemplatelangEnabled_0;

  public static IStrategoConstructor _consTemplatelangDisabled_0;

  public static IStrategoConstructor _consDebugCompiler_0;

  public static IStrategoConstructor _consDebugDeclaration_0;

  public static IStrategoConstructor _consDebugAnalysis_0;

  public static IStrategoConstructor _consDebugSymbolTable_0;

  public static IStrategoConstructor _consDebugAll_0;

  public static IStrategoConstructor _consDebugNone_0;

  public static IStrategoConstructor _consOutputDirectory_1;

  public static IStrategoConstructor _consSTROutputMode_1;

  public static IStrategoConstructor _consCTree_0;

  public static IStrategoConstructor _consJar_0;

  public static IStrategoConstructor _consAll_0;

  public static IStrategoConstructor _consThisOnly_0;

  public static IStrategoConstructor _consType_1;

  public static IStrategoConstructor _consProperty_2;

  public static IStrategoConstructor _consEntity_2;

  public static IStrategoConstructor _consModule_2;

  public static IStrategoConstructor _consMARKER_0;

  public static IStrategoConstructor _consNOCONTEXT_1;

  public static IStrategoConstructor _consCOMPLETION_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static Context init(Context context)
  { 
    synchronized(Main.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_xtc.Main.init(context);
          org.strategoxt.stratego_aterm.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          org.strategoxt.imp.editors.spoofax.configuration.strategies.Main.init(context);
          context.registerComponent("trans");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static Strategy getMainStrategy()
  { 
    return null;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consConfiguration_1 = termFactory.makeConstructor("Configuration", 1);
    _consIncludes_1 = termFactory.makeConstructor("Includes", 1);
    _consSpxProjects_1 = termFactory.makeConstructor("SpxProjects", 1);
    _consDebug_1 = termFactory.makeConstructor("Debug", 1);
    _consTemplateLang_1 = termFactory.makeConstructor("TemplateLang", 1);
    _consCodeGeneration_1 = termFactory.makeConstructor("CodeGeneration", 1);
    _consSource_2 = termFactory.makeConstructor("Source", 2);
    _consTemplatelangEnabled_0 = termFactory.makeConstructor("TemplatelangEnabled", 0);
    _consTemplatelangDisabled_0 = termFactory.makeConstructor("TemplatelangDisabled", 0);
    _consDebugCompiler_0 = termFactory.makeConstructor("DebugCompiler", 0);
    _consDebugDeclaration_0 = termFactory.makeConstructor("DebugDeclaration", 0);
    _consDebugAnalysis_0 = termFactory.makeConstructor("DebugAnalysis", 0);
    _consDebugSymbolTable_0 = termFactory.makeConstructor("DebugSymbolTable", 0);
    _consDebugAll_0 = termFactory.makeConstructor("DebugAll", 0);
    _consDebugNone_0 = termFactory.makeConstructor("DebugNone", 0);
    _consOutputDirectory_1 = termFactory.makeConstructor("OutputDirectory", 1);
    _consSTROutputMode_1 = termFactory.makeConstructor("STROutputMode", 1);
    _consCTree_0 = termFactory.makeConstructor("CTree", 0);
    _consJar_0 = termFactory.makeConstructor("Jar", 0);
    _consAll_0 = termFactory.makeConstructor("All", 0);
    _consThisOnly_0 = termFactory.makeConstructor("ThisOnly", 0);
    _consType_1 = termFactory.makeConstructor("Type", 1);
    _consProperty_2 = termFactory.makeConstructor("Property", 2);
    _consEntity_2 = termFactory.makeConstructor("Entity", 2);
    _consModule_2 = termFactory.makeConstructor("Module", 2);
    _consMARKER_0 = termFactory.makeConstructor("MARKER", 0);
    _consNOCONTEXT_1 = termFactory.makeConstructor("NOCONTEXT", 1);
    _consCOMPLETION_1 = termFactory.makeConstructor("COMPLETION", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    const17843 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'get-all-sources'");
    const17844 = termFactory.makeString("\n");
    const17845 = termFactory.makeString("\n               ");
    constNil14 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const17846 = termFactory.makeString("/");
    const17847 = termFactory.makeString("Failed to get list of source directory.");
    const17848 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'get-local-sources'");
    const17849 = termFactory.makeString("..");
    const17850 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'resolve-external-sources'");
    const17851 = termFactory.makeString("/spx.config");
    constCons8525 = (IStrategoTerm)termFactory.makeListCons(trans.const17851, (IStrategoList)trans.constNil14);
    const17852 = termFactory.makeString("spx.config");
    const17853 = termFactory.makeString("");
    const17854 = termFactory.makeString("Failed to retrieve list of projects.");
    const17855 = termFactory.makeString("Configuration | Failed to find the directory specified: ");
    const17856 = termFactory.makeString("Configuration | Failed to find spx.config file in the directory specified: ");
    const17857 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'normalized-spxproject-reference'");
    const17858 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'verify-local-directory-exist'");
    const17859 = termFactory.makeString("\n            ");
    const17860 = termFactory.makeString("\" is not found.");
    constCons8526 = (IStrategoTerm)termFactory.makeListCons(trans.const17860, (IStrategoList)trans.constNil14);
    const17861 = termFactory.makeString("Direcotory \"");
    const17862 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'verify-project-reference'");
    const17863 = termFactory.makeString("\n                                                                                   ");
    const17864 = termFactory.makeString("Illegal project reference. spx.config file is not found in the following project : ");
    const17865 = termFactory.makeString("\n                                             ");
    const17866 = termFactory.makeString(" is not found in the current workspace");
    constCons8527 = (IStrategoTerm)termFactory.makeListCons(trans.const17866, (IStrategoList)trans.constNil14);
    const17867 = termFactory.makeString("Illegal project reference. Following project ");
    const17868 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'is-spx-config-exist'");
    const17869 = termFactory.makeString("get-config-reference");
    constDR_DUMMY0 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons8528 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY0, (IStrategoList)trans.constNil14);
    const17870 = termFactory.makeString("-763437");
    constSpoofaxConfigurationTbl = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.tbl");
    constSpoofaxConfigurationTbl0 = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.tbl");
    constSpoofaxConfigurationTbl1 = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.tbl");
    constSpoofaxConfigurationGeneratedPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.generated.pp.af");
    constSpoofaxConfigurationPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.pp.af");
    const17871 = termFactory.makeInt(100);
    const17872 = termFactory.makeString("CurrentFile");
    const17873 = termFactory.makeString("99705");
    const17874 = termFactory.makeString("IsImported");
    const17875 = termFactory.makeString("-597601");
    const17876 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const17877 = termFactory.makeString("\n       ");
    const17878 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const17879 = termFactory.makeString("/.cache");
    constCons8529 = (IStrategoTerm)termFactory.makeListCons(trans.const17879, (IStrategoList)trans.constNil14);
    const17880 = termFactory.makeString("+");
    const17881 = termFactory.makeString("\\");
    const17882 = termFactory.makeString(":");
    const17883 = termFactory.makeString(".sig");
    constCons8530 = (IStrategoTerm)termFactory.makeListCons(trans.const17883, (IStrategoList)trans.constNil14);
    const17884 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    const17885 = termFactory.makeString("SpoofaxConfiguration");
    constMARKER0 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons8531 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER0, (IStrategoList)trans.constNil14);
    const17886 = termFactory.makeInt(0);
    const17887 = termFactory.makeString("BACKGROUNDED");
    const17888 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const17889 = termFactory.makeString("config.fullpath");
    const17890 = termFactory.makeString("aterm");
    const17891 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-aterm'");
    const17892 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-hover'");
    const17893 = termFactory.makeString("Hover help: ");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}