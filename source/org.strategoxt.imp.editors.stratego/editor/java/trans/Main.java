package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
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

  protected static IStrategoTerm const4665;

  protected static IStrategoTerm const4664;

  protected static IStrategoTerm const4663;

  protected static IStrategoTerm const4662;

  protected static IStrategoTerm constCons2124;

  protected static IStrategoTerm const4661;

  protected static IStrategoTerm const4660;

  protected static IStrategoTerm const4659;

  protected static IStrategoTerm constCons2123;

  protected static IStrategoTerm const4658;

  protected static IStrategoTerm const4657;

  protected static IStrategoTerm constCons2122;

  protected static IStrategoTerm const4656;

  protected static IStrategoTerm const4655;

  protected static IStrategoTerm const4654;

  protected static IStrategoTerm const4653;

  protected static IStrategoTerm constCons2121;

  protected static IStrategoTerm const4652;

  protected static IStrategoTerm const4651;

  protected static IStrategoTerm constCons2120;

  protected static IStrategoTerm const4650;

  protected static IStrategoTerm const4649;

  protected static IStrategoTerm const4648;

  protected static IStrategoTerm const4647;

  protected static IStrategoTerm const4646;

  protected static IStrategoTerm const4645;

  protected static IStrategoTerm const4644;

  protected static IStrategoTerm const4643;

  protected static IStrategoTerm const4642;

  protected static IStrategoTerm const4641;

  protected static IStrategoTerm const4640;

  protected static IStrategoTerm const4639;

  protected static IStrategoTerm const4638;

  protected static IStrategoTerm const4637;

  protected static IStrategoTerm const4636;

  protected static IStrategoTerm constCons2119;

  protected static IStrategoTerm const4635;

  protected static IStrategoTerm const4634;

  protected static IStrategoTerm const4633;

  protected static IStrategoTerm const4632;

  protected static IStrategoTerm const4631;

  protected static IStrategoTerm const4630;

  protected static IStrategoTerm const4629;

  protected static IStrategoTerm const4628;

  protected static IStrategoTerm const4627;

  protected static IStrategoTerm constCons2118;

  protected static IStrategoTerm const4626;

  protected static IStrategoTerm const4625;

  protected static IStrategoTerm const4624;

  protected static IStrategoTerm constCons2117;

  protected static IStrategoTerm const4623;

  protected static IStrategoTerm const4622;

  protected static IStrategoTerm const4621;

  protected static IStrategoTerm const4620;

  protected static IStrategoTerm const4619;

  protected static IStrategoTerm const4618;

  protected static IStrategoTerm constCons2116;

  protected static IStrategoTerm const4617;

  protected static IStrategoTerm const4616;

  protected static IStrategoTerm constCons2115;

  protected static IStrategoTerm const4615;

  protected static IStrategoTerm const4614;

  protected static IStrategoTerm const4613;

  protected static IStrategoTerm const4612;

  protected static IStrategoTerm const4611;

  protected static IStrategoTerm const4610;

  protected static IStrategoTerm const4609;

  protected static IStrategoTerm const4608;

  protected static IStrategoTerm const4607;

  protected static IStrategoTerm const4606;

  protected static IStrategoTerm const4605;

  protected static IStrategoTerm const4604;

  protected static IStrategoTerm const4603;

  protected static IStrategoTerm constCons2114;

  protected static IStrategoTerm const4602;

  protected static IStrategoTerm const4601;

  protected static IStrategoTerm const4600;

  protected static IStrategoTerm const4599;

  protected static IStrategoTerm const4598;

  protected static IStrategoTerm constCons2113;

  protected static IStrategoTerm constCons2112;

  protected static IStrategoTerm constCons2111;

  protected static IStrategoTerm constCons2110;

  protected static IStrategoTerm constCons2109;

  protected static IStrategoTerm constCons2108;

  protected static IStrategoTerm constCons2107;

  protected static IStrategoTerm constCons2106;

  protected static IStrategoTerm constCons2105;

  protected static IStrategoTerm constCons2104;

  protected static IStrategoTerm constCons2103;

  protected static IStrategoTerm constCons2102;

  protected static IStrategoTerm const4597;

  protected static IStrategoTerm const4596;

  protected static IStrategoTerm const4595;

  protected static IStrategoTerm const4594;

  protected static IStrategoTerm const4593;

  protected static IStrategoTerm const4592;

  protected static IStrategoTerm const4591;

  protected static IStrategoTerm constCons2101;

  protected static IStrategoTerm constCons2100;

  protected static IStrategoTerm constCons2099;

  protected static IStrategoTerm const4590;

  protected static IStrategoTerm constCons2098;

  protected static IStrategoTerm const4589;

  protected static IStrategoTerm constCons2097;

  protected static IStrategoTerm constCons2096;

  protected static IStrategoTerm const4588;

  protected static IStrategoTerm constCons2095;

  protected static IStrategoTerm const4587;

  protected static IStrategoTerm constCons2094;

  protected static IStrategoTerm const4586;

  protected static IStrategoTerm const4585;

  protected static IStrategoTerm const4584;

  protected static IStrategoTerm constCons2093;

  protected static IStrategoTerm const4583;

  protected static IStrategoTerm const4582;

  protected static IStrategoTerm constCons2092;

  protected static IStrategoTerm constCons2091;

  protected static IStrategoTerm const4581;

  protected static IStrategoTerm const4580;

  protected static IStrategoTerm const4579;

  protected static IStrategoTerm const4578;

  protected static IStrategoTerm const4577;

  protected static IStrategoTerm const4576;

  protected static IStrategoTerm const4575;

  protected static IStrategoTerm const4574;

  protected static IStrategoTerm constCritical0;

  protected static IStrategoTerm const4573;

  protected static IStrategoTerm const4572;

  protected static IStrategoTerm const4571;

  protected static IStrategoTerm const4570;

  protected static IStrategoTerm const4569;

  protected static IStrategoTerm const4568;

  protected static IStrategoTerm const4567;

  protected static IStrategoTerm const4566;

  protected static IStrategoTerm const4565;

  protected static IStrategoTerm const4564;

  protected static IStrategoTerm const4563;

  protected static IStrategoTerm const4562;

  protected static IStrategoTerm constCons2090;

  protected static IStrategoTerm const4561;

  protected static IStrategoTerm const4560;

  protected static IStrategoTerm const4559;

  protected static IStrategoTerm constCons2089;

  protected static IStrategoTerm const4558;

  protected static IStrategoTerm const4557;

  protected static IStrategoTerm const4556;

  protected static IStrategoTerm const4555;

  protected static IStrategoTerm const4554;

  protected static IStrategoTerm const4553;

  protected static IStrategoTerm const4552;

  protected static IStrategoTerm const4551;

  protected static IStrategoTerm const4550;

  protected static IStrategoTerm constFail0;

  protected static IStrategoTerm const4549;

  protected static IStrategoTerm constCons2088;

  protected static IStrategoTerm constMARKER0;

  protected static IStrategoTerm const4548;

  protected static IStrategoTerm const4547;

  protected static IStrategoTerm constCons2087;

  protected static IStrategoTerm const4546;

  protected static IStrategoTerm const4545;

  protected static IStrategoTerm const4544;

  protected static IStrategoTerm const4543;

  protected static IStrategoTerm const4542;

  protected static IStrategoTerm constCons2086;

  protected static IStrategoTerm const4541;

  protected static IStrategoTerm const4540;

  protected static IStrategoTerm const4539;

  protected static IStrategoTerm const4538;

  protected static IStrategoTerm const4537;

  protected static IStrategoTerm const4536;

  public static IStrategoTerm getStrategoSugarPpAf()
  { 
    return constStrategoSugarPpAf;
  }

  protected static ImportTerm constStrategoSugarPpAf;

  public static IStrategoTerm getStrategoSugarGeneratedPpAf()
  { 
    return constStrategoSugarGeneratedPpAf;
  }

  protected static ImportTerm constStrategoSugarGeneratedPpAf;

  public static IStrategoTerm getStrategoSugarTbl1()
  { 
    return constStrategoSugarTbl1;
  }

  protected static ImportTerm constStrategoSugarTbl1;

  public static IStrategoTerm getStrategoSugarTbl0()
  { 
    return constStrategoSugarTbl0;
  }

  protected static ImportTerm constStrategoSugarTbl0;

  public static IStrategoTerm getStrategoSugarTbl()
  { 
    return constStrategoSugarTbl;
  }

  protected static ImportTerm constStrategoSugarTbl;

  protected static IStrategoTerm const4535;

  protected static IStrategoTerm constCons2085;

  protected static IStrategoTerm const4534;

  protected static IStrategoTerm constCons2084;

  protected static IStrategoTerm const4533;

  protected static IStrategoTerm constCons2083;

  protected static IStrategoTerm const4532;

  protected static IStrategoTerm const4531;

  protected static IStrategoTerm constCons2082;

  protected static IStrategoTerm const4530;

  protected static IStrategoTerm const4529;

  protected static IStrategoTerm const4528;

  protected static IStrategoTerm constCons2081;

  protected static IStrategoTerm const4527;

  protected static IStrategoTerm const4526;

  protected static IStrategoTerm const4525;

  protected static IStrategoTerm const4524;

  protected static IStrategoTerm const4523;

  protected static IStrategoTerm const4522;

  protected static IStrategoTerm constCons2080;

  protected static IStrategoTerm const4521;

  protected static IStrategoTerm constCons2079;

  protected static IStrategoTerm const4520;

  protected static IStrategoTerm constCons2078;

  protected static IStrategoTerm const4519;

  protected static IStrategoTerm constCons2077;

  protected static IStrategoTerm const4518;

  protected static IStrategoTerm constCons2076;

  protected static IStrategoTerm constCons2075;

  protected static IStrategoTerm const4517;

  protected static IStrategoTerm constCons2074;

  protected static IStrategoTerm const4516;

  protected static IStrategoTerm constCons2073;

  protected static IStrategoTerm const4515;

  protected static IStrategoTerm constCons2072;

  protected static IStrategoTerm const4514;

  protected static IStrategoTerm constCons2071;

  protected static IStrategoTerm const4513;

  protected static IStrategoTerm constCons2070;

  protected static IStrategoTerm const4512;

  protected static IStrategoTerm constCons2069;

  protected static IStrategoTerm const4511;

  protected static IStrategoTerm constCons2068;

  protected static IStrategoTerm const4510;

  protected static IStrategoTerm constCons2067;

  protected static IStrategoTerm const4509;

  protected static IStrategoTerm constCons2066;

  protected static IStrategoTerm const4508;

  protected static IStrategoTerm constCons2065;

  protected static IStrategoTerm const4507;

  protected static IStrategoTerm constCons2064;

  protected static IStrategoTerm const4506;

  protected static IStrategoTerm constCons2063;

  protected static IStrategoTerm const4505;

  protected static IStrategoTerm constCons2062;

  protected static IStrategoTerm const4504;

  protected static IStrategoTerm constCons2061;

  protected static IStrategoTerm const4503;

  protected static IStrategoTerm const4502;

  protected static IStrategoTerm const4501;

  protected static IStrategoTerm const4500;

  protected static IStrategoTerm const4499;

  protected static IStrategoTerm const4498;

  protected static IStrategoTerm constCons2060;

  protected static IStrategoTerm const4497;

  protected static IStrategoTerm const4496;

  protected static IStrategoTerm const4495;

  protected static IStrategoTerm constCons2059;

  protected static IStrategoTerm const4494;

  protected static IStrategoTerm constCons2058;

  protected static IStrategoTerm const4493;

  protected static IStrategoTerm constCons2057;

  protected static IStrategoTerm const4492;

  protected static IStrategoTerm constCons2056;

  protected static IStrategoTerm const4491;

  protected static IStrategoTerm constCons2055;

  protected static IStrategoTerm const4490;

  protected static IStrategoTerm constCons2054;

  protected static IStrategoTerm const4489;

  protected static IStrategoTerm constCons2053;

  protected static IStrategoTerm const4488;

  protected static IStrategoTerm constCons2052;

  protected static IStrategoTerm const4487;

  protected static IStrategoTerm constCons2051;

  protected static IStrategoTerm const4486;

  protected static IStrategoTerm constCons2050;

  protected static IStrategoTerm const4485;

  protected static IStrategoTerm constCons2049;

  protected static IStrategoTerm const4484;

  protected static IStrategoTerm constCons2048;

  protected static IStrategoTerm const4483;

  protected static IStrategoTerm const4482;

  protected static IStrategoTerm const4481;

  protected static IStrategoTerm const4480;

  protected static IStrategoTerm const4479;

  protected static IStrategoTerm const4478;

  protected static IStrategoTerm constImport0;

  protected static IStrategoTerm const4477;

  protected static IStrategoTerm const4476;

  protected static IStrategoTerm const4475;

  protected static IStrategoTerm const4474;

  protected static IStrategoTerm constCons2047;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const4473;

  protected static IStrategoTerm const4472;

  protected static IStrategoTerm const4471;

  protected static IStrategoTerm const4470;

  protected static IStrategoTerm constCons2046;

  protected static IStrategoTerm const4469;

  protected static IStrategoTerm const4468;

  protected static IStrategoTerm const4467;

  protected static IStrategoTerm const4466;

  protected static IStrategoTerm const4465;

  protected static IStrategoTerm const4464;

  protected static IStrategoTerm const4463;

  protected static IStrategoTerm const4462;

  protected static IStrategoTerm const4461;

  protected static IStrategoTerm const4460;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const4459;

  protected static IStrategoTerm const4458;

  protected static IStrategoTerm const4457;

  protected static IStrategoTerm const4456;

  protected static IStrategoTerm const4455;

  protected static IStrategoTerm constCons2045;

  protected static IStrategoTerm const4454;

  protected static IStrategoTerm constConstType0;

  protected static IStrategoTerm constSortNoArgs0;

  protected static IStrategoTerm const4453;

  protected static IStrategoTerm const4452;

  protected static IStrategoTerm constCons2044;

  protected static IStrategoTerm const4451;

  protected static IStrategoTerm const4450;

  protected static IStrategoTerm const4449;

  protected static IStrategoTerm const4448;

  protected static IStrategoTerm const4447;

  protected static IStrategoTerm const4446;

  protected static IStrategoTerm const4445;

  protected static IStrategoTerm const4444;

  protected static IStrategoTerm const4443;

  protected static IStrategoTerm const4442;

  protected static IStrategoTerm const4441;

  protected static IStrategoTerm const4440;

  protected static IStrategoTerm const4439;

  protected static IStrategoTerm const4438;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm constCons2043;

  protected static IStrategoTerm const4437;

  protected static IStrategoTerm constNil4;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consIntCong_1;

  protected static IStrategoConstructor _consStrCong_1;

  protected static IStrategoConstructor _consStringQuotation4_2;

  protected static IStrategoConstructor _consStringQuotation3_2;

  protected static IStrategoConstructor _consStringQuotation2_2;

  protected static IStrategoConstructor _consStringQuotation1_2;

  protected static IStrategoConstructor _consBuildDefaultPT_1;

  protected static IStrategoConstructor _consBuildDefault_1;

  protected static IStrategoConstructor _consBuild_1;

  protected static IStrategoConstructor _consInternal_0;

  protected static IStrategoConstructor _consAnnoDef_2;

  protected static IStrategoConstructor _consLabeledDynRuleId_2;

  protected static IStrategoConstructor _consAs_2;

  protected static IStrategoConstructor _consRootApp_1;

  protected static IStrategoConstructor _consAM_2;

  protected static IStrategoConstructor _consAssign_2;

  protected static IStrategoConstructor _consSetDynRule_2;

  protected static IStrategoConstructor _consMatch_1;

  protected static IStrategoConstructor _consScopeDefault_1;

  protected static IStrategoConstructor _consIncludeFromPath_1;

  protected static IStrategoConstructor _consCritical_0;

  protected static IStrategoConstructor _consDynRuleScopeId_1;

  protected static IStrategoConstructor _consLabeledDynRuleScopeId_2;

  protected static IStrategoConstructor _consExtOpDecl_2;

  protected static IStrategoConstructor _consOpDecl_2;

  protected static IStrategoConstructor _consOp_2;

  protected static IStrategoConstructor _consExtSDef_3;

  protected static IStrategoConstructor _consModule_2;

  protected static IStrategoConstructor _consmeta_listvar_1;

  protected static IStrategoConstructor _consmeta_var_1;

  protected static IStrategoConstructor _consFromStrategy_1;

  protected static IStrategoConstructor _consFromMetaListExpr_1;

  protected static IStrategoConstructor _consFromMetaExpr_1;

  protected static IStrategoConstructor _consFromTerm_1;

  protected static IStrategoConstructor _consSwitchCase_2;

  protected static IStrategoConstructor _consFail_0;

  protected static IStrategoConstructor _consSwitchChoice_3;

  protected static IStrategoConstructor _consSwitchChoiceNoOtherwise_2;

  protected static IStrategoConstructor _consToStrategy_1;

  protected static IStrategoConstructor _consToMetaListExpr_1;

  protected static IStrategoConstructor _consToTerm_1;

  protected static IStrategoConstructor _consToBuild_1;

  protected static IStrategoConstructor _consToMetaExpr_1;

  protected static IStrategoConstructor _consNot_1;

  protected static IStrategoConstructor _consCondChoice_3;

  protected static IStrategoConstructor _consRChoice_2;

  protected static IStrategoConstructor _consChoice_2;

  protected static IStrategoConstructor _consRuleNoCond_2;

  protected static IStrategoConstructor _consDefaultVarDec_1;

  protected static IStrategoConstructor _consListVar_1;

  protected static IStrategoConstructor _consCallNoArgs_1;

  protected static IStrategoConstructor _consCall_2;

  protected static IStrategoConstructor _consRDecNoArgs_1;

  protected static IStrategoConstructor _consOverlay_3;

  protected static IStrategoConstructor _consOverlayNoArgs_2;

  protected static IStrategoConstructor _consRDefNoArgs_2;

  protected static IStrategoConstructor _consSDefNoArgs_2;

  protected static IStrategoConstructor _consRDec_2;

  protected static IStrategoConstructor _consRDefT_4;

  protected static IStrategoConstructor _consSRule_1;

  protected static IStrategoConstructor _consRDef_3;

  protected static IStrategoConstructor _consSDef_3;

  protected static IStrategoConstructor _consRDecT_3;

  protected static IStrategoConstructor _consLet_2;

  protected static IStrategoConstructor _consImportWildcard_1;

  protected static IStrategoConstructor _consImport_1;

  protected static IStrategoConstructor _consNone_0;

  protected static IStrategoConstructor _consScope_2;

  protected static IStrategoConstructor _consLRule_1;

  protected static IStrategoConstructor _consRec_2;

  protected static IStrategoConstructor _consSortNoArgs_1;

  protected static IStrategoConstructor _consConstType_1;

  protected static IStrategoConstructor _consVarDec_2;

  protected static IStrategoConstructor _consSDefT_4;

  protected static IStrategoConstructor _consSVar_1;

  protected static IStrategoConstructor _consCallT_3;

  protected static IStrategoConstructor _consWith_1;

  protected static IStrategoConstructor _consNoAnnoList_1;

  protected static IStrategoConstructor _consVar_1;

  protected static IStrategoConstructor _consBA_2;

  protected static IStrategoConstructor _consWithClause_1;

  protected static IStrategoConstructor _consWhereClause_1;

  protected static IStrategoConstructor _consApp_2;

  protected static IStrategoConstructor _consRule_3;

  protected static IStrategoConstructor _consId_0;

  protected static IStrategoConstructor _consIfThen_2;

  protected static IStrategoConstructor _consWhere_1;

  protected static IStrategoConstructor _consLChoice_2;

  protected static IStrategoConstructor _consGuardedLChoice_3;

  protected static IStrategoConstructor _consSeq_2;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consFromBuild_1;

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
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_xtc.Main.init(context);
          org.strategoxt.stratego_aterm.Main.init(context);
          org.strategoxt.strc.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          org.strategoxt.imp.editors.stratego.strategies.Main.init(context);
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
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consIntCong_1 = termFactory.makeConstructor("IntCong", 1);
    _consStrCong_1 = termFactory.makeConstructor("StrCong", 1);
    _consStringQuotation4_2 = termFactory.makeConstructor("StringQuotation4", 2);
    _consStringQuotation3_2 = termFactory.makeConstructor("StringQuotation3", 2);
    _consStringQuotation2_2 = termFactory.makeConstructor("StringQuotation2", 2);
    _consStringQuotation1_2 = termFactory.makeConstructor("StringQuotation1", 2);
    _consBuildDefaultPT_1 = termFactory.makeConstructor("BuildDefaultPT", 1);
    _consBuildDefault_1 = termFactory.makeConstructor("BuildDefault", 1);
    _consBuild_1 = termFactory.makeConstructor("Build", 1);
    _consInternal_0 = termFactory.makeConstructor("Internal", 0);
    _consAnnoDef_2 = termFactory.makeConstructor("AnnoDef", 2);
    _consLabeledDynRuleId_2 = termFactory.makeConstructor("LabeledDynRuleId", 2);
    _consAs_2 = termFactory.makeConstructor("As", 2);
    _consRootApp_1 = termFactory.makeConstructor("RootApp", 1);
    _consAM_2 = termFactory.makeConstructor("AM", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consSetDynRule_2 = termFactory.makeConstructor("SetDynRule", 2);
    _consMatch_1 = termFactory.makeConstructor("Match", 1);
    _consScopeDefault_1 = termFactory.makeConstructor("ScopeDefault", 1);
    _consIncludeFromPath_1 = termFactory.makeConstructor("IncludeFromPath", 1);
    _consCritical_0 = termFactory.makeConstructor("Critical", 0);
    _consDynRuleScopeId_1 = termFactory.makeConstructor("DynRuleScopeId", 1);
    _consLabeledDynRuleScopeId_2 = termFactory.makeConstructor("LabeledDynRuleScopeId", 2);
    _consExtOpDecl_2 = termFactory.makeConstructor("ExtOpDecl", 2);
    _consOpDecl_2 = termFactory.makeConstructor("OpDecl", 2);
    _consOp_2 = termFactory.makeConstructor("Op", 2);
    _consExtSDef_3 = termFactory.makeConstructor("ExtSDef", 3);
    _consModule_2 = termFactory.makeConstructor("Module", 2);
    _consmeta_listvar_1 = termFactory.makeConstructor("meta-listvar", 1);
    _consmeta_var_1 = termFactory.makeConstructor("meta-var", 1);
    _consFromStrategy_1 = termFactory.makeConstructor("FromStrategy", 1);
    _consFromMetaListExpr_1 = termFactory.makeConstructor("FromMetaListExpr", 1);
    _consFromMetaExpr_1 = termFactory.makeConstructor("FromMetaExpr", 1);
    _consFromTerm_1 = termFactory.makeConstructor("FromTerm", 1);
    _consSwitchCase_2 = termFactory.makeConstructor("SwitchCase", 2);
    _consFail_0 = termFactory.makeConstructor("Fail", 0);
    _consSwitchChoice_3 = termFactory.makeConstructor("SwitchChoice", 3);
    _consSwitchChoiceNoOtherwise_2 = termFactory.makeConstructor("SwitchChoiceNoOtherwise", 2);
    _consToStrategy_1 = termFactory.makeConstructor("ToStrategy", 1);
    _consToMetaListExpr_1 = termFactory.makeConstructor("ToMetaListExpr", 1);
    _consToTerm_1 = termFactory.makeConstructor("ToTerm", 1);
    _consToBuild_1 = termFactory.makeConstructor("ToBuild", 1);
    _consToMetaExpr_1 = termFactory.makeConstructor("ToMetaExpr", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consCondChoice_3 = termFactory.makeConstructor("CondChoice", 3);
    _consRChoice_2 = termFactory.makeConstructor("RChoice", 2);
    _consChoice_2 = termFactory.makeConstructor("Choice", 2);
    _consRuleNoCond_2 = termFactory.makeConstructor("RuleNoCond", 2);
    _consDefaultVarDec_1 = termFactory.makeConstructor("DefaultVarDec", 1);
    _consListVar_1 = termFactory.makeConstructor("ListVar", 1);
    _consCallNoArgs_1 = termFactory.makeConstructor("CallNoArgs", 1);
    _consCall_2 = termFactory.makeConstructor("Call", 2);
    _consRDecNoArgs_1 = termFactory.makeConstructor("RDecNoArgs", 1);
    _consOverlay_3 = termFactory.makeConstructor("Overlay", 3);
    _consOverlayNoArgs_2 = termFactory.makeConstructor("OverlayNoArgs", 2);
    _consRDefNoArgs_2 = termFactory.makeConstructor("RDefNoArgs", 2);
    _consSDefNoArgs_2 = termFactory.makeConstructor("SDefNoArgs", 2);
    _consRDec_2 = termFactory.makeConstructor("RDec", 2);
    _consRDefT_4 = termFactory.makeConstructor("RDefT", 4);
    _consSRule_1 = termFactory.makeConstructor("SRule", 1);
    _consRDef_3 = termFactory.makeConstructor("RDef", 3);
    _consSDef_3 = termFactory.makeConstructor("SDef", 3);
    _consRDecT_3 = termFactory.makeConstructor("RDecT", 3);
    _consLet_2 = termFactory.makeConstructor("Let", 2);
    _consImportWildcard_1 = termFactory.makeConstructor("ImportWildcard", 1);
    _consImport_1 = termFactory.makeConstructor("Import", 1);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consScope_2 = termFactory.makeConstructor("Scope", 2);
    _consLRule_1 = termFactory.makeConstructor("LRule", 1);
    _consRec_2 = termFactory.makeConstructor("Rec", 2);
    _consSortNoArgs_1 = termFactory.makeConstructor("SortNoArgs", 1);
    _consConstType_1 = termFactory.makeConstructor("ConstType", 1);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consSDefT_4 = termFactory.makeConstructor("SDefT", 4);
    _consSVar_1 = termFactory.makeConstructor("SVar", 1);
    _consCallT_3 = termFactory.makeConstructor("CallT", 3);
    _consWith_1 = termFactory.makeConstructor("With", 1);
    _consNoAnnoList_1 = termFactory.makeConstructor("NoAnnoList", 1);
    _consVar_1 = termFactory.makeConstructor("Var", 1);
    _consBA_2 = termFactory.makeConstructor("BA", 2);
    _consWithClause_1 = termFactory.makeConstructor("WithClause", 1);
    _consWhereClause_1 = termFactory.makeConstructor("WhereClause", 1);
    _consApp_2 = termFactory.makeConstructor("App", 2);
    _consRule_3 = termFactory.makeConstructor("Rule", 3);
    _consId_0 = termFactory.makeConstructor("Id", 0);
    _consIfThen_2 = termFactory.makeConstructor("IfThen", 2);
    _consWhere_1 = termFactory.makeConstructor("Where", 1);
    _consLChoice_2 = termFactory.makeConstructor("LChoice", 2);
    _consGuardedLChoice_3 = termFactory.makeConstructor("GuardedLChoice", 3);
    _consSeq_2 = termFactory.makeConstructor("Seq", 2);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consFromBuild_1 = termFactory.makeConstructor("FromBuild", 1);
    _consType_1 = termFactory.makeConstructor("Type", 1);
    _consProperty_2 = termFactory.makeConstructor("Property", 2);
    _consEntity_2 = termFactory.makeConstructor("Entity", 2);
    _consMARKER_0 = termFactory.makeConstructor("MARKER", 0);
    _consNOCONTEXT_1 = termFactory.makeConstructor("NOCONTEXT", 1);
    _consCOMPLETION_1 = termFactory.makeConstructor("COMPLETION", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil4 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const4437 = termFactory.makeInt(0);
    constCons2043 = (IStrategoTerm)termFactory.makeListCons(trans.const4437, (IStrategoList)trans.constNil4);
    constId0 = termFactory.makeAppl(Main._consId_0, NO_TERMS);
    const4438 = termFactory.makeString("Defs: ");
    const4439 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'precondition-warning'");
    const4440 = termFactory.makeString("\n");
    const4441 = termFactory.makeString("\n                       ");
    const4442 = termFactory.makeString("selection extended to: ");
    const4443 = termFactory.makeString("1: ");
    const4444 = termFactory.makeString("2: ");
    const4445 = termFactory.makeString("3: ");
    const4446 = termFactory.makeString("4: ");
    const4447 = termFactory.makeString("6: ");
    const4448 = termFactory.makeString("7: ");
    const4449 = termFactory.makeString("8: ");
    const4450 = termFactory.makeString("9: ");
    const4451 = termFactory.makeString(")");
    constCons2044 = (IStrategoTerm)termFactory.makeListCons(trans.const4451, (IStrategoList)trans.constNil4);
    const4452 = termFactory.makeString("(");
    const4453 = termFactory.makeString("ATerm");
    constSortNoArgs0 = termFactory.makeAppl(Main._consSortNoArgs_1, new IStrategoTerm[]{trans.const4453});
    constConstType0 = termFactory.makeAppl(Main._consConstType_1, new IStrategoTerm[]{trans.constSortNoArgs0});
    const4454 = termFactory.makeString("No declaration found. Libary strategy?");
    constCons2045 = (IStrategoTerm)termFactory.makeListCons(trans.const4454, (IStrategoList)trans.constNil4);
    const4455 = termFactory.makeTuple(trans.constNil4, trans.constCons2045, trans.constNil4, trans.constNil4);
    const4456 = termFactory.makeString("strategy declaration contains recursive call");
    const4457 = termFactory.makeString("multiple declarations found, refactoring may change behaviour by introducing determinism");
    const4458 = termFactory.makeString("NEWNAME");
    const4459 = termFactory.makeString("x.aterm");
    constNone0 = termFactory.makeAppl(Main._consNone_0, NO_TERMS);
    const4460 = termFactory.makeString("MyStrategy");
    const4461 = termFactory.makeString("number of affected files: ");
    const4462 = termFactory.makeString("fatal-errors: ");
    const4463 = termFactory.makeString("errors: ");
    const4464 = termFactory.makeString("warnings: ");
    const4465 = termFactory.makeString("pp: ");
    const4466 = termFactory.makeString("x.str");
    const4467 = termFactory.makeString("str");
    const4468 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'get-affected-stratego-asts'");
    const4469 = termFactory.makeString("/trans");
    constCons2046 = (IStrategoTerm)termFactory.makeListCons(trans.const4469, (IStrategoList)trans.constNil4);
    const4470 = termFactory.makeString(".str.sig");
    const4471 = termFactory.makeString(".rtree");
    const4472 = termFactory.makeString("");
    const4473 = termFactory.makeString("CurrentFile");
    constDR_DUMMY0 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons2047 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY0, (IStrategoList)trans.constNil4);
    const4474 = termFactory.makeString("99705");
    const4475 = termFactory.makeString("ProjectDir");
    const4476 = termFactory.makeString("-231360");
    const4477 = termFactory.makeString("libstratego-lib");
    constImport0 = termFactory.makeAppl(Main._consImport_1, new IStrategoTerm[]{trans.const4477});
    const4478 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'get-source-files'");
    const4479 = termFactory.makeString("\n           ");
    const4480 = termFactory.makeString("/");
    const4481 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'spoofax-dirs'");
    const4482 = termFactory.makeString("\n                 ");
    const4483 = termFactory.makeString("trans");
    constCons2048 = (IStrategoTerm)termFactory.makeListCons(trans.const4483, (IStrategoList)trans.constNil4);
    const4484 = termFactory.makeString(".svn");
    constCons2049 = (IStrategoTerm)termFactory.makeListCons(trans.const4484, (IStrategoList)trans.constCons2048);
    const4485 = termFactory.makeString(".settings");
    constCons2050 = (IStrategoTerm)termFactory.makeListCons(trans.const4485, (IStrategoList)trans.constCons2049);
    const4486 = termFactory.makeString(".externalToolBuilders");
    constCons2051 = (IStrategoTerm)termFactory.makeListCons(trans.const4486, (IStrategoList)trans.constCons2050);
    const4487 = termFactory.makeString(".cache");
    constCons2052 = (IStrategoTerm)termFactory.makeListCons(trans.const4487, (IStrategoList)trans.constCons2051);
    const4488 = termFactory.makeString("utils");
    constCons2053 = (IStrategoTerm)termFactory.makeListCons(trans.const4488, (IStrategoList)trans.constCons2052);
    const4489 = termFactory.makeString("syntax");
    constCons2054 = (IStrategoTerm)termFactory.makeListCons(trans.const4489, (IStrategoList)trans.constCons2053);
    const4490 = termFactory.makeString("META-INF");
    constCons2055 = (IStrategoTerm)termFactory.makeListCons(trans.const4490, (IStrategoList)trans.constCons2054);
    const4491 = termFactory.makeString("include");
    constCons2056 = (IStrategoTerm)termFactory.makeListCons(trans.const4491, (IStrategoList)trans.constCons2055);
    const4492 = termFactory.makeString("icons");
    constCons2057 = (IStrategoTerm)termFactory.makeListCons(trans.const4492, (IStrategoList)trans.constCons2056);
    const4493 = termFactory.makeString("editor");
    constCons2058 = (IStrategoTerm)termFactory.makeListCons(trans.const4493, (IStrategoList)trans.constCons2057);
    const4494 = termFactory.makeString("bin");
    constCons2059 = (IStrategoTerm)termFactory.makeListCons(trans.const4494, (IStrategoList)trans.constCons2058);
    const4495 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'mk-binding-violation-message'");
    const4496 = termFactory.makeString("\n                                 ");
    const4497 = termFactory.makeString("'");
    constCons2060 = (IStrategoTerm)termFactory.makeListCons(trans.const4497, (IStrategoList)trans.constNil4);
    const4498 = termFactory.makeString("Variabele captures detected for '");
    const4499 = termFactory.makeString("spt");
    const4500 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'get-dependend-renamings'");
    const4501 = termFactory.makeString("\n       ");
    const4502 = termFactory.makeString("-");
    const4503 = termFactory.makeString("bigfold");
    constCons2061 = (IStrategoTerm)termFactory.makeListCons(trans.const4503, (IStrategoList)trans.constNil4);
    const4504 = termFactory.makeString("fold");
    constCons2062 = (IStrategoTerm)termFactory.makeListCons(trans.const4504, (IStrategoList)trans.constCons2061);
    const4505 = termFactory.makeString("throw");
    constCons2063 = (IStrategoTerm)termFactory.makeListCons(trans.const4505, (IStrategoList)trans.constCons2062);
    const4506 = termFactory.makeString("continue-to-label");
    constCons2064 = (IStrategoTerm)termFactory.makeListCons(trans.const4506, (IStrategoList)trans.constCons2063);
    const4507 = termFactory.makeString("break-to-label");
    constCons2065 = (IStrategoTerm)termFactory.makeListCons(trans.const4507, (IStrategoList)trans.constCons2064);
    const4508 = termFactory.makeString("innermost-scope");
    constCons2066 = (IStrategoTerm)termFactory.makeListCons(trans.const4508, (IStrategoList)trans.constCons2065);
    const4509 = termFactory.makeString("reverse-bagof");
    constCons2067 = (IStrategoTerm)termFactory.makeListCons(trans.const4509, (IStrategoList)trans.constCons2066);
    const4510 = termFactory.makeString("aux");
    constCons2068 = (IStrategoTerm)termFactory.makeListCons(trans.const4510, (IStrategoList)trans.constCons2067);
    const4511 = termFactory.makeString("undefine");
    constCons2069 = (IStrategoTerm)termFactory.makeListCons(trans.const4511, (IStrategoList)trans.constCons2068);
    const4512 = termFactory.makeString("new");
    constCons2070 = (IStrategoTerm)termFactory.makeListCons(trans.const4512, (IStrategoList)trans.constCons2069);
    const4513 = termFactory.makeString("bigchain");
    constCons2071 = (IStrategoTerm)termFactory.makeListCons(trans.const4513, (IStrategoList)trans.constCons2070);
    const4514 = termFactory.makeString("chain");
    constCons2072 = (IStrategoTerm)termFactory.makeListCons(trans.const4514, (IStrategoList)trans.constCons2071);
    const4515 = termFactory.makeString("continue");
    constCons2073 = (IStrategoTerm)termFactory.makeListCons(trans.const4515, (IStrategoList)trans.constCons2072);
    const4516 = termFactory.makeString("break-bp");
    constCons2074 = (IStrategoTerm)termFactory.makeListCons(trans.const4516, (IStrategoList)trans.constCons2073);
    const4517 = termFactory.makeString("break");
    constCons2075 = (IStrategoTerm)termFactory.makeListCons(trans.const4517, (IStrategoList)trans.constCons2074);
    constCons2076 = (IStrategoTerm)termFactory.makeListCons(trans.const4508, (IStrategoList)trans.constCons2075);
    const4518 = termFactory.makeString("all-keys");
    constCons2077 = (IStrategoTerm)termFactory.makeListCons(trans.const4518, (IStrategoList)trans.constCons2076);
    const4519 = termFactory.makeString("bigbagof");
    constCons2078 = (IStrategoTerm)termFactory.makeListCons(trans.const4519, (IStrategoList)trans.constCons2077);
    const4520 = termFactory.makeString("bagof");
    constCons2079 = (IStrategoTerm)termFactory.makeListCons(trans.const4520, (IStrategoList)trans.constCons2078);
    const4521 = termFactory.makeString("once");
    constCons2080 = (IStrategoTerm)termFactory.makeListCons(trans.const4521, (IStrategoList)trans.constCons2079);
    const4522 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'get-asts-affected-by-renaming'");
    const4523 = termFactory.makeString("\n                     ");
    const4524 = termFactory.makeString("parsing failed for: '");
    const4525 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'declared-in-generated-file'");
    const4526 = termFactory.makeString("\n        ");
    const4527 = termFactory.makeString(" can not be edited");
    constCons2081 = (IStrategoTerm)termFactory.makeListCons(trans.const4527, (IStrategoList)trans.constNil4);
    const4528 = termFactory.makeString("Name in ");
    const4529 = termFactory.makeString("Ext");
    const4530 = termFactory.makeString("External declaration can not be edited");
    constCons2082 = (IStrategoTerm)termFactory.makeListCons(trans.const4530, (IStrategoList)trans.constNil4);
    const4531 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'dirs-with-generated-files'");
    const4532 = termFactory.makeString("/include");
    constCons2083 = (IStrategoTerm)termFactory.makeListCons(trans.const4532, (IStrategoList)trans.constNil4);
    const4533 = termFactory.makeString("/lib");
    constCons2084 = (IStrategoTerm)termFactory.makeListCons(trans.const4533, (IStrategoList)trans.constNil4);
    const4534 = termFactory.makeString("/lib-refactoring");
    constCons2085 = (IStrategoTerm)termFactory.makeListCons(trans.const4534, (IStrategoList)trans.constNil4);
    const4535 = termFactory.makeString(".generated.str");
    constStrategoSugarTbl = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.tbl");
    constStrategoSugarTbl0 = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.tbl");
    constStrategoSugarTbl1 = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.tbl");
    constStrategoSugarGeneratedPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.generated.pp.af");
    constStrategoSugarPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.pp.af");
    const4536 = termFactory.makeInt(100);
    const4537 = termFactory.makeString("IsImported");
    const4538 = termFactory.makeString("-597601");
    const4539 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const4540 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const4541 = termFactory.makeString("/.cache");
    constCons2086 = (IStrategoTerm)termFactory.makeListCons(trans.const4541, (IStrategoList)trans.constNil4);
    const4542 = termFactory.makeString("+");
    const4543 = termFactory.makeString("\\");
    const4544 = termFactory.makeString(":");
    const4545 = termFactory.makeString("\n            ");
    const4546 = termFactory.makeString(".sig");
    constCons2087 = (IStrategoTerm)termFactory.makeListCons(trans.const4546, (IStrategoList)trans.constNil4);
    const4547 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    const4548 = termFactory.makeString("Stratego-Sugar");
    constMARKER0 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons2088 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER0, (IStrategoList)trans.constNil4);
    const4549 = termFactory.makeString("BACKGROUNDED");
    constFail0 = termFactory.makeAppl(Main._consFail_0, NO_TERMS);
    const4550 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'extract-meta-expr-escapes'");
    const4551 = termFactory.makeInt(47);
    const4552 = termFactory.makeString("SourceDir");
    const4553 = termFactory.makeString("1354");
    const4554 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'analyze-ast'");
    const4555 = termFactory.makeString("\n               ");
    const4556 = termFactory.makeString("CurrentDir");
    const4557 = termFactory.makeString("-237042");
    const4558 = termFactory.makeString("/.disable-global-analysis");
    constCons2089 = (IStrategoTerm)termFactory.makeListCons(trans.const4558, (IStrategoList)trans.constNil4);
    const4559 = termFactory.makeString("NoAnalysis");
    const4560 = termFactory.makeString("-546490");
    const4561 = termFactory.makeString("/.warn-global-analysis");
    constCons2090 = (IStrategoTerm)termFactory.makeListCons(trans.const4561, (IStrategoList)trans.constNil4);
    const4562 = termFactory.makeString("WarnAnalysis");
    const4563 = termFactory.makeString("-504485");
    const4564 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-ast'");
    const4565 = termFactory.makeString("DecoratedAst");
    const4566 = termFactory.makeString("-581518");
    const4567 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'remove-quote'");
    const4568 = termFactory.makeString("DeclareCookie");
    const4569 = termFactory.makeString("-783129");
    const4570 = termFactory.makeString("Declaration");
    const4571 = termFactory.makeString("-415135");
    const4572 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-definition'");
    const4573 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'redeclare-definition'");
    constCritical0 = termFactory.makeAppl(Main._consCritical_0, NO_TERMS);
    const4574 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'declare-globals-top'");
    const4575 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-globals'");
    const4576 = termFactory.makeString("IsImportedFailed");
    const4577 = termFactory.makeString("-26001");
    const4578 = termFactory.makeString("rtree");
    const4579 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'open-import'");
    const4580 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'resolve-import-decl'");
    const4581 = termFactory.makeString(".str");
    constCons2091 = (IStrategoTerm)termFactory.makeListCons(trans.const4581, (IStrategoList)trans.constNil4);
    constCons2092 = (IStrategoTerm)termFactory.makeListCons(trans.const4471, (IStrategoList)trans.constNil4);
    const4582 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'load-include-properties'");
    const4583 = termFactory.makeString("/.settings/org.strategoxt.imp.editors.stratego.prefs");
    constCons2093 = (IStrategoTerm)termFactory.makeListCons(trans.const4583, (IStrategoList)trans.constNil4);
    const4584 = termFactory.makeString("MemoizeIncludeProperties");
    const4585 = termFactory.makeString("-64933");
    const4586 = termFactory.makeInt(32);
    constCons2094 = (IStrategoTerm)termFactory.makeListCons(trans.const4586, (IStrategoList)trans.constNil4);
    const4587 = termFactory.makeString("src/syntax");
    constCons2095 = (IStrategoTerm)termFactory.makeListCons(trans.const4587, (IStrategoList)trans.constNil4);
    const4588 = termFactory.makeString("syn");
    constCons2096 = (IStrategoTerm)termFactory.makeListCons(trans.const4588, (IStrategoList)trans.constCons2095);
    constCons2097 = (IStrategoTerm)termFactory.makeListCons(trans.const4489, (IStrategoList)trans.constCons2096);
    const4589 = termFactory.makeString("src");
    constCons2098 = (IStrategoTerm)termFactory.makeListCons(trans.const4589, (IStrategoList)trans.constCons2097);
    const4590 = termFactory.makeString("lib");
    constCons2099 = (IStrategoTerm)termFactory.makeListCons(trans.const4590, (IStrategoList)trans.constCons2098);
    constCons2100 = (IStrategoTerm)termFactory.makeListCons(trans.const4483, (IStrategoList)trans.constCons2099);
    constCons2101 = (IStrategoTerm)termFactory.makeListCons(trans.const4472, (IStrategoList)trans.constCons2100);
    const4591 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'default-include-paths'");
    const4592 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'expand-relative-path'");
    const4593 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'resolve-import-path'");
    const4594 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'remove-stratego-bodies'");
    const4595 = termFactory.makeTuple();
    const4596 = termFactory.makeInt(2);
    const4597 = termFactory.makeInt(1);
    constCons2102 = (IStrategoTerm)termFactory.makeListCons(trans.const4506, (IStrategoList)trans.constNil4);
    constCons2103 = (IStrategoTerm)termFactory.makeListCons(trans.const4507, (IStrategoList)trans.constCons2102);
    constCons2104 = (IStrategoTerm)termFactory.makeListCons(trans.const4513, (IStrategoList)trans.constNil4);
    constCons2105 = (IStrategoTerm)termFactory.makeListCons(trans.const4514, (IStrategoList)trans.constCons2104);
    constCons2106 = (IStrategoTerm)termFactory.makeListCons(trans.const4515, (IStrategoList)trans.constCons2105);
    constCons2107 = (IStrategoTerm)termFactory.makeListCons(trans.const4516, (IStrategoList)trans.constCons2106);
    constCons2108 = (IStrategoTerm)termFactory.makeListCons(trans.const4517, (IStrategoList)trans.constCons2107);
    constCons2109 = (IStrategoTerm)termFactory.makeListCons(trans.const4508, (IStrategoList)trans.constCons2108);
    constCons2110 = (IStrategoTerm)termFactory.makeListCons(trans.const4518, (IStrategoList)trans.constCons2109);
    constCons2111 = (IStrategoTerm)termFactory.makeListCons(trans.const4519, (IStrategoList)trans.constCons2110);
    constCons2112 = (IStrategoTerm)termFactory.makeListCons(trans.const4520, (IStrategoList)trans.constCons2111);
    constCons2113 = (IStrategoTerm)termFactory.makeListCons(trans.const4521, (IStrategoList)trans.constCons2112);
    const4598 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-dynrule'");
    const4599 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'declare-dr-rule'");
    const4600 = termFactory.makeString("\n         ");
    const4601 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'dr-scope-declare-cookies'");
    const4602 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-bodies'");
    constCons2114 = (IStrategoTerm)termFactory.makeListCons(trans.const4568, (IStrategoList)trans.constNil4);
    const4603 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-let-definition'");
    const4604 = termFactory.makeString("OuterCookie");
    const4605 = termFactory.makeString("-802723");
    const4606 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'scope-variables'");
    const4607 = termFactory.makeString("-670577");
    const4608 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-svar'");
    const4609 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-tvar'");
    const4610 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-var'");
    const4611 = termFactory.makeString("ContentProposals");
    const4612 = termFactory.makeString("-535431");
    const4613 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'propose-completion'");
    const4614 = termFactory.makeString(", ");
    const4615 = termFactory.makeString("()");
    constCons2115 = (IStrategoTerm)termFactory.makeListCons(trans.const4615, (IStrategoList)trans.constNil4);
    const4616 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'signature-to-proposal'");
    const4617 = termFactory.makeString("t");
    constCons2116 = (IStrategoTerm)termFactory.makeListCons(trans.const4472, (IStrategoList)trans.constNil4);
    const4618 = termFactory.makeString("s");
    const4619 = termFactory.makeString("(|");
    const4620 = termFactory.makeString("|");
    const4621 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'global-constraint-error'");
    const4622 = termFactory.makeString("\n                  ");
    const4623 = termFactory.makeString("' not defined");
    constCons2117 = (IStrategoTerm)termFactory.makeListCons(trans.const4623, (IStrategoList)trans.constNil4);
    const4624 = termFactory.makeString("Strategy or rule '");
    const4625 = termFactory.makeString("\n                ");
    const4626 = termFactory.makeString(" not declared");
    constCons2118 = (IStrategoTerm)termFactory.makeListCons(trans.const4626, (IStrategoList)trans.constNil4);
    const4627 = termFactory.makeString("Constructor ");
    const4628 = termFactory.makeString("Unable to import '");
    const4629 = termFactory.makeString("\n              ");
    const4630 = termFactory.makeString("Dynamic rule '");
    const4631 = termFactory.makeString("\n                                       ");
    const4632 = termFactory.makeString("Conflicts with external definition of '");
    const4633 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'constraint-error'");
    const4634 = termFactory.makeString("\n          ");
    const4635 = termFactory.makeString("' is not declared");
    constCons2119 = (IStrategoTerm)termFactory.makeListCons(trans.const4635, (IStrategoList)trans.constNil4);
    const4636 = termFactory.makeString("Variable '");
    const4637 = termFactory.makeString("IsNoConflict");
    const4638 = termFactory.makeString("17917");
    const4639 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'constraint-error'");
    const4640 = termFactory.makeString("\n                              ");
    const4641 = termFactory.makeString("No external strategy or rule '");
    const4642 = termFactory.makeString("\n                         ");
    const4643 = termFactory.makeString("Conflicts with strategy '");
    const4644 = termFactory.makeString("\n                           ");
    const4645 = termFactory.makeString("\n                               ");
    const4646 = termFactory.makeString("Conflicts with constructor ");
    const4647 = termFactory.makeString("Match symbol in build pattern");
    const4648 = termFactory.makeString("Build symbol in match pattern");
    const4649 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'constraint-warning'");
    const4650 = termFactory.makeString("' may be bound already");
    constCons2120 = (IStrategoTerm)termFactory.makeListCons(trans.const4650, (IStrategoList)trans.constNil4);
    const4651 = termFactory.makeString("\n                                  ");
    const4652 = termFactory.makeString("()' instead");
    constCons2121 = (IStrategoTerm)termFactory.makeListCons(trans.const4652, (IStrategoList)trans.constNil4);
    const4653 = termFactory.makeString("Unparenthesized constructor: use '");
    const4654 = termFactory.makeString("Should be '!");
    const4655 = termFactory.makeString("Use 'import libjava-front' instead");
    const4656 = termFactory.makeString("Module name does not correspond to file name");
    constCons2122 = (IStrategoTerm)termFactory.makeListCons(trans.const4656, (IStrategoList)trans.constNil4);
    const4657 = termFactory.makeString("../");
    const4658 = termFactory.makeString("Relative path in import");
    constCons2123 = (IStrategoTerm)termFactory.makeListCons(trans.const4658, (IStrategoList)trans.constNil4);
    const4659 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const4660 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-complete'");
    const4661 = termFactory.makeString("</pre>");
    constCons2124 = (IStrategoTerm)termFactory.makeListCons(trans.const4661, (IStrategoList)trans.constNil4);
    const4662 = termFactory.makeString("<pre>");
    const4663 = termFactory.makeString("aterm");
    const4664 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-aterm'");
    const4665 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-desugared-aterm'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}