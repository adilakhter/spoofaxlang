package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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

  protected static IStrategoTerm const15582;

  protected static IStrategoTerm const15581;

  protected static IStrategoTerm const15580;

  protected static IStrategoTerm const15579;

  protected static IStrategoTerm const15578;

  protected static IStrategoTerm constCons7227;

  protected static IStrategoTerm const15577;

  protected static IStrategoTerm const15576;

  protected static IStrategoTerm const15575;

  protected static IStrategoTerm const15574;

  protected static IStrategoTerm const15573;

  protected static IStrategoTerm const15572;

  protected static IStrategoTerm constCons7226;

  protected static IStrategoTerm const15571;

  protected static IStrategoTerm const15570;

  protected static IStrategoTerm constCons7225;

  protected static IStrategoTerm const15569;

  protected static IStrategoTerm constCons7224;

  protected static IStrategoTerm const15568;

  protected static IStrategoTerm constCons7223;

  protected static IStrategoTerm const15567;

  protected static IStrategoTerm constCons7222;

  protected static IStrategoTerm const15566;

  protected static IStrategoTerm constCons7221;

  protected static IStrategoTerm const15565;

  protected static IStrategoTerm constCons7220;

  protected static IStrategoTerm const15564;

  protected static IStrategoTerm constCons7219;

  protected static IStrategoTerm const15563;

  protected static IStrategoTerm constCons7218;

  protected static IStrategoTerm const15562;

  protected static IStrategoTerm constCons7217;

  protected static IStrategoTerm const15561;

  protected static IStrategoTerm const15560;

  protected static IStrategoTerm constCons7216;

  protected static IStrategoTerm const15559;

  protected static IStrategoTerm const15558;

  protected static IStrategoTerm const15557;

  protected static IStrategoTerm constCons7215;

  protected static IStrategoTerm const15556;

  protected static IStrategoTerm const15555;

  protected static IStrategoTerm const15554;

  protected static IStrategoTerm const15553;

  protected static IStrategoTerm const15552;

  protected static IStrategoTerm constCons7214;

  protected static IStrategoTerm const15551;

  protected static IStrategoTerm const15550;

  protected static IStrategoTerm const15549;

  protected static IStrategoTerm const15548;

  protected static IStrategoTerm const15547;

  protected static IStrategoTerm const15546;

  protected static IStrategoTerm const15545;

  protected static IStrategoTerm constCons7213;

  protected static IStrategoTerm const15544;

  protected static IStrategoTerm const15543;

  protected static IStrategoTerm const15542;

  protected static IStrategoTerm const15541;

  protected static IStrategoTerm constCons7212;

  protected static IStrategoTerm const15540;

  protected static IStrategoTerm const15539;

  protected static IStrategoTerm const15538;

  protected static IStrategoTerm const15537;

  protected static IStrategoTerm const15536;

  protected static IStrategoTerm const15535;

  protected static IStrategoTerm const15534;

  protected static IStrategoTerm const15533;

  protected static IStrategoTerm const15532;

  protected static IStrategoTerm constCons7211;

  protected static IStrategoTerm const15531;

  protected static IStrategoTerm const15530;

  protected static IStrategoTerm const15529;

  protected static IStrategoTerm constCons7210;

  protected static IStrategoTerm const15528;

  protected static IStrategoTerm const15527;

  protected static IStrategoTerm const15526;

  protected static IStrategoTerm const15525;

  protected static IStrategoTerm const15524;

  protected static IStrategoTerm const15523;

  protected static IStrategoTerm const15522;

  protected static IStrategoTerm const15521;

  protected static IStrategoTerm const15520;

  protected static IStrategoTerm const15519;

  protected static IStrategoTerm const15518;

  protected static IStrategoTerm const15517;

  protected static IStrategoTerm const15516;

  protected static IStrategoTerm const15515;

  protected static IStrategoTerm const15514;

  protected static IStrategoTerm const15513;

  protected static IStrategoTerm const15512;

  protected static IStrategoTerm const15511;

  protected static IStrategoTerm const15510;

  protected static IStrategoTerm const15509;

  protected static IStrategoTerm const15508;

  protected static IStrategoTerm const15507;

  protected static IStrategoTerm const15506;

  protected static IStrategoTerm const15505;

  protected static IStrategoTerm const15504;

  protected static IStrategoTerm const15503;

  protected static IStrategoTerm const15502;

  protected static IStrategoTerm const15501;

  protected static IStrategoTerm const15500;

  protected static IStrategoTerm const15499;

  protected static IStrategoTerm const15498;

  protected static IStrategoTerm const15497;

  protected static IStrategoTerm const15496;

  protected static IStrategoTerm const15495;

  protected static IStrategoTerm const15494;

  protected static IStrategoTerm const15493;

  protected static IStrategoTerm const15492;

  protected static IStrategoTerm const15491;

  protected static IStrategoTerm const15490;

  protected static IStrategoTerm const15489;

  protected static IStrategoTerm const15488;

  protected static IStrategoTerm constCons7209;

  protected static IStrategoTerm const15487;

  protected static IStrategoTerm const15486;

  protected static IStrategoTerm const15485;

  protected static IStrategoTerm const15484;

  protected static IStrategoTerm const15483;

  protected static IStrategoTerm const15482;

  protected static IStrategoTerm const15481;

  protected static IStrategoTerm const15480;

  protected static IStrategoTerm const15479;

  protected static IStrategoTerm const15478;

  protected static IStrategoTerm const15477;

  protected static IStrategoTerm const15476;

  protected static IStrategoTerm const15475;

  protected static IStrategoTerm const15474;

  protected static IStrategoTerm const15473;

  protected static IStrategoTerm const15472;

  protected static IStrategoTerm const15471;

  protected static IStrategoTerm const15470;

  protected static IStrategoTerm const15469;

  protected static IStrategoTerm const15468;

  protected static IStrategoTerm const15467;

  protected static IStrategoTerm const15466;

  protected static IStrategoTerm const15465;

  protected static IStrategoTerm constCons7208;

  protected static IStrategoTerm constMARKER1;

  protected static IStrategoTerm const15464;

  protected static IStrategoTerm const15463;

  protected static IStrategoTerm constCons7207;

  protected static IStrategoTerm const15462;

  protected static IStrategoTerm const15461;

  protected static IStrategoTerm const15460;

  protected static IStrategoTerm const15459;

  protected static IStrategoTerm const15458;

  protected static IStrategoTerm constCons7206;

  protected static IStrategoTerm const15457;

  protected static IStrategoTerm const15456;

  protected static IStrategoTerm const15455;

  protected static IStrategoTerm const15454;

  protected static IStrategoTerm const15453;

  protected static IStrategoTerm const15452;

  protected static IStrategoTerm const15451;

  protected static IStrategoTerm const15450;

  protected static IStrategoTerm const15449;

  protected static IStrategoTerm constCons7205;

  protected static IStrategoTerm constDR_DUMMY1;

  protected static IStrategoTerm constNil11;

  protected static IStrategoTerm const15448;

  public static IStrategoTerm getSDFTbl3()
  { 
    return constSDFTbl3;
  }

  protected static ImportTerm constSDFTbl3;

  public static IStrategoTerm getSDFTbl2()
  { 
    return constSDFTbl2;
  }

  protected static ImportTerm constSDFTbl2;

  public static IStrategoTerm getSDFTbl()
  { 
    return constSDFTbl;
  }

  protected static ImportTerm constSDFTbl;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consalt_2;

  protected static IStrategoConstructor _consannotated_2;

  protected static IStrategoConstructor _consrange_2;

  protected static IStrategoConstructor _consseq_2;

  protected static IStrategoConstructor _conslexical_syntax_1;

  protected static IStrategoConstructor _conskernel_start_symbols_1;

  protected static IStrategoConstructor _conslexical_start_symbols_1;

  protected static IStrategoConstructor _conscontext_free_start_symbols_1;

  protected static IStrategoConstructor _conssorts_1;

  protected static IStrategoConstructor _consparameterized_sort_2;

  protected static IStrategoConstructor _conslabel_2;

  protected static IStrategoConstructor _conslex_1;

  protected static IStrategoConstructor _conscf_1;

  protected static IStrategoConstructor _consparameterized_2;

  protected static IStrategoConstructor _consunparameterized_1;

  protected static IStrategoConstructor _conssymbol_2;

  protected static IStrategoConstructor _consrenamings_1;

  protected static IStrategoConstructor _consrenamed_module_2;

  protected static IStrategoConstructor _consiter_sep_2;

  protected static IStrategoConstructor _consiter_star_sep_2;

  protected static IStrategoConstructor _consiter_1;

  protected static IStrategoConstructor _consiter_star_1;

  protected static IStrategoConstructor _consopt_1;

  protected static IStrategoConstructor _conslit_1;

  protected static IStrategoConstructor _consnon_assoc_0;

  protected static IStrategoConstructor _consright_0;

  protected static IStrategoConstructor _consleft_0;

  protected static IStrategoConstructor _consassoc_0;

  protected static IStrategoConstructor _consbracket_0;

  protected static IStrategoConstructor _consreject_0;

  protected static IStrategoConstructor _consprefer_0;

  protected static IStrategoConstructor _consavoid_0;

  protected static IStrategoConstructor _consassoc_1;

  protected static IStrategoConstructor _consattrs_1;

  protected static IStrategoConstructor _consno_attrs_0;

  protected static IStrategoConstructor _consquoted_1;

  protected static IStrategoConstructor _consfun_1;

  protected static IStrategoConstructor _consunquoted_1;

  protected static IStrategoConstructor _consappl_2;

  protected static IStrategoConstructor _consdefault_1;

  protected static IStrategoConstructor _consterm_1;

  protected static IStrategoConstructor _conssort_1;

  protected static IStrategoConstructor _consprod_3;

  protected static IStrategoConstructor _conscontext_free_syntax_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consType_1;

  public static IStrategoConstructor _consProperty_2;

  public static IStrategoConstructor _consEntity_2;

  public static IStrategoConstructor _consMARKER_0;

  public static IStrategoConstructor _consNOCONTEXT_1;

  public static IStrategoConstructor _consCOMPLETION_1;

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
          org.strategoxt.strc.Main.init(context);
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_xtc.Main.init(context);
          org.strategoxt.stratego_aterm.Main.init(context);
          org.strategoxt.stratego_sdf.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          pp_sdf_string_0_0.instance = new pp_sdf_string_0_0_override();
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
    _consalt_2 = termFactory.makeConstructor("alt", 2);
    _consannotated_2 = termFactory.makeConstructor("annotated", 2);
    _consrange_2 = termFactory.makeConstructor("range", 2);
    _consseq_2 = termFactory.makeConstructor("seq", 2);
    _conslexical_syntax_1 = termFactory.makeConstructor("lexical-syntax", 1);
    _conskernel_start_symbols_1 = termFactory.makeConstructor("kernel-start-symbols", 1);
    _conslexical_start_symbols_1 = termFactory.makeConstructor("lexical-start-symbols", 1);
    _conscontext_free_start_symbols_1 = termFactory.makeConstructor("context-free-start-symbols", 1);
    _conssorts_1 = termFactory.makeConstructor("sorts", 1);
    _consparameterized_sort_2 = termFactory.makeConstructor("parameterized-sort", 2);
    _conslabel_2 = termFactory.makeConstructor("label", 2);
    _conslex_1 = termFactory.makeConstructor("lex", 1);
    _conscf_1 = termFactory.makeConstructor("cf", 1);
    _consparameterized_2 = termFactory.makeConstructor("parameterized", 2);
    _consunparameterized_1 = termFactory.makeConstructor("unparameterized", 1);
    _conssymbol_2 = termFactory.makeConstructor("symbol", 2);
    _consrenamings_1 = termFactory.makeConstructor("renamings", 1);
    _consrenamed_module_2 = termFactory.makeConstructor("renamed-module", 2);
    _consiter_sep_2 = termFactory.makeConstructor("iter-sep", 2);
    _consiter_star_sep_2 = termFactory.makeConstructor("iter-star-sep", 2);
    _consiter_1 = termFactory.makeConstructor("iter", 1);
    _consiter_star_1 = termFactory.makeConstructor("iter-star", 1);
    _consopt_1 = termFactory.makeConstructor("opt", 1);
    _conslit_1 = termFactory.makeConstructor("lit", 1);
    _consnon_assoc_0 = termFactory.makeConstructor("non-assoc", 0);
    _consright_0 = termFactory.makeConstructor("right", 0);
    _consleft_0 = termFactory.makeConstructor("left", 0);
    _consassoc_0 = termFactory.makeConstructor("assoc", 0);
    _consbracket_0 = termFactory.makeConstructor("bracket", 0);
    _consreject_0 = termFactory.makeConstructor("reject", 0);
    _consprefer_0 = termFactory.makeConstructor("prefer", 0);
    _consavoid_0 = termFactory.makeConstructor("avoid", 0);
    _consassoc_1 = termFactory.makeConstructor("assoc", 1);
    _consattrs_1 = termFactory.makeConstructor("attrs", 1);
    _consno_attrs_0 = termFactory.makeConstructor("no-attrs", 0);
    _consquoted_1 = termFactory.makeConstructor("quoted", 1);
    _consfun_1 = termFactory.makeConstructor("fun", 1);
    _consunquoted_1 = termFactory.makeConstructor("unquoted", 1);
    _consappl_2 = termFactory.makeConstructor("appl", 2);
    _consdefault_1 = termFactory.makeConstructor("default", 1);
    _consterm_1 = termFactory.makeConstructor("term", 1);
    _conssort_1 = termFactory.makeConstructor("sort", 1);
    _consprod_3 = termFactory.makeConstructor("prod", 3);
    _conscontext_free_syntax_1 = termFactory.makeConstructor("context-free-syntax", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consType_1 = termFactory.makeConstructor("Type", 1);
    _consProperty_2 = termFactory.makeConstructor("Property", 2);
    _consEntity_2 = termFactory.makeConstructor("Entity", 2);
    _consMARKER_0 = termFactory.makeConstructor("MARKER", 0);
    _consNOCONTEXT_1 = termFactory.makeConstructor("NOCONTEXT", 1);
    _consCOMPLETION_1 = termFactory.makeConstructor("COMPLETION", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constSDFTbl = new ImportTerm(termFactory, trans.class, "/trans/", "SDF.tbl");
    constSDFTbl2 = new ImportTerm(termFactory, trans.class, "/trans/", "SDF.tbl");
    constSDFTbl3 = new ImportTerm(termFactory, trans.class, "/trans/", "SDF.tbl");
    const15448 = termFactory.makeString("CurrentFile");
    constNil11 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constDR_DUMMY1 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons7205 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY1, (IStrategoList)trans.constNil11);
    const15449 = termFactory.makeString("99705");
    const15450 = termFactory.makeString("IsImported");
    const15451 = termFactory.makeString("-597601");
    const15452 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const15453 = termFactory.makeString("\n");
    const15454 = termFactory.makeString("\n       ");
    const15455 = termFactory.makeString("/");
    const15456 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const15457 = termFactory.makeString("/.cache");
    constCons7206 = (IStrategoTerm)termFactory.makeListCons(trans.const15457, (IStrategoList)trans.constNil11);
    const15458 = termFactory.makeString("+");
    const15459 = termFactory.makeString("\\");
    const15460 = termFactory.makeString(":");
    const15461 = termFactory.makeString("\n            ");
    const15462 = termFactory.makeString(".sig");
    constCons7207 = (IStrategoTerm)termFactory.makeListCons(trans.const15462, (IStrategoList)trans.constNil11);
    const15463 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    const15464 = termFactory.makeString("SDF");
    constMARKER1 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons7208 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER1, (IStrategoList)trans.constNil11);
    const15465 = termFactory.makeInt(0);
    const15466 = termFactory.makeString("BACKGROUNDED");
    const15467 = termFactory.makeString("generated.spx");
    const15468 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'generate-syntax-templates'");
    const15469 = termFactory.makeString("\n  ");
    const15470 = termFactory.makeString("package example\nmodule example\ntemplates\n  ");
    const15471 = termFactory.makeString(" ");
    const15472 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'prod-to-template'");
    const15473 = termFactory.makeString("\n      ");
    const15474 = termFactory.makeString("\n                      ");
    const15475 = termFactory.makeString("\n                            ");
    const15476 = termFactory.makeString("\n                                  ");
    const15477 = termFactory.makeString("\n                                         ");
    const15478 = termFactory.makeString("\n                                                ");
    const15479 = termFactory.makeString("\n                                                       ");
    const15480 = termFactory.makeString(" = ");
    const15481 = termFactory.makeString("Could not generate template from production: ");
    const15482 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'pp-cons'");
    const15483 = termFactory.makeString("\n ");
    const15484 = termFactory.makeString(".");
    const15485 = termFactory.makeString("");
    const15486 = termFactory.makeString(",");
    const15487 = termFactory.makeString("}");
    constCons7209 = (IStrategoTerm)termFactory.makeListCons(trans.const15487, (IStrategoList)trans.constNil11);
    const15488 = termFactory.makeString(" {");
    const15489 = termFactory.makeInt(100);
    const15490 = termFactory.makeString("avoid");
    const15491 = termFactory.makeString("prefer");
    const15492 = termFactory.makeString("reject");
    const15493 = termFactory.makeString("bracket");
    const15494 = termFactory.makeString("assoc");
    const15495 = termFactory.makeString("left");
    const15496 = termFactory.makeString("right");
    const15497 = termFactory.makeString("non-assoc");
    const15498 = termFactory.makeString("[");
    const15499 = termFactory.makeString("]");
    const15500 = termFactory.makeTuple(trans.const15498, trans.const15499);
    const15501 = termFactory.makeString("<");
    const15502 = termFactory.makeString(">");
    const15503 = termFactory.makeTuple(trans.const15501, trans.const15502);
    const15504 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'sym-to-template-elem'");
    const15505 = termFactory.makeString("\n         ");
    const15506 = termFactory.makeString("\n          ");
    const15507 = termFactory.makeString("?");
    const15508 = termFactory.makeString("*");
    const15509 = termFactory.makeString("\n                         ");
    const15510 = termFactory.makeString("*; separator=");
    const15511 = termFactory.makeString("+; separator=");
    const15512 = termFactory.makeString("Could not generate template element from symbol: ");
    const15513 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'analyze-ast'");
    const15514 = termFactory.makeString("\n               ");
    const15515 = termFactory.makeString("CurrentDir");
    const15516 = termFactory.makeString("-237042");
    const15517 = termFactory.makeString("ProjectDir");
    const15518 = termFactory.makeString("-231360");
    const15519 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-ast'");
    const15520 = termFactory.makeString("IsImportFailed");
    const15521 = termFactory.makeString("-48817");
    const15522 = termFactory.makeString("Declaration");
    const15523 = termFactory.makeString("-415135");
    const15524 = termFactory.makeString("DeclarationFile");
    const15525 = termFactory.makeString("-36412");
    const15526 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-globals'");
    const15527 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'resolve-import'");
    const15528 = termFactory.makeString(".sdf");
    constCons7210 = (IStrategoTerm)termFactory.makeListCons(trans.const15528, (IStrategoList)trans.constNil11);
    const15529 = termFactory.makeString("/syntax/");
    const15530 = termFactory.makeString("\n                   ");
    const15531 = termFactory.makeString(".def");
    constCons7211 = (IStrategoTerm)termFactory.makeListCons(trans.const15531, (IStrategoList)trans.constNil11);
    const15532 = termFactory.makeString("/lib/");
    const15533 = termFactory.makeString("130226");
    const15534 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-simple-global'");
    const15535 = termFactory.makeString("Usage");
    const15536 = termFactory.makeString("184525");
    const15537 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-use'");
    const15538 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'declare-use'");
    const15539 = termFactory.makeString("\n     ");
    const15540 = termFactory.makeString("]]");
    constCons7212 = (IStrategoTerm)termFactory.makeListCons(trans.const15540, (IStrategoList)trans.constNil11);
    const15541 = termFactory.makeString("[[");
    const15542 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'propose-completion'");
    const15543 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-analyze'");
    const15544 = termFactory.makeString("/.disable-global-analysis");
    constCons7213 = (IStrategoTerm)termFactory.makeListCons(trans.const15544, (IStrategoList)trans.constNil11);
    const15545 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const15546 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'context-free-syntax-sort-error'");
    const15547 = termFactory.makeString("\n                  ");
    const15548 = termFactory.makeString("No definition for ");
    const15549 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'context-free-syntax-warning'");
    const15550 = termFactory.makeString("\n                             ");
    const15551 = termFactory.makeString("-separated lists");
    constCons7214 = (IStrategoTerm)termFactory.makeListCons(trans.const15551, (IStrategoList)trans.constNil11);
    const15552 = termFactory.makeString("}* instead for ");
    const15553 = termFactory.makeString("Use {");
    const15554 = termFactory.makeString("}+ instead for ");
    const15555 = termFactory.makeString("\n                              ");
    const15556 = termFactory.makeString("?-separated lists");
    constCons7215 = (IStrategoTerm)termFactory.makeListCons(trans.const15556, (IStrategoList)trans.constNil11);
    const15557 = termFactory.makeString("?}+ instead for ");
    const15558 = termFactory.makeString("?}* instead for ");
    const15559 = termFactory.makeString("Character class iteration should be in lexical syntax section");
    constCons7216 = (IStrategoTerm)termFactory.makeListCons(trans.const15559, (IStrategoList)trans.constNil11);
    const15560 = termFactory.makeString("Non-terminal used as a list separator (use round braces for grouping non-terminals)");
    const15561 = termFactory.makeString("Missing {cons(\"Label\")} attribute to label the abstract syntax");
    constCons7217 = (IStrategoTerm)termFactory.makeListCons(trans.const15561, (IStrategoList)trans.constNil11);
    const15562 = termFactory.makeString("Single argument expected for {cons(\"Name\")} attribute");
    constCons7218 = (IStrategoTerm)termFactory.makeListCons(trans.const15562, (IStrategoList)trans.constNil11);
    const15563 = termFactory.makeString("In Stratego, Nil is the empty list, and Nil() does not match this constructor (use a different constructor)");
    constCons7219 = (IStrategoTerm)termFactory.makeListCons(trans.const15563, (IStrategoList)trans.constNil11);
    const15564 = termFactory.makeString("Use round parentheses () for attribute arguments");
    constCons7220 = (IStrategoTerm)termFactory.makeListCons(trans.const15564, (IStrategoList)trans.constNil11);
    const15565 = termFactory.makeString("The | construct is deprecated: instead of A|B->C use A->C B->C");
    constCons7221 = (IStrategoTerm)termFactory.makeListCons(trans.const15565, (IStrategoList)trans.constNil11);
    const15566 = termFactory.makeString("Extract sequence in optional to separate productions to ensure acceptable abstract syntax");
    constCons7222 = (IStrategoTerm)termFactory.makeListCons(trans.const15566, (IStrategoList)trans.constNil11);
    const15567 = termFactory.makeString("Extract literal in optional to separate productions to ensure consistent abstract syntax");
    constCons7223 = (IStrategoTerm)termFactory.makeListCons(trans.const15567, (IStrategoList)trans.constNil11);
    const15568 = termFactory.makeString("Constructor only expected in context-free syntax");
    constCons7224 = (IStrategoTerm)termFactory.makeListCons(trans.const15568, (IStrategoList)trans.constNil11);
    const15569 = termFactory.makeString("Illegal use of {bracket} attribute");
    constCons7225 = (IStrategoTerm)termFactory.makeListCons(trans.const15569, (IStrategoList)trans.constNil11);
    const15570 = termFactory.makeString("selection.pp");
    const15571 = termFactory.makeString("Could not generate pretty printer rules for this selection.");
    constCons7226 = (IStrategoTerm)termFactory.makeListCons(trans.const15571, (IStrategoList)trans.constNil11);
    const15572 = termFactory.makeString("rtg");
    const15573 = termFactory.makeInt(2);
    const15574 = termFactory.makeInt(3);
    const15575 = termFactory.makeInt(4);
    const15576 = termFactory.makeInt(5);
    const15577 = termFactory.makeString("Could not generate abstract syntax signatures for this selection.");
    constCons7227 = (IStrategoTerm)termFactory.makeListCons(trans.const15577, (IStrategoList)trans.constNil11);
    const15578 = termFactory.makeString("aterm");
    const15579 = termFactory.makeString("org.strategoxt.tools.ppgenerate");
    const15580 = termFactory.makeString("org.strategoxt.tools.core-rtg2sig");
    const15581 = termFactory.makeString("org.strategoxt.tools.pp-pp-table");
    const15582 = termFactory.makeString("org.strategoxt.tools.sdf-desugar");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}