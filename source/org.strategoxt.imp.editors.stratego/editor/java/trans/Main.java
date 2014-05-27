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

  protected static IStrategoTerm const4455;

  protected static IStrategoTerm const4454;

  protected static IStrategoTerm const4453;

  protected static IStrategoTerm const4452;

  protected static IStrategoTerm constCons2043;

  protected static IStrategoTerm const4451;

  protected static IStrategoTerm const4450;

  protected static IStrategoTerm const4449;

  protected static IStrategoTerm constCons2042;

  protected static IStrategoTerm const4448;

  protected static IStrategoTerm const4447;

  protected static IStrategoTerm constCons2041;

  protected static IStrategoTerm const4446;

  protected static IStrategoTerm const4445;

  protected static IStrategoTerm const4444;

  protected static IStrategoTerm const4443;

  protected static IStrategoTerm constCons2040;

  protected static IStrategoTerm const4442;

  protected static IStrategoTerm const4441;

  protected static IStrategoTerm constCons2039;

  protected static IStrategoTerm const4440;

  protected static IStrategoTerm const4439;

  protected static IStrategoTerm const4438;

  protected static IStrategoTerm const4437;

  protected static IStrategoTerm const4436;

  protected static IStrategoTerm const4435;

  protected static IStrategoTerm const4434;

  protected static IStrategoTerm const4433;

  protected static IStrategoTerm const4432;

  protected static IStrategoTerm const4431;

  protected static IStrategoTerm const4430;

  protected static IStrategoTerm const4429;

  protected static IStrategoTerm const4428;

  protected static IStrategoTerm const4427;

  protected static IStrategoTerm const4426;

  protected static IStrategoTerm constCons2038;

  protected static IStrategoTerm const4425;

  protected static IStrategoTerm const4424;

  protected static IStrategoTerm const4423;

  protected static IStrategoTerm const4422;

  protected static IStrategoTerm const4421;

  protected static IStrategoTerm const4420;

  protected static IStrategoTerm const4419;

  protected static IStrategoTerm const4418;

  protected static IStrategoTerm const4417;

  protected static IStrategoTerm constCons2037;

  protected static IStrategoTerm const4416;

  protected static IStrategoTerm const4415;

  protected static IStrategoTerm const4414;

  protected static IStrategoTerm constCons2036;

  protected static IStrategoTerm const4413;

  protected static IStrategoTerm const4412;

  protected static IStrategoTerm const4411;

  protected static IStrategoTerm const4410;

  protected static IStrategoTerm const4409;

  protected static IStrategoTerm const4408;

  protected static IStrategoTerm constCons2035;

  protected static IStrategoTerm const4407;

  protected static IStrategoTerm const4406;

  protected static IStrategoTerm constCons2034;

  protected static IStrategoTerm const4405;

  protected static IStrategoTerm const4404;

  protected static IStrategoTerm const4403;

  protected static IStrategoTerm const4402;

  protected static IStrategoTerm const4401;

  protected static IStrategoTerm const4400;

  protected static IStrategoTerm const4399;

  protected static IStrategoTerm const4398;

  protected static IStrategoTerm const4397;

  protected static IStrategoTerm const4396;

  protected static IStrategoTerm const4395;

  protected static IStrategoTerm const4394;

  protected static IStrategoTerm const4393;

  protected static IStrategoTerm constCons2033;

  protected static IStrategoTerm const4392;

  protected static IStrategoTerm const4391;

  protected static IStrategoTerm const4390;

  protected static IStrategoTerm const4389;

  protected static IStrategoTerm const4388;

  protected static IStrategoTerm constCons2032;

  protected static IStrategoTerm constCons2031;

  protected static IStrategoTerm constCons2030;

  protected static IStrategoTerm constCons2029;

  protected static IStrategoTerm constCons2028;

  protected static IStrategoTerm constCons2027;

  protected static IStrategoTerm constCons2026;

  protected static IStrategoTerm constCons2025;

  protected static IStrategoTerm constCons2024;

  protected static IStrategoTerm constCons2023;

  protected static IStrategoTerm constCons2022;

  protected static IStrategoTerm constCons2021;

  protected static IStrategoTerm const4387;

  protected static IStrategoTerm const4386;

  protected static IStrategoTerm const4385;

  protected static IStrategoTerm const4384;

  protected static IStrategoTerm const4383;

  protected static IStrategoTerm const4382;

  protected static IStrategoTerm const4381;

  protected static IStrategoTerm constCons2020;

  protected static IStrategoTerm constCons2019;

  protected static IStrategoTerm constCons2018;

  protected static IStrategoTerm const4380;

  protected static IStrategoTerm constCons2017;

  protected static IStrategoTerm const4379;

  protected static IStrategoTerm constCons2016;

  protected static IStrategoTerm constCons2015;

  protected static IStrategoTerm const4378;

  protected static IStrategoTerm constCons2014;

  protected static IStrategoTerm const4377;

  protected static IStrategoTerm constCons2013;

  protected static IStrategoTerm const4376;

  protected static IStrategoTerm const4375;

  protected static IStrategoTerm const4374;

  protected static IStrategoTerm constCons2012;

  protected static IStrategoTerm const4373;

  protected static IStrategoTerm const4372;

  protected static IStrategoTerm constCons2011;

  protected static IStrategoTerm constCons2010;

  protected static IStrategoTerm const4371;

  protected static IStrategoTerm const4370;

  protected static IStrategoTerm const4369;

  protected static IStrategoTerm const4368;

  protected static IStrategoTerm const4367;

  protected static IStrategoTerm const4366;

  protected static IStrategoTerm const4365;

  protected static IStrategoTerm const4364;

  protected static IStrategoTerm constCritical0;

  protected static IStrategoTerm const4363;

  protected static IStrategoTerm const4362;

  protected static IStrategoTerm const4361;

  protected static IStrategoTerm const4360;

  protected static IStrategoTerm const4359;

  protected static IStrategoTerm const4358;

  protected static IStrategoTerm const4357;

  protected static IStrategoTerm const4356;

  protected static IStrategoTerm const4355;

  protected static IStrategoTerm const4354;

  protected static IStrategoTerm const4353;

  protected static IStrategoTerm const4352;

  protected static IStrategoTerm constCons2009;

  protected static IStrategoTerm const4351;

  protected static IStrategoTerm const4350;

  protected static IStrategoTerm const4349;

  protected static IStrategoTerm constCons2008;

  protected static IStrategoTerm const4348;

  protected static IStrategoTerm const4347;

  protected static IStrategoTerm const4346;

  protected static IStrategoTerm const4345;

  protected static IStrategoTerm const4344;

  protected static IStrategoTerm const4343;

  protected static IStrategoTerm const4342;

  protected static IStrategoTerm const4341;

  protected static IStrategoTerm const4340;

  protected static IStrategoTerm constFail0;

  protected static IStrategoTerm const4339;

  protected static IStrategoTerm constCons2007;

  protected static IStrategoTerm constMARKER0;

  protected static IStrategoTerm const4338;

  protected static IStrategoTerm const4337;

  protected static IStrategoTerm constCons2006;

  protected static IStrategoTerm const4336;

  protected static IStrategoTerm const4335;

  protected static IStrategoTerm const4334;

  protected static IStrategoTerm const4333;

  protected static IStrategoTerm const4332;

  protected static IStrategoTerm constCons2005;

  protected static IStrategoTerm const4331;

  protected static IStrategoTerm const4330;

  protected static IStrategoTerm const4329;

  protected static IStrategoTerm const4328;

  protected static IStrategoTerm const4327;

  protected static IStrategoTerm const4326;

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

  protected static IStrategoTerm const4325;

  protected static IStrategoTerm constCons2004;

  protected static IStrategoTerm const4324;

  protected static IStrategoTerm constCons2003;

  protected static IStrategoTerm const4323;

  protected static IStrategoTerm constCons2002;

  protected static IStrategoTerm const4322;

  protected static IStrategoTerm const4321;

  protected static IStrategoTerm constCons2001;

  protected static IStrategoTerm const4320;

  protected static IStrategoTerm const4319;

  protected static IStrategoTerm const4318;

  protected static IStrategoTerm constCons2000;

  protected static IStrategoTerm const4317;

  protected static IStrategoTerm const4316;

  protected static IStrategoTerm const4315;

  protected static IStrategoTerm const4314;

  protected static IStrategoTerm const4313;

  protected static IStrategoTerm const4312;

  protected static IStrategoTerm constCons1999;

  protected static IStrategoTerm const4311;

  protected static IStrategoTerm constCons1998;

  protected static IStrategoTerm const4310;

  protected static IStrategoTerm constCons1997;

  protected static IStrategoTerm const4309;

  protected static IStrategoTerm constCons1996;

  protected static IStrategoTerm const4308;

  protected static IStrategoTerm constCons1995;

  protected static IStrategoTerm constCons1994;

  protected static IStrategoTerm const4307;

  protected static IStrategoTerm constCons1993;

  protected static IStrategoTerm const4306;

  protected static IStrategoTerm constCons1992;

  protected static IStrategoTerm const4305;

  protected static IStrategoTerm constCons1991;

  protected static IStrategoTerm const4304;

  protected static IStrategoTerm constCons1990;

  protected static IStrategoTerm const4303;

  protected static IStrategoTerm constCons1989;

  protected static IStrategoTerm const4302;

  protected static IStrategoTerm constCons1988;

  protected static IStrategoTerm const4301;

  protected static IStrategoTerm constCons1987;

  protected static IStrategoTerm const4300;

  protected static IStrategoTerm constCons1986;

  protected static IStrategoTerm const4299;

  protected static IStrategoTerm constCons1985;

  protected static IStrategoTerm const4298;

  protected static IStrategoTerm constCons1984;

  protected static IStrategoTerm const4297;

  protected static IStrategoTerm constCons1983;

  protected static IStrategoTerm const4296;

  protected static IStrategoTerm constCons1982;

  protected static IStrategoTerm const4295;

  protected static IStrategoTerm constCons1981;

  protected static IStrategoTerm const4294;

  protected static IStrategoTerm constCons1980;

  protected static IStrategoTerm const4293;

  protected static IStrategoTerm const4292;

  protected static IStrategoTerm const4291;

  protected static IStrategoTerm const4290;

  protected static IStrategoTerm const4289;

  protected static IStrategoTerm const4288;

  protected static IStrategoTerm constCons1979;

  protected static IStrategoTerm const4287;

  protected static IStrategoTerm const4286;

  protected static IStrategoTerm const4285;

  protected static IStrategoTerm constCons1978;

  protected static IStrategoTerm const4284;

  protected static IStrategoTerm constCons1977;

  protected static IStrategoTerm const4283;

  protected static IStrategoTerm constCons1976;

  protected static IStrategoTerm const4282;

  protected static IStrategoTerm constCons1975;

  protected static IStrategoTerm const4281;

  protected static IStrategoTerm constCons1974;

  protected static IStrategoTerm const4280;

  protected static IStrategoTerm constCons1973;

  protected static IStrategoTerm const4279;

  protected static IStrategoTerm constCons1972;

  protected static IStrategoTerm const4278;

  protected static IStrategoTerm constCons1971;

  protected static IStrategoTerm const4277;

  protected static IStrategoTerm constCons1970;

  protected static IStrategoTerm const4276;

  protected static IStrategoTerm constCons1969;

  protected static IStrategoTerm const4275;

  protected static IStrategoTerm constCons1968;

  protected static IStrategoTerm const4274;

  protected static IStrategoTerm constCons1967;

  protected static IStrategoTerm const4273;

  protected static IStrategoTerm const4272;

  protected static IStrategoTerm const4271;

  protected static IStrategoTerm const4270;

  protected static IStrategoTerm const4269;

  protected static IStrategoTerm const4268;

  protected static IStrategoTerm constImport0;

  protected static IStrategoTerm const4267;

  protected static IStrategoTerm const4266;

  protected static IStrategoTerm const4265;

  protected static IStrategoTerm const4264;

  protected static IStrategoTerm constCons1966;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const4263;

  protected static IStrategoTerm const4262;

  protected static IStrategoTerm const4261;

  protected static IStrategoTerm const4260;

  protected static IStrategoTerm constCons1965;

  protected static IStrategoTerm const4259;

  protected static IStrategoTerm const4258;

  protected static IStrategoTerm const4257;

  protected static IStrategoTerm const4256;

  protected static IStrategoTerm const4255;

  protected static IStrategoTerm const4254;

  protected static IStrategoTerm const4253;

  protected static IStrategoTerm const4252;

  protected static IStrategoTerm const4251;

  protected static IStrategoTerm const4250;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const4249;

  protected static IStrategoTerm const4248;

  protected static IStrategoTerm const4247;

  protected static IStrategoTerm const4246;

  protected static IStrategoTerm const4245;

  protected static IStrategoTerm constCons1964;

  protected static IStrategoTerm const4244;

  protected static IStrategoTerm constConstType0;

  protected static IStrategoTerm constSortNoArgs0;

  protected static IStrategoTerm const4243;

  protected static IStrategoTerm const4242;

  protected static IStrategoTerm constCons1963;

  protected static IStrategoTerm const4241;

  protected static IStrategoTerm const4240;

  protected static IStrategoTerm const4239;

  protected static IStrategoTerm const4238;

  protected static IStrategoTerm const4237;

  protected static IStrategoTerm const4236;

  protected static IStrategoTerm const4235;

  protected static IStrategoTerm const4234;

  protected static IStrategoTerm const4233;

  protected static IStrategoTerm const4232;

  protected static IStrategoTerm const4231;

  protected static IStrategoTerm const4230;

  protected static IStrategoTerm const4229;

  protected static IStrategoTerm const4228;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm constCons1962;

  protected static IStrategoTerm const4227;

  protected static IStrategoTerm constNil3;

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
    constNil3 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const4227 = termFactory.makeInt(0);
    constCons1962 = (IStrategoTerm)termFactory.makeListCons(trans.const4227, (IStrategoList)trans.constNil3);
    constId0 = termFactory.makeAppl(Main._consId_0, NO_TERMS);
    const4228 = termFactory.makeString("Defs: ");
    const4229 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'precondition-warning'");
    const4230 = termFactory.makeString("\n");
    const4231 = termFactory.makeString("\n                       ");
    const4232 = termFactory.makeString("selection extended to: ");
    const4233 = termFactory.makeString("1: ");
    const4234 = termFactory.makeString("2: ");
    const4235 = termFactory.makeString("3: ");
    const4236 = termFactory.makeString("4: ");
    const4237 = termFactory.makeString("6: ");
    const4238 = termFactory.makeString("7: ");
    const4239 = termFactory.makeString("8: ");
    const4240 = termFactory.makeString("9: ");
    const4241 = termFactory.makeString(")");
    constCons1963 = (IStrategoTerm)termFactory.makeListCons(trans.const4241, (IStrategoList)trans.constNil3);
    const4242 = termFactory.makeString("(");
    const4243 = termFactory.makeString("ATerm");
    constSortNoArgs0 = termFactory.makeAppl(Main._consSortNoArgs_1, new IStrategoTerm[]{trans.const4243});
    constConstType0 = termFactory.makeAppl(Main._consConstType_1, new IStrategoTerm[]{trans.constSortNoArgs0});
    const4244 = termFactory.makeString("No declaration found. Libary strategy?");
    constCons1964 = (IStrategoTerm)termFactory.makeListCons(trans.const4244, (IStrategoList)trans.constNil3);
    const4245 = termFactory.makeTuple(trans.constNil3, trans.constCons1964, trans.constNil3, trans.constNil3);
    const4246 = termFactory.makeString("strategy declaration contains recursive call");
    const4247 = termFactory.makeString("multiple declarations found, refactoring may change behaviour by introducing determinism");
    const4248 = termFactory.makeString("NEWNAME");
    const4249 = termFactory.makeString("x.aterm");
    constNone0 = termFactory.makeAppl(Main._consNone_0, NO_TERMS);
    const4250 = termFactory.makeString("MyStrategy");
    const4251 = termFactory.makeString("number of affected files: ");
    const4252 = termFactory.makeString("fatal-errors: ");
    const4253 = termFactory.makeString("errors: ");
    const4254 = termFactory.makeString("warnings: ");
    const4255 = termFactory.makeString("pp: ");
    const4256 = termFactory.makeString("x.str");
    const4257 = termFactory.makeString("str");
    const4258 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'get-affected-stratego-asts'");
    const4259 = termFactory.makeString("/trans");
    constCons1965 = (IStrategoTerm)termFactory.makeListCons(trans.const4259, (IStrategoList)trans.constNil3);
    const4260 = termFactory.makeString(".str.sig");
    const4261 = termFactory.makeString(".rtree");
    const4262 = termFactory.makeString("");
    const4263 = termFactory.makeString("CurrentFile");
    constDR_DUMMY0 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons1966 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY0, (IStrategoList)trans.constNil3);
    const4264 = termFactory.makeString("99705");
    const4265 = termFactory.makeString("ProjectDir");
    const4266 = termFactory.makeString("-231360");
    const4267 = termFactory.makeString("libstratego-lib");
    constImport0 = termFactory.makeAppl(Main._consImport_1, new IStrategoTerm[]{trans.const4267});
    const4268 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'get-source-files'");
    const4269 = termFactory.makeString("\n           ");
    const4270 = termFactory.makeString("/");
    const4271 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'spoofax-dirs'");
    const4272 = termFactory.makeString("\n                 ");
    const4273 = termFactory.makeString("trans");
    constCons1967 = (IStrategoTerm)termFactory.makeListCons(trans.const4273, (IStrategoList)trans.constNil3);
    const4274 = termFactory.makeString(".svn");
    constCons1968 = (IStrategoTerm)termFactory.makeListCons(trans.const4274, (IStrategoList)trans.constCons1967);
    const4275 = termFactory.makeString(".settings");
    constCons1969 = (IStrategoTerm)termFactory.makeListCons(trans.const4275, (IStrategoList)trans.constCons1968);
    const4276 = termFactory.makeString(".externalToolBuilders");
    constCons1970 = (IStrategoTerm)termFactory.makeListCons(trans.const4276, (IStrategoList)trans.constCons1969);
    const4277 = termFactory.makeString(".cache");
    constCons1971 = (IStrategoTerm)termFactory.makeListCons(trans.const4277, (IStrategoList)trans.constCons1970);
    const4278 = termFactory.makeString("utils");
    constCons1972 = (IStrategoTerm)termFactory.makeListCons(trans.const4278, (IStrategoList)trans.constCons1971);
    const4279 = termFactory.makeString("syntax");
    constCons1973 = (IStrategoTerm)termFactory.makeListCons(trans.const4279, (IStrategoList)trans.constCons1972);
    const4280 = termFactory.makeString("META-INF");
    constCons1974 = (IStrategoTerm)termFactory.makeListCons(trans.const4280, (IStrategoList)trans.constCons1973);
    const4281 = termFactory.makeString("include");
    constCons1975 = (IStrategoTerm)termFactory.makeListCons(trans.const4281, (IStrategoList)trans.constCons1974);
    const4282 = termFactory.makeString("icons");
    constCons1976 = (IStrategoTerm)termFactory.makeListCons(trans.const4282, (IStrategoList)trans.constCons1975);
    const4283 = termFactory.makeString("editor");
    constCons1977 = (IStrategoTerm)termFactory.makeListCons(trans.const4283, (IStrategoList)trans.constCons1976);
    const4284 = termFactory.makeString("bin");
    constCons1978 = (IStrategoTerm)termFactory.makeListCons(trans.const4284, (IStrategoList)trans.constCons1977);
    const4285 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'mk-binding-violation-message'");
    const4286 = termFactory.makeString("\n                                 ");
    const4287 = termFactory.makeString("'");
    constCons1979 = (IStrategoTerm)termFactory.makeListCons(trans.const4287, (IStrategoList)trans.constNil3);
    const4288 = termFactory.makeString("Variabele captures detected for '");
    const4289 = termFactory.makeString("spt");
    const4290 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'get-dependend-renamings'");
    const4291 = termFactory.makeString("\n       ");
    const4292 = termFactory.makeString("-");
    const4293 = termFactory.makeString("bigfold");
    constCons1980 = (IStrategoTerm)termFactory.makeListCons(trans.const4293, (IStrategoList)trans.constNil3);
    const4294 = termFactory.makeString("fold");
    constCons1981 = (IStrategoTerm)termFactory.makeListCons(trans.const4294, (IStrategoList)trans.constCons1980);
    const4295 = termFactory.makeString("throw");
    constCons1982 = (IStrategoTerm)termFactory.makeListCons(trans.const4295, (IStrategoList)trans.constCons1981);
    const4296 = termFactory.makeString("continue-to-label");
    constCons1983 = (IStrategoTerm)termFactory.makeListCons(trans.const4296, (IStrategoList)trans.constCons1982);
    const4297 = termFactory.makeString("break-to-label");
    constCons1984 = (IStrategoTerm)termFactory.makeListCons(trans.const4297, (IStrategoList)trans.constCons1983);
    const4298 = termFactory.makeString("innermost-scope");
    constCons1985 = (IStrategoTerm)termFactory.makeListCons(trans.const4298, (IStrategoList)trans.constCons1984);
    const4299 = termFactory.makeString("reverse-bagof");
    constCons1986 = (IStrategoTerm)termFactory.makeListCons(trans.const4299, (IStrategoList)trans.constCons1985);
    const4300 = termFactory.makeString("aux");
    constCons1987 = (IStrategoTerm)termFactory.makeListCons(trans.const4300, (IStrategoList)trans.constCons1986);
    const4301 = termFactory.makeString("undefine");
    constCons1988 = (IStrategoTerm)termFactory.makeListCons(trans.const4301, (IStrategoList)trans.constCons1987);
    const4302 = termFactory.makeString("new");
    constCons1989 = (IStrategoTerm)termFactory.makeListCons(trans.const4302, (IStrategoList)trans.constCons1988);
    const4303 = termFactory.makeString("bigchain");
    constCons1990 = (IStrategoTerm)termFactory.makeListCons(trans.const4303, (IStrategoList)trans.constCons1989);
    const4304 = termFactory.makeString("chain");
    constCons1991 = (IStrategoTerm)termFactory.makeListCons(trans.const4304, (IStrategoList)trans.constCons1990);
    const4305 = termFactory.makeString("continue");
    constCons1992 = (IStrategoTerm)termFactory.makeListCons(trans.const4305, (IStrategoList)trans.constCons1991);
    const4306 = termFactory.makeString("break-bp");
    constCons1993 = (IStrategoTerm)termFactory.makeListCons(trans.const4306, (IStrategoList)trans.constCons1992);
    const4307 = termFactory.makeString("break");
    constCons1994 = (IStrategoTerm)termFactory.makeListCons(trans.const4307, (IStrategoList)trans.constCons1993);
    constCons1995 = (IStrategoTerm)termFactory.makeListCons(trans.const4298, (IStrategoList)trans.constCons1994);
    const4308 = termFactory.makeString("all-keys");
    constCons1996 = (IStrategoTerm)termFactory.makeListCons(trans.const4308, (IStrategoList)trans.constCons1995);
    const4309 = termFactory.makeString("bigbagof");
    constCons1997 = (IStrategoTerm)termFactory.makeListCons(trans.const4309, (IStrategoList)trans.constCons1996);
    const4310 = termFactory.makeString("bagof");
    constCons1998 = (IStrategoTerm)termFactory.makeListCons(trans.const4310, (IStrategoList)trans.constCons1997);
    const4311 = termFactory.makeString("once");
    constCons1999 = (IStrategoTerm)termFactory.makeListCons(trans.const4311, (IStrategoList)trans.constCons1998);
    const4312 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'get-asts-affected-by-renaming'");
    const4313 = termFactory.makeString("\n                     ");
    const4314 = termFactory.makeString("parsing failed for: '");
    const4315 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'declared-in-generated-file'");
    const4316 = termFactory.makeString("\n        ");
    const4317 = termFactory.makeString(" can not be edited");
    constCons2000 = (IStrategoTerm)termFactory.makeListCons(trans.const4317, (IStrategoList)trans.constNil3);
    const4318 = termFactory.makeString("Name in ");
    const4319 = termFactory.makeString("Ext");
    const4320 = termFactory.makeString("External declaration can not be edited");
    constCons2001 = (IStrategoTerm)termFactory.makeListCons(trans.const4320, (IStrategoList)trans.constNil3);
    const4321 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'dirs-with-generated-files'");
    const4322 = termFactory.makeString("/include");
    constCons2002 = (IStrategoTerm)termFactory.makeListCons(trans.const4322, (IStrategoList)trans.constNil3);
    const4323 = termFactory.makeString("/lib");
    constCons2003 = (IStrategoTerm)termFactory.makeListCons(trans.const4323, (IStrategoList)trans.constNil3);
    const4324 = termFactory.makeString("/lib-refactoring");
    constCons2004 = (IStrategoTerm)termFactory.makeListCons(trans.const4324, (IStrategoList)trans.constNil3);
    const4325 = termFactory.makeString(".generated.str");
    constStrategoSugarTbl = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.tbl");
    constStrategoSugarTbl0 = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.tbl");
    constStrategoSugarTbl1 = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.tbl");
    constStrategoSugarGeneratedPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.generated.pp.af");
    constStrategoSugarPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "Stratego-Sugar.pp.af");
    const4326 = termFactory.makeInt(100);
    const4327 = termFactory.makeString("IsImported");
    const4328 = termFactory.makeString("-597601");
    const4329 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const4330 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const4331 = termFactory.makeString("/.cache");
    constCons2005 = (IStrategoTerm)termFactory.makeListCons(trans.const4331, (IStrategoList)trans.constNil3);
    const4332 = termFactory.makeString("+");
    const4333 = termFactory.makeString("\\");
    const4334 = termFactory.makeString(":");
    const4335 = termFactory.makeString("\n            ");
    const4336 = termFactory.makeString(".sig");
    constCons2006 = (IStrategoTerm)termFactory.makeListCons(trans.const4336, (IStrategoList)trans.constNil3);
    const4337 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    const4338 = termFactory.makeString("Stratego-Sugar");
    constMARKER0 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons2007 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER0, (IStrategoList)trans.constNil3);
    const4339 = termFactory.makeString("BACKGROUNDED");
    constFail0 = termFactory.makeAppl(Main._consFail_0, NO_TERMS);
    const4340 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'extract-meta-expr-escapes'");
    const4341 = termFactory.makeInt(47);
    const4342 = termFactory.makeString("SourceDir");
    const4343 = termFactory.makeString("1354");
    const4344 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'analyze-ast'");
    const4345 = termFactory.makeString("\n               ");
    const4346 = termFactory.makeString("CurrentDir");
    const4347 = termFactory.makeString("-237042");
    const4348 = termFactory.makeString("/.disable-global-analysis");
    constCons2008 = (IStrategoTerm)termFactory.makeListCons(trans.const4348, (IStrategoList)trans.constNil3);
    const4349 = termFactory.makeString("NoAnalysis");
    const4350 = termFactory.makeString("-546490");
    const4351 = termFactory.makeString("/.warn-global-analysis");
    constCons2009 = (IStrategoTerm)termFactory.makeListCons(trans.const4351, (IStrategoList)trans.constNil3);
    const4352 = termFactory.makeString("WarnAnalysis");
    const4353 = termFactory.makeString("-504485");
    const4354 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-ast'");
    const4355 = termFactory.makeString("DecoratedAst");
    const4356 = termFactory.makeString("-581518");
    const4357 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'remove-quote'");
    const4358 = termFactory.makeString("DeclareCookie");
    const4359 = termFactory.makeString("-783129");
    const4360 = termFactory.makeString("Declaration");
    const4361 = termFactory.makeString("-415135");
    const4362 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-definition'");
    const4363 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'redeclare-definition'");
    constCritical0 = termFactory.makeAppl(Main._consCritical_0, NO_TERMS);
    const4364 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'declare-globals-top'");
    const4365 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-globals'");
    const4366 = termFactory.makeString("IsImportedFailed");
    const4367 = termFactory.makeString("-26001");
    const4368 = termFactory.makeString("rtree");
    const4369 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'open-import'");
    const4370 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'resolve-import-decl'");
    const4371 = termFactory.makeString(".str");
    constCons2010 = (IStrategoTerm)termFactory.makeListCons(trans.const4371, (IStrategoList)trans.constNil3);
    constCons2011 = (IStrategoTerm)termFactory.makeListCons(trans.const4261, (IStrategoList)trans.constNil3);
    const4372 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'load-include-properties'");
    const4373 = termFactory.makeString("/.settings/org.strategoxt.imp.editors.stratego.prefs");
    constCons2012 = (IStrategoTerm)termFactory.makeListCons(trans.const4373, (IStrategoList)trans.constNil3);
    const4374 = termFactory.makeString("MemoizeIncludeProperties");
    const4375 = termFactory.makeString("-64933");
    const4376 = termFactory.makeInt(32);
    constCons2013 = (IStrategoTerm)termFactory.makeListCons(trans.const4376, (IStrategoList)trans.constNil3);
    const4377 = termFactory.makeString("src/syntax");
    constCons2014 = (IStrategoTerm)termFactory.makeListCons(trans.const4377, (IStrategoList)trans.constNil3);
    const4378 = termFactory.makeString("syn");
    constCons2015 = (IStrategoTerm)termFactory.makeListCons(trans.const4378, (IStrategoList)trans.constCons2014);
    constCons2016 = (IStrategoTerm)termFactory.makeListCons(trans.const4279, (IStrategoList)trans.constCons2015);
    const4379 = termFactory.makeString("src");
    constCons2017 = (IStrategoTerm)termFactory.makeListCons(trans.const4379, (IStrategoList)trans.constCons2016);
    const4380 = termFactory.makeString("lib");
    constCons2018 = (IStrategoTerm)termFactory.makeListCons(trans.const4380, (IStrategoList)trans.constCons2017);
    constCons2019 = (IStrategoTerm)termFactory.makeListCons(trans.const4273, (IStrategoList)trans.constCons2018);
    constCons2020 = (IStrategoTerm)termFactory.makeListCons(trans.const4262, (IStrategoList)trans.constCons2019);
    const4381 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'default-include-paths'");
    const4382 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'expand-relative-path'");
    const4383 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'resolve-import-path'");
    const4384 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'remove-stratego-bodies'");
    const4385 = termFactory.makeTuple();
    const4386 = termFactory.makeInt(2);
    const4387 = termFactory.makeInt(1);
    constCons2021 = (IStrategoTerm)termFactory.makeListCons(trans.const4296, (IStrategoList)trans.constNil3);
    constCons2022 = (IStrategoTerm)termFactory.makeListCons(trans.const4297, (IStrategoList)trans.constCons2021);
    constCons2023 = (IStrategoTerm)termFactory.makeListCons(trans.const4303, (IStrategoList)trans.constNil3);
    constCons2024 = (IStrategoTerm)termFactory.makeListCons(trans.const4304, (IStrategoList)trans.constCons2023);
    constCons2025 = (IStrategoTerm)termFactory.makeListCons(trans.const4305, (IStrategoList)trans.constCons2024);
    constCons2026 = (IStrategoTerm)termFactory.makeListCons(trans.const4306, (IStrategoList)trans.constCons2025);
    constCons2027 = (IStrategoTerm)termFactory.makeListCons(trans.const4307, (IStrategoList)trans.constCons2026);
    constCons2028 = (IStrategoTerm)termFactory.makeListCons(trans.const4298, (IStrategoList)trans.constCons2027);
    constCons2029 = (IStrategoTerm)termFactory.makeListCons(trans.const4308, (IStrategoList)trans.constCons2028);
    constCons2030 = (IStrategoTerm)termFactory.makeListCons(trans.const4309, (IStrategoList)trans.constCons2029);
    constCons2031 = (IStrategoTerm)termFactory.makeListCons(trans.const4310, (IStrategoList)trans.constCons2030);
    constCons2032 = (IStrategoTerm)termFactory.makeListCons(trans.const4311, (IStrategoList)trans.constCons2031);
    const4388 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-dynrule'");
    const4389 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'declare-dr-rule'");
    const4390 = termFactory.makeString("\n         ");
    const4391 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'dr-scope-declare-cookies'");
    const4392 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-bodies'");
    constCons2033 = (IStrategoTerm)termFactory.makeListCons(trans.const4358, (IStrategoList)trans.constNil3);
    const4393 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-let-definition'");
    const4394 = termFactory.makeString("OuterCookie");
    const4395 = termFactory.makeString("-802723");
    const4396 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'scope-variables'");
    const4397 = termFactory.makeString("-670577");
    const4398 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-svar'");
    const4399 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-tvar'");
    const4400 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'declare-var'");
    const4401 = termFactory.makeString("ContentProposals");
    const4402 = termFactory.makeString("-535431");
    const4403 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'propose-completion'");
    const4404 = termFactory.makeString(", ");
    const4405 = termFactory.makeString("()");
    constCons2034 = (IStrategoTerm)termFactory.makeListCons(trans.const4405, (IStrategoList)trans.constNil3);
    const4406 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'signature-to-proposal'");
    const4407 = termFactory.makeString("t");
    constCons2035 = (IStrategoTerm)termFactory.makeListCons(trans.const4262, (IStrategoList)trans.constNil3);
    const4408 = termFactory.makeString("s");
    const4409 = termFactory.makeString("(|");
    const4410 = termFactory.makeString("|");
    const4411 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'global-constraint-error'");
    const4412 = termFactory.makeString("\n                  ");
    const4413 = termFactory.makeString("' not defined");
    constCons2036 = (IStrategoTerm)termFactory.makeListCons(trans.const4413, (IStrategoList)trans.constNil3);
    const4414 = termFactory.makeString("Strategy or rule '");
    const4415 = termFactory.makeString("\n                ");
    const4416 = termFactory.makeString(" not declared");
    constCons2037 = (IStrategoTerm)termFactory.makeListCons(trans.const4416, (IStrategoList)trans.constNil3);
    const4417 = termFactory.makeString("Constructor ");
    const4418 = termFactory.makeString("Unable to import '");
    const4419 = termFactory.makeString("\n              ");
    const4420 = termFactory.makeString("Dynamic rule '");
    const4421 = termFactory.makeString("\n                                       ");
    const4422 = termFactory.makeString("Conflicts with external definition of '");
    const4423 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'constraint-error'");
    const4424 = termFactory.makeString("\n          ");
    const4425 = termFactory.makeString("' is not declared");
    constCons2038 = (IStrategoTerm)termFactory.makeListCons(trans.const4425, (IStrategoList)trans.constNil3);
    const4426 = termFactory.makeString("Variable '");
    const4427 = termFactory.makeString("IsNoConflict");
    const4428 = termFactory.makeString("17917");
    const4429 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'constraint-error'");
    const4430 = termFactory.makeString("\n                              ");
    const4431 = termFactory.makeString("No external strategy or rule '");
    const4432 = termFactory.makeString("\n                         ");
    const4433 = termFactory.makeString("Conflicts with strategy '");
    const4434 = termFactory.makeString("\n                           ");
    const4435 = termFactory.makeString("\n                               ");
    const4436 = termFactory.makeString("Conflicts with constructor ");
    const4437 = termFactory.makeString("Match symbol in build pattern");
    const4438 = termFactory.makeString("Build symbol in match pattern");
    const4439 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'constraint-warning'");
    const4440 = termFactory.makeString("' may be bound already");
    constCons2039 = (IStrategoTerm)termFactory.makeListCons(trans.const4440, (IStrategoList)trans.constNil3);
    const4441 = termFactory.makeString("\n                                  ");
    const4442 = termFactory.makeString("()' instead");
    constCons2040 = (IStrategoTerm)termFactory.makeListCons(trans.const4442, (IStrategoList)trans.constNil3);
    const4443 = termFactory.makeString("Unparenthesized constructor: use '");
    const4444 = termFactory.makeString("Should be '!");
    const4445 = termFactory.makeString("Use 'import libjava-front' instead");
    const4446 = termFactory.makeString("Module name does not correspond to file name");
    constCons2041 = (IStrategoTerm)termFactory.makeListCons(trans.const4446, (IStrategoList)trans.constNil3);
    const4447 = termFactory.makeString("../");
    const4448 = termFactory.makeString("Relative path in import");
    constCons2042 = (IStrategoTerm)termFactory.makeListCons(trans.const4448, (IStrategoList)trans.constNil3);
    const4449 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const4450 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-complete'");
    const4451 = termFactory.makeString("</pre>");
    constCons2043 = (IStrategoTerm)termFactory.makeListCons(trans.const4451, (IStrategoList)trans.constNil3);
    const4452 = termFactory.makeString("<pre>");
    const4453 = termFactory.makeString("aterm");
    const4454 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-aterm'");
    const4455 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-desugared-aterm'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}