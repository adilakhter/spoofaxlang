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

  protected static IStrategoTerm const4506;

  protected static IStrategoTerm const4505;

  protected static IStrategoTerm const4504;

  protected static IStrategoTerm const4503;

  protected static IStrategoTerm const4502;

  protected static IStrategoTerm const4501;

  protected static IStrategoTerm const4500;

  protected static IStrategoTerm const4499;

  protected static IStrategoTerm constCons2050;

  protected static IStrategoTerm constMARKER0;

  protected static IStrategoTerm const4498;

  protected static IStrategoTerm const4497;

  protected static IStrategoTerm constCons2049;

  protected static IStrategoTerm const4496;

  protected static IStrategoTerm const4495;

  protected static IStrategoTerm const4494;

  protected static IStrategoTerm const4493;

  protected static IStrategoTerm constCons2048;

  protected static IStrategoTerm const4492;

  protected static IStrategoTerm const4491;

  protected static IStrategoTerm const4490;

  protected static IStrategoTerm const4489;

  protected static IStrategoTerm const4488;

  protected static IStrategoTerm const4487;

  protected static IStrategoTerm const4486;

  protected static IStrategoTerm const4485;

  protected static IStrategoTerm const4484;

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

  protected static IStrategoTerm const4483;

  protected static IStrategoTerm constCons2047;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const4482;

  protected static IStrategoTerm const4481;

  protected static IStrategoTerm const4480;

  protected static IStrategoTerm constCons2046;

  protected static IStrategoTerm const4479;

  protected static IStrategoTerm const4478;

  protected static IStrategoTerm const4477;

  protected static IStrategoTerm const4476;

  protected static IStrategoTerm const4475;

  protected static IStrategoTerm const4474;

  protected static IStrategoTerm constCons2045;

  protected static IStrategoTerm const4473;

  protected static IStrategoTerm const4472;

  protected static IStrategoTerm const4471;

  protected static IStrategoTerm const4470;

  protected static IStrategoTerm const4469;

  protected static IStrategoTerm const4468;

  protected static IStrategoTerm const4467;

  protected static IStrategoTerm const4466;

  protected static IStrategoTerm const4465;

  protected static IStrategoTerm constCons2044;

  protected static IStrategoTerm const4464;

  protected static IStrategoTerm const4463;

  protected static IStrategoTerm const4462;

  protected static IStrategoTerm const4461;

  protected static IStrategoTerm const4460;

  protected static IStrategoTerm const4459;

  protected static IStrategoTerm constNil4;

  protected static IStrategoTerm const4458;

  protected static IStrategoTerm const4457;

  protected static IStrategoTerm const4456;

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
    const4456 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'get-all-sources'");
    const4457 = termFactory.makeString("\n");
    const4458 = termFactory.makeString("\n               ");
    constNil4 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const4459 = termFactory.makeString("/");
    const4460 = termFactory.makeString("Failed to get list of source directory.");
    const4461 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'get-local-sources'");
    const4462 = termFactory.makeString("..");
    const4463 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'resolve-external-sources'");
    const4464 = termFactory.makeString("/spx.config");
    constCons2044 = (IStrategoTerm)termFactory.makeListCons(trans.const4464, (IStrategoList)trans.constNil4);
    const4465 = termFactory.makeString("spx.config");
    const4466 = termFactory.makeString("");
    const4467 = termFactory.makeString("Failed to retrieve list of projects.");
    const4468 = termFactory.makeString("Configuration | Failed to find the directory specified: ");
    const4469 = termFactory.makeString("Configuration | Failed to find spx.config file in the directory specified: ");
    const4470 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'normalized-spxproject-reference'");
    const4471 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'verify-local-directory-exist'");
    const4472 = termFactory.makeString("\n            ");
    const4473 = termFactory.makeString("\" is not found.");
    constCons2045 = (IStrategoTerm)termFactory.makeListCons(trans.const4473, (IStrategoList)trans.constNil4);
    const4474 = termFactory.makeString("Direcotory \"");
    const4475 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'verify-project-reference'");
    const4476 = termFactory.makeString("\n                                                                                   ");
    const4477 = termFactory.makeString("Illegal project reference. spx.config file is not found in the following project : ");
    const4478 = termFactory.makeString("\n                                             ");
    const4479 = termFactory.makeString(" is not found in the current workspace");
    constCons2046 = (IStrategoTerm)termFactory.makeListCons(trans.const4479, (IStrategoList)trans.constNil4);
    const4480 = termFactory.makeString("Illegal project reference. Following project ");
    const4481 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'is-spx-config-exist'");
    const4482 = termFactory.makeString("get-config-reference");
    constDR_DUMMY0 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons2047 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY0, (IStrategoList)trans.constNil4);
    const4483 = termFactory.makeString("-763437");
    constSpoofaxConfigurationTbl = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.tbl");
    constSpoofaxConfigurationTbl0 = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.tbl");
    constSpoofaxConfigurationTbl1 = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.tbl");
    constSpoofaxConfigurationGeneratedPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.generated.pp.af");
    constSpoofaxConfigurationPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "SpoofaxConfiguration.pp.af");
    const4484 = termFactory.makeInt(100);
    const4485 = termFactory.makeString("CurrentFile");
    const4486 = termFactory.makeString("99705");
    const4487 = termFactory.makeString("IsImported");
    const4488 = termFactory.makeString("-597601");
    const4489 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const4490 = termFactory.makeString("\n       ");
    const4491 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const4492 = termFactory.makeString("/.cache");
    constCons2048 = (IStrategoTerm)termFactory.makeListCons(trans.const4492, (IStrategoList)trans.constNil4);
    const4493 = termFactory.makeString("+");
    const4494 = termFactory.makeString("\\");
    const4495 = termFactory.makeString(":");
    const4496 = termFactory.makeString(".sig");
    constCons2049 = (IStrategoTerm)termFactory.makeListCons(trans.const4496, (IStrategoList)trans.constNil4);
    const4497 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    const4498 = termFactory.makeString("SpoofaxConfiguration");
    constMARKER0 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons2050 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER0, (IStrategoList)trans.constNil4);
    const4499 = termFactory.makeInt(0);
    const4500 = termFactory.makeString("BACKGROUNDED");
    const4501 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const4502 = termFactory.makeString("config.fullpath");
    const4503 = termFactory.makeString("aterm");
    const4504 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-aterm'");
    const4505 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-hover'");
    const4506 = termFactory.makeString("Hover help: ");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}