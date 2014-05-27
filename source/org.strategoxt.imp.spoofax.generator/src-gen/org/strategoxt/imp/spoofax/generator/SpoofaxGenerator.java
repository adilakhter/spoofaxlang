package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class SpoofaxGenerator  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const7931;

  protected static IStrategoTerm constModule0;

  protected static IStrategoTerm const7930;

  protected static IStrategoTerm const7929;

  protected static IStrategoTerm const7928;

  protected static IStrategoTerm const7927;

  protected static IStrategoTerm constCons5159;

  protected static IStrategoTerm constIncludeDir1;

  protected static IStrategoTerm constCons5158;

  protected static IStrategoTerm const7926;

  protected static IStrategoTerm const7925;

  protected static IStrategoTerm const7924;

  protected static IStrategoTerm constCons5157;

  protected static IStrategoTerm const7923;

  protected static IStrategoTerm const7922;

  protected static IStrategoTerm const7921;

  protected static IStrategoTerm const7920;

  protected static IStrategoTerm const7919;

  protected static IStrategoTerm const7918;

  protected static IStrategoTerm const7917;

  protected static IStrategoTerm const7916;

  protected static IStrategoTerm const7915;

  protected static IStrategoTerm const7914;

  protected static IStrategoTerm const7913;

  protected static IStrategoTerm const7912;

  protected static IStrategoTerm const7911;

  protected static IStrategoTerm const7910;

  protected static IStrategoTerm const7909;

  protected static IStrategoTerm const7908;

  protected static IStrategoTerm constCons5156;

  protected static IStrategoTerm const7907;

  protected static IStrategoTerm const7906;

  protected static IStrategoTerm const7905;

  protected static IStrategoTerm const7904;

  protected static IStrategoTerm const7903;

  protected static IStrategoTerm const7902;

  protected static IStrategoTerm const7901;

  protected static IStrategoTerm const7900;

  protected static IStrategoTerm const7899;

  protected static IStrategoTerm const7898;

  protected static IStrategoTerm const7897;

  protected static IStrategoTerm const7896;

  protected static IStrategoTerm const7895;

  protected static IStrategoTerm const7894;

  protected static IStrategoTerm const7893;

  protected static IStrategoTerm const7892;

  protected static IStrategoTerm const7891;

  protected static IStrategoTerm const7890;

  protected static IStrategoTerm const7889;

  protected static IStrategoTerm const7888;

  protected static IStrategoTerm const7887;

  protected static IStrategoTerm const7886;

  protected static IStrategoTerm const7885;

  protected static IStrategoTerm const7884;

  protected static IStrategoTerm const7883;

  protected static IStrategoTerm const7882;

  protected static IStrategoTerm const7881;

  protected static IStrategoTerm const7880;

  protected static IStrategoTerm const7879;

  protected static IStrategoTerm const7878;

  protected static IStrategoTerm const7877;

  protected static IStrategoTerm const7876;

  protected static IStrategoTerm const7875;

  protected static IStrategoTerm const7874;

  protected static IStrategoTerm const7873;

  protected static IStrategoTerm const7872;

  protected static IStrategoTerm const7871;

  protected static IStrategoTerm const7870;

  protected static IStrategoTerm const7869;

  protected static IStrategoTerm const7868;

  protected static IStrategoTerm const7867;

  protected static IStrategoTerm const7866;

  protected static IStrategoTerm constCons5155;

  protected static IStrategoTerm constFieldDec5;

  protected static IStrategoTerm constCons5154;

  protected static IStrategoTerm constVarDec6;

  protected static IStrategoTerm constCons5153;

  protected static IStrategoTerm constMethodDec6;

  protected static IStrategoTerm constBlock13;

  protected static IStrategoTerm constCons5152;

  protected static IStrategoTerm constIf7;

  protected static IStrategoTerm constReturn5;

  protected static IStrategoTerm constSome10;

  protected static IStrategoTerm constNewInstance10;

  protected static IStrategoTerm constEq3;

  protected static IStrategoTerm constCons5151;

  protected static IStrategoTerm constReturn4;

  protected static IStrategoTerm constSome9;

  protected static IStrategoTerm constMethodDecHead10;

  protected static IStrategoTerm constId76;

  protected static IStrategoTerm const7865;

  protected static IStrategoTerm constClassOrInterfaceType12;

  protected static IStrategoTerm constTypeName32;

  protected static IStrategoTerm constCons5150;

  protected static IStrategoTerm constCons5149;

  protected static IStrategoTerm constConstrDec0;

  protected static IStrategoTerm constConstrBody0;

  protected static IStrategoTerm constCons5148;

  protected static IStrategoTerm constExprStm12;

  protected static IStrategoTerm constAssign6;

  protected static IStrategoTerm constExprName16;

  protected static IStrategoTerm constId75;

  protected static IStrategoTerm const7864;

  protected static IStrategoTerm constSome8;

  protected static IStrategoTerm constSuperConstrInv0;

  protected static IStrategoTerm constConstrDecHead0;

  protected static IStrategoTerm constCons5147;

  protected static IStrategoTerm constMethodDec5;

  protected static IStrategoTerm constBlock12;

  protected static IStrategoTerm constCons5146;

  protected static IStrategoTerm constExprStm11;

  protected static IStrategoTerm constInvoke14;

  protected static IStrategoTerm constCons5145;

  protected static IStrategoTerm constExprName15;

  protected static IStrategoTerm constSuperMethod2;

  protected static IStrategoTerm constMethodDecHead9;

  protected static IStrategoTerm constSome7;

  protected static IStrategoTerm constThrowsDec0;

  protected static IStrategoTerm constCons5144;

  protected static IStrategoTerm constClassType3;

  protected static IStrategoTerm constTypeName31;

  protected static IStrategoTerm constId74;

  protected static IStrategoTerm const7863;

  protected static IStrategoTerm constCons5143;

  protected static IStrategoTerm constParam4;

  protected static IStrategoTerm constId73;

  protected static IStrategoTerm const7862;

  protected static IStrategoTerm constClassOrInterfaceType11;

  protected static IStrategoTerm constTypeName30;

  protected static IStrategoTerm constId72;

  protected static IStrategoTerm const7861;

  protected static IStrategoTerm constCons5142;

  protected static IStrategoTerm constMethodDec4;

  protected static IStrategoTerm constBlock11;

  protected static IStrategoTerm constCons5141;

  protected static IStrategoTerm constReturn3;

  protected static IStrategoTerm constSome6;

  protected static IStrategoTerm constExprName14;

  protected static IStrategoTerm constId71;

  protected static IStrategoTerm const7860;

  protected static IStrategoTerm constMethodDecHead8;

  protected static IStrategoTerm constId70;

  protected static IStrategoTerm const7859;

  protected static IStrategoTerm constCons5140;

  protected static IStrategoTerm constMethodDec3;

  protected static IStrategoTerm constBlock10;

  protected static IStrategoTerm constCons5139;

  protected static IStrategoTerm constReturn2;

  protected static IStrategoTerm constSome5;

  protected static IStrategoTerm constExprName13;

  protected static IStrategoTerm constId69;

  protected static IStrategoTerm const7858;

  protected static IStrategoTerm constMethodDecHead7;

  protected static IStrategoTerm constId68;

  protected static IStrategoTerm const7857;

  protected static IStrategoTerm constCons5138;

  protected static IStrategoTerm constFieldDec4;

  protected static IStrategoTerm constCons5137;

  protected static IStrategoTerm constVarDec5;

  protected static IStrategoTerm constId67;

  protected static IStrategoTerm const7856;

  protected static IStrategoTerm constClassOrInterfaceType10;

  protected static IStrategoTerm constTypeName29;

  protected static IStrategoTerm constClassDecHead0;

  protected static IStrategoTerm constSome4;

  protected static IStrategoTerm constSuperDec2;

  protected static IStrategoTerm constClassType2;

  protected static IStrategoTerm constTypeName28;

  protected static IStrategoTerm constId66;

  protected static IStrategoTerm const7855;

  protected static IStrategoTerm constCons5136;

  protected static IStrategoTerm constTypeImportDec14;

  protected static IStrategoTerm constTypeName27;

  protected static IStrategoTerm constId65;

  protected static IStrategoTerm const7854;

  protected static IStrategoTerm constPackageOrTypeName16;

  protected static IStrategoTerm constId64;

  protected static IStrategoTerm const7853;

  protected static IStrategoTerm constCons5135;

  protected static IStrategoTerm constTypeImportDec13;

  protected static IStrategoTerm constTypeName26;

  protected static IStrategoTerm constId63;

  protected static IStrategoTerm const7852;

  protected static IStrategoTerm constPackageOrTypeName15;

  protected static IStrategoTerm constCons5134;

  protected static IStrategoTerm constTypeImportDec12;

  protected static IStrategoTerm constTypeName25;

  protected static IStrategoTerm constId62;

  protected static IStrategoTerm const7851;

  protected static IStrategoTerm constPackageOrTypeName14;

  protected static IStrategoTerm constId61;

  protected static IStrategoTerm const7850;

  protected static IStrategoTerm constPackageOrTypeName13;

  protected static IStrategoTerm constId60;

  protected static IStrategoTerm const7849;

  protected static IStrategoTerm const7848;

  protected static IStrategoTerm const7847;

  protected static IStrategoTerm const7846;

  protected static IStrategoTerm constCons5133;

  protected static IStrategoTerm const7845;

  protected static IStrategoTerm constCons5132;

  protected static IStrategoTerm const7844;

  protected static IStrategoTerm constCons5131;

  protected static IStrategoTerm constCons5130;

  protected static IStrategoTerm const7843;

  protected static IStrategoTerm constCons5129;

  protected static IStrategoTerm constCons5128;

  protected static IStrategoTerm const7842;

  protected static IStrategoTerm const7841;

  protected static IStrategoTerm constCons5127;

  protected static IStrategoTerm const7840;

  protected static IStrategoTerm constCons5126;

  protected static IStrategoTerm constCons5125;

  protected static IStrategoTerm const7839;

  protected static IStrategoTerm constCons5124;

  protected static IStrategoTerm constCons5123;

  protected static IStrategoTerm const7838;

  protected static IStrategoTerm constCons5122;

  protected static IStrategoTerm constCons5121;

  protected static IStrategoTerm const7837;

  protected static IStrategoTerm constCons5120;

  protected static IStrategoTerm constCons5119;

  protected static IStrategoTerm const7836;

  protected static IStrategoTerm constCons5118;

  protected static IStrategoTerm constCons5117;

  protected static IStrategoTerm const7835;

  protected static IStrategoTerm constCons5116;

  protected static IStrategoTerm constCons5115;

  protected static IStrategoTerm const7834;

  protected static IStrategoTerm const7833;

  protected static IStrategoTerm const7832;

  protected static IStrategoTerm constCons5114;

  protected static IStrategoTerm const7831;

  protected static IStrategoTerm const7830;

  protected static IStrategoTerm const7829;

  protected static IStrategoTerm const7828;

  protected static IStrategoTerm const7827;

  protected static IStrategoTerm constCons5113;

  protected static IStrategoTerm const7826;

  protected static IStrategoTerm const7825;

  protected static IStrategoTerm const7824;

  protected static IStrategoTerm const7823;

  protected static IStrategoTerm const7822;

  protected static IStrategoTerm const7821;

  protected static IStrategoTerm const7820;

  protected static IStrategoTerm constCons5112;

  protected static IStrategoTerm const7819;

  protected static IStrategoTerm const7818;

  protected static IStrategoTerm constCons5111;

  protected static IStrategoTerm const7817;

  protected static IStrategoTerm const7816;

  protected static IStrategoTerm const7815;

  protected static IStrategoTerm const7814;

  protected static IStrategoTerm constCons5110;

  protected static IStrategoTerm const7813;

  protected static IStrategoTerm const7812;

  protected static IStrategoTerm constCons5109;

  protected static IStrategoTerm constCons5108;

  protected static IStrategoTerm const7811;

  protected static IStrategoTerm const7810;

  protected static IStrategoTerm const7809;

  protected static IStrategoTerm const7808;

  protected static IStrategoTerm const7807;

  protected static IStrategoTerm const7806;

  protected static IStrategoTerm const7805;

  protected static IStrategoTerm constCons5107;

  protected static IStrategoTerm const7804;

  protected static IStrategoTerm const7803;

  protected static IStrategoTerm const7802;

  protected static IStrategoTerm constCons5106;

  protected static IStrategoTerm const7801;

  protected static IStrategoTerm const7800;

  protected static IStrategoTerm const7799;

  protected static IStrategoTerm const7798;

  protected static IStrategoTerm const7797;

  protected static IStrategoTerm const7796;

  protected static IStrategoTerm const7795;

  protected static IStrategoTerm const7794;

  protected static IStrategoTerm constCons5105;

  protected static IStrategoTerm const7793;

  protected static IStrategoTerm const7792;

  protected static IStrategoTerm const7791;

  protected static IStrategoTerm const7790;

  protected static IStrategoTerm constCons5104;

  protected static IStrategoTerm const7789;

  protected static IStrategoTerm constCons5103;

  protected static IStrategoTerm constCons5102;

  protected static IStrategoTerm const7788;

  protected static IStrategoTerm constCons5101;

  protected static IStrategoTerm constCons5100;

  protected static IStrategoTerm const7787;

  protected static IStrategoTerm constCons5099;

  protected static IStrategoTerm constCons5098;

  protected static IStrategoTerm const7786;

  protected static IStrategoTerm constCons5097;

  protected static IStrategoTerm constCons5096;

  protected static IStrategoTerm const7785;

  protected static IStrategoTerm const7784;

  protected static IStrategoTerm const7783;

  protected static IStrategoTerm const7782;

  protected static IStrategoTerm constCons5095;

  protected static IStrategoTerm const7781;

  protected static IStrategoTerm constCons5094;

  protected static IStrategoTerm constCons5093;

  protected static IStrategoTerm const7780;

  protected static IStrategoTerm constCons5092;

  protected static IStrategoTerm constCons5091;

  protected static IStrategoTerm const7779;

  protected static IStrategoTerm constCons5090;

  protected static IStrategoTerm constCons5089;

  protected static IStrategoTerm constCons5088;

  protected static IStrategoTerm constCons5087;

  protected static IStrategoTerm const7778;

  protected static IStrategoTerm constCons5086;

  protected static IStrategoTerm constCons5085;

  protected static IStrategoTerm const7777;

  protected static IStrategoTerm constCons5084;

  protected static IStrategoTerm constCons5083;

  protected static IStrategoTerm const7776;

  protected static IStrategoTerm constCons5082;

  protected static IStrategoTerm constCons5081;

  protected static IStrategoTerm const7775;

  protected static IStrategoTerm constCons5080;

  protected static IStrategoTerm constCons5079;

  protected static IStrategoTerm const7774;

  protected static IStrategoTerm constCons5078;

  protected static IStrategoTerm constCons5077;

  protected static IStrategoTerm const7773;

  protected static IStrategoTerm const7772;

  protected static IStrategoTerm constCons5076;

  protected static IStrategoTerm constCons5075;

  protected static IStrategoTerm const7771;

  protected static IStrategoTerm const7770;

  protected static IStrategoTerm const7769;

  protected static IStrategoTerm constCons5074;

  protected static IStrategoTerm const7768;

  protected static IStrategoTerm constCons5073;

  protected static IStrategoTerm constCons5072;

  protected static IStrategoTerm const7767;

  protected static IStrategoTerm const7766;

  protected static IStrategoTerm const7765;

  protected static IStrategoTerm const7764;

  protected static IStrategoTerm const7763;

  protected static IStrategoTerm const7762;

  protected static IStrategoTerm const7761;

  protected static IStrategoTerm constCons5071;

  protected static IStrategoTerm const7760;

  protected static IStrategoTerm const7759;

  protected static IStrategoTerm const7758;

  protected static IStrategoTerm const7757;

  protected static IStrategoTerm const7756;

  protected static IStrategoTerm const7755;

  protected static IStrategoTerm const7754;

  protected static IStrategoTerm const7753;

  protected static IStrategoTerm constCons5070;

  protected static IStrategoTerm const7752;

  protected static IStrategoTerm const7751;

  protected static IStrategoTerm const7750;

  protected static IStrategoTerm const7749;

  protected static IStrategoTerm constCons5069;

  protected static IStrategoTerm const7748;

  protected static IStrategoTerm const7747;

  protected static IStrategoTerm const7746;

  protected static IStrategoTerm const7745;

  protected static IStrategoTerm constCons5068;

  protected static IStrategoTerm const7744;

  protected static IStrategoTerm constCons5067;

  protected static IStrategoTerm const7743;

  protected static IStrategoTerm constCons5066;

  protected static IStrategoTerm constCons5065;

  protected static IStrategoTerm constCons5064;

  protected static IStrategoTerm const7742;

  protected static IStrategoTerm const7741;

  protected static IStrategoTerm const7740;

  protected static IStrategoTerm const7739;

  protected static IStrategoTerm constCons5063;

  protected static IStrategoTerm const7738;

  protected static IStrategoTerm constCons5062;

  protected static IStrategoTerm const7737;

  protected static IStrategoTerm const7736;

  protected static IStrategoTerm const7735;

  protected static IStrategoTerm constCons5061;

  protected static IStrategoTerm const7734;

  protected static IStrategoTerm const7733;

  protected static IStrategoTerm const7732;

  protected static IStrategoTerm const7731;

  protected static IStrategoTerm const7730;

  protected static IStrategoTerm const7729;

  protected static IStrategoTerm const7728;

  protected static IStrategoTerm const7727;

  protected static IStrategoTerm const7726;

  protected static IStrategoTerm constClassBody0;

  protected static IStrategoTerm constCons5060;

  protected static IStrategoTerm constFieldDec3;

  protected static IStrategoTerm constCons5059;

  protected static IStrategoTerm constVarDec4;

  protected static IStrategoTerm constPlus16;

  protected static IStrategoTerm constLit13;

  protected static IStrategoTerm constString27;

  protected static IStrategoTerm constCons5058;

  protected static IStrategoTerm constChars10;

  protected static IStrategoTerm constFieldDec2;

  protected static IStrategoTerm constCons5057;

  protected static IStrategoTerm constVarDec3;

  protected static IStrategoTerm constPlus15;

  protected static IStrategoTerm constLit12;

  protected static IStrategoTerm constString26;

  protected static IStrategoTerm constCons5056;

  protected static IStrategoTerm constChars9;

  protected static IStrategoTerm const7725;

  protected static IStrategoTerm constPlus14;

  protected static IStrategoTerm constLit11;

  protected static IStrategoTerm constString25;

  protected static IStrategoTerm constCons5055;

  protected static IStrategoTerm constChars8;

  protected static IStrategoTerm const7724;

  protected static IStrategoTerm constCons5054;

  protected static IStrategoTerm constCons5053;

  protected static IStrategoTerm constCons5052;

  protected static IStrategoTerm constFinal0;

  protected static IStrategoTerm constFieldDec1;

  protected static IStrategoTerm constCons5051;

  protected static IStrategoTerm constVarDec2;

  protected static IStrategoTerm constCons5050;

  protected static IStrategoTerm constCons5049;

  protected static IStrategoTerm constCons5048;

  protected static IStrategoTerm constVolatile0;

  protected static IStrategoTerm constFieldDec0;

  protected static IStrategoTerm constCons5047;

  protected static IStrategoTerm constVarDec1;

  protected static IStrategoTerm constMethodDec2;

  protected static IStrategoTerm constBlock9;

  protected static IStrategoTerm constCons5046;

  protected static IStrategoTerm constCons5045;

  protected static IStrategoTerm constIf6;

  protected static IStrategoTerm constExprStm10;

  protected static IStrategoTerm constInvoke13;

  protected static IStrategoTerm constMethod11;

  protected static IStrategoTerm constMethodName8;

  protected static IStrategoTerm constEq2;

  protected static IStrategoTerm constCons5044;

  protected static IStrategoTerm constReturn1;

  protected static IStrategoTerm constSome3;

  protected static IStrategoTerm constMethodDecHead6;

  protected static IStrategoTerm constCons5043;

  protected static IStrategoTerm constMethodDecHead5;

  protected static IStrategoTerm constCons5042;

  protected static IStrategoTerm constParam3;

  protected static IStrategoTerm constId59;

  protected static IStrategoTerm const7723;

  protected static IStrategoTerm constCons5041;

  protected static IStrategoTerm constCons5040;

  protected static IStrategoTerm constCons5039;

  protected static IStrategoTerm constSynchronized0;

  protected static IStrategoTerm constCons5038;

  protected static IStrategoTerm constCatch2;

  protected static IStrategoTerm constBlock8;

  protected static IStrategoTerm constCons5037;

  protected static IStrategoTerm constCons5036;

  protected static IStrategoTerm constExprStm9;

  protected static IStrategoTerm constInvoke12;

  protected static IStrategoTerm constCons5035;

  protected static IStrategoTerm constThrow5;

  protected static IStrategoTerm constNewInstance9;

  protected static IStrategoTerm constCons5034;

  protected static IStrategoTerm constPlus13;

  protected static IStrategoTerm constPlus12;

  protected static IStrategoTerm constLit10;

  protected static IStrategoTerm constString24;

  protected static IStrategoTerm constCons5033;

  protected static IStrategoTerm constChars7;

  protected static IStrategoTerm const7722;

  protected static IStrategoTerm constCons5032;

  protected static IStrategoTerm constCatch1;

  protected static IStrategoTerm constBlock7;

  protected static IStrategoTerm constCons5031;

  protected static IStrategoTerm constCons5030;

  protected static IStrategoTerm constExprStm8;

  protected static IStrategoTerm constInvoke11;

  protected static IStrategoTerm constMethod10;

  protected static IStrategoTerm constMethodName7;

  protected static IStrategoTerm constId58;

  protected static IStrategoTerm const7721;

  protected static IStrategoTerm constAmbName3;

  protected static IStrategoTerm constCons5029;

  protected static IStrategoTerm constThrow4;

  protected static IStrategoTerm constNewInstance8;

  protected static IStrategoTerm constCons5028;

  protected static IStrategoTerm constPlus11;

  protected static IStrategoTerm constLit9;

  protected static IStrategoTerm constString23;

  protected static IStrategoTerm constCons5027;

  protected static IStrategoTerm constChars6;

  protected static IStrategoTerm const7720;

  protected static IStrategoTerm constPlus10;

  protected static IStrategoTerm constExprName12;

  protected static IStrategoTerm constId57;

  protected static IStrategoTerm const7719;

  protected static IStrategoTerm constLit8;

  protected static IStrategoTerm constString22;

  protected static IStrategoTerm constCons5026;

  protected static IStrategoTerm constChars5;

  protected static IStrategoTerm const7718;

  protected static IStrategoTerm constParam2;

  protected static IStrategoTerm constClassOrInterfaceType9;

  protected static IStrategoTerm constTypeName24;

  protected static IStrategoTerm constCons5025;

  protected static IStrategoTerm constCons5024;

  protected static IStrategoTerm constId56;

  protected static IStrategoTerm const7717;

  protected static IStrategoTerm constClassOrInterfaceType8;

  protected static IStrategoTerm constTypeName23;

  protected static IStrategoTerm constLocalVarDecStm0;

  protected static IStrategoTerm constLocalVarDec0;

  protected static IStrategoTerm constCons5023;

  protected static IStrategoTerm constVarDec0;

  protected static IStrategoTerm constLit7;

  protected static IStrategoTerm constBool1;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constBoolean0;

  protected static IStrategoTerm constIf5;

  protected static IStrategoTerm constBlock6;

  protected static IStrategoTerm constCons5022;

  protected static IStrategoTerm constExprStm7;

  protected static IStrategoTerm constAssign5;

  protected static IStrategoTerm constNewInstance7;

  protected static IStrategoTerm constLazyAnd1;

  protected static IStrategoTerm constInvoke10;

  protected static IStrategoTerm constMethod9;

  protected static IStrategoTerm constNewInstance6;

  protected static IStrategoTerm constCons5021;

  protected static IStrategoTerm constPlus9;

  protected static IStrategoTerm constIf4;

  protected static IStrategoTerm constBlock5;

  protected static IStrategoTerm constCons5020;

  protected static IStrategoTerm constExprStm6;

  protected static IStrategoTerm constAssign4;

  protected static IStrategoTerm constNewInstance5;

  protected static IStrategoTerm constClassOrInterfaceType7;

  protected static IStrategoTerm constTypeName22;

  protected static IStrategoTerm constCons5019;

  protected static IStrategoTerm constExprStm5;

  protected static IStrategoTerm constAssign3;

  protected static IStrategoTerm constLit6;

  protected static IStrategoTerm constBool0;

  protected static IStrategoTerm constTrue0;

  protected static IStrategoTerm constLazyAnd0;

  protected static IStrategoTerm constInvoke9;

  protected static IStrategoTerm constMethod8;

  protected static IStrategoTerm constId55;

  protected static IStrategoTerm const7716;

  protected static IStrategoTerm constNewInstance4;

  protected static IStrategoTerm constCons5018;

  protected static IStrategoTerm constPlus8;

  protected static IStrategoTerm constClassOrInterfaceType6;

  protected static IStrategoTerm constTypeName21;

  protected static IStrategoTerm constIf3;

  protected static IStrategoTerm constThrow3;

  protected static IStrategoTerm constNewInstance3;

  protected static IStrategoTerm constCons5017;

  protected static IStrategoTerm constPlus7;

  protected static IStrategoTerm constPlus6;

  protected static IStrategoTerm constPlus5;

  protected static IStrategoTerm constPlus4;

  protected static IStrategoTerm constExprName11;

  protected static IStrategoTerm constId54;

  protected static IStrategoTerm const7715;

  protected static IStrategoTerm constLit5;

  protected static IStrategoTerm constString21;

  protected static IStrategoTerm constCons5016;

  protected static IStrategoTerm constChars4;

  protected static IStrategoTerm const7714;

  protected static IStrategoTerm constEq1;

  protected static IStrategoTerm constIf2;

  protected static IStrategoTerm constThrow2;

  protected static IStrategoTerm constNewInstance2;

  protected static IStrategoTerm constCons5015;

  protected static IStrategoTerm constPlus3;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString20;

  protected static IStrategoTerm constCons5014;

  protected static IStrategoTerm constChars3;

  protected static IStrategoTerm constPlus2;

  protected static IStrategoTerm constInvoke8;

  protected static IStrategoTerm constMethod7;

  protected static IStrategoTerm constMethodName6;

  protected static IStrategoTerm constPlus1;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constString19;

  protected static IStrategoTerm constCons5013;

  protected static IStrategoTerm constChars2;

  protected static IStrategoTerm const7713;

  protected static IStrategoTerm constPlus0;

  protected static IStrategoTerm constExprName10;

  protected static IStrategoTerm constId53;

  protected static IStrategoTerm const7712;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constString18;

  protected static IStrategoTerm constCons5012;

  protected static IStrategoTerm constChars1;

  protected static IStrategoTerm const7711;

  protected static IStrategoTerm constEq0;

  protected static IStrategoTerm constExprStm4;

  protected static IStrategoTerm constAssign2;

  protected static IStrategoTerm constInvoke7;

  protected static IStrategoTerm constCons5011;

  protected static IStrategoTerm constExprName9;

  protected static IStrategoTerm constId52;

  protected static IStrategoTerm const7710;

  protected static IStrategoTerm constCons5010;

  protected static IStrategoTerm constExprName8;

  protected static IStrategoTerm constId51;

  protected static IStrategoTerm const7709;

  protected static IStrategoTerm constCons5009;

  protected static IStrategoTerm constCond0;

  protected static IStrategoTerm constInvoke6;

  protected static IStrategoTerm constCons5008;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constString17;

  protected static IStrategoTerm constCons5007;

  protected static IStrategoTerm constChars0;

  protected static IStrategoTerm const7708;

  protected static IStrategoTerm constMethod6;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm constId50;

  protected static IStrategoTerm const7707;

  protected static IStrategoTerm constAmbName2;

  protected static IStrategoTerm constExprName7;

  protected static IStrategoTerm constId49;

  protected static IStrategoTerm const7706;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm constId48;

  protected static IStrategoTerm const7705;

  protected static IStrategoTerm constAmbName1;

  protected static IStrategoTerm constExprName6;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId47;

  protected static IStrategoTerm const7704;

  protected static IStrategoTerm constAmbName0;

  protected static IStrategoTerm constId46;

  protected static IStrategoTerm const7703;

  protected static IStrategoTerm constMethodDecHead4;

  protected static IStrategoTerm constId45;

  protected static IStrategoTerm const7702;

  protected static IStrategoTerm constCons5006;

  protected static IStrategoTerm constId44;

  protected static IStrategoTerm const7701;

  protected static IStrategoTerm constId43;

  protected static IStrategoTerm const7700;

  protected static IStrategoTerm constId42;

  protected static IStrategoTerm const7699;

  protected static IStrategoTerm constId41;

  protected static IStrategoTerm const7698;

  protected static IStrategoTerm constMethodDecHead3;

  protected static IStrategoTerm constId40;

  protected static IStrategoTerm const7697;

  protected static IStrategoTerm constClassOrInterfaceType5;

  protected static IStrategoTerm constTypeName20;

  protected static IStrategoTerm constId39;

  protected static IStrategoTerm const7696;

  protected static IStrategoTerm constCons5005;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm constCons5004;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constCons5003;

  protected static IStrategoTerm constMethodDec1;

  protected static IStrategoTerm constBlock4;

  protected static IStrategoTerm constCons5002;

  protected static IStrategoTerm constIf1;

  protected static IStrategoTerm constBlock3;

  protected static IStrategoTerm constCons5001;

  protected static IStrategoTerm constIf0;

  protected static IStrategoTerm constThrow1;

  protected static IStrategoTerm constNewInstance1;

  protected static IStrategoTerm constCons5000;

  protected static IStrategoTerm constNotEq0;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constCons4999;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons4998;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constCons4997;

  protected static IStrategoTerm constExprStm3;

  protected static IStrategoTerm constAssign1;

  protected static IStrategoTerm constCons4996;

  protected static IStrategoTerm constThrow0;

  protected static IStrategoTerm constNewInstance0;

  protected static IStrategoTerm constCons4995;

  protected static IStrategoTerm constExprName5;

  protected static IStrategoTerm constClassOrInterfaceType4;

  protected static IStrategoTerm constTypeName19;

  protected static IStrategoTerm constId38;

  protected static IStrategoTerm const7695;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId37;

  protected static IStrategoTerm const7694;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName18;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons4994;

  protected static IStrategoTerm constExprStm2;

  protected static IStrategoTerm constInvoke5;

  protected static IStrategoTerm constCons4993;

  protected static IStrategoTerm constThis0;

  protected static IStrategoTerm constCons4992;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constId36;

  protected static IStrategoTerm const7693;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constMethod2;

  protected static IStrategoTerm constMethodName2;

  protected static IStrategoTerm constMethod1;

  protected static IStrategoTerm constMethodName1;

  protected static IStrategoTerm constId35;

  protected static IStrategoTerm const7692;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constInvoke2;

  protected static IStrategoTerm constMethod0;

  protected static IStrategoTerm constMethodName0;

  protected static IStrategoTerm constId34;

  protected static IStrategoTerm const7691;

  protected static IStrategoTerm constCons4991;

  protected static IStrategoTerm constReturn0;

  protected static IStrategoTerm constSome2;

  protected static IStrategoTerm constInvoke1;

  protected static IStrategoTerm constSuperMethod1;

  protected static IStrategoTerm constMethodDecHead2;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const7690;

  protected static IStrategoTerm constClassOrInterfaceType2;

  protected static IStrategoTerm constTypeName17;

  protected static IStrategoTerm constCons4990;

  protected static IStrategoTerm constMethodDec0;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons4989;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constAssign0;

  protected static IStrategoTerm constExprName4;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const7689;

  protected static IStrategoTerm constCons4988;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke0;

  protected static IStrategoTerm constCons4987;

  protected static IStrategoTerm constExprName3;

  protected static IStrategoTerm constSuperMethod0;

  protected static IStrategoTerm constMethodDecHead1;

  protected static IStrategoTerm constCons4986;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const7688;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constTypeName16;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const7687;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const7686;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constCons4985;

  protected static IStrategoTerm constCons4984;

  protected static IStrategoTerm constProtected0;

  protected static IStrategoTerm constSome1;

  protected static IStrategoTerm constSuperDec1;

  protected static IStrategoTerm constClassType1;

  protected static IStrategoTerm constTypeName15;

  protected static IStrategoTerm constCons4983;

  protected static IStrategoTerm constTypeImportDec11;

  protected static IStrategoTerm constTypeName14;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const7685;

  protected static IStrategoTerm constCons4982;

  protected static IStrategoTerm constTypeImportDec10;

  protected static IStrategoTerm constTypeName13;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const7684;

  protected static IStrategoTerm constCons4981;

  protected static IStrategoTerm constTypeImportDec9;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const7683;

  protected static IStrategoTerm constCons4980;

  protected static IStrategoTerm constTypeImportDec8;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const7682;

  protected static IStrategoTerm constPackageOrTypeName12;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const7681;

  protected static IStrategoTerm constPackageOrTypeName11;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm constCons4979;

  protected static IStrategoTerm constTypeImportDec7;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const7680;

  protected static IStrategoTerm constPackageOrTypeName10;

  protected static IStrategoTerm constPackageOrTypeName9;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const7679;

  protected static IStrategoTerm constCons4978;

  protected static IStrategoTerm constTypeImportDec6;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const7678;

  protected static IStrategoTerm constPackageOrTypeName8;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const7677;

  protected static IStrategoTerm constPackageOrTypeName7;

  protected static IStrategoTerm constPackageOrTypeName6;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const7676;

  protected static IStrategoTerm constCons4977;

  protected static IStrategoTerm constTypeImportDec5;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const7675;

  protected static IStrategoTerm constCons4976;

  protected static IStrategoTerm constTypeImportDec4;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const7674;

  protected static IStrategoTerm constCons4975;

  protected static IStrategoTerm constCons4974;

  protected static IStrategoTerm constTypeImportDec3;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const7673;

  protected static IStrategoTerm constCons4973;

  protected static IStrategoTerm constTypeImportDec2;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const7672;

  protected static IStrategoTerm const7671;

  protected static IStrategoTerm const7670;

  protected static IStrategoTerm const7669;

  protected static IStrategoTerm const7668;

  protected static IStrategoTerm const7667;

  protected static IStrategoTerm const7666;

  protected static IStrategoTerm constCons4972;

  protected static IStrategoTerm const7665;

  protected static IStrategoTerm constCons4971;

  protected static IStrategoTerm constCons4970;

  protected static IStrategoTerm const7664;

  protected static IStrategoTerm constCons4969;

  protected static IStrategoTerm const7663;

  protected static IStrategoTerm constCons4968;

  protected static IStrategoTerm const7662;

  protected static IStrategoTerm constCons4967;

  protected static IStrategoTerm const7661;

  protected static IStrategoTerm constCons4966;

  protected static IStrategoTerm const7660;

  protected static IStrategoTerm const7659;

  protected static IStrategoTerm const7658;

  protected static IStrategoTerm const7657;

  protected static IStrategoTerm const7656;

  protected static IStrategoTerm const7655;

  protected static IStrategoTerm const7654;

  protected static IStrategoTerm const7653;

  protected static IStrategoTerm const7652;

  protected static IStrategoTerm const7651;

  protected static IStrategoTerm const7650;

  protected static IStrategoTerm constCons4965;

  protected static IStrategoTerm const7649;

  protected static IStrategoTerm const7648;

  protected static IStrategoTerm const7647;

  protected static IStrategoTerm const7646;

  protected static IStrategoTerm const7645;

  protected static IStrategoTerm const7644;

  protected static IStrategoTerm const7643;

  protected static IStrategoTerm const7642;

  protected static IStrategoTerm const7641;

  protected static IStrategoTerm const7640;

  protected static IStrategoTerm const7639;

  protected static IStrategoTerm const7638;

  protected static IStrategoTerm constCons4964;

  protected static IStrategoTerm const7637;

  protected static IStrategoTerm const7636;

  protected static IStrategoTerm constCons4963;

  protected static IStrategoTerm const7635;

  protected static IStrategoTerm const7634;

  protected static IStrategoTerm const7633;

  protected static IStrategoTerm const7632;

  protected static IStrategoTerm const7631;

  protected static IStrategoTerm const7630;

  protected static IStrategoTerm const7629;

  protected static IStrategoTerm constCons4962;

  protected static IStrategoTerm const7628;

  protected static IStrategoTerm const7627;

  protected static IStrategoTerm const7626;

  protected static IStrategoTerm const7625;

  protected static IStrategoTerm const7624;

  protected static IStrategoTerm const7623;

  protected static IStrategoTerm constCons4961;

  protected static IStrategoTerm const7622;

  protected static IStrategoTerm constCons4960;

  protected static IStrategoTerm const7621;

  protected static IStrategoTerm constCons4959;

  protected static IStrategoTerm constCons4958;

  protected static IStrategoTerm const7620;

  protected static IStrategoTerm const7619;

  protected static IStrategoTerm constCons4957;

  protected static IStrategoTerm const7618;

  protected static IStrategoTerm const7617;

  protected static IStrategoTerm const7616;

  protected static IStrategoTerm constCons4956;

  protected static IStrategoTerm const7615;

  protected static IStrategoTerm constCons4955;

  protected static IStrategoTerm const7614;

  protected static IStrategoTerm const7613;

  protected static IStrategoTerm const7612;

  protected static IStrategoTerm const7611;

  protected static IStrategoTerm const7610;

  protected static IStrategoTerm const7609;

  protected static IStrategoTerm const7608;

  protected static IStrategoTerm const7607;

  protected static IStrategoTerm const7606;

  protected static IStrategoTerm const7605;

  protected static IStrategoTerm const7604;

  protected static IStrategoTerm const7603;

  protected static IStrategoTerm const7602;

  protected static IStrategoTerm const7601;

  protected static IStrategoTerm const7600;

  protected static IStrategoTerm const7599;

  protected static IStrategoTerm const7598;

  protected static IStrategoTerm const7597;

  protected static IStrategoTerm const7596;

  protected static IStrategoTerm const7595;

  protected static IStrategoTerm const7594;

  protected static IStrategoTerm const7593;

  protected static IStrategoTerm const7592;

  protected static IStrategoTerm const7591;

  protected static IStrategoTerm const7590;

  protected static IStrategoTerm const7589;

  protected static IStrategoTerm const7588;

  protected static IStrategoTerm const7587;

  protected static IStrategoTerm const7586;

  protected static IStrategoTerm const7585;

  protected static IStrategoTerm const7584;

  protected static IStrategoTerm const7583;

  protected static IStrategoTerm const7582;

  protected static IStrategoTerm constCons4954;

  protected static IStrategoTerm const7581;

  protected static IStrategoTerm const7580;

  protected static IStrategoTerm const7579;

  protected static IStrategoTerm constCons4953;

  protected static IStrategoTerm const7578;

  protected static IStrategoTerm const7577;

  protected static IStrategoTerm const7576;

  protected static IStrategoTerm const7575;

  protected static IStrategoTerm const7574;

  protected static IStrategoTerm const7573;

  protected static IStrategoTerm const7572;

  protected static IStrategoTerm const7571;

  protected static IStrategoTerm constCons4952;

  protected static IStrategoTerm const7570;

  protected static IStrategoTerm const7569;

  protected static IStrategoTerm const7568;

  protected static IStrategoTerm const7567;

  protected static IStrategoTerm constCons4951;

  protected static IStrategoTerm const7566;

  protected static IStrategoTerm const7565;

  protected static IStrategoTerm const7564;

  protected static IStrategoTerm const7563;

  protected static IStrategoTerm const7562;

  protected static IStrategoTerm const7561;

  protected static IStrategoTerm const7560;

  protected static IStrategoTerm const7559;

  protected static IStrategoTerm const7558;

  protected static IStrategoTerm const7557;

  protected static IStrategoTerm const7556;

  protected static IStrategoTerm const7555;

  protected static IStrategoTerm const7554;

  protected static IStrategoTerm constCons4950;

  protected static IStrategoTerm const7553;

  protected static IStrategoTerm const7552;

  protected static IStrategoTerm const7551;

  protected static IStrategoTerm const7550;

  protected static IStrategoTerm const7549;

  protected static IStrategoTerm const7548;

  protected static IStrategoTerm const7547;

  protected static IStrategoTerm const7546;

  protected static IStrategoTerm const7545;

  protected static IStrategoTerm const7544;

  protected static IStrategoTerm const7543;

  protected static IStrategoTerm const7542;

  protected static IStrategoTerm const7541;

  protected static IStrategoTerm const7540;

  protected static IStrategoTerm const7539;

  protected static IStrategoTerm const7538;

  protected static IStrategoTerm const7537;

  protected static IStrategoTerm const7536;

  protected static IStrategoTerm const7535;

  protected static IStrategoTerm const7534;

  protected static IStrategoTerm const7533;

  protected static IStrategoTerm const7532;

  protected static IStrategoTerm const7531;

  protected static IStrategoTerm const7530;

  protected static IStrategoTerm const7529;

  protected static IStrategoTerm const7528;

  protected static IStrategoTerm const7527;

  protected static IStrategoTerm const7526;

  protected static IStrategoTerm const7525;

  protected static IStrategoTerm constCons4949;

  protected static IStrategoTerm const7524;

  protected static IStrategoTerm constCons4948;

  protected static IStrategoTerm constCons4947;

  protected static IStrategoTerm const7523;

  protected static IStrategoTerm constCons4946;

  protected static IStrategoTerm constCons4945;

  protected static IStrategoTerm const7522;

  protected static IStrategoTerm constCons4944;

  protected static IStrategoTerm constCons4943;

  protected static IStrategoTerm const7521;

  protected static IStrategoTerm constCons4942;

  protected static IStrategoTerm constCons4941;

  protected static IStrategoTerm const7520;

  protected static IStrategoTerm constCons4940;

  protected static IStrategoTerm const7519;

  protected static IStrategoTerm constCons4939;

  protected static IStrategoTerm const7518;

  protected static IStrategoTerm const7517;

  protected static IStrategoTerm const7516;

  protected static IStrategoTerm const7515;

  protected static IStrategoTerm const7514;

  protected static IStrategoTerm const7513;

  protected static IStrategoTerm const7512;

  protected static IStrategoTerm const7511;

  protected static IStrategoTerm constCons4938;

  protected static IStrategoTerm const7510;

  protected static IStrategoTerm constCons4937;

  protected static IStrategoTerm const7509;

  protected static IStrategoTerm constCons4936;

  protected static IStrategoTerm constCons4935;

  protected static IStrategoTerm const7508;

  protected static IStrategoTerm constCons4934;

  protected static IStrategoTerm constCons4933;

  protected static IStrategoTerm const7507;

  protected static IStrategoTerm constCons4932;

  protected static IStrategoTerm const7506;

  protected static IStrategoTerm constCons4931;

  protected static IStrategoTerm const7505;

  protected static IStrategoTerm const7504;

  protected static IStrategoTerm const7503;

  protected static IStrategoTerm const7502;

  protected static IStrategoTerm constMethodDecHead0;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const7501;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constCons4930;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const7500;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constSuperDec0;

  protected static IStrategoTerm constClassType0;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constCons4929;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons4928;

  protected static IStrategoTerm constTypeImportDec1;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const7499;

  protected static IStrategoTerm constPackageOrTypeName5;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const7498;

  protected static IStrategoTerm constCons4927;

  protected static IStrategoTerm constTypeImportDec0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const7497;

  protected static IStrategoTerm constPackageOrTypeName4;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm const7496;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const7495;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const7494;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const7493;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const7492;

  protected static IStrategoTerm const7491;

  protected static IStrategoTerm const7490;

  protected static IStrategoTerm const7489;

  protected static IStrategoTerm const7488;

  protected static IStrategoTerm const7487;

  protected static IStrategoTerm const7486;

  protected static IStrategoTerm const7485;

  protected static IStrategoTerm const7484;

  protected static IStrategoTerm const7483;

  protected static IStrategoTerm const7482;

  protected static IStrategoTerm const7481;

  protected static IStrategoTerm const7480;

  protected static IStrategoTerm const7479;

  protected static IStrategoTerm constCons4926;

  protected static IStrategoTerm const7478;

  protected static IStrategoTerm const7477;

  protected static IStrategoTerm const7476;

  protected static IStrategoTerm const7475;

  protected static IStrategoTerm const7474;

  protected static IStrategoTerm constCons4925;

  protected static IStrategoTerm constExprName2;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const7473;

  protected static IStrategoTerm constCons4924;

  protected static IStrategoTerm constExprName1;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const7472;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const7471;

  protected static IStrategoTerm constExprName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const7470;

  protected static IStrategoTerm const7469;

  protected static IStrategoTerm const7468;

  protected static IStrategoTerm const7467;

  protected static IStrategoTerm const7466;

  protected static IStrategoTerm const7465;

  protected static IStrategoTerm const7464;

  protected static IStrategoTerm const7463;

  protected static IStrategoTerm const7462;

  protected static IStrategoTerm const7461;

  protected static IStrategoTerm const7460;

  protected static IStrategoTerm const7459;

  protected static IStrategoTerm constImport0;

  protected static IStrategoTerm const7458;

  protected static IStrategoTerm const7457;

  protected static IStrategoTerm const7456;

  protected static IStrategoTerm const7455;

  protected static IStrategoTerm const7454;

  protected static IStrategoTerm const7453;

  protected static IStrategoTerm const7452;

  protected static IStrategoTerm const7451;

  protected static IStrategoTerm const7450;

  protected static IStrategoTerm const7449;

  protected static IStrategoTerm const7448;

  protected static IStrategoTerm const7447;

  protected static IStrategoTerm const7446;

  protected static IStrategoTerm const7445;

  protected static IStrategoTerm const7444;

  protected static IStrategoTerm const7443;

  protected static IStrategoTerm const7442;

  protected static IStrategoTerm const7441;

  protected static IStrategoTerm const7440;

  protected static IStrategoTerm const7439;

  protected static IStrategoTerm const7438;

  protected static IStrategoTerm const7437;

  protected static IStrategoTerm const7436;

  protected static IStrategoTerm const7435;

  protected static IStrategoTerm const7434;

  protected static IStrategoTerm constBuilders1;

  protected static IStrategoTerm constCons4923;

  protected static IStrategoTerm constCons4922;

  protected static IStrategoTerm constCommentLine113;

  protected static IStrategoTerm const7433;

  protected static IStrategoTerm constCons4921;

  protected static IStrategoTerm constCons4920;

  protected static IStrategoTerm constSemanticObserver0;

  protected static IStrategoTerm constStrategy7;

  protected static IStrategoTerm const7432;

  protected static IStrategoTerm constCons4919;

  protected static IStrategoTerm constCons4918;

  protected static IStrategoTerm constBuilder1;

  protected static IStrategoTerm constCons4917;

  protected static IStrategoTerm constCons4916;

  protected static IStrategoTerm constStrategy6;

  protected static IStrategoTerm const7431;

  protected static IStrategoTerm constString16;

  protected static IStrategoTerm const7430;

  protected static IStrategoTerm constCons4915;

  protected static IStrategoTerm constBuilder0;

  protected static IStrategoTerm constCons4914;

  protected static IStrategoTerm constOpenEditor0;

  protected static IStrategoTerm constCons4913;

  protected static IStrategoTerm constRealTime0;

  protected static IStrategoTerm constCons4912;

  protected static IStrategoTerm constMeta0;

  protected static IStrategoTerm constCons4911;

  protected static IStrategoTerm constStrategy5;

  protected static IStrategoTerm const7429;

  protected static IStrategoTerm constString15;

  protected static IStrategoTerm const7428;

  protected static IStrategoTerm constCons4910;

  protected static IStrategoTerm constRefactorings0;

  protected static IStrategoTerm constCons4909;

  protected static IStrategoTerm constCons4908;

  protected static IStrategoTerm constPPTable0;

  protected static IStrategoTerm constStrategy4;

  protected static IStrategoTerm const7427;

  protected static IStrategoTerm constCons4907;

  protected static IStrategoTerm constCons4906;

  protected static IStrategoTerm constRefactoring0;

  protected static IStrategoTerm constCons4905;

  protected static IStrategoTerm constSource0;

  protected static IStrategoTerm constCons4904;

  protected static IStrategoTerm constStrategy3;

  protected static IStrategoTerm const7426;

  protected static IStrategoTerm constString14;

  protected static IStrategoTerm const7425;

  protected static IStrategoTerm constCons4903;

  protected static IStrategoTerm constSort4;

  protected static IStrategoTerm const7424;

  protected static IStrategoTerm constCons4902;

  protected static IStrategoTerm constCons4901;

  protected static IStrategoTerm constCommentLine112;

  protected static IStrategoTerm const7423;

  protected static IStrategoTerm const7422;

  protected static IStrategoTerm const7421;

  protected static IStrategoTerm const7420;

  protected static IStrategoTerm constCons4900;

  protected static IStrategoTerm constBuilders0;

  protected static IStrategoTerm constCons4899;

  protected static IStrategoTerm constCons4898;

  protected static IStrategoTerm constCommentLine111;

  protected static IStrategoTerm const7419;

  protected static IStrategoTerm constCons4897;

  protected static IStrategoTerm constCons4896;

  protected static IStrategoTerm constCommentLine110;

  protected static IStrategoTerm const7418;

  protected static IStrategoTerm constCons4895;

  protected static IStrategoTerm constCommentLine109;

  protected static IStrategoTerm const7417;

  protected static IStrategoTerm constCons4894;

  protected static IStrategoTerm constCons4893;

  protected static IStrategoTerm constCommentLine108;

  protected static IStrategoTerm const7416;

  protected static IStrategoTerm constCons4892;

  protected static IStrategoTerm constCons4891;

  protected static IStrategoTerm constCommentLine107;

  protected static IStrategoTerm const7415;

  protected static IStrategoTerm constCons4890;

  protected static IStrategoTerm constCons4889;

  protected static IStrategoTerm constCommentLine106;

  protected static IStrategoTerm const7414;

  protected static IStrategoTerm constCons4888;

  protected static IStrategoTerm constCommentLine105;

  protected static IStrategoTerm const7413;

  protected static IStrategoTerm constCons4887;

  protected static IStrategoTerm constCons4886;

  protected static IStrategoTerm constCommentLine104;

  protected static IStrategoTerm const7412;

  protected static IStrategoTerm constCons4885;

  protected static IStrategoTerm constCommentLine103;

  protected static IStrategoTerm const7411;

  protected static IStrategoTerm constCons4884;

  protected static IStrategoTerm constCommentLine102;

  protected static IStrategoTerm const7410;

  protected static IStrategoTerm constCons4883;

  protected static IStrategoTerm constCons4882;

  protected static IStrategoTerm constCommentLine101;

  protected static IStrategoTerm const7409;

  protected static IStrategoTerm constCons4881;

  protected static IStrategoTerm constCons4880;

  protected static IStrategoTerm constCommentLine100;

  protected static IStrategoTerm const7408;

  protected static IStrategoTerm constCons4879;

  protected static IStrategoTerm constCommentLine99;

  protected static IStrategoTerm const7407;

  protected static IStrategoTerm constCons4878;

  protected static IStrategoTerm constCommentLine98;

  protected static IStrategoTerm const7406;

  protected static IStrategoTerm constCons4877;

  protected static IStrategoTerm constCons4876;

  protected static IStrategoTerm constCommentLine97;

  protected static IStrategoTerm const7405;

  protected static IStrategoTerm constCons4875;

  protected static IStrategoTerm constCommentLine96;

  protected static IStrategoTerm const7404;

  protected static IStrategoTerm constCons4874;

  protected static IStrategoTerm constCommentLine95;

  protected static IStrategoTerm const7403;

  protected static IStrategoTerm constCons4873;

  protected static IStrategoTerm constCommentLine94;

  protected static IStrategoTerm const7402;

  protected static IStrategoTerm constCons4872;

  protected static IStrategoTerm constCommentLine93;

  protected static IStrategoTerm const7401;

  protected static IStrategoTerm constCons4871;

  protected static IStrategoTerm constCommentLine92;

  protected static IStrategoTerm const7400;

  protected static IStrategoTerm constCons4870;

  protected static IStrategoTerm constCommentLine91;

  protected static IStrategoTerm const7399;

  protected static IStrategoTerm constCons4869;

  protected static IStrategoTerm constCommentLine90;

  protected static IStrategoTerm const7398;

  protected static IStrategoTerm constCons4868;

  protected static IStrategoTerm constCommentLine89;

  protected static IStrategoTerm const7397;

  protected static IStrategoTerm constCons4867;

  protected static IStrategoTerm constCons4866;

  protected static IStrategoTerm constCommentLine88;

  protected static IStrategoTerm const7396;

  protected static IStrategoTerm constCons4865;

  protected static IStrategoTerm constCommentLine87;

  protected static IStrategoTerm const7395;

  protected static IStrategoTerm constCons4864;

  protected static IStrategoTerm constCommentLine86;

  protected static IStrategoTerm const7394;

  protected static IStrategoTerm constCons4863;

  protected static IStrategoTerm constCommentLine85;

  protected static IStrategoTerm const7393;

  protected static IStrategoTerm constCons4862;

  protected static IStrategoTerm constCommentLine84;

  protected static IStrategoTerm const7392;

  protected static IStrategoTerm constCons4861;

  protected static IStrategoTerm constCommentLine83;

  protected static IStrategoTerm const7391;

  protected static IStrategoTerm constCons4860;

  protected static IStrategoTerm constCons4859;

  protected static IStrategoTerm constCommentLine82;

  protected static IStrategoTerm const7390;

  protected static IStrategoTerm constCons4858;

  protected static IStrategoTerm constCommentLine81;

  protected static IStrategoTerm const7389;

  protected static IStrategoTerm constCons4857;

  protected static IStrategoTerm constCons4856;

  protected static IStrategoTerm constCommentLine80;

  protected static IStrategoTerm const7388;

  protected static IStrategoTerm constCons4855;

  protected static IStrategoTerm constCommentLine79;

  protected static IStrategoTerm constCons4854;

  protected static IStrategoTerm constCommentLine78;

  protected static IStrategoTerm const7387;

  protected static IStrategoTerm constCons4853;

  protected static IStrategoTerm constCommentLine77;

  protected static IStrategoTerm constCons4852;

  protected static IStrategoTerm constCommentLine76;

  protected static IStrategoTerm const7386;

  protected static IStrategoTerm const7385;

  protected static IStrategoTerm const7384;

  protected static IStrategoTerm const7383;

  protected static IStrategoTerm const7382;

  protected static IStrategoTerm constCons4851;

  protected static IStrategoTerm const7381;

  protected static IStrategoTerm const7380;

  protected static IStrategoTerm const7379;

  protected static IStrategoTerm constCons4850;

  protected static IStrategoTerm constColorer4;

  protected static IStrategoTerm constCons4849;

  protected static IStrategoTerm constCons4848;

  protected static IStrategoTerm constCommentLine75;

  protected static IStrategoTerm const7378;

  protected static IStrategoTerm constCons4847;

  protected static IStrategoTerm constCommentLine74;

  protected static IStrategoTerm const7377;

  protected static IStrategoTerm constCons4846;

  protected static IStrategoTerm constCons4845;

  protected static IStrategoTerm constCommentLine73;

  protected static IStrategoTerm const7376;

  protected static IStrategoTerm constCons4844;

  protected static IStrategoTerm constCommentLine72;

  protected static IStrategoTerm const7375;

  protected static IStrategoTerm constCons4843;

  protected static IStrategoTerm constCons4842;

  protected static IStrategoTerm constCommentLine71;

  protected static IStrategoTerm const7374;

  protected static IStrategoTerm constCons4841;

  protected static IStrategoTerm constCommentLine70;

  protected static IStrategoTerm const7373;

  protected static IStrategoTerm constCons4840;

  protected static IStrategoTerm constCons4839;

  protected static IStrategoTerm constCommentLine69;

  protected static IStrategoTerm const7372;

  protected static IStrategoTerm constCons4838;

  protected static IStrategoTerm constCommentLine68;

  protected static IStrategoTerm const7371;

  protected static IStrategoTerm constCons4837;

  protected static IStrategoTerm constCommentLine67;

  protected static IStrategoTerm const7370;

  protected static IStrategoTerm constCons4836;

  protected static IStrategoTerm constColorer3;

  protected static IStrategoTerm constCons4835;

  protected static IStrategoTerm constCons4834;

  protected static IStrategoTerm constColorRule7;

  protected static IStrategoTerm constAttribute19;

  protected static IStrategoTerm constColorRGB18;

  protected static IStrategoTerm const7369;

  protected static IStrategoTerm constToken6;

  protected static IStrategoTerm constTK_KEYWORD0;

  protected static IStrategoTerm constCons4833;

  protected static IStrategoTerm constColorRule6;

  protected static IStrategoTerm constAttributeRef3;

  protected static IStrategoTerm constToken5;

  protected static IStrategoTerm constTK_IDENTIFIER0;

  protected static IStrategoTerm constCons4832;

  protected static IStrategoTerm constColorRule5;

  protected static IStrategoTerm constAttributeRef2;

  protected static IStrategoTerm constToken4;

  protected static IStrategoTerm constTK_STRING0;

  protected static IStrategoTerm constCons4831;

  protected static IStrategoTerm constColorRule4;

  protected static IStrategoTerm constAttributeRef1;

  protected static IStrategoTerm constToken3;

  protected static IStrategoTerm constTK_NUMBER0;

  protected static IStrategoTerm constCons4830;

  protected static IStrategoTerm constColorRule3;

  protected static IStrategoTerm constAttribute18;

  protected static IStrategoTerm constColorRGB17;

  protected static IStrategoTerm const7368;

  protected static IStrategoTerm constToken2;

  protected static IStrategoTerm constTK_VAR0;

  protected static IStrategoTerm constCons4829;

  protected static IStrategoTerm constColorRule2;

  protected static IStrategoTerm constToken1;

  protected static IStrategoTerm constTK_OPERATOR0;

  protected static IStrategoTerm constCons4828;

  protected static IStrategoTerm constColorRule1;

  protected static IStrategoTerm constAttribute17;

  protected static IStrategoTerm constITALIC0;

  protected static IStrategoTerm constColorRGB16;

  protected static IStrategoTerm const7367;

  protected static IStrategoTerm const7366;

  protected static IStrategoTerm const7365;

  protected static IStrategoTerm constToken0;

  protected static IStrategoTerm constTK_LAYOUT0;

  protected static IStrategoTerm constCons4827;

  protected static IStrategoTerm const7364;

  protected static IStrategoTerm constCons4826;

  protected static IStrategoTerm constColorer2;

  protected static IStrategoTerm constCons4825;

  protected static IStrategoTerm constCons4824;

  protected static IStrategoTerm constColorDef16;

  protected static IStrategoTerm constAttribute16;

  protected static IStrategoTerm constColorRGB15;

  protected static IStrategoTerm const7363;

  protected static IStrategoTerm constCons4823;

  protected static IStrategoTerm constColorDef15;

  protected static IStrategoTerm constAttribute15;

  protected static IStrategoTerm constColorRGB14;

  protected static IStrategoTerm const7362;

  protected static IStrategoTerm constCons4822;

  protected static IStrategoTerm constColorDef14;

  protected static IStrategoTerm constAttribute14;

  protected static IStrategoTerm constColorRGB13;

  protected static IStrategoTerm const7361;

  protected static IStrategoTerm constCons4821;

  protected static IStrategoTerm constColorDef13;

  protected static IStrategoTerm constAttribute13;

  protected static IStrategoTerm constColorRGB12;

  protected static IStrategoTerm const7360;

  protected static IStrategoTerm constCons4820;

  protected static IStrategoTerm constColorDef12;

  protected static IStrategoTerm constAttribute12;

  protected static IStrategoTerm constColorRGB11;

  protected static IStrategoTerm const7359;

  protected static IStrategoTerm constCons4819;

  protected static IStrategoTerm constColorDef11;

  protected static IStrategoTerm constAttribute11;

  protected static IStrategoTerm constColorRGB10;

  protected static IStrategoTerm const7358;

  protected static IStrategoTerm constCons4818;

  protected static IStrategoTerm constColorDef10;

  protected static IStrategoTerm constAttribute10;

  protected static IStrategoTerm constColorRGB9;

  protected static IStrategoTerm const7357;

  protected static IStrategoTerm constCons4817;

  protected static IStrategoTerm constColorDef9;

  protected static IStrategoTerm constAttribute9;

  protected static IStrategoTerm constColorRGB8;

  protected static IStrategoTerm const7356;

  protected static IStrategoTerm constCons4816;

  protected static IStrategoTerm constColorDef8;

  protected static IStrategoTerm constAttribute8;

  protected static IStrategoTerm constColorRGB7;

  protected static IStrategoTerm const7355;

  protected static IStrategoTerm constCons4815;

  protected static IStrategoTerm constColorDef7;

  protected static IStrategoTerm constAttribute7;

  protected static IStrategoTerm constColorRGB6;

  protected static IStrategoTerm const7354;

  protected static IStrategoTerm constCons4814;

  protected static IStrategoTerm constColorDef6;

  protected static IStrategoTerm constAttribute6;

  protected static IStrategoTerm constColorRGB5;

  protected static IStrategoTerm const7353;

  protected static IStrategoTerm constCons4813;

  protected static IStrategoTerm constColorDef5;

  protected static IStrategoTerm constAttribute5;

  protected static IStrategoTerm constColorRGB4;

  protected static IStrategoTerm const7352;

  protected static IStrategoTerm constCons4812;

  protected static IStrategoTerm constColorDef4;

  protected static IStrategoTerm constAttributeRef0;

  protected static IStrategoTerm const7351;

  protected static IStrategoTerm const7350;

  protected static IStrategoTerm constCons4811;

  protected static IStrategoTerm constColorDef3;

  protected static IStrategoTerm constAttribute4;

  protected static IStrategoTerm constColorRGB3;

  protected static IStrategoTerm const7349;

  protected static IStrategoTerm const7348;

  protected static IStrategoTerm constCons4810;

  protected static IStrategoTerm constColorDef2;

  protected static IStrategoTerm constAttribute3;

  protected static IStrategoTerm constColorRGB2;

  protected static IStrategoTerm const7347;

  protected static IStrategoTerm const7346;

  protected static IStrategoTerm const7345;

  protected static IStrategoTerm const7344;

  protected static IStrategoTerm constCons4809;

  protected static IStrategoTerm constColorDef1;

  protected static IStrategoTerm constAttribute2;

  protected static IStrategoTerm constColorRGB1;

  protected static IStrategoTerm const7343;

  protected static IStrategoTerm const7342;

  protected static IStrategoTerm const7341;

  protected static IStrategoTerm const7340;

  protected static IStrategoTerm constCons4808;

  protected static IStrategoTerm constColorDef0;

  protected static IStrategoTerm constAttribute1;

  protected static IStrategoTerm constNORMAL0;

  protected static IStrategoTerm constColorDefault0;

  protected static IStrategoTerm const7339;

  protected static IStrategoTerm const7338;

  protected static IStrategoTerm constCons4807;

  protected static IStrategoTerm constColorer1;

  protected static IStrategoTerm constCons4806;

  protected static IStrategoTerm constCons4805;

  protected static IStrategoTerm constCommentLine66;

  protected static IStrategoTerm const7337;

  protected static IStrategoTerm constCons4804;

  protected static IStrategoTerm constColorer0;

  protected static IStrategoTerm constCons4803;

  protected static IStrategoTerm constCons4802;

  protected static IStrategoTerm constColorRule0;

  protected static IStrategoTerm constAttribute0;

  protected static IStrategoTerm constBOLD0;

  protected static IStrategoTerm constNoColor0;

  protected static IStrategoTerm constColorRGB0;

  protected static IStrategoTerm const7336;

  protected static IStrategoTerm const7335;

  protected static IStrategoTerm const7334;

  protected static IStrategoTerm constSort3;

  protected static IStrategoTerm const7333;

  protected static IStrategoTerm const7332;

  protected static IStrategoTerm const7331;

  protected static IStrategoTerm const7330;

  protected static IStrategoTerm constCommentLine65;

  protected static IStrategoTerm const7329;

  protected static IStrategoTerm constCons4801;

  protected static IStrategoTerm constCompletions5;

  protected static IStrategoTerm constCons4800;

  protected static IStrategoTerm constCons4799;

  protected static IStrategoTerm constCommentLine64;

  protected static IStrategoTerm const7328;

  protected static IStrategoTerm constCons4798;

  protected static IStrategoTerm constCompletions4;

  protected static IStrategoTerm constCons4797;

  protected static IStrategoTerm constCons4796;

  protected static IStrategoTerm constCons4795;

  protected static IStrategoTerm constCons4794;

  protected static IStrategoTerm constCons4793;

  protected static IStrategoTerm constCons4792;

  protected static IStrategoTerm constCons4791;

  protected static IStrategoTerm constCons4790;

  protected static IStrategoTerm constCompletionTemplateEx3;

  protected static IStrategoTerm constCompletionPrefix1;

  protected static IStrategoTerm constString13;

  protected static IStrategoTerm const7327;

  protected static IStrategoTerm constCons4789;

  protected static IStrategoTerm constCompletions3;

  protected static IStrategoTerm constCons4788;

  protected static IStrategoTerm constCommentLine63;

  protected static IStrategoTerm const7326;

  protected static IStrategoTerm constCons4787;

  protected static IStrategoTerm constCons4786;

  protected static IStrategoTerm constCompletionProposer0;

  protected static IStrategoTerm constStrategy2;

  protected static IStrategoTerm const7325;

  protected static IStrategoTerm constCons4785;

  protected static IStrategoTerm constCons4784;

  protected static IStrategoTerm constCompletionTrigger0;

  protected static IStrategoTerm const7324;

  protected static IStrategoTerm const7323;

  protected static IStrategoTerm const7322;

  protected static IStrategoTerm constCons4783;

  protected static IStrategoTerm constCompletions2;

  protected static IStrategoTerm constCons4782;

  protected static IStrategoTerm constCons4781;

  protected static IStrategoTerm constCommentLine62;

  protected static IStrategoTerm const7321;

  protected static IStrategoTerm constCons4780;

  protected static IStrategoTerm constCons4779;

  protected static IStrategoTerm constCommentLine61;

  protected static IStrategoTerm const7320;

  protected static IStrategoTerm constCons4778;

  protected static IStrategoTerm constCommentLine60;

  protected static IStrategoTerm const7319;

  protected static IStrategoTerm constCons4777;

  protected static IStrategoTerm constCons4776;

  protected static IStrategoTerm constCommentLine59;

  protected static IStrategoTerm const7318;

  protected static IStrategoTerm constCons4775;

  protected static IStrategoTerm constCommentLine58;

  protected static IStrategoTerm const7317;

  protected static IStrategoTerm constCons4774;

  protected static IStrategoTerm constCommentLine57;

  protected static IStrategoTerm const7316;

  protected static IStrategoTerm constCons4773;

  protected static IStrategoTerm constCommentLine56;

  protected static IStrategoTerm const7315;

  protected static IStrategoTerm constCons4772;

  protected static IStrategoTerm constCons4771;

  protected static IStrategoTerm constCommentLine55;

  protected static IStrategoTerm const7314;

  protected static IStrategoTerm constCons4770;

  protected static IStrategoTerm constCommentLine54;

  protected static IStrategoTerm const7313;

  protected static IStrategoTerm constCons4769;

  protected static IStrategoTerm constCons4768;

  protected static IStrategoTerm constCommentLine53;

  protected static IStrategoTerm const7312;

  protected static IStrategoTerm constCons4767;

  protected static IStrategoTerm constCons4766;

  protected static IStrategoTerm constCommentLine52;

  protected static IStrategoTerm const7311;

  protected static IStrategoTerm constCons4765;

  protected static IStrategoTerm constCommentLine51;

  protected static IStrategoTerm const7310;

  protected static IStrategoTerm constCons4764;

  protected static IStrategoTerm constCons4763;

  protected static IStrategoTerm constCommentLine50;

  protected static IStrategoTerm const7309;

  protected static IStrategoTerm constCons4762;

  protected static IStrategoTerm constCommentLine49;

  protected static IStrategoTerm const7308;

  protected static IStrategoTerm constCons4761;

  protected static IStrategoTerm constCons4760;

  protected static IStrategoTerm constCommentLine48;

  protected static IStrategoTerm const7307;

  protected static IStrategoTerm constCons4759;

  protected static IStrategoTerm constCons4758;

  protected static IStrategoTerm constCommentLine47;

  protected static IStrategoTerm const7306;

  protected static IStrategoTerm constCons4757;

  protected static IStrategoTerm constCommentLine46;

  protected static IStrategoTerm const7305;

  protected static IStrategoTerm constCons4756;

  protected static IStrategoTerm constCons4755;

  protected static IStrategoTerm constCommentLine45;

  protected static IStrategoTerm const7304;

  protected static IStrategoTerm constCons4754;

  protected static IStrategoTerm constCons4753;

  protected static IStrategoTerm constCommentLine44;

  protected static IStrategoTerm const7303;

  protected static IStrategoTerm constCons4752;

  protected static IStrategoTerm constCommentLine43;

  protected static IStrategoTerm const7302;

  protected static IStrategoTerm constCons4751;

  protected static IStrategoTerm constCons4750;

  protected static IStrategoTerm constCommentLine42;

  protected static IStrategoTerm const7301;

  protected static IStrategoTerm constCons4749;

  protected static IStrategoTerm constCommentLine41;

  protected static IStrategoTerm const7300;

  protected static IStrategoTerm constCons4748;

  protected static IStrategoTerm constCommentLine40;

  protected static IStrategoTerm const7299;

  protected static IStrategoTerm constCons4747;

  protected static IStrategoTerm constCommentLine39;

  protected static IStrategoTerm const7298;

  protected static IStrategoTerm constCons4746;

  protected static IStrategoTerm constCommentLine38;

  protected static IStrategoTerm const7297;

  protected static IStrategoTerm constCons4745;

  protected static IStrategoTerm constCons4744;

  protected static IStrategoTerm constCommentLine37;

  protected static IStrategoTerm const7296;

  protected static IStrategoTerm constCons4743;

  protected static IStrategoTerm constCommentLine36;

  protected static IStrategoTerm const7295;

  protected static IStrategoTerm constCons4742;

  protected static IStrategoTerm constCons4741;

  protected static IStrategoTerm constCommentLine35;

  protected static IStrategoTerm const7294;

  protected static IStrategoTerm const7293;

  protected static IStrategoTerm constCons4740;

  protected static IStrategoTerm constCompletions1;

  protected static IStrategoTerm constCons4739;

  protected static IStrategoTerm constCons4738;

  protected static IStrategoTerm constCommentLine34;

  protected static IStrategoTerm const7292;

  protected static IStrategoTerm constCons4737;

  protected static IStrategoTerm constCompletions0;

  protected static IStrategoTerm constCons4736;

  protected static IStrategoTerm constCons4735;

  protected static IStrategoTerm constCommentLine33;

  protected static IStrategoTerm const7291;

  protected static IStrategoTerm constCons4734;

  protected static IStrategoTerm constCons4733;

  protected static IStrategoTerm constCompletionTemplateEx2;

  protected static IStrategoTerm constCons4732;

  protected static IStrategoTerm constString12;

  protected static IStrategoTerm constCons4731;

  protected static IStrategoTerm constPlaceholder3;

  protected static IStrategoTerm const7290;

  protected static IStrategoTerm constCons4730;

  protected static IStrategoTerm constSort2;

  protected static IStrategoTerm const7289;

  protected static IStrategoTerm constCons4729;

  protected static IStrategoTerm constCons4728;

  protected static IStrategoTerm constCompletionTemplateEx1;

  protected static IStrategoTerm constCons4727;

  protected static IStrategoTerm constString11;

  protected static IStrategoTerm const7288;

  protected static IStrategoTerm constCons4726;

  protected static IStrategoTerm constPlaceholder2;

  protected static IStrategoTerm const7287;

  protected static IStrategoTerm constCons4725;

  protected static IStrategoTerm constString10;

  protected static IStrategoTerm const7286;

  protected static IStrategoTerm constCons4724;

  protected static IStrategoTerm constCursor0;

  protected static IStrategoTerm constCons4723;

  protected static IStrategoTerm constString9;

  protected static IStrategoTerm constNoCompletionPrefix0;

  protected static IStrategoTerm constCons4722;

  protected static IStrategoTerm constSort1;

  protected static IStrategoTerm constCons4721;

  protected static IStrategoTerm constCons4720;

  protected static IStrategoTerm constCompletionTemplateEx0;

  protected static IStrategoTerm constCons4719;

  protected static IStrategoTerm constBlank0;

  protected static IStrategoTerm constCons4718;

  protected static IStrategoTerm constPlaceholder1;

  protected static IStrategoTerm const7285;

  protected static IStrategoTerm constCons4717;

  protected static IStrategoTerm constString8;

  protected static IStrategoTerm const7284;

  protected static IStrategoTerm constCons4716;

  protected static IStrategoTerm constPlaceholder0;

  protected static IStrategoTerm const7283;

  protected static IStrategoTerm constCompletionPrefix0;

  protected static IStrategoTerm constString7;

  protected static IStrategoTerm const7282;

  protected static IStrategoTerm constCons4715;

  protected static IStrategoTerm constSort0;

  protected static IStrategoTerm const7281;

  protected static IStrategoTerm const7280;

  protected static IStrategoTerm const7279;

  protected static IStrategoTerm const7278;

  protected static IStrategoTerm const7277;

  protected static IStrategoTerm constCons4714;

  protected static IStrategoTerm constFolding1;

  protected static IStrategoTerm constCons4713;

  protected static IStrategoTerm constCons4712;

  protected static IStrategoTerm constCommentLine32;

  protected static IStrategoTerm const7276;

  protected static IStrategoTerm constCons4711;

  protected static IStrategoTerm constCommentLine31;

  protected static IStrategoTerm const7275;

  protected static IStrategoTerm constCons4710;

  protected static IStrategoTerm constCons4709;

  protected static IStrategoTerm constCons4708;

  protected static IStrategoTerm constCons4707;

  protected static IStrategoTerm constCons4706;

  protected static IStrategoTerm constCons4705;

  protected static IStrategoTerm constCons4704;

  protected static IStrategoTerm constCons4703;

  protected static IStrategoTerm constCommentLine30;

  protected static IStrategoTerm const7274;

  protected static IStrategoTerm constCons4702;

  protected static IStrategoTerm constCommentLine29;

  protected static IStrategoTerm const7273;

  protected static IStrategoTerm constCons4701;

  protected static IStrategoTerm constCons4700;

  protected static IStrategoTerm constCommentLine28;

  protected static IStrategoTerm const7272;

  protected static IStrategoTerm constCons4699;

  protected static IStrategoTerm constCons4698;

  protected static IStrategoTerm constCommentLine27;

  protected static IStrategoTerm const7271;

  protected static IStrategoTerm constCons4697;

  protected static IStrategoTerm constCons4696;

  protected static IStrategoTerm constCommentLine26;

  protected static IStrategoTerm const7270;

  protected static IStrategoTerm const7269;

  protected static IStrategoTerm const7268;

  protected static IStrategoTerm constCons4695;

  protected static IStrategoTerm constFolding0;

  protected static IStrategoTerm constCons4694;

  protected static IStrategoTerm constCons4693;

  protected static IStrategoTerm constCommentLine25;

  protected static IStrategoTerm const7267;

  protected static IStrategoTerm const7266;

  protected static IStrategoTerm const7265;

  protected static IStrategoTerm constCons4692;

  protected static IStrategoTerm const7264;

  protected static IStrategoTerm const7263;

  protected static IStrategoTerm constExtends0;

  protected static IStrategoTerm constValues0;

  protected static IStrategoTerm constCons4691;

  protected static IStrategoTerm const7262;

  protected static IStrategoTerm constURL0;

  protected static IStrategoTerm const7261;

  protected static IStrategoTerm const7260;

  protected static IStrategoTerm const7259;

  protected static IStrategoTerm const7258;

  protected static IStrategoTerm const7257;

  protected static IStrategoTerm const7256;

  protected static IStrategoTerm const7255;

  protected static IStrategoTerm const7254;

  protected static IStrategoTerm const7253;

  protected static IStrategoTerm const7252;

  protected static IStrategoTerm const7251;

  protected static IStrategoTerm const7250;

  protected static IStrategoTerm const7249;

  protected static IStrategoTerm const7248;

  protected static IStrategoTerm const7247;

  protected static IStrategoTerm constCons4690;

  protected static IStrategoTerm const7246;

  protected static IStrategoTerm const7245;

  protected static IStrategoTerm const7244;

  protected static IStrategoTerm constCons4689;

  protected static IStrategoTerm const7243;

  protected static IStrategoTerm const7242;

  protected static IStrategoTerm const7241;

  protected static IStrategoTerm constCons4688;

  protected static IStrategoTerm constOutliner1;

  protected static IStrategoTerm constCons4687;

  protected static IStrategoTerm constCons4686;

  protected static IStrategoTerm constCommentLine24;

  protected static IStrategoTerm const7240;

  protected static IStrategoTerm constCons4685;

  protected static IStrategoTerm constCommentLine23;

  protected static IStrategoTerm const7239;

  protected static IStrategoTerm constCons4684;

  protected static IStrategoTerm constCons4683;

  protected static IStrategoTerm constCommentLine22;

  protected static IStrategoTerm const7238;

  protected static IStrategoTerm constCons4682;

  protected static IStrategoTerm constCons4681;

  protected static IStrategoTerm constCommentLine21;

  protected static IStrategoTerm const7237;

  protected static IStrategoTerm constCons4680;

  protected static IStrategoTerm constCons4679;

  protected static IStrategoTerm constCommentLine20;

  protected static IStrategoTerm const7236;

  protected static IStrategoTerm const7235;

  protected static IStrategoTerm const7234;

  protected static IStrategoTerm constCons4678;

  protected static IStrategoTerm constOutliner0;

  protected static IStrategoTerm constCons4677;

  protected static IStrategoTerm constCons4676;

  protected static IStrategoTerm constCommentLine19;

  protected static IStrategoTerm const7233;

  protected static IStrategoTerm const7232;

  protected static IStrategoTerm const7231;

  protected static IStrategoTerm const7230;

  protected static IStrategoTerm constCons4675;

  protected static IStrategoTerm constReferences2;

  protected static IStrategoTerm constCons4674;

  protected static IStrategoTerm constCons4673;

  protected static IStrategoTerm constCommentLine18;

  protected static IStrategoTerm const7229;

  protected static IStrategoTerm constCons4672;

  protected static IStrategoTerm constCons4671;

  protected static IStrategoTerm constCons4670;

  protected static IStrategoTerm constCons4669;

  protected static IStrategoTerm constReferences1;

  protected static IStrategoTerm constCons4668;

  protected static IStrategoTerm constCons4667;

  protected static IStrategoTerm constReferenceRule0;

  protected static IStrategoTerm constStrategy1;

  protected static IStrategoTerm const7228;

  protected static IStrategoTerm constCons4666;

  protected static IStrategoTerm constHoverRule0;

  protected static IStrategoTerm constStrategy0;

  protected static IStrategoTerm const7227;

  protected static IStrategoTerm const7226;

  protected static IStrategoTerm constCons4665;

  protected static IStrategoTerm constReferences0;

  protected static IStrategoTerm constCons4664;

  protected static IStrategoTerm constCons4663;

  protected static IStrategoTerm constCommentLine17;

  protected static IStrategoTerm const7225;

  protected static IStrategoTerm constCons4662;

  protected static IStrategoTerm constCommentLine16;

  protected static IStrategoTerm const7224;

  protected static IStrategoTerm constCons4661;

  protected static IStrategoTerm constCons4660;

  protected static IStrategoTerm constCommentLine15;

  protected static IStrategoTerm const7223;

  protected static IStrategoTerm constCons4659;

  protected static IStrategoTerm constCons4658;

  protected static IStrategoTerm constCommentLine14;

  protected static IStrategoTerm const7222;

  protected static IStrategoTerm constCons4657;

  protected static IStrategoTerm constCommentLine13;

  protected static IStrategoTerm const7221;

  protected static IStrategoTerm constCons4656;

  protected static IStrategoTerm constCons4655;

  protected static IStrategoTerm constCommentLine12;

  protected static IStrategoTerm const7220;

  protected static IStrategoTerm constCons4654;

  protected static IStrategoTerm constCons4653;

  protected static IStrategoTerm constCommentLine11;

  protected static IStrategoTerm const7219;

  protected static IStrategoTerm constCons4652;

  protected static IStrategoTerm constCons4651;

  protected static IStrategoTerm constCommentLine10;

  protected static IStrategoTerm const7218;

  protected static IStrategoTerm constCons4650;

  protected static IStrategoTerm constCommentLine9;

  protected static IStrategoTerm const7217;

  protected static IStrategoTerm const7216;

  protected static IStrategoTerm const7215;

  protected static IStrategoTerm const7214;

  protected static IStrategoTerm const7213;

  protected static IStrategoTerm const7212;

  protected static IStrategoTerm const7211;

  protected static IStrategoTerm constCons4649;

  protected static IStrategoTerm const7210;

  protected static IStrategoTerm const7209;

  protected static IStrategoTerm const7208;

  protected static IStrategoTerm const7207;

  protected static IStrategoTerm const7206;

  protected static IStrategoTerm const7205;

  protected static IStrategoTerm const7204;

  protected static IStrategoTerm const7203;

  protected static IStrategoTerm const7202;

  protected static IStrategoTerm constCons4648;

  protected static IStrategoTerm const7201;

  protected static IStrategoTerm const7200;

  protected static IStrategoTerm const7199;

  protected static IStrategoTerm const7198;

  protected static IStrategoTerm constCons4647;

  protected static IStrategoTerm const7197;

  protected static IStrategoTerm const7196;

  protected static IStrategoTerm const7195;

  protected static IStrategoTerm const7194;

  protected static IStrategoTerm const7193;

  protected static IStrategoTerm const7192;

  protected static IStrategoTerm const7191;

  protected static IStrategoTerm const7190;

  protected static IStrategoTerm constCons4646;

  protected static IStrategoTerm const7189;

  protected static IStrategoTerm const7188;

  protected static IStrategoTerm constCons4645;

  protected static IStrategoTerm constLanguage1;

  protected static IStrategoTerm constCons4644;

  protected static IStrategoTerm constCons4643;

  protected static IStrategoTerm constCommentLine8;

  protected static IStrategoTerm const7187;

  protected static IStrategoTerm constCons4642;

  protected static IStrategoTerm constLineCommentPrefix0;

  protected static IStrategoTerm constString6;

  protected static IStrategoTerm const7186;

  protected static IStrategoTerm constCons4641;

  protected static IStrategoTerm constBlockCommentDefs0;

  protected static IStrategoTerm constBlockCommentDef0;

  protected static IStrategoTerm constString5;

  protected static IStrategoTerm const7185;

  protected static IStrategoTerm const7184;

  protected static IStrategoTerm constString4;

  protected static IStrategoTerm const7183;

  protected static IStrategoTerm constCons4640;

  protected static IStrategoTerm constCons4639;

  protected static IStrategoTerm constCommentLine7;

  protected static IStrategoTerm const7182;

  protected static IStrategoTerm constCons4638;

  protected static IStrategoTerm constCommentLine6;

  protected static IStrategoTerm const7181;

  protected static IStrategoTerm constCons4637;

  protected static IStrategoTerm constFenceDefs0;

  protected static IStrategoTerm constCons4636;

  protected static IStrategoTerm constFenceDef2;

  protected static IStrategoTerm constCons4635;

  protected static IStrategoTerm constFenceDef1;

  protected static IStrategoTerm constCons4634;

  protected static IStrategoTerm constFenceDef0;

  protected static IStrategoTerm const7180;

  protected static IStrategoTerm const7179;

  protected static IStrategoTerm constCons4633;

  protected static IStrategoTerm constCons4632;

  protected static IStrategoTerm constCommentLine5;

  protected static IStrategoTerm const7178;

  protected static IStrategoTerm constCons4631;

  protected static IStrategoTerm constCommentLine4;

  protected static IStrategoTerm const7177;

  protected static IStrategoTerm constCons4630;

  protected static IStrategoTerm constIndentDefs0;

  protected static IStrategoTerm constCons4629;

  protected static IStrategoTerm constIndentDef1;

  protected static IStrategoTerm constString3;

  protected static IStrategoTerm constCons4628;

  protected static IStrategoTerm constIndentDef0;

  protected static IStrategoTerm constString2;

  protected static IStrategoTerm constCons4627;

  protected static IStrategoTerm constCons4626;

  protected static IStrategoTerm constCommentLine3;

  protected static IStrategoTerm const7176;

  protected static IStrategoTerm constCons4625;

  protected static IStrategoTerm constIdentifierLexical0;

  protected static IStrategoTerm constString1;

  protected static IStrategoTerm const7175;

  protected static IStrategoTerm const7174;

  protected static IStrategoTerm constNoImports0;

  protected static IStrategoTerm constCons4624;

  protected static IStrategoTerm constLanguage0;

  protected static IStrategoTerm constCons4623;

  protected static IStrategoTerm constEmptyLine0;

  protected static IStrategoTerm constCons4622;

  protected static IStrategoTerm constCommentLine2;

  protected static IStrategoTerm const7173;

  protected static IStrategoTerm constCons4621;

  protected static IStrategoTerm constCommentLine1;

  protected static IStrategoTerm constCons4620;

  protected static IStrategoTerm constCommentLine0;

  protected static IStrategoTerm const7172;

  protected static IStrategoTerm const7171;

  protected static IStrategoTerm const7170;

  protected static IStrategoTerm const7169;

  protected static IStrategoTerm const7168;

  protected static IStrategoTerm const7167;

  protected static IStrategoTerm const7166;

  protected static IStrategoTerm const7165;

  protected static IStrategoTerm const7164;

  protected static IStrategoTerm const7163;

  protected static IStrategoTerm const7162;

  protected static IStrategoTerm const7161;

  protected static IStrategoTerm const7160;

  protected static IStrategoTerm const7159;

  protected static IStrategoTerm const7158;

  protected static IStrategoTerm const7157;

  protected static IStrategoTerm constCons4619;

  protected static IStrategoTerm const7156;

  protected static IStrategoTerm const7155;

  protected static IStrategoTerm const7154;

  public static IStrategoTerm getEditorServiceTbl()
  { 
    return constEditorServiceTbl;
  }

  protected static ImportTerm constEditorServiceTbl;

  protected static IStrategoTerm const7153;

  protected static IStrategoTerm const7152;

  protected static IStrategoTerm const7151;

  protected static IStrategoTerm const7150;

  protected static IStrategoTerm const7149;

  protected static IStrategoTerm const7148;

  protected static IStrategoTerm const7147;

  protected static IStrategoTerm const7146;

  protected static IStrategoTerm const7145;

  protected static IStrategoTerm const7144;

  protected static IStrategoTerm const7143;

  protected static IStrategoTerm const7142;

  protected static IStrategoTerm const7141;

  protected static IStrategoTerm const7140;

  protected static IStrategoTerm const7139;

  protected static IStrategoTerm const7138;

  protected static IStrategoTerm const7137;

  protected static IStrategoTerm const7136;

  protected static IStrategoTerm const7135;

  protected static IStrategoTerm const7134;

  protected static IStrategoTerm const7133;

  protected static IStrategoTerm const7132;

  protected static IStrategoTerm const7131;

  protected static IStrategoTerm const7130;

  protected static IStrategoTerm constCons4618;

  protected static IStrategoTerm const7129;

  protected static IStrategoTerm const7128;

  protected static IStrategoTerm const7127;

  protected static IStrategoTerm const7126;

  protected static IStrategoTerm const7125;

  protected static IStrategoTerm const7124;

  public static IStrategoTerm getEditorServiceprettyPpAf()
  { 
    return constEditorServiceprettyPpAf;
  }

  protected static ImportTerm constEditorServiceprettyPpAf;

  public static IStrategoTerm getStrategoSugarprettyPpAf()
  { 
    return constStrategoSugarprettyPpAf;
  }

  protected static ImportTerm constStrategoSugarprettyPpAf;

  protected static IStrategoTerm const7123;

  protected static IStrategoTerm constprod13;

  protected static IStrategoTerm constCons4617;

  protected static IStrategoTerm const7122;

  protected static IStrategoTerm const7121;

  protected static IStrategoTerm const7120;

  protected static IStrategoTerm const7119;

  protected static IStrategoTerm const7118;

  protected static IStrategoTerm const7117;

  protected static IStrategoTerm const7116;

  protected static IStrategoTerm const7115;

  protected static IStrategoTerm const7114;

  protected static IStrategoTerm const7113;

  protected static IStrategoTerm const7112;

  protected static IStrategoTerm const7111;

  protected static IStrategoTerm const7110;

  protected static IStrategoTerm constWarning0;

  protected static IStrategoTerm constDebug0;

  protected static IStrategoTerm constError0;

  protected static IStrategoTerm constRef1;

  protected static IStrategoTerm constInt0;

  protected static IStrategoTerm constCons4616;

  protected static IStrategoTerm constAppl2;

  protected static IStrategoTerm constCons4615;

  protected static IStrategoTerm constRef0;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constTerm0;

  protected static IStrategoTerm constPlain0;

  protected static IStrategoTerm const7109;

  protected static IStrategoTerm constCons4614;

  protected static IStrategoTerm constAppl1;

  protected static IStrategoTerm constNoneTerm0;

  protected static IStrategoTerm constSomeTerm0;

  protected static IStrategoTerm constConcTerm0;

  protected static IStrategoTerm constConsTerm0;

  protected static IStrategoTerm constCons4613;

  protected static IStrategoTerm constAppl0;

  protected static IStrategoTerm constNilTerm0;

  protected static IStrategoTerm const7108;

  protected static IStrategoTerm const7107;

  protected static IStrategoTerm const7106;

  protected static IStrategoTerm const7105;

  protected static IStrategoTerm const7104;

  protected static IStrategoTerm const7103;

  protected static IStrategoTerm const7102;

  protected static IStrategoTerm const7101;

  protected static IStrategoTerm const7100;

  protected static IStrategoTerm const7099;

  protected static IStrategoTerm const7098;

  protected static IStrategoTerm constCons4612;

  protected static IStrategoTerm const7097;

  protected static IStrategoTerm const7096;

  protected static IStrategoTerm const7095;

  protected static IStrategoTerm constCons4611;

  protected static IStrategoTerm const7094;

  protected static IStrategoTerm const7093;

  protected static IStrategoTerm constCons4610;

  protected static IStrategoTerm const7092;

  protected static IStrategoTerm const7091;

  protected static IStrategoTerm const7090;

  protected static IStrategoTerm const7089;

  protected static IStrategoTerm const7088;

  protected static IStrategoTerm const7087;

  protected static IStrategoTerm const7086;

  protected static IStrategoTerm const7085;

  protected static IStrategoTerm const7084;

  protected static IStrategoTerm const7083;

  protected static IStrategoTerm const7082;

  protected static IStrategoTerm const7081;

  protected static IStrategoTerm const7080;

  protected static IStrategoTerm const7079;

  protected static IStrategoTerm const7078;

  protected static IStrategoTerm const7077;

  protected static IStrategoTerm const7076;

  protected static IStrategoTerm const7075;

  protected static IStrategoTerm const7074;

  protected static IStrategoTerm constCons4609;

  protected static IStrategoTerm const7073;

  protected static IStrategoTerm constCons4608;

  protected static IStrategoTerm const7072;

  protected static IStrategoTerm const7071;

  protected static IStrategoTerm const7070;

  protected static IStrategoTerm const7069;

  protected static IStrategoTerm const7068;

  protected static IStrategoTerm const7067;

  protected static IStrategoTerm constCritical0;

  protected static IStrategoTerm const7066;

  protected static IStrategoTerm const7065;

  protected static IStrategoTerm const7064;

  protected static IStrategoTerm const7063;

  protected static IStrategoTerm const7062;

  protected static IStrategoTerm const7061;

  protected static IStrategoTerm const7060;

  protected static IStrategoTerm const7059;

  protected static IStrategoTerm const7058;

  protected static IStrategoTerm const7057;

  protected static IStrategoTerm const7056;

  protected static IStrategoTerm constCons4607;

  protected static IStrategoTerm const7055;

  protected static IStrategoTerm const7054;

  protected static IStrategoTerm const7053;

  protected static IStrategoTerm constIncludeDir0;

  protected static IStrategoTerm const7052;

  protected static IStrategoTerm const7051;

  protected static IStrategoTerm constCons4606;

  protected static IStrategoTerm constIncludeXTC0;

  protected static IStrategoTerm const7050;

  protected static IStrategoTerm const7049;

  protected static IStrategoTerm const7048;

  protected static IStrategoTerm constCons4605;

  protected static IStrategoTerm const7047;

  protected static IStrategoTerm const7046;

  protected static IStrategoTerm const7045;

  protected static IStrategoTerm constCons4604;

  protected static IStrategoTerm constCons4603;

  protected static IStrategoTerm const7044;

  protected static IStrategoTerm constCons4602;

  protected static IStrategoTerm const7043;

  protected static IStrategoTerm const7042;

  protected static IStrategoTerm const7041;

  protected static IStrategoTerm constprod12;

  protected static IStrategoTerm constattrs3;

  protected static IStrategoTerm constCons4601;

  protected static IStrategoTerm constassoc0;

  protected static IStrategoTerm constleft0;

  protected static IStrategoTerm constCons4600;

  protected static IStrategoTerm constCons4599;

  protected static IStrategoTerm constappl5;

  protected static IStrategoTerm constCons4598;

  protected static IStrategoTerm constCons4597;

  protected static IStrategoTerm constCons4596;

  protected static IStrategoTerm constCons4595;

  protected static IStrategoTerm constCons4594;

  protected static IStrategoTerm constCons4593;

  protected static IStrategoTerm constCons4592;

  protected static IStrategoTerm constCons4591;

  protected static IStrategoTerm constCons4590;

  protected static IStrategoTerm constprod11;

  protected static IStrategoTerm constCons4589;

  protected static IStrategoTerm constchar_class7;

  protected static IStrategoTerm constCons4588;

  protected static IStrategoTerm const7040;

  protected static IStrategoTerm constCons4587;

  protected static IStrategoTerm constchar_class6;

  protected static IStrategoTerm constCons4586;

  protected static IStrategoTerm const7039;

  protected static IStrategoTerm constCons4585;

  protected static IStrategoTerm constchar_class5;

  protected static IStrategoTerm constCons4584;

  protected static IStrategoTerm const7038;

  protected static IStrategoTerm constCons4583;

  protected static IStrategoTerm constCons4582;

  protected static IStrategoTerm constCons4581;

  protected static IStrategoTerm constCons4580;

  protected static IStrategoTerm constchar_class4;

  protected static IStrategoTerm constCons4579;

  protected static IStrategoTerm const7037;

  protected static IStrategoTerm constCons4578;

  protected static IStrategoTerm constchar_class3;

  protected static IStrategoTerm constCons4577;

  protected static IStrategoTerm const7036;

  protected static IStrategoTerm constCons4576;

  protected static IStrategoTerm constchar_class2;

  protected static IStrategoTerm constCons4575;

  protected static IStrategoTerm const7035;

  protected static IStrategoTerm constCons4574;

  protected static IStrategoTerm constchar_class1;

  protected static IStrategoTerm constCons4573;

  protected static IStrategoTerm const7034;

  protected static IStrategoTerm constprod10;

  protected static IStrategoTerm constCons4572;

  protected static IStrategoTerm constprod9;

  protected static IStrategoTerm constCons4571;

  protected static IStrategoTerm constprod8;

  protected static IStrategoTerm constattrs2;

  protected static IStrategoTerm constCons4570;

  protected static IStrategoTerm constterm0;

  protected static IStrategoTerm constcons0;

  protected static IStrategoTerm constCons4569;

  protected static IStrategoTerm constlit0;

  protected static IStrategoTerm const7033;

  protected static IStrategoTerm constCons4568;

  protected static IStrategoTerm constCons4567;

  protected static IStrategoTerm constcf6;

  protected static IStrategoTerm constsort3;

  protected static IStrategoTerm const7032;

  protected static IStrategoTerm constprod7;

  protected static IStrategoTerm constCons4566;

  protected static IStrategoTerm constCons4565;

  protected static IStrategoTerm constcf5;

  protected static IStrategoTerm constsort2;

  protected static IStrategoTerm const7031;

  protected static IStrategoTerm constappl4;

  protected static IStrategoTerm constprod6;

  protected static IStrategoTerm constCons4564;

  protected static IStrategoTerm constprod5;

  protected static IStrategoTerm constcf4;

  protected static IStrategoTerm constiter0;

  protected static IStrategoTerm constCons4563;

  protected static IStrategoTerm const7030;

  protected static IStrategoTerm constappl3;

  protected static IStrategoTerm constprod4;

  protected static IStrategoTerm constcf3;

  protected static IStrategoTerm constiter_star0;

  protected static IStrategoTerm constappl2;

  protected static IStrategoTerm constprod3;

  protected static IStrategoTerm const7029;

  protected static IStrategoTerm const7028;

  protected static IStrategoTerm const7027;

  protected static IStrategoTerm const7026;

  protected static IStrategoTerm const7025;

  protected static IStrategoTerm constCons4562;

  protected static IStrategoTerm const7024;

  protected static IStrategoTerm const7023;

  protected static IStrategoTerm constCons4561;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const7022;

  public static IStrategoTerm getSdf2Baf()
  { 
    return constSdf2Baf;
  }

  protected static ImportTerm constSdf2Baf;

  protected static IStrategoTerm const7021;

  protected static IStrategoTerm constCons4560;

  protected static IStrategoTerm const7020;

  protected static IStrategoTerm const7019;

  protected static IStrategoTerm const7018;

  protected static IStrategoTerm constCons4559;

  protected static IStrategoTerm constappl1;

  protected static IStrategoTerm constCons4558;

  protected static IStrategoTerm constappl0;

  protected static IStrategoTerm constCons4557;

  protected static IStrategoTerm constprod2;

  protected static IStrategoTerm constattrs1;

  protected static IStrategoTerm constCons4556;

  protected static IStrategoTerm constprefer0;

  protected static IStrategoTerm constCons4555;

  protected static IStrategoTerm constchar_class0;

  protected static IStrategoTerm constCons4554;

  protected static IStrategoTerm constrange0;

  protected static IStrategoTerm const7017;

  protected static IStrategoTerm const7016;

  protected static IStrategoTerm constCons4553;

  protected static IStrategoTerm const7015;

  protected static IStrategoTerm constCons4552;

  protected static IStrategoTerm const7014;

  protected static IStrategoTerm constprod1;

  protected static IStrategoTerm constcf2;

  protected static IStrategoTerm constCons4551;

  protected static IStrategoTerm constlex0;

  protected static IStrategoTerm constprod0;

  protected static IStrategoTerm constno_attrs0;

  protected static IStrategoTerm constsort1;

  protected static IStrategoTerm const7013;

  protected static IStrategoTerm constCons4550;

  protected static IStrategoTerm constCons4549;

  protected static IStrategoTerm constcf1;

  protected static IStrategoTerm constsort0;

  protected static IStrategoTerm const7012;

  protected static IStrategoTerm constCons4548;

  protected static IStrategoTerm constcf0;

  protected static IStrategoTerm constopt0;

  protected static IStrategoTerm constlayout0;

  protected static IStrategoTerm const7011;

  protected static IStrategoTerm constCons4547;

  protected static IStrategoTerm const7010;

  protected static IStrategoTerm const7009;

  protected static IStrategoTerm constCons4546;

  protected static IStrategoTerm const7008;

  protected static IStrategoTerm const7007;

  protected static IStrategoTerm constCons4545;

  protected static IStrategoTerm const7006;

  protected static IStrategoTerm const7005;

  protected static IStrategoTerm const7004;

  protected static IStrategoTerm const7003;

  protected static IStrategoTerm const7002;

  protected static IStrategoTerm const7001;

  protected static IStrategoTerm constCons4544;

  protected static IStrategoTerm const7000;

  protected static IStrategoTerm const6999;

  protected static IStrategoTerm constCons4543;

  protected static IStrategoTerm const6998;

  protected static IStrategoTerm const6997;

  protected static IStrategoTerm const6996;

  protected static IStrategoTerm const6995;

  protected static IStrategoTerm const6994;

  protected static IStrategoTerm const6993;

  protected static IStrategoTerm const6992;

  protected static IStrategoTerm const6991;

  protected static IStrategoTerm constCons4542;

  protected static IStrategoTerm const6990;

  protected static IStrategoTerm conststderr0;

  protected static IStrategoTerm const6989;

  protected static IStrategoTerm const6988;

  protected static IStrategoTerm constCons4541;

  protected static IStrategoTerm const6987;

  protected static IStrategoTerm const6986;

  protected static IStrategoTerm const6985;

  protected static IStrategoTerm constattrs0;

  protected static IStrategoTerm const6984;

  protected static IStrategoTerm constCons4540;

  protected static IStrategoTerm const6983;

  protected static IStrategoTerm const6982;

  protected static IStrategoTerm const6981;

  protected static IStrategoTerm const6980;

  protected static IStrategoTerm constCons4539;

  protected static IStrategoTerm const6979;

  protected static IStrategoTerm constSdfMainModuleFlag0;

  protected static IStrategoTerm const6978;

  protected static IStrategoTerm constCons4538;

  protected static IStrategoTerm constAutoProgram0;

  protected static IStrategoTerm constCons4537;

  protected static IStrategoTerm constAuthor0;

  protected static IStrategoTerm constPerson0;

  protected static IStrategoTerm const6977;

  protected static IStrategoTerm const6976;

  protected static IStrategoTerm constCons4536;

  protected static IStrategoTerm constGNU_LGPL0;

  protected static IStrategoTerm const6975;

  protected static IStrategoTerm const6974;

  protected static IStrategoTerm constCons4535;

  protected static IStrategoTerm constConfig0;

  protected static IStrategoTerm constCons4534;

  protected static IStrategoTerm constDefaultXTCRepository0;

  protected static IStrategoTerm constCons4533;

  protected static IStrategoTerm constCurrentXTCRepository0;

  protected static IStrategoTerm constCons4532;

  protected static IStrategoTerm constUsage0;

  protected static IStrategoTerm const6973;

  protected static IStrategoTerm constCons4531;

  protected static IStrategoTerm constSummary0;

  protected static IStrategoTerm const6972;

  protected static IStrategoTerm constCons4530;

  protected static IStrategoTerm constOptionUsage0;

  protected static IStrategoTerm constCons4529;

  protected static IStrategoTerm constAutoReportBugs0;

  protected static IStrategoTerm constHelpString0;

  protected static IStrategoTerm const6971;

  protected static IStrategoTerm const6970;

  protected static IStrategoTerm const6969;

  protected static IStrategoTerm const6968;

  protected static IStrategoTerm constIgnoreMissingCons0;

  protected static IStrategoTerm constCons4528;

  protected static IStrategoTerm const6967;

  protected static IStrategoTerm constCons4527;

  protected static IStrategoTerm const6966;

  protected static IStrategoTerm constCons4526;

  protected static IStrategoTerm const6965;

  protected static IStrategoTerm const6964;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const6963;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm const6962;

  protected static IStrategoTerm constCons4525;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const6961;

  protected static IStrategoTerm constQName2;

  protected static IStrategoTerm const6960;

  protected static IStrategoTerm constQName1;

  protected static IStrategoTerm const6959;

  protected static IStrategoTerm constQName0;

  protected static IStrategoTerm const6958;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const6957;

  protected static IStrategoTerm constCons4524;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const6956;

  protected static IStrategoTerm constCons4523;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const6955;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const6954;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const6953;

  protected static IStrategoTerm constCons4522;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const6952;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const6951;

  protected static IStrategoTerm constCons4521;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const6950;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const6949;

  protected static IStrategoTerm constCons4520;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const6948;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const6947;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const6946;

  protected static IStrategoTerm constCons4519;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const6945;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const6944;

  protected static IStrategoTerm constCons4518;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constCons4517;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const6943;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constCons4516;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const6942;

  protected static IStrategoTerm constCons4515;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm const6941;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constNil7;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consSuperConstrInv_2;

  protected static IStrategoConstructor _consConstrBody_2;

  protected static IStrategoConstructor _consConstrDecHead_5;

  protected static IStrategoConstructor _consConstrDec_2;

  protected static IStrategoConstructor _consThrowsDec_1;

  protected static IStrategoConstructor _consFinal_0;

  protected static IStrategoConstructor _consVolatile_0;

  protected static IStrategoConstructor _consVarDec_1;

  protected static IStrategoConstructor _consFieldDec_3;

  protected static IStrategoConstructor _consExprName_2;

  protected static IStrategoConstructor _consSynchronized_0;

  protected static IStrategoConstructor _consFalse_0;

  protected static IStrategoConstructor _consVarDec_2;

  protected static IStrategoConstructor _consBoolean_0;

  protected static IStrategoConstructor _consLocalVarDec_3;

  protected static IStrategoConstructor _consLocalVarDecStm_1;

  protected static IStrategoConstructor _consTrue_0;

  protected static IStrategoConstructor _consBool_1;

  protected static IStrategoConstructor _consPlus_2;

  protected static IStrategoConstructor _consCond_3;

  protected static IStrategoConstructor _consClass_1;

  protected static IStrategoConstructor _consPrivate_0;

  protected static IStrategoConstructor _consStatic_0;

  protected static IStrategoConstructor _consNull_0;

  protected static IStrategoConstructor _consNotEq_2;

  protected static IStrategoConstructor _consNewInstance_4;

  protected static IStrategoConstructor _consThrow_1;

  protected static IStrategoConstructor _consCatch_2;

  protected static IStrategoConstructor _consThis_0;

  protected static IStrategoConstructor _consTry_2;

  protected static IStrategoConstructor _consMethodName_1;

  protected static IStrategoConstructor _consNot_1;

  protected static IStrategoConstructor _consIf_2;

  protected static IStrategoConstructor _consAssign_2;

  protected static IStrategoConstructor _consSuperMethod_2;

  protected static IStrategoConstructor _consExprStm_1;

  protected static IStrategoConstructor _consParam_3;

  protected static IStrategoConstructor _consVoid_0;

  protected static IStrategoConstructor _consProtected_0;

  protected static IStrategoConstructor _consAmbName_1;

  protected static IStrategoConstructor _consMethodName_2;

  protected static IStrategoConstructor _consMethod_1;

  protected static IStrategoConstructor _consReturn_1;

  protected static IStrategoConstructor _consBlock_1;

  protected static IStrategoConstructor _consClassOrInterfaceType_2;

  protected static IStrategoConstructor _consMarkerAnno_1;

  protected static IStrategoConstructor _consMethodDecHead_6;

  protected static IStrategoConstructor _consMethodDec_2;

  protected static IStrategoConstructor _consClassBody_1;

  protected static IStrategoConstructor _consTypeName_1;

  protected static IStrategoConstructor _consClassType_2;

  protected static IStrategoConstructor _consSuperDec_1;

  protected static IStrategoConstructor _consPublic_0;

  protected static IStrategoConstructor _consPackageOrTypeName_1;

  protected static IStrategoConstructor _consPackageOrTypeName_2;

  protected static IStrategoConstructor _consTypeName_2;

  protected static IStrategoConstructor _consTypeImportDec_1;

  protected static IStrategoConstructor _consLazyAnd_2;

  protected static IStrategoConstructor _consChars_1;

  protected static IStrategoConstructor _consLit_1;

  protected static IStrategoConstructor _consMethod_3;

  protected static IStrategoConstructor _consInvoke_2;

  protected static IStrategoConstructor _consExprName_1;

  protected static IStrategoConstructor _consEq_2;

  protected static IStrategoConstructor _consselector_2;

  protected static IStrategoConstructor _consPath_2;

  protected static IStrategoConstructor _consPP_Entry_2;

  protected static IStrategoConstructor _consToMetaExpr_1;

  protected static IStrategoConstructor _consamb_1;

  protected static IStrategoConstructor _consInterfaceDecHead_4;

  protected static IStrategoConstructor _consInterfaceDec_2;

  protected static IStrategoConstructor _consClassDecHead_5;

  protected static IStrategoConstructor _consClassDec_2;

  protected static IStrategoConstructor _consId_1;

  protected static IStrategoConstructor _consPackageName_1;

  protected static IStrategoConstructor _consPackageDec_2;

  protected static IStrategoConstructor _consCompilationUnit_3;

  protected static IStrategoConstructor _consString_1;

  protected static IStrategoConstructor _consseq_2;

  protected static IStrategoConstructor _consWarning_0;

  protected static IStrategoConstructor _consDebug_0;

  protected static IStrategoConstructor _consError_0;

  protected static IStrategoConstructor _consreject_0;

  protected static IStrategoConstructor _consbracket_0;

  protected static IStrategoConstructor _consparameterized_sort_2;

  protected static IStrategoConstructor _conslabel_2;

  protected static IStrategoConstructor _consInt_0;

  protected static IStrategoConstructor _consString_0;

  protected static IStrategoConstructor _consPlain_1;

  protected static IStrategoConstructor _consNoneTerm_0;

  protected static IStrategoConstructor _consSomeTerm_0;

  protected static IStrategoConstructor _consiter_star_sep_2;

  protected static IStrategoConstructor _consiter_sep_2;

  protected static IStrategoConstructor _consConcTerm_0;

  protected static IStrategoConstructor _consConsTerm_0;

  protected static IStrategoConstructor _consNilTerm_0;

  protected static IStrategoConstructor _consTupleTerm_1;

  protected static IStrategoConstructor _consTerm_1;

  protected static IStrategoConstructor _consAppl_2;

  protected static IStrategoConstructor _consNonterm_1;

  protected static IStrategoConstructor _consfile_start_0;

  protected static IStrategoConstructor _consstart_0;

  protected static IStrategoConstructor _consalt_2;

  protected static IStrategoConstructor _consvarsym_1;

  protected static IStrategoConstructor _consProdRule_2;

  protected static IStrategoConstructor _conslexical_syntax_1;

  protected static IStrategoConstructor _conscontext_free_syntax_1;

  protected static IStrategoConstructor _consProdRules_1;

  protected static IStrategoConstructor _consStart_1;

  protected static IStrategoConstructor _consRTG_2;

  protected static IStrategoConstructor _consRef_1;

  protected static IStrategoConstructor _conssyntax_1;

  protected static IStrategoConstructor _consCritical_0;

  protected static IStrategoConstructor _consleft_0;

  protected static IStrategoConstructor _consassoc_1;

  protected static IStrategoConstructor _conscons_1;

  protected static IStrategoConstructor _consiter_1;

  protected static IStrategoConstructor _consiter_star_1;

  protected static IStrategoConstructor _consparsetree_2;

  protected static IStrategoConstructor _consprefer_0;

  protected static IStrategoConstructor _consrange_2;

  protected static IStrategoConstructor _conschar_class_1;

  protected static IStrategoConstructor _conslex_1;

  protected static IStrategoConstructor _conssort_1;

  protected static IStrategoConstructor _conslayout_0;

  protected static IStrategoConstructor _consopt_1;

  protected static IStrategoConstructor _conscf_1;

  protected static IStrategoConstructor _consappl_2;

  protected static IStrategoConstructor _consstderr_0;

  protected static IStrategoConstructor _consFILE_1;

  protected static IStrategoConstructor _consquoted_1;

  protected static IStrategoConstructor _consci_lit_1;

  protected static IStrategoConstructor _consdefault_1;

  protected static IStrategoConstructor _consterm_1;

  protected static IStrategoConstructor _consattrs_1;

  protected static IStrategoConstructor _consno_attrs_0;

  protected static IStrategoConstructor _consAutoProgram_0;

  protected static IStrategoConstructor _consPerson_2;

  protected static IStrategoConstructor _consAuthor_1;

  protected static IStrategoConstructor _consGNU_LGPL_2;

  protected static IStrategoConstructor _consDefaultXTCRepository_0;

  protected static IStrategoConstructor _consCurrentXTCRepository_0;

  protected static IStrategoConstructor _consConfig_1;

  protected static IStrategoConstructor _consUsage_1;

  protected static IStrategoConstructor _consSummary_1;

  protected static IStrategoConstructor _consOptionUsage_0;

  protected static IStrategoConstructor _consAutoReportBugs_0;

  protected static IStrategoConstructor _consHelpString_2;

  protected static IStrategoConstructor _consNone_0;

  protected static IStrategoConstructor _consC_2;

  protected static IStrategoConstructor _consComment_1;

  protected static IStrategoConstructor _consHS_0;

  protected static IStrategoConstructor _consH_2;

  protected static IStrategoConstructor _consS_1;

  protected static IStrategoConstructor _consKW_0;

  protected static IStrategoConstructor _consFBOX_2;

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consVS_0;

  protected static IStrategoConstructor _consSOpt_2;

  protected static IStrategoConstructor _consV_2;

  public static IStrategoConstructor _consSort_1;

  public static IStrategoConstructor _consListSort_1;

  public static IStrategoConstructor _consConstructorOnly_1;

  public static IStrategoConstructor _consConstructor_1;

  public static IStrategoConstructor _consSortAndConstructor_2;

  public static IStrategoConstructor _consSemanticProvider_1;

  public static IStrategoConstructor _consOnSave_2;

  public static IStrategoConstructor _consReferenceHoverRule_3;

  public static IStrategoConstructor _consReferenceRule_2;

  public static IStrategoConstructor _consHoverRule_2;

  public static IStrategoConstructor _consOccurrenceRule_2;

  public static IStrategoConstructor _consCompletionProposer_1;

  public static IStrategoConstructor _consCompletionKeyword_2;

  public static IStrategoConstructor _consCompletionTemplate_3;

  public static IStrategoConstructor _consCompletionTemplateWithSort_4;

  public static IStrategoConstructor _consCompletionTrigger_2;

  public static IStrategoConstructor _consCompletionTemplateEx_4;

  public static IStrategoConstructor _consSemanticObserver_1;

  public static IStrategoConstructor _consBuilder_3;

  public static IStrategoConstructor _consBuilderCaption_1;

  public static IStrategoConstructor _consPPTable_1;

  public static IStrategoConstructor _consPrettyPrint_1;

  public static IStrategoConstructor _consRefactoring_4;

  public static IStrategoConstructor _consStrategy_1;

  public static IStrategoConstructor _consAttribute_1;

  public static IStrategoConstructor _consLanguage_2;

  public static IStrategoConstructor _consFolding_2;

  public static IStrategoConstructor _consOutliner_2;

  public static IStrategoConstructor _consColorer_2;

  public static IStrategoConstructor _consReferences_2;

  public static IStrategoConstructor _consCompletions_2;

  public static IStrategoConstructor _consBuilders_2;

  public static IStrategoConstructor _consRefactorings_2;

  public static IStrategoConstructor _consValues_1;

  public static IStrategoConstructor _consLanguageName_1;

  public static IStrategoConstructor _consLanguageId_1;

  public static IStrategoConstructor _consExtensions_1;

  public static IStrategoConstructor _consTable_1;

  public static IStrategoConstructor _consTableProvider_1;

  public static IStrategoConstructor _consStartSymbols_1;

  public static IStrategoConstructor _consURL_1;

  public static IStrategoConstructor _consExtends_1;

  public static IStrategoConstructor _consAliases_1;

  public static IStrategoConstructor _consUnmanagedTablePrefix_1;

  public static IStrategoConstructor _consDisambiguator_1;

  public static IStrategoConstructor _consLineCommentPrefix_1;

  public static IStrategoConstructor _consBlockCommentDefs_1;

  public static IStrategoConstructor _consFenceDefs_1;

  public static IStrategoConstructor _consIndentDefs_1;

  public static IStrategoConstructor _consIdentifierLexical_1;

  public static IStrategoConstructor _consBlockCommentDef_3;

  public static IStrategoConstructor _consNoContinuation_0;

  public static IStrategoConstructor _consFenceDef_2;

  public static IStrategoConstructor _consIndentDef_1;

  public static IStrategoConstructor _consFoldRule_2;

  public static IStrategoConstructor _consFoldRuleAll_2;

  public static IStrategoConstructor _consFolded_0;

  public static IStrategoConstructor _consOutlineRule_1;

  public static IStrategoConstructor _consColorRuleAll_2;

  public static IStrategoConstructor _consColorRule_2;

  public static IStrategoConstructor _consColorRuleAllNamed_3;

  public static IStrategoConstructor _consColorRuleNamed_3;

  public static IStrategoConstructor _consColorDef_2;

  public static IStrategoConstructor _consAttribute_3;

  public static IStrategoConstructor _consAttributeRef_1;

  public static IStrategoConstructor _consToken_1;

  public static IStrategoConstructor _consTK_IDENTIFIER_0;

  public static IStrategoConstructor _consTK_NUMBER_0;

  public static IStrategoConstructor _consTK_LAYOUT_0;

  public static IStrategoConstructor _consTK_STRING_0;

  public static IStrategoConstructor _consTK_KEYWORD_0;

  public static IStrategoConstructor _consTK_OPERATOR_0;

  public static IStrategoConstructor _consTK_VAR_0;

  public static IStrategoConstructor _consTK_ERROR_0;

  public static IStrategoConstructor _consTK_UNKNOWN_0;

  public static IStrategoConstructor _consNORMAL_0;

  public static IStrategoConstructor _consBOLD_0;

  public static IStrategoConstructor _consITALIC_0;

  public static IStrategoConstructor _consBOLD_ITALIC_0;

  public static IStrategoConstructor _consColorDefault_0;

  public static IStrategoConstructor _consColorRGB_3;

  public static IStrategoConstructor _consNoColor_0;

  public static IStrategoConstructor _consNoCompletionPrefix_0;

  public static IStrategoConstructor _consCompletionPrefix_1;

  public static IStrategoConstructor _consPlaceholder_1;

  public static IStrategoConstructor _consPlaceholderWithSort_2;

  public static IStrategoConstructor _consDisable_0;

  public static IStrategoConstructor _consBlank_0;

  public static IStrategoConstructor _consLinked_0;

  public static IStrategoConstructor _consOpenEditor_0;

  public static IStrategoConstructor _consRealTime_0;

  public static IStrategoConstructor _consPersistent_0;

  public static IStrategoConstructor _consMeta_0;

  public static IStrategoConstructor _consCursor_0;

  public static IStrategoConstructor _consSource_0;

  public static IStrategoConstructor _consModule_3;

  public static IStrategoConstructor _consImports_1;

  public static IStrategoConstructor _consNoImports_0;

  public static IStrategoConstructor _consImport_1;

  public static IStrategoConstructor _consImportRenamed_2;

  public static IStrategoConstructor _consError_2;

  public static IStrategoConstructor _consEmptyLine_0;

  public static IStrategoConstructor _consCommentLine_1;

  public static IStrategoConstructor _consdeprecated_1;

  public static IStrategoConstructor _consdeprecated_0;

  public static IStrategoConstructor _consREPLACEMENT_3;

  public static IStrategoConstructor _consINSERT_BEFORE_3;

  public static IStrategoConstructor _consINSERT_AT_END_3;

  public static IStrategoConstructor _consREPLACEMENT_2;

  public static IStrategoConstructor _consDETETION_1;

  public static IStrategoConstructor _consINSERT_BEFORE_2;

  public static IStrategoConstructor _consINSERT_AT_END_2;

  public static IStrategoConstructor _consConcLayout_1;

  public static IStrategoConstructor _consprod_3;

  public static IStrategoConstructor _conslit_1;

  public static IStrategoConstructor _consflatlex_2;

  public static IStrategoConstructor _consignore_0;

  public static IStrategoConstructor _consrtg_1;

  public static IStrategoConstructor _consIncludeFromPath_1;

  public static IStrategoConstructor _consIncludePathName_1;

  public static IStrategoConstructor _consIncludeXTC_0;

  public static IStrategoConstructor _consIncludeDir_1;

  public static IStrategoConstructor _consIncludeDef_2;

  public static IStrategoConstructor _consIncludeDef_1;

  public static IStrategoConstructor _consSdfMainModuleFlag_0;

  public static IStrategoConstructor _consIgnoreMissingCons_0;

  public static IStrategoConstructor _consDescription_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consQName_2;

  public static IStrategoConstructor _consPrefix_1;

  public static IStrategoConstructor _consPI_2;

  public static IStrategoConstructor _consSystemExternalID_1;

  public static IStrategoConstructor _consPublicExternalID_2;

  public static IStrategoConstructor _consPrologue_3;

  public static IStrategoConstructor _consEpilogue_1;

  public static IStrategoConstructor _consXMLDecl_3;

  public static IStrategoConstructor _consStandaloneDecl_1;

  public static IStrategoConstructor _consVersionDecl_1;

  public static IStrategoConstructor _consEncodingDecl_1;

  public static IStrategoConstructor _consStandalone_1;

  public static IStrategoConstructor _consStandaloneSingle_1;

  public static IStrategoConstructor _consEncoding_1;

  public static IStrategoConstructor _consEncodingSingle_1;

  public static IStrategoConstructor _consVersion_1;

  public static IStrategoConstructor _consVersionSingle_1;

  public static IStrategoConstructor _consDocTypePrologue_2;

  public static IStrategoConstructor _consDocTypeDecl_2;

  public static IStrategoConstructor _consText_1;

  public static IStrategoConstructor _consCDATASection_1;

  public static IStrategoConstructor _consDecCharRef_1;

  public static IStrategoConstructor _consHexCharRef_1;

  public static IStrategoConstructor _consEntityRef_1;

  public static IStrategoConstructor _consAttribute_2;

  public static IStrategoConstructor _consDoubleQuoted_1;

  public static IStrategoConstructor _consSingleQuoted_1;

  public static IStrategoConstructor _consLiteral_1;

  public static IStrategoConstructor _consDocument_3;

  public static IStrategoConstructor _consEmptyElement_2;

  public static IStrategoConstructor _consElement_4;

  public static Context init(Context context)
  { 
    synchronized(SpoofaxGenerator.class)
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
          org.strategoxt.stratego_rtg.Main.init(context);
          org.strategoxt.stratego_sdf.Main.init(context);
          org.strategoxt.stratego_tool_doc.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          context.registerComponent("generator");
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

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_$Spoofax$Generator_0_0.instance, "SpoofaxGenerator", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("SpoofaxGenerator" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_$Spoofax$Generator_0_0.instance, "SpoofaxGenerator", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_$Spoofax$Generator_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consSuperConstrInv_2 = termFactory.makeConstructor("SuperConstrInv", 2);
    _consConstrBody_2 = termFactory.makeConstructor("ConstrBody", 2);
    _consConstrDecHead_5 = termFactory.makeConstructor("ConstrDecHead", 5);
    _consConstrDec_2 = termFactory.makeConstructor("ConstrDec", 2);
    _consThrowsDec_1 = termFactory.makeConstructor("ThrowsDec", 1);
    _consFinal_0 = termFactory.makeConstructor("Final", 0);
    _consVolatile_0 = termFactory.makeConstructor("Volatile", 0);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consExprName_2 = termFactory.makeConstructor("ExprName", 2);
    _consSynchronized_0 = termFactory.makeConstructor("Synchronized", 0);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consLocalVarDecStm_1 = termFactory.makeConstructor("LocalVarDecStm", 1);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consBool_1 = termFactory.makeConstructor("Bool", 1);
    _consPlus_2 = termFactory.makeConstructor("Plus", 2);
    _consCond_3 = termFactory.makeConstructor("Cond", 3);
    _consClass_1 = termFactory.makeConstructor("Class", 1);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
    _consNotEq_2 = termFactory.makeConstructor("NotEq", 2);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consThrow_1 = termFactory.makeConstructor("Throw", 1);
    _consCatch_2 = termFactory.makeConstructor("Catch", 2);
    _consThis_0 = termFactory.makeConstructor("This", 0);
    _consTry_2 = termFactory.makeConstructor("Try", 2);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consIf_2 = termFactory.makeConstructor("If", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consSuperMethod_2 = termFactory.makeConstructor("SuperMethod", 2);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consProtected_0 = termFactory.makeConstructor("Protected", 0);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consClassType_2 = termFactory.makeConstructor("ClassType", 2);
    _consSuperDec_1 = termFactory.makeConstructor("SuperDec", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consTypeImportDec_1 = termFactory.makeConstructor("TypeImportDec", 1);
    _consLazyAnd_2 = termFactory.makeConstructor("LazyAnd", 2);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consMethod_3 = termFactory.makeConstructor("Method", 3);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consselector_2 = termFactory.makeConstructor("selector", 2);
    _consPath_2 = termFactory.makeConstructor("Path", 2);
    _consPP_Entry_2 = termFactory.makeConstructor("PP-Entry", 2);
    _consToMetaExpr_1 = termFactory.makeConstructor("ToMetaExpr", 1);
    _consamb_1 = termFactory.makeConstructor("amb", 1);
    _consInterfaceDecHead_4 = termFactory.makeConstructor("InterfaceDecHead", 4);
    _consInterfaceDec_2 = termFactory.makeConstructor("InterfaceDec", 2);
    _consClassDecHead_5 = termFactory.makeConstructor("ClassDecHead", 5);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consseq_2 = termFactory.makeConstructor("seq", 2);
    _consWarning_0 = termFactory.makeConstructor("Warning", 0);
    _consDebug_0 = termFactory.makeConstructor("Debug", 0);
    _consError_0 = termFactory.makeConstructor("Error", 0);
    _consreject_0 = termFactory.makeConstructor("reject", 0);
    _consbracket_0 = termFactory.makeConstructor("bracket", 0);
    _consparameterized_sort_2 = termFactory.makeConstructor("parameterized-sort", 2);
    _conslabel_2 = termFactory.makeConstructor("label", 2);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consString_0 = termFactory.makeConstructor("String", 0);
    _consPlain_1 = termFactory.makeConstructor("Plain", 1);
    _consNoneTerm_0 = termFactory.makeConstructor("NoneTerm", 0);
    _consSomeTerm_0 = termFactory.makeConstructor("SomeTerm", 0);
    _consiter_star_sep_2 = termFactory.makeConstructor("iter-star-sep", 2);
    _consiter_sep_2 = termFactory.makeConstructor("iter-sep", 2);
    _consConcTerm_0 = termFactory.makeConstructor("ConcTerm", 0);
    _consConsTerm_0 = termFactory.makeConstructor("ConsTerm", 0);
    _consNilTerm_0 = termFactory.makeConstructor("NilTerm", 0);
    _consTupleTerm_1 = termFactory.makeConstructor("TupleTerm", 1);
    _consTerm_1 = termFactory.makeConstructor("Term", 1);
    _consAppl_2 = termFactory.makeConstructor("Appl", 2);
    _consNonterm_1 = termFactory.makeConstructor("Nonterm", 1);
    _consfile_start_0 = termFactory.makeConstructor("file-start", 0);
    _consstart_0 = termFactory.makeConstructor("start", 0);
    _consalt_2 = termFactory.makeConstructor("alt", 2);
    _consvarsym_1 = termFactory.makeConstructor("varsym", 1);
    _consProdRule_2 = termFactory.makeConstructor("ProdRule", 2);
    _conslexical_syntax_1 = termFactory.makeConstructor("lexical-syntax", 1);
    _conscontext_free_syntax_1 = termFactory.makeConstructor("context-free-syntax", 1);
    _consProdRules_1 = termFactory.makeConstructor("ProdRules", 1);
    _consStart_1 = termFactory.makeConstructor("Start", 1);
    _consRTG_2 = termFactory.makeConstructor("RTG", 2);
    _consRef_1 = termFactory.makeConstructor("Ref", 1);
    _conssyntax_1 = termFactory.makeConstructor("syntax", 1);
    _consCritical_0 = termFactory.makeConstructor("Critical", 0);
    _consleft_0 = termFactory.makeConstructor("left", 0);
    _consassoc_1 = termFactory.makeConstructor("assoc", 1);
    _conscons_1 = termFactory.makeConstructor("cons", 1);
    _consiter_1 = termFactory.makeConstructor("iter", 1);
    _consiter_star_1 = termFactory.makeConstructor("iter-star", 1);
    _consparsetree_2 = termFactory.makeConstructor("parsetree", 2);
    _consprefer_0 = termFactory.makeConstructor("prefer", 0);
    _consrange_2 = termFactory.makeConstructor("range", 2);
    _conschar_class_1 = termFactory.makeConstructor("char-class", 1);
    _conslex_1 = termFactory.makeConstructor("lex", 1);
    _conssort_1 = termFactory.makeConstructor("sort", 1);
    _conslayout_0 = termFactory.makeConstructor("layout", 0);
    _consopt_1 = termFactory.makeConstructor("opt", 1);
    _conscf_1 = termFactory.makeConstructor("cf", 1);
    _consappl_2 = termFactory.makeConstructor("appl", 2);
    _consstderr_0 = termFactory.makeConstructor("stderr", 0);
    _consFILE_1 = termFactory.makeConstructor("FILE", 1);
    _consquoted_1 = termFactory.makeConstructor("quoted", 1);
    _consci_lit_1 = termFactory.makeConstructor("ci-lit", 1);
    _consdefault_1 = termFactory.makeConstructor("default", 1);
    _consterm_1 = termFactory.makeConstructor("term", 1);
    _consattrs_1 = termFactory.makeConstructor("attrs", 1);
    _consno_attrs_0 = termFactory.makeConstructor("no-attrs", 0);
    _consAutoProgram_0 = termFactory.makeConstructor("AutoProgram", 0);
    _consPerson_2 = termFactory.makeConstructor("Person", 2);
    _consAuthor_1 = termFactory.makeConstructor("Author", 1);
    _consGNU_LGPL_2 = termFactory.makeConstructor("GNU_LGPL", 2);
    _consDefaultXTCRepository_0 = termFactory.makeConstructor("DefaultXTCRepository", 0);
    _consCurrentXTCRepository_0 = termFactory.makeConstructor("CurrentXTCRepository", 0);
    _consConfig_1 = termFactory.makeConstructor("Config", 1);
    _consUsage_1 = termFactory.makeConstructor("Usage", 1);
    _consSummary_1 = termFactory.makeConstructor("Summary", 1);
    _consOptionUsage_0 = termFactory.makeConstructor("OptionUsage", 0);
    _consAutoReportBugs_0 = termFactory.makeConstructor("AutoReportBugs", 0);
    _consHelpString_2 = termFactory.makeConstructor("HelpString", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consC_2 = termFactory.makeConstructor("C", 2);
    _consComment_1 = termFactory.makeConstructor("Comment", 1);
    _consHS_0 = termFactory.makeConstructor("HS", 0);
    _consH_2 = termFactory.makeConstructor("H", 2);
    _consS_1 = termFactory.makeConstructor("S", 1);
    _consKW_0 = termFactory.makeConstructor("KW", 0);
    _consFBOX_2 = termFactory.makeConstructor("FBOX", 2);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consVS_0 = termFactory.makeConstructor("VS", 0);
    _consSOpt_2 = termFactory.makeConstructor("SOpt", 2);
    _consV_2 = termFactory.makeConstructor("V", 2);
    _consSort_1 = termFactory.makeConstructor("Sort", 1);
    _consListSort_1 = termFactory.makeConstructor("ListSort", 1);
    _consConstructorOnly_1 = termFactory.makeConstructor("ConstructorOnly", 1);
    _consConstructor_1 = termFactory.makeConstructor("Constructor", 1);
    _consSortAndConstructor_2 = termFactory.makeConstructor("SortAndConstructor", 2);
    _consSemanticProvider_1 = termFactory.makeConstructor("SemanticProvider", 1);
    _consOnSave_2 = termFactory.makeConstructor("OnSave", 2);
    _consReferenceHoverRule_3 = termFactory.makeConstructor("ReferenceHoverRule", 3);
    _consReferenceRule_2 = termFactory.makeConstructor("ReferenceRule", 2);
    _consHoverRule_2 = termFactory.makeConstructor("HoverRule", 2);
    _consOccurrenceRule_2 = termFactory.makeConstructor("OccurrenceRule", 2);
    _consCompletionProposer_1 = termFactory.makeConstructor("CompletionProposer", 1);
    _consCompletionKeyword_2 = termFactory.makeConstructor("CompletionKeyword", 2);
    _consCompletionTemplate_3 = termFactory.makeConstructor("CompletionTemplate", 3);
    _consCompletionTemplateWithSort_4 = termFactory.makeConstructor("CompletionTemplateWithSort", 4);
    _consCompletionTrigger_2 = termFactory.makeConstructor("CompletionTrigger", 2);
    _consCompletionTemplateEx_4 = termFactory.makeConstructor("CompletionTemplateEx", 4);
    _consSemanticObserver_1 = termFactory.makeConstructor("SemanticObserver", 1);
    _consBuilder_3 = termFactory.makeConstructor("Builder", 3);
    _consBuilderCaption_1 = termFactory.makeConstructor("BuilderCaption", 1);
    _consPPTable_1 = termFactory.makeConstructor("PPTable", 1);
    _consPrettyPrint_1 = termFactory.makeConstructor("PrettyPrint", 1);
    _consRefactoring_4 = termFactory.makeConstructor("Refactoring", 4);
    _consStrategy_1 = termFactory.makeConstructor("Strategy", 1);
    _consAttribute_1 = termFactory.makeConstructor("Attribute", 1);
    _consLanguage_2 = termFactory.makeConstructor("Language", 2);
    _consFolding_2 = termFactory.makeConstructor("Folding", 2);
    _consOutliner_2 = termFactory.makeConstructor("Outliner", 2);
    _consColorer_2 = termFactory.makeConstructor("Colorer", 2);
    _consReferences_2 = termFactory.makeConstructor("References", 2);
    _consCompletions_2 = termFactory.makeConstructor("Completions", 2);
    _consBuilders_2 = termFactory.makeConstructor("Builders", 2);
    _consRefactorings_2 = termFactory.makeConstructor("Refactorings", 2);
    _consValues_1 = termFactory.makeConstructor("Values", 1);
    _consLanguageName_1 = termFactory.makeConstructor("LanguageName", 1);
    _consLanguageId_1 = termFactory.makeConstructor("LanguageId", 1);
    _consExtensions_1 = termFactory.makeConstructor("Extensions", 1);
    _consTable_1 = termFactory.makeConstructor("Table", 1);
    _consTableProvider_1 = termFactory.makeConstructor("TableProvider", 1);
    _consStartSymbols_1 = termFactory.makeConstructor("StartSymbols", 1);
    _consURL_1 = termFactory.makeConstructor("URL", 1);
    _consExtends_1 = termFactory.makeConstructor("Extends", 1);
    _consAliases_1 = termFactory.makeConstructor("Aliases", 1);
    _consUnmanagedTablePrefix_1 = termFactory.makeConstructor("UnmanagedTablePrefix", 1);
    _consDisambiguator_1 = termFactory.makeConstructor("Disambiguator", 1);
    _consLineCommentPrefix_1 = termFactory.makeConstructor("LineCommentPrefix", 1);
    _consBlockCommentDefs_1 = termFactory.makeConstructor("BlockCommentDefs", 1);
    _consFenceDefs_1 = termFactory.makeConstructor("FenceDefs", 1);
    _consIndentDefs_1 = termFactory.makeConstructor("IndentDefs", 1);
    _consIdentifierLexical_1 = termFactory.makeConstructor("IdentifierLexical", 1);
    _consBlockCommentDef_3 = termFactory.makeConstructor("BlockCommentDef", 3);
    _consNoContinuation_0 = termFactory.makeConstructor("NoContinuation", 0);
    _consFenceDef_2 = termFactory.makeConstructor("FenceDef", 2);
    _consIndentDef_1 = termFactory.makeConstructor("IndentDef", 1);
    _consFoldRule_2 = termFactory.makeConstructor("FoldRule", 2);
    _consFoldRuleAll_2 = termFactory.makeConstructor("FoldRuleAll", 2);
    _consFolded_0 = termFactory.makeConstructor("Folded", 0);
    _consOutlineRule_1 = termFactory.makeConstructor("OutlineRule", 1);
    _consColorRuleAll_2 = termFactory.makeConstructor("ColorRuleAll", 2);
    _consColorRule_2 = termFactory.makeConstructor("ColorRule", 2);
    _consColorRuleAllNamed_3 = termFactory.makeConstructor("ColorRuleAllNamed", 3);
    _consColorRuleNamed_3 = termFactory.makeConstructor("ColorRuleNamed", 3);
    _consColorDef_2 = termFactory.makeConstructor("ColorDef", 2);
    _consAttribute_3 = termFactory.makeConstructor("Attribute", 3);
    _consAttributeRef_1 = termFactory.makeConstructor("AttributeRef", 1);
    _consToken_1 = termFactory.makeConstructor("Token", 1);
    _consTK_IDENTIFIER_0 = termFactory.makeConstructor("TK_IDENTIFIER", 0);
    _consTK_NUMBER_0 = termFactory.makeConstructor("TK_NUMBER", 0);
    _consTK_LAYOUT_0 = termFactory.makeConstructor("TK_LAYOUT", 0);
    _consTK_STRING_0 = termFactory.makeConstructor("TK_STRING", 0);
    _consTK_KEYWORD_0 = termFactory.makeConstructor("TK_KEYWORD", 0);
    _consTK_OPERATOR_0 = termFactory.makeConstructor("TK_OPERATOR", 0);
    _consTK_VAR_0 = termFactory.makeConstructor("TK_VAR", 0);
    _consTK_ERROR_0 = termFactory.makeConstructor("TK_ERROR", 0);
    _consTK_UNKNOWN_0 = termFactory.makeConstructor("TK_UNKNOWN", 0);
    _consNORMAL_0 = termFactory.makeConstructor("NORMAL", 0);
    _consBOLD_0 = termFactory.makeConstructor("BOLD", 0);
    _consITALIC_0 = termFactory.makeConstructor("ITALIC", 0);
    _consBOLD_ITALIC_0 = termFactory.makeConstructor("BOLD_ITALIC", 0);
    _consColorDefault_0 = termFactory.makeConstructor("ColorDefault", 0);
    _consColorRGB_3 = termFactory.makeConstructor("ColorRGB", 3);
    _consNoColor_0 = termFactory.makeConstructor("NoColor", 0);
    _consNoCompletionPrefix_0 = termFactory.makeConstructor("NoCompletionPrefix", 0);
    _consCompletionPrefix_1 = termFactory.makeConstructor("CompletionPrefix", 1);
    _consPlaceholder_1 = termFactory.makeConstructor("Placeholder", 1);
    _consPlaceholderWithSort_2 = termFactory.makeConstructor("PlaceholderWithSort", 2);
    _consDisable_0 = termFactory.makeConstructor("Disable", 0);
    _consBlank_0 = termFactory.makeConstructor("Blank", 0);
    _consLinked_0 = termFactory.makeConstructor("Linked", 0);
    _consOpenEditor_0 = termFactory.makeConstructor("OpenEditor", 0);
    _consRealTime_0 = termFactory.makeConstructor("RealTime", 0);
    _consPersistent_0 = termFactory.makeConstructor("Persistent", 0);
    _consMeta_0 = termFactory.makeConstructor("Meta", 0);
    _consCursor_0 = termFactory.makeConstructor("Cursor", 0);
    _consSource_0 = termFactory.makeConstructor("Source", 0);
    _consModule_3 = termFactory.makeConstructor("Module", 3);
    _consImports_1 = termFactory.makeConstructor("Imports", 1);
    _consNoImports_0 = termFactory.makeConstructor("NoImports", 0);
    _consImport_1 = termFactory.makeConstructor("Import", 1);
    _consImportRenamed_2 = termFactory.makeConstructor("ImportRenamed", 2);
    _consError_2 = termFactory.makeConstructor("Error", 2);
    _consEmptyLine_0 = termFactory.makeConstructor("EmptyLine", 0);
    _consCommentLine_1 = termFactory.makeConstructor("CommentLine", 1);
    _consdeprecated_1 = termFactory.makeConstructor("deprecated", 1);
    _consdeprecated_0 = termFactory.makeConstructor("deprecated", 0);
    _consREPLACEMENT_3 = termFactory.makeConstructor("REPLACEMENT", 3);
    _consINSERT_BEFORE_3 = termFactory.makeConstructor("INSERT_BEFORE", 3);
    _consINSERT_AT_END_3 = termFactory.makeConstructor("INSERT_AT_END", 3);
    _consREPLACEMENT_2 = termFactory.makeConstructor("REPLACEMENT", 2);
    _consDETETION_1 = termFactory.makeConstructor("DETETION", 1);
    _consINSERT_BEFORE_2 = termFactory.makeConstructor("INSERT_BEFORE", 2);
    _consINSERT_AT_END_2 = termFactory.makeConstructor("INSERT_AT_END", 2);
    _consConcLayout_1 = termFactory.makeConstructor("ConcLayout", 1);
    _consprod_3 = termFactory.makeConstructor("prod", 3);
    _conslit_1 = termFactory.makeConstructor("lit", 1);
    _consflatlex_2 = termFactory.makeConstructor("flatlex", 2);
    _consignore_0 = termFactory.makeConstructor("ignore", 0);
    _consrtg_1 = termFactory.makeConstructor("rtg", 1);
    _consIncludeFromPath_1 = termFactory.makeConstructor("IncludeFromPath", 1);
    _consIncludePathName_1 = termFactory.makeConstructor("IncludePathName", 1);
    _consIncludeXTC_0 = termFactory.makeConstructor("IncludeXTC", 0);
    _consIncludeDir_1 = termFactory.makeConstructor("IncludeDir", 1);
    _consIncludeDef_2 = termFactory.makeConstructor("IncludeDef", 2);
    _consIncludeDef_1 = termFactory.makeConstructor("IncludeDef", 1);
    _consSdfMainModuleFlag_0 = termFactory.makeConstructor("SdfMainModuleFlag", 0);
    _consIgnoreMissingCons_0 = termFactory.makeConstructor("IgnoreMissingCons", 0);
    _consDescription_1 = termFactory.makeConstructor("Description", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consQName_2 = termFactory.makeConstructor("QName", 2);
    _consPrefix_1 = termFactory.makeConstructor("Prefix", 1);
    _consPI_2 = termFactory.makeConstructor("PI", 2);
    _consSystemExternalID_1 = termFactory.makeConstructor("SystemExternalID", 1);
    _consPublicExternalID_2 = termFactory.makeConstructor("PublicExternalID", 2);
    _consPrologue_3 = termFactory.makeConstructor("Prologue", 3);
    _consEpilogue_1 = termFactory.makeConstructor("Epilogue", 1);
    _consXMLDecl_3 = termFactory.makeConstructor("XMLDecl", 3);
    _consStandaloneDecl_1 = termFactory.makeConstructor("StandaloneDecl", 1);
    _consVersionDecl_1 = termFactory.makeConstructor("VersionDecl", 1);
    _consEncodingDecl_1 = termFactory.makeConstructor("EncodingDecl", 1);
    _consStandalone_1 = termFactory.makeConstructor("Standalone", 1);
    _consStandaloneSingle_1 = termFactory.makeConstructor("StandaloneSingle", 1);
    _consEncoding_1 = termFactory.makeConstructor("Encoding", 1);
    _consEncodingSingle_1 = termFactory.makeConstructor("EncodingSingle", 1);
    _consVersion_1 = termFactory.makeConstructor("Version", 1);
    _consVersionSingle_1 = termFactory.makeConstructor("VersionSingle", 1);
    _consDocTypePrologue_2 = termFactory.makeConstructor("DocTypePrologue", 2);
    _consDocTypeDecl_2 = termFactory.makeConstructor("DocTypeDecl", 2);
    _consText_1 = termFactory.makeConstructor("Text", 1);
    _consCDATASection_1 = termFactory.makeConstructor("CDATASection", 1);
    _consDecCharRef_1 = termFactory.makeConstructor("DecCharRef", 1);
    _consHexCharRef_1 = termFactory.makeConstructor("HexCharRef", 1);
    _consEntityRef_1 = termFactory.makeConstructor("EntityRef", 1);
    _consAttribute_2 = termFactory.makeConstructor("Attribute", 2);
    _consDoubleQuoted_1 = termFactory.makeConstructor("DoubleQuoted", 1);
    _consSingleQuoted_1 = termFactory.makeConstructor("SingleQuoted", 1);
    _consLiteral_1 = termFactory.makeConstructor("Literal", 1);
    _consDocument_3 = termFactory.makeConstructor("Document", 3);
    _consEmptyElement_2 = termFactory.makeConstructor("EmptyElement", 2);
    _consElement_4 = termFactory.makeConstructor("Element", 4);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    initConstants31(termFactory);
    constAssign6 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName16, generator.constThis0});
    constExprStm12 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign6});
    constCons5148 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm12, (IStrategoList)generator.constNil7);
    constConstrBody0 = termFactory.makeAppl(SpoofaxGenerator._consConstrBody_2, new IStrategoTerm[]{generator.constSome8, generator.constCons5148});
    constConstrDec0 = termFactory.makeAppl(SpoofaxGenerator._consConstrDec_2, new IStrategoTerm[]{generator.constConstrDecHead0, generator.constConstrBody0});
    constCons5149 = (IStrategoTerm)termFactory.makeListCons(generator.constConstrDec0, (IStrategoList)generator.constCons5147);
    constCons5150 = (IStrategoTerm)termFactory.makeListCons(generator.constPublic0, (IStrategoList)generator.constCons5004);
    constTypeName32 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId66});
    constClassOrInterfaceType12 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName32, generator.constNone0});
    const7865 = termFactory.makeString("getInstance");
    constId76 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7865});
    constMethodDecHead10 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons5150, generator.constNone0, generator.constClassOrInterfaceType12, generator.constId76, generator.constNil7, generator.constNone0});
    constSome9 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constExprName16});
    constReturn4 = termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{generator.constSome9});
    constCons5151 = (IStrategoTerm)termFactory.makeListCons(generator.constReturn4, (IStrategoList)generator.constNil7);
    constEq3 = termFactory.makeAppl(SpoofaxGenerator._consEq_2, new IStrategoTerm[]{generator.constExprName16, generator.constLit0});
    constNewInstance10 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType12, generator.constNil7, generator.constNone0});
    constSome10 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constNewInstance10});
    constReturn5 = termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{generator.constSome10});
    constIf7 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constEq3, generator.constReturn5});
    constCons5152 = (IStrategoTerm)termFactory.makeListCons(generator.constIf7, (IStrategoList)generator.constCons5151);
    constBlock13 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5152});
    constMethodDec6 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead10, generator.constBlock13});
    constCons5153 = (IStrategoTerm)termFactory.makeListCons(generator.constMethodDec6, (IStrategoList)generator.constCons5149);
    constVarDec6 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_1, new IStrategoTerm[]{generator.constId75});
    constCons5154 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec6, (IStrategoList)generator.constNil7);
    constFieldDec5 = termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5006, generator.constClassOrInterfaceType12, generator.constCons5154});
    constCons5155 = (IStrategoTerm)termFactory.makeListCons(generator.constFieldDec5, (IStrategoList)generator.constCons5153);
    const7866 = termFactory.makeString("utils");
    const7867 = termFactory.makeString("Copying jar files");
    const7868 = termFactory.makeString("InputFile");
    const7869 = termFactory.makeString("58206");
    const7870 = termFactory.makeString("-i <grammar>.def      Set input file (optional)");
    const7871 = termFactory.makeString("ParseTable");
    const7872 = termFactory.makeString("221160");
    const7873 = termFactory.makeString("-p <parse table>.tbl  Set parse table (optional; None to skip table generation)");
    const7874 = termFactory.makeString("-e <extensions>       Set editor file extensions (comma separated)");
    const7875 = termFactory.makeString("-n <packagename>      Set base package name (optional)");
    const7876 = termFactory.makeString("ProjectName");
    const7877 = termFactory.makeString("34095");
    const7878 = termFactory.makeString("-pn <project name>    Set project name (optional)");
    const7879 = termFactory.makeString("File does not exist");
    const7880 = termFactory.makeString("JarLocations");
    const7881 = termFactory.makeString("-793957");
    const7882 = termFactory.makeString("-jar <paths>          Set jar files to include (optional)");
    const7883 = termFactory.makeString("Multiple start symbols not supported yet, please specify a single start symbol");
    const7884 = termFactory.makeString("-s <start symbol>     Set start symbol");
    const7885 = termFactory.makeString("NewProject");
    const7886 = termFactory.makeString("228271");
    const7887 = termFactory.makeString("-nproj | --newProject    Create files related to new eclipse plugin project");
    const7888 = termFactory.makeString("ResetFiles");
    const7889 = termFactory.makeString("-147169");
    const7890 = termFactory.makeString("-r | --reset          Reset all generated files to their defaults");
    const7891 = termFactory.makeString("[[");
    const7892 = termFactory.makeString("org.strategoxt.imp.generated.");
    const7893 = termFactory.makeString(" not specified");
    const7894 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'sdf2imp-jvm'");
    const7895 = termFactory.makeString("IsLaunchedFromEclipse");
    const7896 = termFactory.makeString("-93503");
    const7897 = termFactory.makeString("MainDescriptorName");
    const7898 = termFactory.makeString("136411");
    const7899 = termFactory.makeString("DescriptorNamePrefix");
    const7900 = termFactory.makeString("74836");
    const7901 = termFactory.makeString("Found accompanying .def file:");
    const7902 = termFactory.makeString("..");
    const7903 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'find-def-file'");
    const7904 = termFactory.makeString("def");
    const7905 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'find-def-file'");
    const7906 = termFactory.makeString("\n                                  ");
    const7907 = termFactory.makeString(".\nMaybe the project should be rebuilt?");
    constCons5156 = (IStrategoTerm)termFactory.makeListCons(generator.const7907, (IStrategoList)generator.constNil7);
    const7908 = termFactory.makeString("Accompanying .def file not found: ");
    const7909 = termFactory.makeString("Spoofaxlang Build succesful.");
    const7910 = termFactory.makeString("Welcome to SpoofaxLang Project Wizard Version 0.0: ");
    const7911 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'generate-spoofaxlang-example'");
    const7912 = termFactory.makeString("DefaultDefFile");
    const7913 = termFactory.makeString("100819");
    const7914 = termFactory.makeString("Generating configuration file for spoofaxlang project. ");
    const7915 = termFactory.makeString("Generating main descriptor. ");
    const7916 = termFactory.makeString("Generating Eclipse Project related Artifacts.");
    const7917 = termFactory.makeString("Build succesful.");
    const7918 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'sdf2imp'");
    const7919 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'sdf2imp'");
    const7920 = termFactory.makeString("rtg");
    const7921 = termFactory.makeString("Importing regular tree grammar from");
    const7922 = termFactory.makeString("Analyzing grammar...");
    const7923 = termFactory.makeString("Input file must be a .def file.");
    constCons5157 = (IStrategoTerm)termFactory.makeListCons(generator.const7099, (IStrategoList)generator.constNil7);
    const7924 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'sdf2rtg'");
    const7925 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'pack-default-sdf'");
    const7926 = termFactory.makeString(".def");
    constCons5158 = (IStrategoTerm)termFactory.makeListCons(generator.const7926, (IStrategoList)generator.constNil7);
    constIncludeDir1 = termFactory.makeAppl(SpoofaxGenerator._consIncludeDir_1, new IStrategoTerm[]{generator.const7637});
    constCons5159 = (IStrategoTerm)termFactory.makeListCons(generator.constIncludeDir1, (IStrategoList)generator.constNil7);
    const7927 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'pack-default-sdf'");
    const7928 = termFactory.makeString("Could not import module ");
    const7929 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'OnImportFailure', defined in strategy 'current-main-descriptor-file'");
    const7930 = termFactory.makeString("Could not import module");
    constModule0 = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{generator.const7000, generator.constNoImports0, generator.constNil7});
    const7931 = termFactory.makeString("Could not import ");
  }

  private static void initConstants31(ITermFactory termFactory)
  { 
    initConstants30(termFactory);
    constId37 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7694});
    constParam1 = termFactory.makeAppl(SpoofaxGenerator._consParam_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType3, generator.constId37});
    const7695 = termFactory.makeString("RuntimeException");
    constId38 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7695});
    constTypeName19 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId38});
    constClassOrInterfaceType4 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName19, generator.constNone0});
    constExprName5 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId37});
    constCons4995 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName5, (IStrategoList)generator.constNil7);
    constNewInstance0 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType4, generator.constCons4995, generator.constNone0});
    constThrow0 = termFactory.makeAppl(SpoofaxGenerator._consThrow_1, new IStrategoTerm[]{generator.constNewInstance0});
    constCons4996 = (IStrategoTerm)termFactory.makeListCons(generator.constThrow0, (IStrategoList)generator.constNil7);
    constAssign1 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName4, generator.constExprName5});
    constExprStm3 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign1});
    constCons4997 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm3, (IStrategoList)generator.constCons4996);
    constBlock2 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons4997});
    constCatch0 = termFactory.makeAppl(SpoofaxGenerator._consCatch_2, new IStrategoTerm[]{generator.constParam1, generator.constBlock2});
    constCons4998 = (IStrategoTerm)termFactory.makeListCons(generator.constCatch0, (IStrategoList)generator.constNil7);
    constTry0 = termFactory.makeAppl(SpoofaxGenerator._consTry_2, new IStrategoTerm[]{generator.constBlock1, generator.constCons4998});
    constCons4999 = (IStrategoTerm)termFactory.makeListCons(generator.constTry0, (IStrategoList)generator.constNil7);
    constNull0 = termFactory.makeAppl(SpoofaxGenerator._consNull_0, NO_TERMS);
    constLit0 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constNull0});
    constNotEq0 = termFactory.makeAppl(SpoofaxGenerator._consNotEq_2, new IStrategoTerm[]{generator.constExprName4, generator.constLit0});
    constCons5000 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName4, (IStrategoList)generator.constNil7);
    constNewInstance1 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType4, generator.constCons5000, generator.constNone0});
    constThrow1 = termFactory.makeAppl(SpoofaxGenerator._consThrow_1, new IStrategoTerm[]{generator.constNewInstance1});
    constIf0 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constNotEq0, generator.constThrow1});
    constCons5001 = (IStrategoTerm)termFactory.makeListCons(generator.constIf0, (IStrategoList)generator.constCons4999);
    constBlock3 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5001});
    constIf1 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constNot0, generator.constBlock3});
    constCons5002 = (IStrategoTerm)termFactory.makeListCons(generator.constIf1, (IStrategoList)generator.constCons4991);
    constBlock4 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5002});
    constMethodDec1 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead2, generator.constBlock4});
    constCons5003 = (IStrategoTerm)termFactory.makeListCons(generator.constMethodDec1, (IStrategoList)generator.constCons4990);
    constStatic0 = termFactory.makeAppl(SpoofaxGenerator._consStatic_0, NO_TERMS);
    constCons5004 = (IStrategoTerm)termFactory.makeListCons(generator.constStatic0, (IStrategoList)generator.constNil7);
    constPrivate0 = termFactory.makeAppl(SpoofaxGenerator._consPrivate_0, NO_TERMS);
    constCons5005 = (IStrategoTerm)termFactory.makeListCons(generator.constPrivate0, (IStrategoList)generator.constCons5004);
    const7696 = termFactory.makeString("String");
    constId39 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7696});
    constTypeName20 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId39});
    constClassOrInterfaceType5 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName20, generator.constNone0});
    const7697 = termFactory.makeString("getPluginLocation");
    constId40 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7697});
    constMethodDecHead3 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons5005, generator.constNone0, generator.constClassOrInterfaceType5, generator.constId40, generator.constNil7, generator.constNone0});
    const7698 = termFactory.makeString("getProtectionDomain");
    constId41 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7698});
    const7699 = termFactory.makeString("getCodeSource");
    constId42 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7699});
    const7700 = termFactory.makeString("getLocation");
    constId43 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7700});
    const7701 = termFactory.makeString("getFile");
    constId44 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7701});
    constCons5006 = (IStrategoTerm)termFactory.makeListCons(generator.constProtected0, (IStrategoList)generator.constCons5004);
    const7702 = termFactory.makeString("createDescriptor");
    constId45 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7702});
    constMethodDecHead4 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons5006, generator.constNone0, generator.constVoid0, generator.constId45, generator.constNil7, generator.constNone0});
    const7703 = termFactory.makeString("descriptor");
    constId46 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7703});
    constAmbName0 = termFactory.makeAppl(SpoofaxGenerator._consAmbName_1, new IStrategoTerm[]{generator.constId46});
    const7704 = termFactory.makeString("setAttachmentProvider");
    constId47 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7704});
    constMethodName3 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_2, new IStrategoTerm[]{generator.constAmbName0, generator.constId47});
    constMethod4 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName3});
    constExprName6 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId46});
    constAmbName1 = termFactory.makeAppl(SpoofaxGenerator._consAmbName_1, new IStrategoTerm[]{generator.constId15});
    const7705 = termFactory.makeString("load");
    constId48 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7705});
    constMethodName4 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_2, new IStrategoTerm[]{generator.constAmbName1, generator.constId48});
    constMethod5 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName4});
    const7706 = termFactory.makeString("filesystem");
    constId49 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7706});
    constExprName7 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId49});
    constAmbName2 = termFactory.makeAppl(SpoofaxGenerator._consAmbName_1, new IStrategoTerm[]{generator.constId22});
    const7707 = termFactory.makeString("fromPortableString");
    constId50 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7707});
    constMethodName5 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_2, new IStrategoTerm[]{generator.constAmbName2, generator.constId50});
    constMethod6 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName5});
    const7708 = termFactory.makeString("./");
    constChars0 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7708});
    constCons5007 = (IStrategoTerm)termFactory.makeListCons(generator.constChars0, (IStrategoList)generator.constNil7);
    constString17 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5007});
    constLit1 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString17});
    constCons5008 = (IStrategoTerm)termFactory.makeListCons(generator.constLit1, (IStrategoList)generator.constNil7);
    constInvoke6 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod6, generator.constCons5008});
    constCond0 = termFactory.makeAppl(SpoofaxGenerator._consCond_3, new IStrategoTerm[]{generator.constExprName7, generator.constInvoke6, generator.constLit0});
    constCons5009 = (IStrategoTerm)termFactory.makeListCons(generator.constCond0, (IStrategoList)generator.constNil7);
    const7709 = termFactory.makeString("table");
    constId51 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7709});
    constExprName8 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId51});
    constCons5010 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName8, (IStrategoList)generator.constCons5009);
    const7710 = termFactory.makeString("descriptorStream");
    constId52 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7710});
    constExprName9 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId52});
    constCons5011 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName9, (IStrategoList)generator.constCons5010);
    constInvoke7 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod5, generator.constCons5011});
    constAssign2 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName6, generator.constInvoke7});
    constExprStm4 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign2});
    constEq0 = termFactory.makeAppl(SpoofaxGenerator._consEq_2, new IStrategoTerm[]{generator.constExprName8, generator.constLit0});
    const7711 = termFactory.makeString("Could not load parse table from ");
    constChars1 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7711});
    constCons5012 = (IStrategoTerm)termFactory.makeListCons(generator.constChars1, (IStrategoList)generator.constNil7);
    constString18 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5012});
    constLit2 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString18});
    const7712 = termFactory.makeString("TABLE");
    constId53 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7712});
    constExprName10 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId53});
    constPlus0 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit2, generator.constExprName10});
    const7713 = termFactory.makeString(" (not found in plugin: ");
    constChars2 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7713});
    constCons5013 = (IStrategoTerm)termFactory.makeListCons(generator.constChars2, (IStrategoList)generator.constNil7);
    constString19 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5013});
    constLit3 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString19});
    constPlus1 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus0, generator.constLit3});
    constMethodName6 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_1, new IStrategoTerm[]{generator.constId40});
    constMethod7 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName6});
    constInvoke8 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod7, generator.constNil7});
    constPlus2 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus1, generator.constInvoke8});
    constChars3 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7047});
    constCons5014 = (IStrategoTerm)termFactory.makeListCons(generator.constChars3, (IStrategoList)generator.constNil7);
    constString20 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5014});
    constLit4 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString20});
    constPlus3 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus2, generator.constLit4});
    constCons5015 = (IStrategoTerm)termFactory.makeListCons(generator.constPlus3, (IStrategoList)generator.constNil7);
    constNewInstance2 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType3, generator.constCons5015, generator.constNone0});
    constThrow2 = termFactory.makeAppl(SpoofaxGenerator._consThrow_1, new IStrategoTerm[]{generator.constNewInstance2});
    constIf2 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constEq0, generator.constThrow2});
    constEq1 = termFactory.makeAppl(SpoofaxGenerator._consEq_2, new IStrategoTerm[]{generator.constExprName9, generator.constLit0});
    const7714 = termFactory.makeString("Could not load descriptor file from ");
    constChars4 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7714});
    constCons5016 = (IStrategoTerm)termFactory.makeListCons(generator.constChars4, (IStrategoList)generator.constNil7);
    constString21 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5016});
    constLit5 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString21});
    const7715 = termFactory.makeString("DESCRIPTOR");
    constId54 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7715});
    constExprName11 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId54});
    constPlus4 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit5, generator.constExprName11});
    constPlus5 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus4, generator.constLit3});
    constPlus6 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus5, generator.constInvoke8});
    constPlus7 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus6, generator.constLit4});
    constCons5017 = (IStrategoTerm)termFactory.makeListCons(generator.constPlus7, (IStrategoList)generator.constNil7);
    constNewInstance3 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType3, generator.constCons5017, generator.constNone0});
    constThrow3 = termFactory.makeAppl(SpoofaxGenerator._consThrow_1, new IStrategoTerm[]{generator.constNewInstance3});
    constIf3 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constEq1, generator.constThrow3});
    constTypeName21 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId26});
    constClassOrInterfaceType6 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName21, generator.constNone0});
    constPlus8 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit1, generator.constExprName10});
    constCons5018 = (IStrategoTerm)termFactory.makeListCons(generator.constPlus8, (IStrategoList)generator.constNil7);
    constNewInstance4 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType6, generator.constCons5018, generator.constNone0});
    const7716 = termFactory.makeString("exists");
    constId55 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7716});
    constMethod8 = termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{generator.constNewInstance4, generator.constNone0, generator.constId55});
    constInvoke9 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod8, generator.constNil7});
    constLazyAnd0 = termFactory.makeAppl(SpoofaxGenerator._consLazyAnd_2, new IStrategoTerm[]{generator.constEq0, generator.constInvoke9});
    constTrue0 = termFactory.makeAppl(SpoofaxGenerator._consTrue_0, NO_TERMS);
    constBool0 = termFactory.makeAppl(SpoofaxGenerator._consBool_1, new IStrategoTerm[]{generator.constTrue0});
    constLit6 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constBool0});
    constAssign3 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName7, generator.constLit6});
    constExprStm5 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign3});
    constCons5019 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm5, (IStrategoList)generator.constNil7);
    constTypeName22 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId25});
    constClassOrInterfaceType7 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName22, generator.constNone0});
    constNewInstance5 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType7, generator.constCons5018, generator.constNone0});
    constAssign4 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName8, generator.constNewInstance5});
    constExprStm6 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign4});
    constCons5020 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm6, (IStrategoList)generator.constCons5019);
    constBlock5 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5020});
    constIf4 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constLazyAnd0, generator.constBlock5});
    constPlus9 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit1, generator.constExprName11});
    constCons5021 = (IStrategoTerm)termFactory.makeListCons(generator.constPlus9, (IStrategoList)generator.constNil7);
    constNewInstance6 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType6, generator.constCons5021, generator.constNone0});
    constMethod9 = termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{generator.constNewInstance6, generator.constNone0, generator.constId55});
    constInvoke10 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod9, generator.constNil7});
    constLazyAnd1 = termFactory.makeAppl(SpoofaxGenerator._consLazyAnd_2, new IStrategoTerm[]{generator.constEq1, generator.constInvoke10});
    constNewInstance7 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType7, generator.constCons5021, generator.constNone0});
    constAssign5 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName9, generator.constNewInstance7});
    constExprStm7 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign5});
    constCons5022 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm7, (IStrategoList)generator.constCons5019);
    constBlock6 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5022});
    constIf5 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constLazyAnd1, generator.constBlock6});
    constBoolean0 = termFactory.makeAppl(SpoofaxGenerator._consBoolean_0, NO_TERMS);
    constFalse0 = termFactory.makeAppl(SpoofaxGenerator._consFalse_0, NO_TERMS);
    constBool1 = termFactory.makeAppl(SpoofaxGenerator._consBool_1, new IStrategoTerm[]{generator.constFalse0});
    constLit7 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constBool1});
    constVarDec0 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId49, generator.constLit7});
    constCons5023 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec0, (IStrategoList)generator.constNil7);
    constLocalVarDec0 = termFactory.makeAppl(SpoofaxGenerator._consLocalVarDec_3, new IStrategoTerm[]{generator.constNil7, generator.constBoolean0, generator.constCons5023});
    constLocalVarDecStm0 = termFactory.makeAppl(SpoofaxGenerator._consLocalVarDecStm_1, new IStrategoTerm[]{generator.constLocalVarDec0});
    constTypeName23 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId28});
    constClassOrInterfaceType8 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName23, generator.constNone0});
    const7717 = termFactory.makeString("getResourceAsStream");
    constId56 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7717});
    constCons5024 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName10, (IStrategoList)generator.constNil7);
    constCons5025 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName11, (IStrategoList)generator.constNil7);
    constTypeName24 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId27});
    constClassOrInterfaceType9 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName24, generator.constNone0});
    constParam2 = termFactory.makeAppl(SpoofaxGenerator._consParam_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType9, generator.constId37});
    const7718 = termFactory.makeString("I/O problem loading descriptor for ");
    constChars5 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7718});
    constCons5026 = (IStrategoTerm)termFactory.makeListCons(generator.constChars5, (IStrategoList)generator.constNil7);
    constString22 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5026});
    constLit8 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString22});
    const7719 = termFactory.makeString("LANGUAGE");
    constId57 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7719});
    constExprName12 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId57});
    constPlus10 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit8, generator.constExprName12});
    const7720 = termFactory.makeString(" plugin");
    constChars6 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7720});
    constCons5027 = (IStrategoTerm)termFactory.makeListCons(generator.constChars6, (IStrategoList)generator.constNil7);
    constString23 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5027});
    constLit9 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString23});
    constPlus11 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus10, generator.constLit9});
    constCons5028 = (IStrategoTerm)termFactory.makeListCons(generator.constPlus11, (IStrategoList)generator.constCons4995);
    constNewInstance8 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType4, generator.constCons5028, generator.constNone0});
    constThrow4 = termFactory.makeAppl(SpoofaxGenerator._consThrow_1, new IStrategoTerm[]{generator.constNewInstance8});
    constCons5029 = (IStrategoTerm)termFactory.makeListCons(generator.constThrow4, (IStrategoList)generator.constNil7);
    constAmbName3 = termFactory.makeAppl(SpoofaxGenerator._consAmbName_1, new IStrategoTerm[]{generator.constId17});
    const7721 = termFactory.makeString("logException");
    constId58 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7721});
    constMethodName7 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_2, new IStrategoTerm[]{generator.constAmbName3, generator.constId58});
    constMethod10 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName7});
    constInvoke11 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod10, generator.constCons5028});
    constExprStm8 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constInvoke11});
    constCons5030 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm8, (IStrategoList)generator.constCons5029);
    constCons5031 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm3, (IStrategoList)generator.constCons5030);
    constBlock7 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5031});
    constCatch1 = termFactory.makeAppl(SpoofaxGenerator._consCatch_2, new IStrategoTerm[]{generator.constParam2, generator.constBlock7});
    constCons5032 = (IStrategoTerm)termFactory.makeListCons(generator.constCatch1, (IStrategoList)generator.constNil7);
    const7722 = termFactory.makeString("Bad descriptor for ");
    constChars7 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7722});
    constCons5033 = (IStrategoTerm)termFactory.makeListCons(generator.constChars7, (IStrategoList)generator.constNil7);
    constString24 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5033});
    constLit10 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString24});
    constPlus12 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit10, generator.constExprName12});
    constPlus13 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus12, generator.constLit9});
    constCons5034 = (IStrategoTerm)termFactory.makeListCons(generator.constPlus13, (IStrategoList)generator.constCons4995);
    constNewInstance9 = termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType4, generator.constCons5034, generator.constNone0});
    constThrow5 = termFactory.makeAppl(SpoofaxGenerator._consThrow_1, new IStrategoTerm[]{generator.constNewInstance9});
    constCons5035 = (IStrategoTerm)termFactory.makeListCons(generator.constThrow5, (IStrategoList)generator.constNil7);
    constInvoke12 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod10, generator.constCons5034});
    constExprStm9 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constInvoke12});
    constCons5036 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm9, (IStrategoList)generator.constCons5035);
    constCons5037 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm3, (IStrategoList)generator.constCons5036);
    constBlock8 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5037});
    constCatch2 = termFactory.makeAppl(SpoofaxGenerator._consCatch_2, new IStrategoTerm[]{generator.constParam1, generator.constBlock8});
    constCons5038 = (IStrategoTerm)termFactory.makeListCons(generator.constCatch2, (IStrategoList)generator.constCons5032);
    constSynchronized0 = termFactory.makeAppl(SpoofaxGenerator._consSynchronized_0, NO_TERMS);
    constCons5039 = (IStrategoTerm)termFactory.makeListCons(generator.constSynchronized0, (IStrategoList)generator.constNil7);
    constCons5040 = (IStrategoTerm)termFactory.makeListCons(generator.constStatic0, (IStrategoList)generator.constCons5039);
    constCons5041 = (IStrategoTerm)termFactory.makeListCons(generator.constProtected0, (IStrategoList)generator.constCons5040);
    const7723 = termFactory.makeString("setDescriptor");
    constId59 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7723});
    constParam3 = termFactory.makeAppl(SpoofaxGenerator._consParam_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType0, generator.constId46});
    constCons5042 = (IStrategoTerm)termFactory.makeListCons(generator.constParam3, (IStrategoList)generator.constNil7);
    constMethodDecHead5 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons5041, generator.constNone0, generator.constVoid0, generator.constId59, generator.constCons5042, generator.constNone0});
    constCons5043 = (IStrategoTerm)termFactory.makeListCons(generator.constPublic0, (IStrategoList)generator.constCons5040);
    constMethodDecHead6 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons5043, generator.constNone0, generator.constClassOrInterfaceType0, generator.constId13, generator.constNil7, generator.constNone0});
    constSome3 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constExprName6});
    constReturn1 = termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{generator.constSome3});
    constCons5044 = (IStrategoTerm)termFactory.makeListCons(generator.constReturn1, (IStrategoList)generator.constNil7);
    constEq2 = termFactory.makeAppl(SpoofaxGenerator._consEq_2, new IStrategoTerm[]{generator.constExprName6, generator.constLit0});
    constMethodName8 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_1, new IStrategoTerm[]{generator.constId45});
    constMethod11 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName8});
    constInvoke13 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod11, generator.constNil7});
    constExprStm10 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constInvoke13});
    constIf6 = termFactory.makeAppl(SpoofaxGenerator._consIf_2, new IStrategoTerm[]{generator.constEq2, generator.constExprStm10});
    constCons5045 = (IStrategoTerm)termFactory.makeListCons(generator.constIf6, (IStrategoList)generator.constCons5044);
    constCons5046 = (IStrategoTerm)termFactory.makeListCons(generator.constIf0, (IStrategoList)generator.constCons5045);
    constBlock9 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5046});
    constMethodDec2 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead6, generator.constBlock9});
    constVarDec1 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_1, new IStrategoTerm[]{generator.constId32});
    constCons5047 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec1, (IStrategoList)generator.constNil7);
    constFieldDec0 = termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5005, generator.constClassOrInterfaceType1, generator.constCons5047});
    constVolatile0 = termFactory.makeAppl(SpoofaxGenerator._consVolatile_0, NO_TERMS);
    constCons5048 = (IStrategoTerm)termFactory.makeListCons(generator.constVolatile0, (IStrategoList)generator.constNil7);
    constCons5049 = (IStrategoTerm)termFactory.makeListCons(generator.constStatic0, (IStrategoList)generator.constCons5048);
    constCons5050 = (IStrategoTerm)termFactory.makeListCons(generator.constPrivate0, (IStrategoList)generator.constCons5049);
    constVarDec2 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_1, new IStrategoTerm[]{generator.constId46});
    constCons5051 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec2, (IStrategoList)generator.constNil7);
    constFieldDec1 = termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5050, generator.constClassOrInterfaceType0, generator.constCons5051});
    constFinal0 = termFactory.makeAppl(SpoofaxGenerator._consFinal_0, NO_TERMS);
    constCons5052 = (IStrategoTerm)termFactory.makeListCons(generator.constFinal0, (IStrategoList)generator.constNil7);
    constCons5053 = (IStrategoTerm)termFactory.makeListCons(generator.constStatic0, (IStrategoList)generator.constCons5052);
    constCons5054 = (IStrategoTerm)termFactory.makeListCons(generator.constPrivate0, (IStrategoList)generator.constCons5053);
    const7724 = termFactory.makeString("/include/");
    constChars8 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7724});
    constCons5055 = (IStrategoTerm)termFactory.makeListCons(generator.constChars8, (IStrategoList)generator.constNil7);
    constString25 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5055});
    constLit11 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString25});
    constPlus14 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constLit11, generator.constExprName12});
    const7725 = termFactory.makeString(".packed.esv");
    constChars9 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7725});
    constCons5056 = (IStrategoTerm)termFactory.makeListCons(generator.constChars9, (IStrategoList)generator.constNil7);
    constString26 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5056});
    constLit12 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString26});
    constPlus15 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus14, generator.constLit12});
    constVarDec3 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId54, generator.constPlus15});
    constCons5057 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec3, (IStrategoList)generator.constNil7);
    constFieldDec2 = termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5054, generator.constClassOrInterfaceType5, generator.constCons5057});
    constChars10 = termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{generator.const7670});
    constCons5058 = (IStrategoTerm)termFactory.makeListCons(generator.constChars10, (IStrategoList)generator.constNil7);
    constString27 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.constCons5058});
    constLit13 = termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{generator.constString27});
    constPlus16 = termFactory.makeAppl(SpoofaxGenerator._consPlus_2, new IStrategoTerm[]{generator.constPlus14, generator.constLit13});
    constVarDec4 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId53, generator.constPlus16});
    constCons5059 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec4, (IStrategoList)generator.constNil7);
    constFieldDec3 = termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5054, generator.constClassOrInterfaceType5, generator.constCons5059});
    constCons5060 = (IStrategoTerm)termFactory.makeListCons(generator.constPublic0, (IStrategoList)generator.constCons5053);
    constClassBody0 = termFactory.makeAppl(SpoofaxGenerator._consClassBody_1, new IStrategoTerm[]{generator.constNil7});
    const7726 = termFactory.makeString("Generated");
    const7727 = termFactory.makeString("31954");
    const7728 = termFactory.makeString("Could not pack descriptor files");
    const7729 = termFactory.makeString("META-INF/MANIFEST.MF");
    const7730 = termFactory.makeString("Manifest-Version: 1.0\nBundle-ManifestVersion: 2\nBundle-Name: ");
    const7731 = termFactory.makeString(" Plug-in\nBundle-SymbolicName: ");
    const7732 = termFactory.makeString("; singleton:=true\nBundle-Version: 1.0.0\nBundle-Activator: ");
    const7733 = termFactory.makeString(".Activator\nImport-Package: org.osgi.framework;version=\"1.3.0\"\nRequire-Bundle: org.eclipse.core.runtime,\n  org.eclipse.core.resources,\n  org.eclipse.imp.runtime,\n  org.eclipse.ui,\n  lpg.runtime,\n  org.eclipse.jface.text,\n  org.eclipse.ui.editors,\n  org.eclipse.ui.workbench.texteditor,\n  org.strategoxt.imp.runtime,\n  org.spoofax.jsglr,\n  org.strategoxt.strj\nBundle-RequiredExecutionEnvironment: J2SE-1.5\nBundle-ActivationPolicy: lazy\nExport-Package: ");
    const7734 = termFactory.makeString("META-INF");
    constCons5061 = (IStrategoTerm)termFactory.makeListCons(generator.const7734, (IStrategoList)generator.constNil7);
    const7735 = termFactory.makeString("MANIFEST.MF");
    const7736 = termFactory.makeString(".settings/org.eclipse.jdt.core.prefs");
    const7737 = termFactory.makeString("eclipse.preferences.version=1\norg.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled\norg.eclipse.jdt.core.compiler.codegen.targetPlatform=1.5\norg.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve\norg.eclipse.jdt.core.compiler.compliance=1.5\norg.eclipse.jdt.core.compiler.debug.lineNumber=generate\norg.eclipse.jdt.core.compiler.debug.localVariable=generate\norg.eclipse.jdt.core.compiler.debug.sourceFile=generate\norg.eclipse.jdt.core.compiler.problem.assertIdentifier=error\norg.eclipse.jdt.core.compiler.problem.enumIdentifier=error\norg.eclipse.jdt.core.compiler.source=1.5\n");
    constCons5062 = (IStrategoTerm)termFactory.makeListCons(generator.const7737, (IStrategoList)generator.constNil7);
    const7738 = termFactory.makeString(".settings");
    constCons5063 = (IStrategoTerm)termFactory.makeListCons(generator.const7738, (IStrategoList)generator.constNil7);
    const7739 = termFactory.makeString("org.eclipse.jdt.core.prefs");
    const7740 = termFactory.makeString("editor/java/strategies/InteropRegisterer.java");
    const7741 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-java-strategy-1'");
    const7742 = termFactory.makeString(" { java_strategy_0_0.instance });\n  }\n}\n");
    constCons5064 = (IStrategoTerm)termFactory.makeListCons(generator.const7742, (IStrategoList)generator.constNil7);
    constCons5065 = (IStrategoTerm)termFactory.makeListCons(generator.const7068, (IStrategoList)generator.constCons5064);
    constCons5066 = (IStrategoTerm)termFactory.makeListCons(generator.const7067, (IStrategoList)generator.constCons5065);
    const7743 = termFactory.makeString(".strategies;\n\nimport org.strategoxt.lang.JavaInteropRegisterer;\nimport org.strategoxt.lang.Strategy;\n\n/**\n * Helper class for {@link java_strategy_0_0}.\n */\npublic class InteropRegisterer extends JavaInteropRegisterer {\n\n  public InteropRegisterer() {\n    super(new Strategy");
    constCons5067 = (IStrategoTerm)termFactory.makeListCons(generator.const7743, (IStrategoList)generator.constCons5066);
    const7744 = termFactory.makeString("strategies");
    constCons5068 = (IStrategoTerm)termFactory.makeListCons(generator.const7744, (IStrategoList)generator.constNil7);
    const7745 = termFactory.makeString("InteropRegisterer.java");
    const7746 = termFactory.makeString("editor/java/strategies/java_strategy_0_0.java");
    const7747 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-java-strategy-2'");
    const7748 = termFactory.makeString(".strategies;\n\nimport org.spoofax.interpreter.terms.IStrategoTerm;\nimport org.spoofax.interpreter.terms.ITermFactory;\nimport org.strategoxt.lang.Context;\nimport org.strategoxt.lang.Strategy;\n\n/**\n * Example Java strategy implementation.\n *\n * This strategy can be used by editor services and can be called\n * in Stratego modules by declaring it as an external strategy\n * as follows:\n *\n * <code>\n *  external java-strategy(|)\n * </code>\n *\n * @see InteropRegisterer  This class registers java_strategy_0_0 for use.\n */\npublic class java_strategy_0_0 extends Strategy {\n  \n  public static java_strategy_0_0 instance = new java_strategy_0_0();\n\n  @Override\n  public IStrategoTerm invoke(Context context, IStrategoTerm current) {\n    context.getIOAgent().printError(\"Input for java-strategy: \" + current);\n    ITermFactory factory = context.getFactory();\n    return factory.makeString(\"Regards from java-strategy\");\n  }\n\n}\n");
    constCons5069 = (IStrategoTerm)termFactory.makeListCons(generator.const7748, (IStrategoList)generator.constNil7);
    const7749 = termFactory.makeString("java_strategy_0_0.java");
    const7750 = termFactory.makeString("editor/java/strategies/Main.java");
    const7751 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-java-strategy-3'");
    const7752 = termFactory.makeString(".strategies;\n\nimport org.strategoxt.lang.Context;\n\npublic class Main {\n  \n  public static void init(Context context) {\n    // Called when the editor is being initialized\n  }\n\n}\n");
    constCons5070 = (IStrategoTerm)termFactory.makeListCons(generator.const7752, (IStrategoList)generator.constNil7);
    const7753 = termFactory.makeString("Main.java");
    const7754 = termFactory.makeString("%% Grammar for the ");
    const7755 = termFactory.makeString(" language\n%% By default, based on an example \"entities\" syntax\nmodule ");
    const7756 = termFactory.makeString("\n\nimports Common\n\nexports\n\n  context-free start-symbols\n    ");
    const7757 = termFactory.makeString("\n\n  context-free syntax\n  \n    \"module\" ID Definition*       -> ");
    const7758 = termFactory.makeString(" {cons(\"Module\")}\n    \"entity\" ID \"{\" Property* \"}\" -> Definition {cons(\"Entity\")}\n    ID \":\" Type                   -> Property {cons(\"Property\")}\n    ID                            -> Type {cons(\"Type\")}\n");
    const7759 = termFactory.makeString("syntax/Common.sdf");
    const7760 = termFactory.makeString("module Common\n\nexports\n\n  lexical syntax\n  \n    [a-zA-Z][a-zA-Z0-9]* -> ID\n    \"-\"? [0-9]+          -> INT\n    \n    \"\\\"\" StringChar* \"\\\"\" -> STRING\n    ~[\\\"\\n]               -> StringChar\n    \"\\\\\\\"\"                -> StringChar\n    BackSlashChar         -> StringChar\n    \"\\\\\"                  -> BackSlashChar\n    \n    [\\ \\t\\n\\r] -> LAYOUT\n    \n    [\\*]                             -> CommentChar\n    \"/*\" (~[\\*] | CommentChar)* \"*/\" -> LAYOUT\n    \"//\" ~[\\n\\r]* ([\\n\\r] | EOF)     -> LAYOUT\n    \n    -> EOF\n  \n  lexical restrictions\n  \n    %% Ensure greedy matching for lexicals\n  \n    CommentChar   -/- [\\/]\n    INT           -/- [0-9]\n    ID            -/- [a-zA-Z0-9\\_]\n    \n    %% EOF may not be followed by any char\n    \n    EOF           -/- ~[]\n\n    %% Backslash chars in strings may not be followed by \" \n    \n    BackSlashChar -/- [\\\"]\n\n  context-free restrictions\n  \n    %% Ensure greedy matching for comments\n\n    LAYOUT? -/- [\\ \\t\\n\\r]\n    LAYOUT? -/- [\\/].[\\/]\n    LAYOUT? -/- [\\/].[\\*]\n");
    constCons5071 = (IStrategoTerm)termFactory.makeListCons(generator.const7760, (IStrategoList)generator.constNil7);
    const7761 = termFactory.makeString("Common.sdf");
    const7762 = termFactory.makeString("trans/");
    const7763 = termFactory.makeString(".str");
    const7764 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-example-trans'");
    const7765 = termFactory.makeString("\n          ");
    const7766 = termFactory.makeString("\n                                                  ");
    const7767 = termFactory.makeString("[Hover help: [<write-to-string> target]]\n\n  // Completes an identifier when the user presses control-space\n  // (the completion identifier in the AST provides additional context information)\n  editor-complete:\n    (node, position, ast, path, project-path) ->\n    [\"String\", \"Int\" | proposals]\n    where\n      if !node => Type(COMPLETION(prefix)) then\n        proposals := <all-keys-GetEntity>\n      end\n");
    constCons5072 = (IStrategoTerm)termFactory.makeListCons(generator.const7767, (IStrategoList)generator.constNil7);
    constCons5073 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5072);
    const7768 = termFactory.makeString("-Builders and -References.esv)\n  \n  // Analyzes the current program, returning a tuple with errors, warnings, and notes;\n  // each a list of (term, message) tuples or simply (message) terms.\n  editor-analyze:\n    (ast, path, project-path) -> (ast, errors, warnings, notes)\n    with\n      editor-init;\n      analyze;\n      errors   := <collect-all(constraint-error, conc)> ast;\n      warnings := <collect-all(constraint-warning, conc)> ast;\n      notes    := <collect-all(constraint-note, conc)> ast\n  \n  // Transforms a selection to Java\n  generate-java:\n    (selected, position, ast, path, project-path) -> (filename, result)\n    with\n      filename := <guarantee-extension(|\"java\")> path;\n      result   := <to-java> selected\n  \n  // Prints the abstract syntax ATerm of a selection.\n  generate-aterm:\n    (selected, position, ast, path, project-path) -> (filename, result)\n    with\n      filename := <guarantee-extension(|\"aterm\")> path;\n      result   := selected // we just return the input term\n  \n  // Resolves a reference when the user control-clicks or presses F3 in the editor.\n  // Only succeeds for nodes of the form Type(_) for which GetEntity is defined.\n  editor-resolve:\n    (node, position, ast, path, project-path) -> target\n    where\n      <debug(!\"Resolve: \")> node; \n      Type(type) := node; \n      target     := <GetEntity> type\n\n  // Returns \"hover help\" information for a particular node in the editor.\n  // For references, this rule is invoked using the resolved term.\n  editor-hover:\n    (target, position, ast, path, project-path) -> ");
    constCons5074 = (IStrategoTerm)termFactory.makeListCons(generator.const7768, (IStrategoList)generator.constCons5073);
    const7769 = termFactory.makeString("\n  lib/editor-common.generated\n  check\n  generate\n  refactor\n\nrules // Main editor interface (defined by editor/");
    const7770 = termFactory.makeString("\n\nimports\n  libstratego-lib\n  libstratego-gpp\n  libstratego-aterm\n  include/");
    const7771 = termFactory.makeString("trans");
    constCons5075 = (IStrategoTerm)termFactory.makeListCons(generator.const7771, (IStrategoList)generator.constNil7);
    constCons5076 = (IStrategoTerm)termFactory.makeListCons(generator.const7763, (IStrategoList)generator.constNil7);
    const7772 = termFactory.makeString("trans/generate.str");
    const7773 = termFactory.makeString("\n  ]\n  \n  to-java:\n    Type(t) -> t\n\n  to-java:\n    t* -> <map(to-java)> t*\n");
    constCons5077 = (IStrategoTerm)termFactory.makeListCons(generator.const7773, (IStrategoList)generator.constNil7);
    constCons5078 = (IStrategoTerm)termFactory.makeListCons(generator.const7180, (IStrategoList)generator.constCons5077);
    const7774 = termFactory.makeString("\n          this.[x] = [x];    \n      ");
    constCons5079 = (IStrategoTerm)termFactory.makeListCons(generator.const7774, (IStrategoList)generator.constCons5078);
    constCons5080 = (IStrategoTerm)termFactory.makeListCons(generator.const7179, (IStrategoList)generator.constCons5079);
    const7775 = termFactory.makeString("\n      \n      public void set_[x] ([t] [x]) ");
    constCons5081 = (IStrategoTerm)termFactory.makeListCons(generator.const7775, (IStrategoList)generator.constCons5080);
    constCons5082 = (IStrategoTerm)termFactory.makeListCons(generator.const7180, (IStrategoList)generator.constCons5081);
    const7776 = termFactory.makeString("\n          return [x];\n      ");
    constCons5083 = (IStrategoTerm)termFactory.makeListCons(generator.const7776, (IStrategoList)generator.constCons5082);
    constCons5084 = (IStrategoTerm)termFactory.makeListCons(generator.const7179, (IStrategoList)generator.constCons5083);
    const7777 = termFactory.makeString("[\n      private [t] [x];\n      \n      public [t] get_[x] ");
    constCons5085 = (IStrategoTerm)termFactory.makeListCons(generator.const7777, (IStrategoList)generator.constCons5084);
    constCons5086 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5085);
    const7778 = termFactory.makeString("\n     ]\n    with\n      p'* := <to-java> p*\n\n  to-java:\n    Property(x, Type(t)) -> ");
    constCons5087 = (IStrategoTerm)termFactory.makeListCons(generator.const7778, (IStrategoList)generator.constCons5086);
    constCons5088 = (IStrategoTerm)termFactory.makeListCons(generator.const7180, (IStrategoList)generator.constCons5087);
    constCons5089 = (IStrategoTerm)termFactory.makeListCons(generator.const7531, (IStrategoList)generator.constCons5088);
    constCons5090 = (IStrategoTerm)termFactory.makeListCons(generator.const7179, (IStrategoList)generator.constCons5089);
    const7779 = termFactory.makeString("[ class [x] ");
    constCons5091 = (IStrategoTerm)termFactory.makeListCons(generator.const7779, (IStrategoList)generator.constCons5090);
    constCons5092 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5091);
    const7780 = termFactory.makeString("[ package [x];\n       \n       [d'*]\n     ]\n    with\n      d'* := <to-java> d*\n  \n  to-java:\n    Entity(x, p*) ->\n    ");
    constCons5093 = (IStrategoTerm)termFactory.makeListCons(generator.const7780, (IStrategoList)generator.constCons5092);
    constCons5094 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5093);
    const7781 = termFactory.makeString("\n  lib/editor-common.generated\n\nrules\n\n  to-java:\n    Module(x, d*) ->\n    ");
    constCons5095 = (IStrategoTerm)termFactory.makeListCons(generator.const7781, (IStrategoList)generator.constCons5094);
    const7782 = termFactory.makeString("module generate\n\nimports\n  libstratego-lib\n  libstratego-gpp\n  libstratego-aterm\n  include/");
    const7783 = termFactory.makeString("generate.str");
    const7784 = termFactory.makeString("trans/check.str");
    const7785 = termFactory.makeString("[This is just an example program in the \"entities\" language\n                                      (this note is defined in trans/check.str) ])\n");
    constCons5096 = (IStrategoTerm)termFactory.makeListCons(generator.const7785, (IStrategoList)generator.constNil7);
    constCons5097 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5096);
    const7786 = termFactory.makeString("[Entity names must start with a capital])\n    where\n      not(<string-starts-with-capital> x)\n  \n  constraint-note:\n    Module(x @ \"example\", _) -> (x, ");
    constCons5098 = (IStrategoTerm)termFactory.makeListCons(generator.const7786, (IStrategoList)generator.constCons5097);
    constCons5099 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5098);
    const7787 = termFactory.makeString("[Duplicate entity name])\n    where\n      not(<bagof-GetEntity> x => [_])\n  \n  constraint-warning:\n    Entity(x, _) -> (x, ");
    constCons5100 = (IStrategoTerm)termFactory.makeListCons(generator.const7787, (IStrategoList)generator.constCons5099);
    constCons5101 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5100);
    const7788 = termFactory.makeString("[Type [type] is not defined])\n    where\n      not(!type => \"String\"); // String and Int are built-in types\n      not(!type => \"Int\");\n      not(<GetEntity> type) // no entity for this type\n  \n  // Reports an error if an entity is defined more than once.\n  // This constraint is implemented by testing if the \"bag\" of\n  // all entities x is not a singleton list.\n  constraint-error:\n    Entity(x, _) -> (x, ");
    constCons5102 = (IStrategoTerm)termFactory.makeListCons(generator.const7788, (IStrategoList)generator.constCons5101);
    constCons5103 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5102);
    const7789 = termFactory.makeString("\n  lib/editor-common.generated\n\nrules\n\n  // Analysis: does a topdown traversal of the tree,\n  // and tries to apply the record-entity rule.\n  analyze:\n    t -> t\n    with\n      <topdown(try(record-entity))> t\n\n  // Records the definition of an entity in a dynamic rule GetEntity.\n  record-entity:\n    Entity(x, body) -> Entity(x, body)\n    with\n      // For a name 'x', GetEntity will return the original 'x' tree node\n      rules(\n        GetEntity :+ x -> x\n      )\nrules\n    \n  // Reports an error if a property type is undefined.\n  // This error is reported on the type name 'type'.\n  constraint-error:\n    Property(x, Type(type)) -> (type, ");
    constCons5104 = (IStrategoTerm)termFactory.makeListCons(generator.const7789, (IStrategoList)generator.constCons5103);
    const7790 = termFactory.makeString("module check\n\nimports\n  libstratego-lib\n  include/");
    const7791 = termFactory.makeString("check.str");
    const7792 = termFactory.makeString("trans/refactor.str");
    const7793 = termFactory.makeString("\", \"rename\", \"Rename entity:\", \"\"); \n      new-ast  := <topdown(try(rename-type(|selected-name, new-name)))> ast\n\n  rename-type(|old-name, new-name):\n    Entity(old-name, y) -> Entity(new-name, y)\n\n  rename-type(|old-name, new-name):\n    Type(old-name) -> Type(new-name)\n\n");
    constCons5105 = (IStrategoTerm)termFactory.makeListCons(generator.const7793, (IStrategoList)generator.constNil7);
    const7794 = termFactory.makeString("\n  lib/editor-common.generated  \n\nrules\n \n  rename-entity:\n    (selected-name, position, ast, path, project-path) -> [(ast, new-ast)]\n    with\n      new-name := <input-dialog> (\"");
    const7795 = termFactory.makeString("module refactor\n\nimports\n  lib/refactor-common.generated\n  include/");
    const7796 = termFactory.makeString("refactor.str");
    const7797 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'create-example-file'");
    const7798 = termFactory.makeString("module example\n\n// Example \"");
    const7799 = termFactory.makeString("\" program (see src/");
    const7800 = termFactory.makeString(" -Definitions.spx for the language definition)\n\nentity User {\n  name     : String\n  password : String\n  homepage : URL\n}\n\nentity BlogPosting {\n  poster : User\n  body   : String\n}\n\nentity URL {\n  location : String\n}");
    const7801 = termFactory.makeString("test");
    constCons5106 = (IStrategoTerm)termFactory.makeListCons(generator.const7801, (IStrategoList)generator.constNil7);
    const7802 = termFactory.makeString("example");
    const7803 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-common-trans'");
    const7804 = termFactory.makeString(".str module. However,\n  // to ensure that the example transformation doesn't break when the\n  // syntax is changed, we also hard-coded them here.\n          \n  Module   : ID * List(Entity)   -> Module\n  Entity   : ID * List(Property) -> Entity\n  Property : ID * Type           -> Property\n  Type     : ID                  -> Type\n\nstrategies\n  \n  // Set markers for a given file. Use when checking files from a queued strategy.\n  // Current term: (ast-desugared, errors, warnings, notes) tuple\n  // ast: the root node of the file to set markers on \n  set-markers(|ast) = prim(\"SSL_EXT_set_markers\", ast)\n\n  // Indicate that one or more files need analysis. \n  // Current term: ss a list of absolute file paths, or a single absolute file path to analyze\n  queue-analysis = \n       (is-list; list-loop(queue-analysis))\n    <+ prim(\"SSL_EXT_queue_analysis\")\n\n  // Set the total number of work units to complete. Can be called multiple times. \n  // Current term: number of work units (int).\n  set-total-work-units = prim(\"SSL_EXT_set_total_work_units\")\n  \n  // Complete one work unit and update progress monitors.\n  // Current term: ignored\n  complete-work-unit = prim(\"SSL_EXT_complete_work_unit\")\n  \n  // Queue a strategy for background processing with a progress indicator.\n  // Current term: the term to pass to the background strategy\n  // s: the strategy, as string\n  // description: name of the task (will be shown in progress view)\n  queue-strategy(|s,description) = prim(\"SSL_EXT_queue_strategy\", s, description)\n  \n  // Return the result of this strategy to indicate a non-completed (backgrounded) analysis.\n  // Editor services (hover, resolve) will be delayed until a complete analysis is performed. \n  set-analysis-backgrounded = !\"BACKGROUNDED\"\n  \n");
    constCons5107 = (IStrategoTerm)termFactory.makeListCons(generator.const7804, (IStrategoList)generator.constNil7);
    const7805 = termFactory.makeString(".str file. These definitions should also be automatically \n  // generated in the imported include/");
    const7806 = termFactory.makeString(")> ast''\n   \n  at-position(s|position):\n    c#(t*) -> t'\n    where\n      !position => [i | position']\n    where\n      t' := c#(<at-index(at-position(s|position'))> (i, t*))\n\n  at-position(s|position):\n    t -> t'\n    where\n      !position => [];\n      t' := <s> t\n\n  position-of-term(is-term):\n    t -> []\n    where\n      is-term\n  \n  position-of-term(is-term):\n    _#(t*) -> <position-of-term(is-term|0)> t*\n  \n  position-of-term(is-term|start-index):\n    [t | t*] -> position\n    where\n      if i* := <position-of-term(is-term)> t then\n        position := [start-index | i*]\n      else\n        position := <position-of-term(is-term | <inc> start-index)> t*\n      end\n\n  term-at-position(|position):\n    t -> t'\n    where\n      at-position(?t'|position) \n\n  parent-at-position(|position):\n    t -> t'\n    where\n      !position => [i, _];\n      t' := <subterm-at(|i)> t\n  \n  parent-at-position(|position):\n    t -> <parent-at-position(|position')> t'\n    where\n      !position => [i | position' @ [_, _ | _]];\n      t' := <subterm-at(|i)> t\n\n  subterm-at(|index):\n    _#(t*) -> <index(|<inc> index)> t*\n  \nsignature constructors\n\n  COMPLETION : String -> Term\n  NOCONTEXT  : Term   -> Term\n  MARKER     : Term\n\n  // Below are copies of the signatures of the terms used in example\n  // trans/");
    const7807 = termFactory.makeString(".pp.af)>]);\n    box2text-string(|100)\n\nstrategies\n  \n  /**\n   * Processes an import during semantic analysis.\n   * Ensures proper caching of files and prevents\n   * processing duplicate imports more than once.\n   *\n   * @param resolve-path  Resolves the filesystem path of this import\n   * @param parse-file    Parses a file (optionally removing definition bodies\n   *                      so only signatures are stored in the cache)\n   * @param record-declarations\n   *                      Performs semantic analysis on a tree\n   */\n  open-import(resolve-path, parse-file, record-declarations):\n    import -> import\n    where\n      if not(!import => COMPLETION(_)) then\n        path       := <resolve-path> import;\n        cache-path := <import-cache-path> path;\n        if not(<IsImported> path) then\n          rules(\n            IsImported: path\n          );\n          ( <is-newer> (cache-path, path);\n            file := <ReadFromFile> cache-path\n          <+\n            file := <parse-file> path;\n            if <file-exists> path then\n              // Only cache if on filesystem (e.g., ignore libstratego-lib)\n              <WriteToBinaryFile> (cache-path, file)\n            end        \n          );\n          ");
    const7808 = termFactory.makeString("-string =\n    parse-string(\n      strsglr-report-parse-error\n    | <import-term(include/");
    const7809 = termFactory.makeString("-string\n  parse-");
    const7810 = termFactory.makeString("module lib/editor-common.generated\n\nimports\n  libstratego-lib\n  libstratego-sglr\n  libstratego-gpp\n\nstrategies\n\n  parse-file = parse-");
    const7811 = termFactory.makeString("lib");
    constCons5108 = (IStrategoTerm)termFactory.makeListCons(generator.const7811, (IStrategoList)generator.constNil7);
    constCons5109 = (IStrategoTerm)termFactory.makeListCons(generator.const7206, (IStrategoList)generator.constCons5108);
    const7812 = termFactory.makeString("editor-common.generated.spx");
    const7813 = termFactory.makeString(".generated.pp.af)\n	\n");
    constCons5110 = (IStrategoTerm)termFactory.makeListCons(generator.const7813, (IStrategoList)generator.constNil7);
    const7814 = termFactory.makeString("module lib/refactor-common.generated\n\nimports\n  libstratego-lib\n  lib/editor-common.generated\n  \n\nstrategies //transformation\n\n/**\n * Replaces elements in a list (once, starting from the right)\n * @param match strategy for partial list\n * @param new elements List(b)\n * @type List(a) -> List(a,b)\n */\nreplace-sublist(match-sublist|new-elems): \n  list -> <\n    at-suffix(match-sublist;!new-elems) <+\n    (\n      init; \n      replace-sublist(match-sublist|new-elems);\n      at-end(![<last> list])\n    )\n  > list \n\n/**\n * Inserts an element at a given AST position\n * @param List(Int), denoting an AST position\n * @param inserted list element \n * @type Term -> Term\n */\ninsert-elem(|pos, elem)=\n  insert-sublist(|pos, [elem])\n\n/**\n * Inserts a list of elements at a given AST position\n * @param List(Int), denoting an AST position\n * @param inserted list elements \n * @type Term -> Term\n */	\ninsert-sublist(|pos, elems)=\n  at-position(\n    split-at(|<last> pos);\n    ?(prefix, suffix);\n    <concat>[prefix, elems, suffix]\n    |<init> pos\n  )\n\n\nstrategies //user-input\n\n/**\n * Opens an input dialog for one string value that represents an identifier\n * The language is used to check if the input value matches the identifier pattern\n * @type (String, String, String, String) -> String\n */\ninput-dialog:\n  (language, title, label, default-value) -> <prim(\"SSL_EXT_newnamedialog\", language, title, label, default-value)>\n  \ninput-dialog:\n  (title, label, default-value) -> <input-dialog>(\"\", title, label, default-value)\n\nstrategies //pp-table\n	\nget-pp-table=\n  import-term(include/");
    const7815 = termFactory.makeString("refactor-common.generated.str");
    const7816 = termFactory.makeString(".classpath");
    const7817 = termFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<classpath>\n	<classpathentry kind=\"src\" excluding=\"trans/**\" path=\"editor/java\"/>\n	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5\"/>\n	<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>\n	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.junit.JUNIT_CONTAINER/4\"/>\n	<classpathentry kind=\"output\" path=\"bin\"/>\n</classpath>\n");
    constCons5111 = (IStrategoTerm)termFactory.makeListCons(generator.const7817, (IStrategoList)generator.constNil7);
    const7818 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'builder-xml-name'");
    const7819 = termFactory.makeString(" build.main.xml.launch");
    constCons5112 = (IStrategoTerm)termFactory.makeListCons(generator.const7819, (IStrategoList)generator.constNil7);
    const7820 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-builder-xml'");
    const7821 = termFactory.makeString(".externalToolBuilders/");
    const7822 = termFactory.makeString("\n                                              ");
    const7823 = termFactory.makeString("Project name not specified, cannot regenerate ");
    const7824 = termFactory.makeString("\n                                                                                          ");
    const7825 = termFactory.makeString("\n                                                                                                   ");
    const7826 = termFactory.makeString("}\"/>\n<stringAttribute key=\"process_factory_id\" value=\"org.eclipse.ant.ui.remoteAntProcessFactory\"/>\n</launchConfiguration>\n");
    constCons5113 = (IStrategoTerm)termFactory.makeListCons(generator.const7826, (IStrategoList)generator.constNil7);
    const7827 = termFactory.makeString("{workspace_loc:/");
    const7828 = termFactory.makeString("/build.main.xml}\"/>\n<stringAttribute key=\"org.eclipse.ui.externaltools.ATTR_WORKING_DIRECTORY\" value=\"");
    const7829 = termFactory.makeString("{none}\"/>\n<stringAttribute key=\"org.eclipse.ui.externaltools.ATTR_LOCATION\" value=\"");
    const7830 = termFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<launchConfiguration type=\"org.eclipse.ant.AntLaunchConfigurationType\">\n<stringAttribute key=\"bad_container_name\" value=\".externalToolBuilders\"/>\n<booleanAttribute key=\"org.eclipse.ant.ui.DEFAULT_VM_INSTALL\" value=\"false\"/>\n<listAttribute key=\"org.eclipse.debug.core.MAPPED_RESOURCE_PATHS\"/>\n<listAttribute key=\"org.eclipse.debug.core.MAPPED_RESOURCE_TYPES\"/>\n<booleanAttribute key=\"org.eclipse.debug.ui.ATTR_LAUNCH_IN_BACKGROUND\" value=\"false\"/>\n<listAttribute key=\"org.eclipse.jdt.launching.CLASSPATH\">\n<listEntry value=\"&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;no&quot;?&gt;&#10;&lt;runtimeClasspathEntry containerPath=&quot;org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/java-1.5.0-sun-1.5.0.18&quot; path=&quot;1&quot; type=&quot;4&quot;/&gt;&#10;\"/>\n<listEntry value=\"&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;no&quot;?&gt;&#10;&lt;runtimeClasspathEntry id=&quot;org.eclipse.ant.ui.classpathentry.antHome&quot;&gt;&#10;&lt;memento default=&quot;true&quot;/&gt;&#10;&lt;/runtimeClasspathEntry&gt;&#10;\"/>\n<listEntry value=\"&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;no&quot;?&gt;&#10;&lt;runtimeClasspathEntry id=&quot;org.eclipse.ant.ui.classpathentry.extraClasspathEntries&quot;&gt;&#10;&lt;memento/&gt;&#10;&lt;/runtimeClasspathEntry&gt;&#10;\"/>\n</listAttribute>\n<stringAttribute key=\"org.eclipse.jdt.launching.CLASSPATH_PROVIDER\" value=\"org.eclipse.ant.ui.AntClasspathProvider\"/>\n<booleanAttribute key=\"org.eclipse.jdt.launching.DEFAULT_CLASSPATH\" value=\"false\"/>\n<stringAttribute key=\"org.eclipse.jdt.launching.PROJECT_ATTR\" value=\"\"/>\n<stringAttribute key=\"org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER\" value=\"org.eclipse.ant.ui.AntClasspathProvider\"/>\n<stringAttribute key=\"org.eclipse.ui.externaltools.ATTR_ANT_TARGETS\" value=\"all,\"/>\n<stringAttribute key=\"org.eclipse.ui.externaltools.ATTR_LAUNCH_CONFIGURATION_BUILD_SCOPE\" value=\"");
    const7831 = termFactory.makeString(".externalToolBuilders");
    constCons5114 = (IStrategoTerm)termFactory.makeListCons(generator.const7831, (IStrategoList)generator.constNil7);
    const7832 = termFactory.makeString("build.main.xml");
    const7833 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-build-xml'");
    const7834 = termFactory.makeString("{basedir}\"/>\n		 	<arg value=\"-c\"/> <!-- clean Build -->\n	  </java>\n  </target>\n  \n  <target name=\"build-incrementally\" depends=\"generate-incrementally\">\n  	<antcall target = \"build-spx-packages\"/>\n  </target>\n  \n  <target name=\"build-clean\" depends=\"generate-all\">\n  	<antcall target = \"build-spx-packages\"/>\n  </target>\n  \n  <!-- Main target -->\n  <target name = \"all\" depends = \"build-clean\"/>\n</project>");
    constCons5115 = (IStrategoTerm)termFactory.makeListCons(generator.const7834, (IStrategoList)generator.constNil7);
    constCons5116 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5115);
    const7835 = termFactory.makeString("{basedir}\"/>\n		 	<arg value=\"-i\"/> <!-- Incremental Build -->\n	  </java>\n  </target>\n  \n  <target name=\"generate-all\">\n  	<java classname=\"org.strategoxt.imp.metatooling.building.AntSpxGenerateArtefacts\" failonerror=\"true\">\n		 	<arg value=\"");
    constCons5117 = (IStrategoTerm)termFactory.makeListCons(generator.const7835, (IStrategoList)generator.constCons5116);
    constCons5118 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5117);
    const7836 = termFactory.makeString("{user.home}/.nix-profile/bin\"/>\n  <import file=\".build/build.spx.main.generated.xml\" optional = \"true\"/>\n  \n  <!-- Compiles and Generates Artefacts. Internally it calls build-spoofaxlang-jvm strategy -->\n 	<target name=\"generate-incrementally\">\n  	<java classname=\"org.strategoxt.imp.metatooling.building.AntSpxGenerateArtefacts\" failonerror=\"true\">\n		 	<arg value=\"");
    constCons5119 = (IStrategoTerm)termFactory.makeListCons(generator.const7836, (IStrategoList)generator.constCons5118);
    constCons5120 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5119);
    const7837 = termFactory.makeString("{eclipse.spoofaximp.nativeprefix}\" else=\"\">\n  	<isset property=\"eclipse.spoofaximp.nativeprefix\"/>\n  </condition>\n  \n  <property name=\"build.strategoxt.stratego\" location=\"");
    constCons5121 = (IStrategoTerm)termFactory.makeListCons(generator.const7837, (IStrategoList)generator.constCons5120);
    constCons5122 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5121);
    const7838 = termFactory.makeString("{basedir}&quot;\n                  -la stratego-lib -la stratego-sglr -la stratego-gpp -la stratego-xtc -la stratego-aterm  -la strc -la stratego-sdf\"/>\n\n  <condition property=\"build.strategoxt.sdf\" value=\"");
    constCons5123 = (IStrategoTerm)termFactory.makeListCons(generator.const7838, (IStrategoList)generator.constCons5122);
    constCons5124 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5123);
    const7839 = termFactory.makeString("{basedir}&quot; \"/>\n  <property name=\"build.stratego.args\" value=\"\n                  --library\n                  -I &quot;");
    constCons5125 = (IStrategoTerm)termFactory.makeListCons(generator.const7839, (IStrategoList)generator.constCons5124);
    constCons5126 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons5125);
    const7840 = termFactory.makeString("\" default=\"all\">\n	\n	<!-- prject directories -->\n  <property name=\"trans\" location=\"trans\"/>\n  <property name=\"src-gen\" location=\"editor/java\"/>\n  <property name=\"include\" location=\"include\"/>\n  <property name=\"lib\" location=\"lib\"/>\n  <property name=\"build\" location=\"bin\"/> \n  <property name=\"dist\" location=\"bin/dist\"/>\n\n	\n	  \n	<!-- Environment configuration for command-line builds -->\n  <property name=\"build.sdf.imports\" value= \"-I &quot;");
    constCons5127 = (IStrategoTerm)termFactory.makeListCons(generator.const7840, (IStrategoList)generator.constCons5126);
    const7841 = termFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n		\n<project name=\"");
    const7842 = termFactory.makeString(" target.\n        </echo>\n    </target>\n</project>");
    constCons5128 = (IStrategoTerm)termFactory.makeListCons(generator.const7842, (IStrategoList)generator.constNil7);
    constCons5129 = (IStrategoTerm)termFactory.makeListCons(generator.const7068, (IStrategoList)generator.constCons5128);
    const7843 = termFactory.makeString("build-all");
    constCons5130 = (IStrategoTerm)termFactory.makeListCons(generator.const7843, (IStrategoList)generator.constCons5129);
    constCons5131 = (IStrategoTerm)termFactory.makeListCons(generator.const7067, (IStrategoList)generator.constCons5130);
    const7844 = termFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n	\n<project name=\"build.spx.main.generated\" default=\"build-spx-packages\">\n    <target name=\"build-spx-packages\">\n        <echo>\n            Build Failed. Please compile and  generate all the artifacts first by clicking ");
    constCons5132 = (IStrategoTerm)termFactory.makeListCons(generator.const7844, (IStrategoList)generator.constCons5131);
    const7845 = termFactory.makeString(".build");
    constCons5133 = (IStrategoTerm)termFactory.makeListCons(generator.const7845, (IStrategoList)generator.constNil7);
    const7846 = termFactory.makeString("build.spx.main.generated.xml");
    const7847 = termFactory.makeString("build.properties");
    const7848 = termFactory.makeString("source.. = editor/java/\noutput.. = bin/\nbin.includes = META-INF/,\\\n               plugin.xml,\\\n               include/,\\\n               bin/,\\\n               lib/,\\\n               .\n");
    const7849 = termFactory.makeString("osgi");
    constId60 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7849});
    constPackageOrTypeName13 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName0, generator.constId60});
    const7850 = termFactory.makeString("framework");
    constId61 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7850});
    constPackageOrTypeName14 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName13, generator.constId61});
    const7851 = termFactory.makeString("BundleContext");
    constId62 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7851});
    constTypeName25 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName14, generator.constId62});
    constTypeImportDec12 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName25});
    constCons5134 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec12, (IStrategoList)generator.constNil7);
    constPackageOrTypeName15 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName7, generator.constId7});
    const7852 = termFactory.makeString("PluginBase");
    constId63 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7852});
    constTypeName26 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName15, generator.constId63});
    constTypeImportDec13 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName26});
    constCons5135 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec13, (IStrategoList)generator.constCons5134);
    const7853 = termFactory.makeString("preferences");
    constId64 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7853});
    constPackageOrTypeName16 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName7, generator.constId64});
    const7854 = termFactory.makeString("PreferencesService");
    constId65 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7854});
    constTypeName27 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName16, generator.constId65});
    constTypeImportDec14 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName27});
    constCons5136 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec14, (IStrategoList)generator.constCons5135);
    const7855 = termFactory.makeString("Activator");
    constId66 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7855});
    constTypeName28 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId63});
    constClassType2 = termFactory.makeAppl(SpoofaxGenerator._consClassType_2, new IStrategoTerm[]{generator.constTypeName28, generator.constNone0});
    constSuperDec2 = termFactory.makeAppl(SpoofaxGenerator._consSuperDec_1, new IStrategoTerm[]{generator.constClassType2});
    constSome4 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constSuperDec2});
    constClassDecHead0 = termFactory.makeAppl(SpoofaxGenerator._consClassDecHead_5, new IStrategoTerm[]{generator.constCons4929, generator.constId66, generator.constNone0, generator.constSome4, generator.constNone0});
    constTypeName29 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId65});
    constClassOrInterfaceType10 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName29, generator.constNone0});
    const7856 = termFactory.makeString("preferencesService");
    constId67 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7856});
    constVarDec5 = termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId67, generator.constLit0});
    constCons5137 = (IStrategoTerm)termFactory.makeListCons(generator.constVarDec5, (IStrategoList)generator.constNil7);
    constFieldDec4 = termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5006, generator.constClassOrInterfaceType10, generator.constCons5137});
    constCons5138 = (IStrategoTerm)termFactory.makeListCons(generator.constFieldDec4, (IStrategoList)generator.constNil7);
    const7857 = termFactory.makeString("getLanguageID");
    constId68 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7857});
    constMethodDecHead7 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons4930, generator.constNone0, generator.constClassOrInterfaceType5, generator.constId68, generator.constNil7, generator.constNone0});
    const7858 = termFactory.makeString("kLanguageName");
    constId69 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7858});
    constExprName13 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId69});
    constSome5 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constExprName13});
    constReturn2 = termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{generator.constSome5});
    constCons5139 = (IStrategoTerm)termFactory.makeListCons(generator.constReturn2, (IStrategoList)generator.constNil7);
    constBlock10 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5139});
    constMethodDec3 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead7, generator.constBlock10});
    constCons5140 = (IStrategoTerm)termFactory.makeListCons(generator.constMethodDec3, (IStrategoList)generator.constCons5138);
    const7859 = termFactory.makeString("getID");
    constId70 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7859});
    constMethodDecHead8 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons4930, generator.constNone0, generator.constClassOrInterfaceType5, generator.constId70, generator.constNil7, generator.constNone0});
    const7860 = termFactory.makeString("kPluginID");
    constId71 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7860});
    constExprName14 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId71});
    constSome6 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constExprName14});
    constReturn3 = termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{generator.constSome6});
    constCons5141 = (IStrategoTerm)termFactory.makeListCons(generator.constReturn3, (IStrategoList)generator.constNil7);
    constBlock11 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5141});
    constMethodDec4 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead8, generator.constBlock11});
    constCons5142 = (IStrategoTerm)termFactory.makeListCons(generator.constMethodDec4, (IStrategoList)generator.constCons5140);
    const7861 = termFactory.makeString("start");
    constId72 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7861});
    constTypeName30 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId62});
    constClassOrInterfaceType11 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName30, generator.constNone0});
    const7862 = termFactory.makeString("context");
    constId73 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7862});
    constParam4 = termFactory.makeAppl(SpoofaxGenerator._consParam_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType11, generator.constId73});
    constCons5143 = (IStrategoTerm)termFactory.makeListCons(generator.constParam4, (IStrategoList)generator.constNil7);
    const7863 = termFactory.makeString("Exception");
    constId74 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7863});
    constTypeName31 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId74});
    constClassType3 = termFactory.makeAppl(SpoofaxGenerator._consClassType_2, new IStrategoTerm[]{generator.constTypeName31, generator.constNone0});
    constCons5144 = (IStrategoTerm)termFactory.makeListCons(generator.constClassType3, (IStrategoList)generator.constNil7);
    constThrowsDec0 = termFactory.makeAppl(SpoofaxGenerator._consThrowsDec_1, new IStrategoTerm[]{generator.constCons5144});
    constSome7 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constThrowsDec0});
    constMethodDecHead9 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons4930, generator.constNone0, generator.constVoid0, generator.constId72, generator.constCons5143, generator.constSome7});
    constSuperMethod2 = termFactory.makeAppl(SpoofaxGenerator._consSuperMethod_2, new IStrategoTerm[]{generator.constNone0, generator.constId72});
    constExprName15 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId73});
    constCons5145 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName15, (IStrategoList)generator.constNil7);
    constInvoke14 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constSuperMethod2, generator.constCons5145});
    constExprStm11 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constInvoke14});
    constCons5146 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm11, (IStrategoList)generator.constNil7);
    constBlock12 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons5146});
    constMethodDec5 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead9, generator.constBlock12});
    constCons5147 = (IStrategoTerm)termFactory.makeListCons(generator.constMethodDec5, (IStrategoList)generator.constCons5142);
    constConstrDecHead0 = termFactory.makeAppl(SpoofaxGenerator._consConstrDecHead_5, new IStrategoTerm[]{generator.constCons4929, generator.constNone0, generator.constId66, generator.constNil7, generator.constNone0});
    constSuperConstrInv0 = termFactory.makeAppl(SpoofaxGenerator._consSuperConstrInv_2, new IStrategoTerm[]{generator.constNone0, generator.constNil7});
    constSome8 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constSuperConstrInv0});
    const7864 = termFactory.makeString("sPlugin");
    constId75 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7864});
    constExprName16 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId75});
  }

  private static void initConstants30(ITermFactory termFactory)
  { 
    initConstants29(termFactory);
    const7398 = termFactory.makeString("   (source)      Always apply this builder to the source AST, not to the AST");
    constCommentLine90 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7398});
    constCons4869 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine90, (IStrategoList)generator.constCons4868);
    const7399 = termFactory.makeString("                 as the source file is edited.");
    constCommentLine91 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7399});
    constCons4870 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine91, (IStrategoList)generator.constCons4869);
    const7400 = termFactory.makeString("   (realtime)    Indicates that the resulting editor should be updated in real-time");
    constCommentLine92 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7400});
    constCons4871 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine92, (IStrategoList)generator.constCons4870);
    const7401 = termFactory.makeString("   (persistent)  Indicates that the resulting file should be saved to disk.");
    constCommentLine93 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7401});
    constCons4872 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine93, (IStrategoList)generator.constCons4871);
    const7402 = termFactory.makeString("   (openeditor)  Indicates an editor should be opened with the result.");
    constCommentLine94 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7402});
    constCons4873 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine94, (IStrategoList)generator.constCons4872);
    const7403 = termFactory.makeString("                 (i.e., not when the plugin is deployed to end-users).");
    constCommentLine95 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7403});
    constCons4874 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine95, (IStrategoList)generator.constCons4873);
    const7404 = termFactory.makeString("   (meta)        Indicates the builder should only be available to meta-programmers");
    constCommentLine96 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7404});
    constCons4875 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine96, (IStrategoList)generator.constCons4874);
    const7405 = termFactory.makeString("   (cursor)      The builder should always transform the tree node at the cursor.");
    constCommentLine97 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7405});
    constCons4876 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine97, (IStrategoList)generator.constCons4875);
    constCons4877 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4876);
    const7406 = termFactory.makeString(" Builder definitions can also specify any combination of the following annotations:");
    constCommentLine98 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7406});
    constCons4878 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine98, (IStrategoList)generator.constCons4877);
    const7407 = termFactory.makeString(" and the generate-java rule is used to carry out the tranformation.");
    constCommentLine99 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7407});
    constCons4879 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine99, (IStrategoList)generator.constCons4878);
    const7408 = termFactory.makeString(" In this example, the caption \"Generate Java code\" is used in the build button dropdown menu,");
    constCommentLine100 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7408});
    constCons4880 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine100, (IStrategoList)generator.constCons4879);
    constCons4881 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4880);
    const7409 = termFactory.makeString("   builder : \"Generate Java code\" = generate-java (openeditor) (persistent) (realtime)");
    constCommentLine101 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7409});
    constCons4882 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine101, (IStrategoList)generator.constCons4881);
    constCons4883 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4882);
    const7410 = termFactory.makeString(" Builders can be specified as follows:");
    constCommentLine102 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7410});
    constCons4884 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine102, (IStrategoList)generator.constCons4883);
    const7411 = termFactory.makeString(" (At run-time, they can be accessed using the toolbar button with the star icon.)");
    constCommentLine103 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7411});
    constCons4885 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine103, (IStrategoList)generator.constCons4884);
    const7412 = termFactory.makeString(" Builders may carry out custom transformations on a file or selection.");
    constCommentLine104 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7412});
    constCons4886 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine104, (IStrategoList)generator.constCons4885);
    constCons4887 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4886);
    const7413 = termFactory.makeString(" such as reference resolving or the builders.");
    constCommentLine105 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7413});
    constCons4888 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine105, (IStrategoList)generator.constCons4887);
    const7414 = termFactory.makeString(" Any dynamic rules set in the analysis may be used by other semantic services,");
    constCommentLine106 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7414});
    constCons4889 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine106, (IStrategoList)generator.constCons4888);
    constCons4890 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4889);
    const7415 = termFactory.makeString("   observer : analysis-rule");
    constCommentLine107 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7415});
    constCons4891 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine107, (IStrategoList)generator.constCons4890);
    constCons4892 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4891);
    const7416 = termFactory.makeString(" Analysis is carried out by a Stratego rule that can be selected as follows:");
    constCommentLine108 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7416});
    constCons4893 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine108, (IStrategoList)generator.constCons4892);
    constCons4894 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4893);
    const7417 = termFactory.makeString("   provider : stratego-library.jar");
    constCommentLine109 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7417});
    constCons4895 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine109, (IStrategoList)generator.constCons4894);
    const7418 = termFactory.makeString("   provider : stratego-program.ctree");
    constCommentLine110 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7418});
    constCons4896 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine110, (IStrategoList)generator.constCons4895);
    constCons4897 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4896);
    const7419 = termFactory.makeString(" Building and analysis is defined in Stratego program or programs:");
    constCommentLine111 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7419});
    constCons4898 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine111, (IStrategoList)generator.constCons4897);
    constCons4899 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4898);
    constBuilders0 = termFactory.makeAppl(SpoofaxGenerator._consBuilders_2, new IStrategoTerm[]{generator.const7000, generator.constCons4899});
    constCons4900 = (IStrategoTerm)termFactory.makeListCons(generator.constBuilders0, (IStrategoList)generator.constNil7);
    const7420 = termFactory.makeString("include/");
    const7421 = termFactory.makeString(".ctree");
    const7422 = termFactory.makeString("-java.jar");
    const7423 = termFactory.makeString(" on save: generate-java");
    constCommentLine112 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7423});
    constCons4901 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine112, (IStrategoList)generator.constNil7);
    constCons4902 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4901);
    const7424 = termFactory.makeString("ID");
    constSort4 = termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{generator.const7424});
    constCons4903 = (IStrategoTerm)termFactory.makeListCons(generator.constSort4, (IStrategoList)generator.constNil7);
    const7425 = termFactory.makeString("Rename Entity");
    constString14 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7425});
    const7426 = termFactory.makeString("rename-entity");
    constStrategy3 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7426});
    constCons4904 = (IStrategoTerm)termFactory.makeListCons(generator.constCursor0, (IStrategoList)generator.constNil7);
    constSource0 = termFactory.makeAppl(SpoofaxGenerator._consSource_0, NO_TERMS);
    constCons4905 = (IStrategoTerm)termFactory.makeListCons(generator.constSource0, (IStrategoList)generator.constCons4904);
    constRefactoring0 = termFactory.makeAppl(SpoofaxGenerator._consRefactoring_4, new IStrategoTerm[]{generator.constCons4903, generator.constString14, generator.constStrategy3, generator.constCons4905});
    constCons4906 = (IStrategoTerm)termFactory.makeListCons(generator.constRefactoring0, (IStrategoList)generator.constCons4902);
    constCons4907 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4906);
    const7427 = termFactory.makeString("get-pp-table");
    constStrategy4 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7427});
    constPPTable0 = termFactory.makeAppl(SpoofaxGenerator._consPPTable_1, new IStrategoTerm[]{generator.constStrategy4});
    constCons4908 = (IStrategoTerm)termFactory.makeListCons(generator.constPPTable0, (IStrategoList)generator.constCons4907);
    constCons4909 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4908);
    constRefactorings0 = termFactory.makeAppl(SpoofaxGenerator._consRefactorings_2, new IStrategoTerm[]{generator.const7000, generator.constCons4909});
    constCons4910 = (IStrategoTerm)termFactory.makeListCons(generator.constRefactorings0, (IStrategoList)generator.constNil7);
    const7428 = termFactory.makeString("Show abstract syntax (for selection)");
    constString15 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7428});
    const7429 = termFactory.makeString("generate-aterm");
    constStrategy5 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7429});
    constCons4911 = (IStrategoTerm)termFactory.makeListCons(generator.constSource0, (IStrategoList)generator.constNil7);
    constMeta0 = termFactory.makeAppl(SpoofaxGenerator._consMeta_0, NO_TERMS);
    constCons4912 = (IStrategoTerm)termFactory.makeListCons(generator.constMeta0, (IStrategoList)generator.constCons4911);
    constRealTime0 = termFactory.makeAppl(SpoofaxGenerator._consRealTime_0, NO_TERMS);
    constCons4913 = (IStrategoTerm)termFactory.makeListCons(generator.constRealTime0, (IStrategoList)generator.constCons4912);
    constOpenEditor0 = termFactory.makeAppl(SpoofaxGenerator._consOpenEditor_0, NO_TERMS);
    constCons4914 = (IStrategoTerm)termFactory.makeListCons(generator.constOpenEditor0, (IStrategoList)generator.constCons4913);
    constBuilder0 = termFactory.makeAppl(SpoofaxGenerator._consBuilder_3, new IStrategoTerm[]{generator.constString15, generator.constStrategy5, generator.constCons4914});
    constCons4915 = (IStrategoTerm)termFactory.makeListCons(generator.constBuilder0, (IStrategoList)generator.constCons4670);
    const7430 = termFactory.makeString("Generate Java code (for selection)");
    constString16 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7430});
    const7431 = termFactory.makeString("generate-java");
    constStrategy6 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7431});
    constCons4916 = (IStrategoTerm)termFactory.makeListCons(generator.constRealTime0, (IStrategoList)generator.constNil7);
    constCons4917 = (IStrategoTerm)termFactory.makeListCons(generator.constOpenEditor0, (IStrategoList)generator.constCons4916);
    constBuilder1 = termFactory.makeAppl(SpoofaxGenerator._consBuilder_3, new IStrategoTerm[]{generator.constString16, generator.constStrategy6, generator.constCons4917});
    constCons4918 = (IStrategoTerm)termFactory.makeListCons(generator.constBuilder1, (IStrategoList)generator.constCons4915);
    constCons4919 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4918);
    const7432 = termFactory.makeString("editor-analyze");
    constStrategy7 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7432});
    constSemanticObserver0 = termFactory.makeAppl(SpoofaxGenerator._consSemanticObserver_1, new IStrategoTerm[]{generator.constStrategy7});
    constCons4920 = (IStrategoTerm)termFactory.makeListCons(generator.constSemanticObserver0, (IStrategoList)generator.constCons4919);
    constCons4921 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4920);
    const7433 = termFactory.makeString(" This file can be used for custom analysis and builder rules.");
    constCommentLine113 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7433});
    constCons4922 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine113, (IStrategoList)generator.constCons4621);
    constCons4923 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4922);
    constBuilders1 = termFactory.makeAppl(SpoofaxGenerator._consBuilders_2, new IStrategoTerm[]{generator.const7000, generator.constCons4923});
    const7434 = termFactory.makeString("builderDescriptor");
    const7435 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-builders-descriptor'");
    const7436 = termFactory.makeString("Using file extensions");
    const7437 = termFactory.makeString("Main module (-m)");
    const7438 = termFactory.makeString("language name");
    const7439 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'configure-main-descriptor'");
    const7440 = termFactory.makeString("Using main module");
    const7441 = termFactory.makeString("Start symbols (-s)");
    const7442 = termFactory.makeString("language start symbols");
    const7443 = termFactory.makeString("StartSymbol");
    const7444 = termFactory.makeString("240597");
    const7445 = termFactory.makeString("Using start symbols");
    const7446 = termFactory.makeString("Package name (-p)");
    const7447 = termFactory.makeString("language id");
    const7448 = termFactory.makeString("BasePackage");
    const7449 = termFactory.makeString("-28876");
    const7450 = termFactory.makeString("Using package name");
    const7451 = termFactory.makeString("Editor file extensions (-e)");
    const7452 = termFactory.makeString("language extensions");
    const7453 = termFactory.makeString("EditorExtensions");
    const7454 = termFactory.makeString("-271127");
    const7455 = termFactory.makeString("Existing descriptor determines generated services:");
    const7456 = termFactory.makeString("Reading descriptor files");
    const7457 = termFactory.makeString("editor/");
    const7458 = termFactory.makeString("OnImportFailure");
    constImport0 = termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{generator.constCons4561});
    const7459 = termFactory.annotateTerm(generator.constImport0, checkListAnnos(termFactory, generator.constCons4561));
    const7460 = termFactory.makeString("91205");
    const7461 = termFactory.makeString("(editor/");
    const7462 = termFactory.makeString("Error opening existing descriptor file; attempting to use defaults instead");
    const7463 = termFactory.makeString("NoExistingDescriptor");
    const7464 = termFactory.makeString("19145");
    const7465 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'find-package-name'");
    const7466 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'verbosity-scope'");
    const7467 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'descriptor-name'");
    const7468 = termFactory.makeString(".main");
    const7469 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'condition-to-java'");
    const7470 = termFactory.makeString("tokenKind");
    constId0 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7470});
    constExprName0 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId0});
    const7471 = termFactory.makeString("equals");
    constId1 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7471});
    const7472 = termFactory.makeString("constructor");
    constId2 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7472});
    constExprName1 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId2});
    constCons4924 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName1, (IStrategoList)generator.constNil7);
    const7473 = termFactory.makeString("sort");
    constId3 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7473});
    constExprName2 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId3});
    constCons4925 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName2, (IStrategoList)generator.constNil7);
    const7474 = termFactory.makeString("Unknown sort referenced");
    const7475 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'check-validity'");
    const7476 = termFactory.makeString("Undeclared sort");
    const7477 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'register-rtg'");
    const7478 = termFactory.makeString(" esv definition");
    constCons4926 = (IStrategoTerm)termFactory.makeListCons(generator.const7478, (IStrategoList)generator.constNil7);
    const7479 = termFactory.makeString("No legal start symbol specified in ");
    const7480 = termFactory.makeString("Productions");
    const7481 = termFactory.makeString("-731576");
    const7482 = termFactory.makeString("Bad input for heuristic-child-sorts");
    const7483 = termFactory.makeString("CollectAllVisited");
    const7484 = termFactory.makeString("-469688");
    const7485 = termFactory.makeString("FollowVisited");
    const7486 = termFactory.makeString("193036");
    const7487 = termFactory.makeString("FollowSuccess");
    const7488 = termFactory.makeString("154863");
    const7489 = termFactory.makeString("ProductionVisited");
    const7490 = termFactory.makeString("29931");
    const7491 = termFactory.makeString("Validator");
    const7492 = termFactory.makeString("org");
    constId4 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7492});
    constPackageOrTypeName0 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_1, new IStrategoTerm[]{generator.constId4});
    const7493 = termFactory.makeString("strategoxt");
    constId5 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7493});
    constPackageOrTypeName1 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName0, generator.constId5});
    const7494 = termFactory.makeString("imp");
    constId6 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7494});
    constPackageOrTypeName2 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName1, generator.constId6});
    const7495 = termFactory.makeString("runtime");
    constId7 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7495});
    constPackageOrTypeName3 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName2, generator.constId7});
    const7496 = termFactory.makeString("services");
    constId8 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7496});
    constPackageOrTypeName4 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName3, generator.constId8});
    const7497 = termFactory.makeString("MetaFileLanguageValidator");
    constId9 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7497});
    constTypeName0 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName4, generator.constId9});
    constTypeImportDec0 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName0});
    constCons4927 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec0, (IStrategoList)generator.constNil7);
    const7498 = termFactory.makeString("dynamicloading");
    constId10 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7498});
    constPackageOrTypeName5 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName3, generator.constId10});
    const7499 = termFactory.makeString("Descriptor");
    constId11 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7499});
    constTypeName1 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName5, generator.constId11});
    constTypeImportDec1 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName1});
    constCons4928 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec1, (IStrategoList)generator.constCons4927);
    constPublic0 = termFactory.makeAppl(SpoofaxGenerator._consPublic_0, NO_TERMS);
    constCons4929 = (IStrategoTerm)termFactory.makeListCons(generator.constPublic0, (IStrategoList)generator.constNil7);
    constTypeName2 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId9});
    constClassType0 = termFactory.makeAppl(SpoofaxGenerator._consClassType_2, new IStrategoTerm[]{generator.constTypeName2, generator.constNone0});
    constSuperDec0 = termFactory.makeAppl(SpoofaxGenerator._consSuperDec_1, new IStrategoTerm[]{generator.constClassType0});
    constSome0 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constSuperDec0});
    const7500 = termFactory.makeString("Override");
    constId12 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7500});
    constTypeName3 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId12});
    constMarkerAnno0 = termFactory.makeAppl(SpoofaxGenerator._consMarkerAnno_1, new IStrategoTerm[]{generator.constTypeName3});
    constCons4930 = (IStrategoTerm)termFactory.makeListCons(generator.constMarkerAnno0, (IStrategoList)generator.constCons4929);
    constTypeName4 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId11});
    constClassOrInterfaceType0 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName4, generator.constNone0});
    const7501 = termFactory.makeString("getDescriptor");
    constId13 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7501});
    constMethodDecHead0 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons4930, generator.constNone0, generator.constClassOrInterfaceType0, generator.constId13, generator.constNil7, generator.constNone0});
    const7502 = termFactory.makeString("lexical-constructs");
    const7503 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spxlang-lexicalconstructs'");
    const7504 = termFactory.makeString("   \n");
    const7505 = termFactory.makeString("\nmodule identifierDefinition\n	lexical syntax\n		[a-zA-Z][a-zA-Z0-9]* -> ID\n");
    constCons4931 = (IStrategoTerm)termFactory.makeListCons(generator.const7505, (IStrategoList)generator.constNil7);
    const7506 = termFactory.makeString("\nmodule literals\n	lexical syntax\n		\"-\"? [0-9]+           -> INT\n		\"\\\"\" StringChar* \"\\\"\" -> STRING\n		~[\\\"\\n]               -> StringChar\n		\"\\\\\\\"\"                -> StringChar\n		\n		BackSlashChar         -> StringChar\n		\"\\\\\"                  -> BackSlashChar\n	\n	lexical restrictions\n	\n		//Ensure greedy matching for lexicals\n		CommentChar   -/- [\\/]\n		INT           -/- [0-9]\n		ID            -/- [a-zA-Z0-9\\_]\n		\n		//Backslash chars in strings may not be followed by \"\n		\n		BackSlashChar -/- [\\\"]\n");
    constCons4932 = (IStrategoTerm)termFactory.makeListCons(generator.const7506, (IStrategoList)generator.constNil7);
    const7507 = termFactory.makeString("\n\n	lexical restrictions\n		//Ensure greedy matching for lexicals\n		\"Int\" \n		\"String\"  -/- [A-Za-z0-9\\_]\n");
    constCons4933 = (IStrategoTerm)termFactory.makeListCons(generator.const7507, (IStrategoList)generator.constNil7);
    constCons4934 = (IStrategoTerm)termFactory.makeListCons(generator.const7180, (IStrategoList)generator.constCons4933);
    const7508 = termFactory.makeString("reject");
    constCons4935 = (IStrategoTerm)termFactory.makeListCons(generator.const7508, (IStrategoList)generator.constCons4934);
    constCons4936 = (IStrategoTerm)termFactory.makeListCons(generator.const7179, (IStrategoList)generator.constCons4935);
    const7509 = termFactory.makeString("\nmodule keywordDefinition\n	\n	lexical syntax \n		\"Int\"					  			-> RESERVED\n		\"String\"			  			-> RESERVED\n		RESERVED 						-> ID");
    constCons4937 = (IStrategoTerm)termFactory.makeListCons(generator.const7509, (IStrategoList)generator.constCons4936);
    const7510 = termFactory.makeString("\n\nmodule layout\n	lexical syntax\n		[\\ \\t\\n\\r] -> LAYOUT\n	    \n		[\\*]                             -> CommentChar\n		\"/*\" (~[\\*] | CommentChar)* \"*/\" -> LAYOUT\n		\"//\" ~[\\n\\r]* ([\\n\\r] | EOF)     -> LAYOUT   \n	    \n		-> EOF\n	  \n	lexical restrictions \n		//Ensure greedy matching for lexicals\n		//EOF may not be followed by any char\n		EOF           -/- ~[]\n	\n	context-free restrictions \n  \n		//Ensure greedy matching for comments\n		LAYOUT? -/- [\\ \\t\\n\\r]\n		LAYOUT? -/- [\\/].[\\/]\n		LAYOUT? -/- [\\/].[\\*]		\n");
    constCons4938 = (IStrategoTerm)termFactory.makeListCons(generator.const7510, (IStrategoList)generator.constNil7);
    const7511 = termFactory.makeString("definitions");
    const7512 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spxlang-definitions'");
    const7513 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-main-language-constructs'");
    const7514 = termFactory.makeString("\n                                                            ");
    const7515 = termFactory.makeString("\n	                                                                   ");
    const7516 = termFactory.makeString("\n	                             ");
    const7517 = termFactory.makeString("\n	                                         ");
    const7518 = termFactory.makeString("[[x] : [<pp-entitylang>type] \n		]     \n  	\n	pp-entitylang: t* -> <map(pp-entitylang)> t*\n");
    constCons4939 = (IStrategoTerm)termFactory.makeListCons(generator.const7518, (IStrategoList)generator.constNil7);
    const7519 = termFactory.makeString("$");
    constCons4940 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons4939);
    const7520 = termFactory.makeString("\n			]\n		with\n			p'* := <pp-entitylang> p*\n\n	pp-entitylang: Property(x, type) -> \n		");
    constCons4941 = (IStrategoTerm)termFactory.makeListCons(generator.const7520, (IStrategoList)generator.constCons4940);
    constCons4942 = (IStrategoTerm)termFactory.makeListCons(generator.const7180, (IStrategoList)generator.constCons4941);
    const7521 = termFactory.makeString("\n         [p'*]\n     ");
    constCons4943 = (IStrategoTerm)termFactory.makeListCons(generator.const7521, (IStrategoList)generator.constCons4942);
    constCons4944 = (IStrategoTerm)termFactory.makeListCons(generator.const7179, (IStrategoList)generator.constCons4943);
    const7522 = termFactory.makeString("[entity [x] ");
    constCons4945 = (IStrategoTerm)termFactory.makeListCons(generator.const7522, (IStrategoList)generator.constCons4944);
    constCons4946 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons4945);
    const7523 = termFactory.makeString("[module [x]\n     [d'*]\n		]\n		with\n		d'* := <pp-entitylang> d*\n  \n	pp-entitylang: Entity(x, p*) ->\n		");
    constCons4947 = (IStrategoTerm)termFactory.makeListCons(generator.const7523, (IStrategoList)generator.constCons4946);
    constCons4948 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons4947);
    const7524 = termFactory.makeString(" language. \n	pp-entitylang: Module(x, d*) ->\n		");
    constCons4949 = (IStrategoTerm)termFactory.makeListCons(generator.const7524, (IStrategoList)generator.constCons4948);
    const7525 = termFactory.makeString("\n		]     \n  	\n		to-java: t* -> <map(to-java)> t*\n		\nrules\n	\n	// Pretty-prints Abstract Syntax Tree to ");
    const7526 = termFactory.makeString("\n              this.[x] = [x];    \n           ");
    const7527 = termFactory.makeString("\n      \n           public void set_[x] ([<to-java>type] [x]) ");
    const7528 = termFactory.makeString("\n              return [x];\n           ");
    const7529 = termFactory.makeString("[\n           private [<to-java>type] [x];\n      \n           public [<to-java>type] get_[x] ");
    const7530 = termFactory.makeString("\n		]\n    with\n		p'* := <to-java> p*\n\n	to-java: Property(x, type) -> \n		");
    const7531 = termFactory.makeString("\n           [p'*]\n       ");
    const7532 = termFactory.makeString("[class [x] ");
    const7533 = termFactory.makeString("[package [x];\n      [d'*]\n		 ]\n    with\n      d'* := <to-java> d*\n  \n	to-java: Entity(x, p*) ->\n    ");
    const7534 = termFactory.makeString(" language.\n	to-java: Module(x, d*) ->\n		");
    const7535 = termFactory.makeString("-Definitions.spx) ])\n	 \nrules\n	// Generates java codes from ");
    const7536 = termFactory.makeString("[This is just an example program in the \"entities\" language\n	                                      (this note is defined in src/");
    const7537 = termFactory.makeString("[Entity names must start with a capital])\n			where\n				not(<string-starts-with-capital> x)\n	  \n	constraint-note:\n		Module(x @ \"example\", _) -> (x, ");
    const7538 = termFactory.makeString("[Duplicate entity name])\n		where\n			not(<bagof-GetEntity> x => [_])\n		\n	constraint-warning:\n		Entity(x, _) -> (x, ");
    const7539 = termFactory.makeString(" \n	\nrules \n	// Semantic analyses\n	// Reports an error if an entity is defined more than once.\n	// This constraint is implemented by testing if the \"bag\" of\n	// all entities x is not a singleton list.\n	constraint-error:\n		Entity(x, _) -> (x, ");
    const7540 = termFactory.makeString("\"Property\"");
    const7541 = termFactory.makeString("\n	ID  \":\" Type               		      -> Property");
    const7542 = termFactory.makeString("\"Entity\"");
    const7543 = termFactory.makeString("\"    -> Definition");
    const7544 = termFactory.makeString("\" Property* \"");
    const7545 = termFactory.makeString(" \n	\"entity\" ID \"");
    const7546 = termFactory.makeString(" \"Module\"");
    const7547 = termFactory.makeString(" language\nmodule languageConcepts\n\n	\ncontext-free syntax    \n	\"module\" ID Definition*             -> Start");
    const7548 = termFactory.makeString("\n// Following module define the main langauge constructs for ");
    const7549 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-lang-type-system'");
    const7550 = termFactory.makeString("\n                                                ");
    const7551 = termFactory.makeString("\n	                ");
    const7552 = termFactory.makeString("\n	                 ");
    const7553 = termFactory.makeString("  types \n	pp-entitylang : Type(t) -> t\n		\n	pp-entitylang : IntegerType() -> \"Int\"\n    \n	pp-entitylang : StringType() -> \"String\"  \n");
    constCons4950 = (IStrategoTerm)termFactory.makeListCons(generator.const7553, (IStrategoList)generator.constNil7);
    const7554 = termFactory.makeString(" types to java types  \n	to-java: Type(t) -> t\n \n	to-java: IntegerType() -> \"int\"\n    \n	to-java: StringType() -> \"string\"  \n\nrules\n	// Pretty-prints ");
    const7555 = termFactory.makeString("[Type [type] is not defined])\n		where\n			not(<GetEntity> type) // no entity for this type \n	\nrules\n	// Transforming ");
    const7556 = termFactory.makeString("\n\nrules \n	// Semantic analysis of types\n	// Reports an error if a property type is undefined.\n	// This error is reported on the type name 'type'.\n	constraint-error:\n		Type(type) -> (type, ");
    const7557 = termFactory.makeString("\"StringType\" , prefer");
    const7558 = termFactory.makeString("\n	\"String\"												-> Type ");
    const7559 = termFactory.makeString("\"IntegerType\", prefer");
    const7560 = termFactory.makeString("\n	\"Int\"														-> Type ");
    const7561 = termFactory.makeString("\"Type\"");
    const7562 = termFactory.makeString(" language\nmodule typeSystem\n	\ncontext-free syntax\n	ID                              -> Type ");
    const7563 = termFactory.makeString("// Following module defines the Type-System of  ");
    const7564 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-symantic-analyzer'");
    const7565 = termFactory.makeString("\n                                                   ");
    const7566 = termFactory.makeString(".generated\n\nrules\n	// Analysis: does a topdown traversal of the tree,\n	// and tries to apply the record-entity rule.\n	analyze:\n		t -> t\n		with\n			<topdown(try(record-entity))> t\n	\n	// Records the definition of an entity in a dynamic rule GetEntity.\n	record-entity:\n		Entity(x, body) -> Entity(x, body)\n		with\n			// For a name 'x', GetEntity will return the original 'x' tree node\n			rules(\n				GetEntity :+ x -> x \n			)\nrules \n	// Analyzes the current program, returning a tuple with errors, warnings, and notes;\n	// each a list of (term, message) tuples or simply (message) terms.\n	editor-analyze:\n		(ast, path, project-path) -> (ast, errors, warnings, notes)\n		with\n			editor-init;\n			analyze;\n			errors   := <collect-all(constraint-error, conc)> ast;\n			warnings := <collect-all(constraint-warning, conc)> ast;\n			notes    := <collect-all(constraint-note, conc)> ast	\n");
    constCons4951 = (IStrategoTerm)termFactory.makeListCons(generator.const7566, (IStrategoList)generator.constNil7);
    const7567 = termFactory.makeString(" language\nmodule semanticAnalyzer\nimports ");
    const7568 = termFactory.makeString("// Following module performs semantic analyses for ");
    const7569 = termFactory.makeString("spx.config");
    const7570 = termFactory.makeString("configuration\n	\n	// For current project, following configuration section specifies the directories \n	// that will be included during building this project. \n	// It can be specified as follows : \n	//			directoryname | include-mode\n	// Here- \n	//			\n	//			directoryname : Refers to the name of the local directory. \n	//											It must be a relative path from the project-root.\n	//\n	//			include-mode  : It can have one of the following two values - \n	//                           .  : includes only current directory. Subdirectories of the current directory are not included.\n	//                           ** : includes current directory and its subdirectories as well.\n	//\n	// If configuration file is missing or does not specify source, then default configuration is used during project build.\n	// By default, it includes all the directories ( and their subdirectories) of the project during build. Hence, It is  \n	// always recommended to explicitly specify the sources to include. 							  \n	src:\n		src | **\n		\n	\n				\n	codegen:\n		// todir refers to the project directory where intermediate generated \n		// output is stored for further processing. \n		todir			 		: .shadowdir\n		\n		// STR outputmode can be configured as follows : jar | ctree.\n		// Based on this value, ctree or jar file generated for the packages\n		stroutputmode : ctree 	\n		//stroutputmode : jar\n	\n	// Other project references are specified in this configuration section.\n	//projectreferences:\n	//		org.strategoxt.imp.editors.spoofax.configuration   \n	\n	// options : compiler , analysis , symboltable,  declaration, none, all \n	log : none\n	\n	templatelang : disabled \n");
    constCons4952 = (IStrategoTerm)termFactory.makeListCons(generator.const7570, (IStrategoList)generator.constNil7);
    const7571 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-common-strategies'");
    const7572 = termFactory.makeString("\n                           ");
    const7573 = termFactory.makeString("\n     ");
    const7574 = termFactory.makeString("\n                                    ");
    const7575 = termFactory.makeString("\\\\");
    const7576 = termFactory.makeString("\n                                                                   ");
    const7577 = termFactory.makeString("\n                                                 ");
    const7578 = termFactory.makeString("{?_{a*}; <one(?MARKER())> a*}");
    constCons4953 = (IStrategoTerm)termFactory.makeListCons(generator.const7578, (IStrategoList)generator.constNil7);
    const7579 = termFactory.makeString("\n                                     ");
    const7580 = termFactory.makeString("\n                                       ");
    const7581 = termFactory.makeString("-signatures.str module. However,\n  // to ensure that the example transformation doesn't break when the\n  // syntax is changed, we also hard-coded them here.\n          \n  Module   : ID * List(Entity)   -> Module\n  Entity   : ID * List(Property) -> Entity\n  Property : ID * Type           -> Property\n  Type     : ID                  -> Type   \n   \nstrategies\n  \n  // Set markers for a given file. Use when checking files from a queued strategy.\n  // Current term: (ast-desugared, errors, warnings, notes) tuple\n  // ast: the root node of the file to set markers on \n  set-markers(|ast) = prim(\"SSL_EXT_set_markers\", ast)\n\n  // Indicate that one or more files need analysis. \n  // Current term: ss a list of absolute file paths, or a single absolute file path to analyze\n  queue-analysis = \n       (is-list; list-loop(queue-analysis))\n    <+ prim(\"SSL_EXT_queue_analysis\")\n\n  // Set the total number of work units to complete. Can be called multiple times. \n  // Current term: number of work units (int).\n  set-total-work-units = prim(\"SSL_EXT_set_total_work_units\")\n  \n  // Complete one work unit and update progress monitors.\n  // Current term: ignored\n  complete-work-unit = prim(\"SSL_EXT_complete_work_unit\")\n  \n  // Queue a strategy for background processing with a progress indicator.\n  // Current term: the term to pass to the background strategy\n  // s: the strategy, as string\n  // description: name of the task (will be shown in progress view)\n  queue-strategy(|s,description) = prim(\"SSL_EXT_queue_strategy\", s, description)\n  \n  // Return the result of this strategy to indicate a non-completed (backgrounded) analysis.\n  // Editor services (hover, resolve) will be delayed until a complete analysis is performed. \n  set-analysis-backgrounded = !\"BACKGROUNDED\"\n");
    constCons4954 = (IStrategoTerm)termFactory.makeListCons(generator.const7581, (IStrategoList)generator.constNil7);
    const7582 = termFactory.makeString("-Definitions.spx. These definitions should also be automatically \n  // generated in the imported include/");
    const7583 = termFactory.makeString(")> ast''\n   \n  at-position(s|position):\n    c#(t*) -> t'\n    where\n      !position => [i | position']\n    where\n      t' := c#(<at-index(at-position(s|position'))> (i, t*))\n\n  at-position(s|position):\n    t -> t'\n    where\n      !position => [];\n      t' := <s> t\n\n  position-of-term(is-term):\n    t -> []\n    where\n      is-term\n  \n  position-of-term(is-term):\n    _#(t*) -> <position-of-term(is-term|0)> t*\n  \n  position-of-term(is-term|start-index):\n    [t | t*] -> position\n    where\n      if i* := <position-of-term(is-term)> t then\n        position := [start-index | i*]\n      else\n        position := <position-of-term(is-term | <inc> start-index)> t*\n      end\n\n  term-at-position(|position):\n    t -> t'\n    where\n      at-position(?t'|position) \n\n  parent-at-position(|position):\n    t -> t'\n    where\n      !position => [i, _];\n      t' := <subterm-at(|i)> t\n  \n  parent-at-position(|position):\n    t -> <parent-at-position(|position')> t'\n    where\n      !position => [i | position' @ [_, _ | _]];\n      t' := <subterm-at(|i)> t\n\n  subterm-at(|index):\n    _#(t*) -> <index(|<inc> index)> t*\n  \nsignature constructors\n\n  COMPLETION : String -> Term\n  NOCONTEXT  : Term   -> Term\n  MARKER     : Term\n\n  // Below are copies of the signatures of the terms used in example\n  // ");
    const7584 = termFactory.makeString(")))> ast';\n      position' := <position-of-term(");
    const7585 = termFactory.makeString("?x; desugar; not(?x)");
    const7586 = termFactory.makeString("|position)> ast;\n      ast'' := <topdown(repeat(preserve-annos(");
    const7587 = termFactory.makeString("MARKER()");
    const7588 = termFactory.makeString("\", <id>)\n    \n  origin-documentation-comment =\n    origin-surrounding-comments;\n    filter(string-as-chars(documentation-comment-chars));\n    concat-strings\n  \n  documentation-comment-chars:\n    ['*' | c*] -> <ltrim(' ' + '\\t' + '\\n' + '\\r')> c*\n  \n  origin-track-forced(s) =\n    ![<id>]; all(s); ?[<id>]\n\nstrategies\n\n  desugar-position(desugar|ast):\n    position -> position'\n    where\n      ast'  := <at-position(!<id>");
    const7589 = termFactory.makeString("[[cache-dir]/[full-path'].sig]\n\n  project-path = prim(\"SSL_EXT_projectpath\")\n  \n  plugin-path = prim(\"SSL_EXT_pluginpath\")\n  \n  candidate-sorts = prim(\"SSL_EXT_candidatesorts\")\n\n  is-newer:\n    (file1, file2) -> <id>\n    where\n      <gt> (<file-exists; modification-time> file1, <file-exists; modification-time> file2) \n\nstrategies\n  \n  editor-init =\n    // Ensure all dynamic rules are properly scoped\n    try(dr-scope-all-end);\n    dr-scope-all-start\n  \n  refresh-workspace-file:\n    path -> <prim(\"SSL_EXT_refreshresource\", path)>\n  \n  string-starts-with-capital =\n    explode-string; Hd; is-upper\n\nstrategies\n  \n  origin-term      = prim(\"SSL_EXT_origin_term\", <id>)\n  origin-text      = prim(\"SSL_EXT_origin_text\", <id>)\n  origin-location  = prim(\"SSL_EXT_origin_location\", <id>)\n  origin-line      = origin-location => (<id>, _, _, _)\n  origin-column    = origin-location => (_, <id>, _, _)\n  origin-strip     = prim(\"SSL_EXT_origin_strip\", <id>)\n  origin-equal(|t) = prim(\"SSL_EXT_origin_equal\", <id>, t)\n  \n  origin-surrounding-comments =\n    prim(\"SSL_EXT_origin_surrounding_comments\", \"");
    const7590 = termFactory.makeString("\", \"+\"); string-replace(|\":\", \"+\")> full-path;\n      cache-path   := ");
    const7591 = termFactory.makeString("[[project-path]/.cache];\n      full-path'   := <string-replace(|\"/\", \"+\"); string-replace(|\"");
    const7592 = termFactory.makeString("[[path]/[<id>]]\n          <+\n            try(?one-failed)\n          end\n        );\n        not(!one-failed)\n      end\n  \n  import-cache-path:\n    full-path -> cache-path\n    with\n      project-path := <project-path>;\n      cache-dir    := <file-exists <+ mkdir> ");
    const7593 = termFactory.makeString("\n        end\n      end\n\n  open-wildcard-import(resolve-path, parse-file, record-declarations, is-source-file):\n    import -> import\n    where\n      if not(!import => COMPLETION(_)) then\n        path := <resolve-path> import;\n        readdir;\n        list-loop(\n          if is-source-file then\n            <open-import(id, parse-file, record-declarations)>\n              ");
    const7594 = termFactory.makeString("| CurrentFile:\n            rules(CurrentFile := path);\n            <record-declarations> file\n          |");
    const7595 = termFactory.makeString(".pp.af)>]); \n    box2text-string(|100)\n\n    \n\nstrategies\n  \n  /**\n   * Processes an import during semantic analysis.\n   * Ensures proper caching of files and prevents\n   * processing duplicate imports more than once.\n   *\n   * @param resolve-path  Resolves the filesystem path of this import\n   * @param parse-file    Parses a file (optionally removing definition bodies\n   *                      so only signatures are stored in the cache)\n   * @param record-declarations\n   *                      Performs semantic analysis on a tree\n   */\n  open-import(resolve-path, parse-file, record-declarations):\n    import -> import\n    where\n      if not(!import => COMPLETION(_)) then\n        path       := <resolve-path> import;\n        cache-path := <import-cache-path> path;\n        if not(<IsImported> path) then\n          rules(\n            IsImported: path\n          );\n          ( <is-newer> (cache-path, path);\n            file := <ReadFromFile> cache-path\n          <+\n            file := <parse-file> path;\n            if <file-exists> path then\n              // Only cache if on filesystem (e.g., ignore libstratego-lib)\n              <WriteToBinaryFile> (cache-path, file)\n            end        \n          );\n          ");
    const7596 = termFactory.makeString(".generated.pp.af)>,\n               <import-term(include/");
    const7597 = termFactory.makeString("-string =\n    ast2abox(|[<import-term(include/");
    const7598 = termFactory.makeString(".tbl)>\n    )\n\n  pp-");
    const7599 = termFactory.makeString("-stream =\n    parse-stream(\n      strsglr-report-parse-error\n    | <import-term(include/");
    const7600 = termFactory.makeString("-stream\n  parse-");
    const7601 = termFactory.makeString(".tbl)>\n    )\n  \n  parse-stream = parse-");
    const7602 = termFactory.makeString("-string = \n    parse-string( \n      strsglr-report-parse-error\n    | <import-term(include/");
    const7603 = termFactory.makeString("-string \n  parse-");
    const7604 = termFactory.makeString(".tbl)>\n    )\n\n  parse-string = parse-");
    const7605 = termFactory.makeString("-file =\n    parse-file(\n      strsglr-perror, strsglr-report-parse-error\n    | <import-term(include/");
    const7606 = termFactory.makeString("-file\n  parse-");
    const7607 = termFactory.makeString(".generated\n\nmodule utils\n\nimports\n  libstratego-sglr\n  libstratego-gpp \n  \nstrategies\n\n  parse-file = parse-");
    const7608 = termFactory.makeString("editorcommon.generated");
    const7609 = termFactory.makeString("\n                     ");
    const7610 = termFactory.makeString("\n                       ");
    const7611 = termFactory.makeString("adapters");
    const7612 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spxlang-adapters'");
    const7613 = termFactory.makeString("	\n");
    const7614 = termFactory.makeString("// This module acts as adapter between editor services and respective custom transformations. \n	// It specifies Stratego transformation rules to be executed for different types of editor services. \n	// See editor-services.generated.spx for a brief introduction on the available editor services.\n	module builderDescriptor\n					\n		// Builders may carry out custom transformations on a file or selection.\n		builders\n			observer : editor-analyze         	                                                                          \n	  \n			builder  : \"Show abstract syntax (for selection)\" = generate-aterm (openeditor) (realtime) (meta) (source)\n			builder  : \"Generate Java code (for selection)\"   = generate-java (openeditor) (realtime)\n			builder  : \"Pretty-printing (for selection)\"      = prettyprint-entitylang(openeditor) (realtime)\n\n			// on save: generate-java\n						\n		// Content completion proposer and trigger is specified in the following section.\n		completions\n			completion proposer                  : editor-complete\n			completion trigger                   : \":\"\n	\n		// Reference resolving and hover help\n		references\n			reference _ : editor-resolve\n			hover _     : editor-hover\n");
    constCons4955 = (IStrategoTerm)termFactory.makeListCons(generator.const7614, (IStrategoList)generator.constNil7);
    const7615 = termFactory.makeInt(44);
    constCons4956 = (IStrategoTerm)termFactory.makeListCons(generator.const7615, (IStrategoList)generator.constNil7);
    const7616 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-builders-definition'");
    const7617 = termFactory.makeString("\n			                                      ");
    const7618 = termFactory.makeString("\")> path;\n			result   := <pp-entitylang>selected // we just return the input term\n");
    constCons4957 = (IStrategoTerm)termFactory.makeListCons(generator.const7618, (IStrategoList)generator.constNil7);
    const7619 = termFactory.makeString("module builderDefinition  \n	 	\nrules \n	// Transforms a selection to Java\n	generate-java:\n		(selected, position, ast, path, project-path) -> (filename, result)\n		with\n			filename := <guarantee-extension(|\"java\")> path;\n			result   := <to-java> selected\n	 		\n	// Prints the abstract syntax ATerm of a selection.\n	generate-aterm:\n		(selected, position, ast, path, project-path) -> (filename, result)\n		with\n			filename := <guarantee-extension(|\"aterm\")> path;\n			result   := selected // we just return the input term\n	\n	// Prints the abstract syntax ATerm of a selection.\n	prettyprint-entitylang:\n		(selected, position, ast, path, project-path) -> (filename, result)\n		with\n			filename := <guarantee-extension(|\"pp.");
    const7620 = termFactory.makeString("[Hover help: [<write-to-string> target]]\n");
    constCons4958 = (IStrategoTerm)termFactory.makeListCons(generator.const7620, (IStrategoList)generator.constNil7);
    constCons4959 = (IStrategoTerm)termFactory.makeListCons(generator.const7519, (IStrategoList)generator.constCons4958);
    const7621 = termFactory.makeString("module referenceResolver\n	\nrules\n	// Resolves a reference when the user control-clicks or presses F3 in the editor.\n  editor-resolve:\n		(node, position, ast, path, project-path) -> elem\n		where \n			<id> node => elem\n	    		 \n	// Returns \"hover help\" information for a particular node in the editor.\n	// For references, this rule is invoked using the resolved term.\n	editor-hover:\n		(target, position, ast, path, project-path) -> ");
    constCons4960 = (IStrategoTerm)termFactory.makeListCons(generator.const7621, (IStrategoList)generator.constCons4959);
    const7622 = termFactory.makeString("module contentAssistant\n\nrules\n		// Completes an identifier when the user presses control-space\n		// (the completion identifier in the AST provides additional context information)\n		editor-complete:\n			(node, position, ast, path, project-path) ->[\"String\", \"Int\" | proposals]\n			where\n				if !node => Type(COMPLETION(prefix)) then\n					proposals := <all-keys-GetEntity>\n				end\n");
    constCons4961 = (IStrategoTerm)termFactory.makeListCons(generator.const7622, (IStrategoList)generator.constNil7);
    const7623 = termFactory.makeString(".project");
    const7624 = termFactory.makeString("&lt;project&gt;/.externalToolBuilders/");
    const7625 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-project-file'");
    const7626 = termFactory.makeString("\n	      ");
    const7627 = termFactory.makeString("\n                         ");
    const7628 = termFactory.makeString("</value>\n              </dictionary>\n          </arguments>\n      </buildCommand>\n      <buildCommand>\n        <name>org.eclipse.pde.ManifestBuilder</name>\n        <arguments>\n        </arguments>\n      </buildCommand>\n      <buildCommand>\n        <name>org.eclipse.pde.SchemaBuilder</name>\n        <arguments>\n        </arguments>\n      </buildCommand>\n    </buildSpec>\n    <natures>\n      <nature>org.eclipse.pde.PluginNature</nature>\n      <nature>org.eclipse.jdt.core.javanature</nature>\n    </natures>\n</projectDescription>\n");
    constCons4962 = (IStrategoTerm)termFactory.makeListCons(generator.const7628, (IStrategoList)generator.constNil7);
    const7629 = termFactory.makeString("</name>\n	<comment></comment>\n	<buildSpec>\n      <buildCommand>\n        <name>org.eclipse.jdt.core.javabuilder</name>\n        <arguments>\n        </arguments>\n      </buildCommand>\n      <buildCommand>\n          <name>org.eclipse.ui.externaltools.ExternalToolBuilder</name>\n          <triggers>full,incremental,</triggers>\n          <arguments>\n              <dictionary>\n                  <key>LaunchConfigHandle</key>\n                  <value>");
    const7630 = termFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<projectDescription>\n	<name>");
    const7631 = termFactory.makeString("syntax/");
    const7632 = termFactory.makeString(".pp");
    const7633 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-pp-table'");
    const7634 = termFactory.makeString("\n                                   ");
    const7635 = termFactory.makeString(".generated.pp)\n[]\n");
    constCons4963 = (IStrategoTerm)termFactory.makeListCons(generator.const7635, (IStrategoList)generator.constNil7);
    const7636 = termFactory.makeString("%% Pretty printing table (see also ");
    const7637 = termFactory.makeString("syntax");
    constCons4964 = (IStrategoTerm)termFactory.makeListCons(generator.const7637, (IStrategoList)generator.constNil7);
    const7638 = termFactory.makeString("plugin.xml");
    const7639 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-plugin-xml'");
    const7640 = termFactory.makeString("\n                        ");
    const7641 = termFactory.makeString("\n                      ");
    const7642 = termFactory.makeString("\n                                 ");
    const7643 = termFactory.makeString("\n                            ");
    const7644 = termFactory.makeString("\n                                      ");
    const7645 = termFactory.makeString("\n             ");
    const7646 = termFactory.makeString("\n               ");
    const7647 = termFactory.makeString("\n                   ");
    const7648 = termFactory.makeString("\n                             ");
    const7649 = termFactory.makeString("\">\n      </parser>\n   </extension>    \n</plugin>\n");
    constCons4965 = (IStrategoTerm)termFactory.makeListCons(generator.const7649, (IStrategoList)generator.constNil7);
    const7650 = termFactory.makeString("\"\n            language=\"");
    const7651 = termFactory.makeString(" Parser\"\n         point=\"org.eclipse.imp.runtime.parser\">\n      <parser\n            class=\"");
    const7652 = termFactory.makeString(".parser\"\n         name=\"");
    const7653 = termFactory.makeString("\"\n      ></language>\n   </extension>\n   <extension\n         id=\"");
    const7654 = termFactory.makeString("\"\n            validatorClass=\"");
    const7655 = termFactory.makeString("\"\n            derivedFrom=\"DynamicRoot\"\n            validator=\"");
    const7656 = termFactory.makeString("\"\n            description=\"");
    const7657 = termFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<?eclipse version=\"3.0\"?>\n<plugin>\n   <extension\n         point=\"org.eclipse.imp.runtime.languageDescription\">\n      <language\n            extensions=\"");
    const7658 = termFactory.makeString("Could not copy or create parse table");
    const7659 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'create-parse-table'");
    const7660 = termFactory.makeString("-V");
    constCons4966 = (IStrategoTerm)termFactory.makeListCons(generator.const7660, (IStrategoList)generator.constNil7);
    const7661 = termFactory.makeString("Internal error: parse table creation failed");
    constCons4967 = (IStrategoTerm)termFactory.makeListCons(generator.const7661, (IStrategoList)generator.constNil7);
    const7662 = termFactory.makeString("Internal error: could not call sdf2table");
    constCons4968 = (IStrategoTerm)termFactory.makeListCons(generator.const7662, (IStrategoList)generator.constNil7);
    const7663 = termFactory.makeString("on");
    constCons4969 = (IStrategoTerm)termFactory.makeListCons(generator.const7663, (IStrategoList)generator.constNil7);
    const7664 = termFactory.makeString("--optimize");
    constCons4970 = (IStrategoTerm)termFactory.makeListCons(generator.const7664, (IStrategoList)generator.constCons4969);
    constCons4971 = (IStrategoTerm)termFactory.makeListCons(generator.const7663, (IStrategoList)generator.constCons4970);
    const7665 = termFactory.makeString("--open-brackets");
    constCons4972 = (IStrategoTerm)termFactory.makeListCons(generator.const7665, (IStrategoList)generator.constCons4971);
    const7666 = termFactory.makeString("org.strategoxt.permissivegrammars.main-make-permissive");
    const7667 = termFactory.makeString("Could not create permissive grammar using make-permissive");
    const7668 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'create-permissive-grammar'");
    const7669 = termFactory.makeString("-Permissive.def");
    const7670 = termFactory.makeString(".tbl");
    const7671 = termFactory.makeString("ParseController");
    const7672 = termFactory.makeString("DynamicParseController");
    constId14 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7672});
    constTypeName5 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName5, generator.constId14});
    constTypeImportDec2 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName5});
    constCons4973 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec2, (IStrategoList)generator.constNil7);
    const7673 = termFactory.makeString("DescriptorFactory");
    constId15 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7673});
    constTypeName6 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName5, generator.constId15});
    constTypeImportDec3 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName6});
    constCons4974 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec3, (IStrategoList)generator.constCons4973);
    constCons4975 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec1, (IStrategoList)generator.constCons4974);
    const7674 = termFactory.makeString("BadDescriptorException");
    constId16 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7674});
    constTypeName7 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName5, generator.constId16});
    constTypeImportDec4 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName7});
    constCons4976 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec4, (IStrategoList)generator.constCons4975);
    const7675 = termFactory.makeString("Environment");
    constId17 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7675});
    constTypeName8 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName3, generator.constId17});
    constTypeImportDec5 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName8});
    constCons4977 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec5, (IStrategoList)generator.constCons4976);
    const7676 = termFactory.makeString("eclipse");
    constId18 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7676});
    constPackageOrTypeName6 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName0, generator.constId18});
    constPackageOrTypeName7 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName6, generator.constId6});
    const7677 = termFactory.makeString("parser");
    constId19 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7677});
    constPackageOrTypeName8 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName7, generator.constId19});
    const7678 = termFactory.makeString("IParseController");
    constId20 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7678});
    constTypeName9 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName8, generator.constId20});
    constTypeImportDec6 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName9});
    constCons4978 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec6, (IStrategoList)generator.constCons4977);
    const7679 = termFactory.makeString("core");
    constId21 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7679});
    constPackageOrTypeName9 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName6, generator.constId21});
    constPackageOrTypeName10 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName9, generator.constId7});
    const7680 = termFactory.makeString("Path");
    constId22 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7680});
    constTypeName10 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName10, generator.constId22});
    constTypeImportDec7 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName10});
    constCons4979 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec7, (IStrategoList)generator.constCons4978);
    constId23 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7134});
    constPackageOrTypeName11 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_1, new IStrategoTerm[]{generator.constId23});
    const7681 = termFactory.makeString("io");
    constId24 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7681});
    constPackageOrTypeName12 = termFactory.makeAppl(SpoofaxGenerator._consPackageOrTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName11, generator.constId24});
    const7682 = termFactory.makeString("FileInputStream");
    constId25 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7682});
    constTypeName11 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName12, generator.constId25});
    constTypeImportDec8 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName11});
    constCons4980 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec8, (IStrategoList)generator.constCons4979);
    const7683 = termFactory.makeString("File");
    constId26 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7683});
    constTypeName12 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName12, generator.constId26});
    constTypeImportDec9 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName12});
    constCons4981 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec9, (IStrategoList)generator.constCons4980);
    const7684 = termFactory.makeString("IOException");
    constId27 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7684});
    constTypeName13 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName12, generator.constId27});
    constTypeImportDec10 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName13});
    constCons4982 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec10, (IStrategoList)generator.constCons4981);
    const7685 = termFactory.makeString("InputStream");
    constId28 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7685});
    constTypeName14 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_2, new IStrategoTerm[]{generator.constPackageOrTypeName12, generator.constId28});
    constTypeImportDec11 = termFactory.makeAppl(SpoofaxGenerator._consTypeImportDec_1, new IStrategoTerm[]{generator.constTypeName14});
    constCons4983 = (IStrategoTerm)termFactory.makeListCons(generator.constTypeImportDec11, (IStrategoList)generator.constCons4982);
    constTypeName15 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId14});
    constClassType1 = termFactory.makeAppl(SpoofaxGenerator._consClassType_2, new IStrategoTerm[]{generator.constTypeName15, generator.constNone0});
    constSuperDec1 = termFactory.makeAppl(SpoofaxGenerator._consSuperDec_1, new IStrategoTerm[]{generator.constClassType1});
    constSome1 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constSuperDec1});
    constProtected0 = termFactory.makeAppl(SpoofaxGenerator._consProtected_0, NO_TERMS);
    constCons4984 = (IStrategoTerm)termFactory.makeListCons(generator.constProtected0, (IStrategoList)generator.constNil7);
    constCons4985 = (IStrategoTerm)termFactory.makeListCons(generator.constMarkerAnno0, (IStrategoList)generator.constCons4984);
    constVoid0 = termFactory.makeAppl(SpoofaxGenerator._consVoid_0, NO_TERMS);
    const7686 = termFactory.makeString("setNotLoadingCause");
    constId29 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7686});
    const7687 = termFactory.makeString("Throwable");
    constId30 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7687});
    constTypeName16 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId30});
    constClassOrInterfaceType1 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName16, generator.constNone0});
    const7688 = termFactory.makeString("value");
    constId31 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7688});
    constParam0 = termFactory.makeAppl(SpoofaxGenerator._consParam_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType1, generator.constId31});
    constCons4986 = (IStrategoTerm)termFactory.makeListCons(generator.constParam0, (IStrategoList)generator.constNil7);
    constMethodDecHead1 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons4985, generator.constNone0, generator.constVoid0, generator.constId29, generator.constCons4986, generator.constNone0});
    constSuperMethod0 = termFactory.makeAppl(SpoofaxGenerator._consSuperMethod_2, new IStrategoTerm[]{generator.constNone0, generator.constId29});
    constExprName3 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId31});
    constCons4987 = (IStrategoTerm)termFactory.makeListCons(generator.constExprName3, (IStrategoList)generator.constNil7);
    constInvoke0 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constSuperMethod0, generator.constCons4987});
    constExprStm0 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constInvoke0});
    constCons4988 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm0, (IStrategoList)generator.constNil7);
    const7689 = termFactory.makeString("notLoadingCause");
    constId32 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7689});
    constExprName4 = termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{generator.constId32});
    constAssign0 = termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{generator.constExprName4, generator.constExprName3});
    constExprStm1 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constAssign0});
    constCons4989 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm1, (IStrategoList)generator.constCons4988);
    constBlock0 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons4989});
    constMethodDec0 = termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead1, generator.constBlock0});
    constCons4990 = (IStrategoTerm)termFactory.makeListCons(generator.constMethodDec0, (IStrategoList)generator.constNil7);
    constTypeName17 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId20});
    constClassOrInterfaceType2 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName17, generator.constNone0});
    const7690 = termFactory.makeString("getWrapped");
    constId33 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7690});
    constMethodDecHead2 = termFactory.makeAppl(SpoofaxGenerator._consMethodDecHead_6, new IStrategoTerm[]{generator.constCons4930, generator.constNone0, generator.constClassOrInterfaceType2, generator.constId33, generator.constNil7, generator.constNone0});
    constSuperMethod1 = termFactory.makeAppl(SpoofaxGenerator._consSuperMethod_2, new IStrategoTerm[]{generator.constNone0, generator.constId33});
    constInvoke1 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constSuperMethod1, generator.constNil7});
    constSome2 = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{generator.constInvoke1});
    constReturn0 = termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{generator.constSome2});
    constCons4991 = (IStrategoTerm)termFactory.makeListCons(generator.constReturn0, (IStrategoList)generator.constNil7);
    const7691 = termFactory.makeString("isInitialized");
    constId34 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7691});
    constMethodName0 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_1, new IStrategoTerm[]{generator.constId34});
    constMethod0 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName0});
    constInvoke2 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod0, generator.constNil7});
    constNot0 = termFactory.makeAppl(SpoofaxGenerator._consNot_1, new IStrategoTerm[]{generator.constInvoke2});
    const7692 = termFactory.makeString("initialize");
    constId35 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7692});
    constMethodName1 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_1, new IStrategoTerm[]{generator.constId35});
    constMethod1 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName1});
    constMethodName2 = termFactory.makeAppl(SpoofaxGenerator._consMethodName_1, new IStrategoTerm[]{generator.constId13});
    constMethod2 = termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{generator.constMethodName2});
    constInvoke3 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod2, generator.constNil7});
    const7693 = termFactory.makeString("getLanguage");
    constId36 = termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{generator.const7693});
    constMethod3 = termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{generator.constInvoke3, generator.constNone0, generator.constId36});
    constInvoke4 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod3, generator.constNil7});
    constCons4992 = (IStrategoTerm)termFactory.makeListCons(generator.constInvoke4, (IStrategoList)generator.constNil7);
    constThis0 = termFactory.makeAppl(SpoofaxGenerator._consThis_0, NO_TERMS);
    constCons4993 = (IStrategoTerm)termFactory.makeListCons(generator.constThis0, (IStrategoList)generator.constCons4992);
    constInvoke5 = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod1, generator.constCons4993});
    constExprStm2 = termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{generator.constInvoke5});
    constCons4994 = (IStrategoTerm)termFactory.makeListCons(generator.constExprStm2, (IStrategoList)generator.constNil7);
    constBlock1 = termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{generator.constCons4994});
    constTypeName18 = termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{generator.constId16});
    constClassOrInterfaceType3 = termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{generator.constTypeName18, generator.constNone0});
    const7694 = termFactory.makeString("exc");
  }

  private static void initConstants29(ITermFactory termFactory)
  { 
    initConstants28(termFactory);
    constCons4659 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4658);
    const7223 = termFactory.makeString("   reference FunctionCall : resolve-function-call ");
    constCommentLine15 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7223});
    constCons4660 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine15, (IStrategoList)generator.constCons4659);
    constCons4661 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4660);
    const7224 = termFactory.makeString(" a reference resolving function is available:");
    constCommentLine16 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7224});
    constCons4662 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine16, (IStrategoList)generator.constCons4661);
    const7225 = termFactory.makeString(" Reference resolving rules can specify the syntax constructors for which");
    constCommentLine17 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7225});
    constCons4663 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine17, (IStrategoList)generator.constCons4662);
    constCons4664 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4663);
    constReferences0 = termFactory.makeAppl(SpoofaxGenerator._consReferences_2, new IStrategoTerm[]{generator.const7000, generator.constCons4664});
    constCons4665 = (IStrategoTerm)termFactory.makeListCons(generator.constReferences0, (IStrategoList)generator.constNil7);
    const7226 = termFactory.makeString("-References");
    const7227 = termFactory.makeString("editor-hover");
    constStrategy0 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7227});
    constHoverRule0 = termFactory.makeAppl(SpoofaxGenerator._consHoverRule_2, new IStrategoTerm[]{generator.const7120, generator.constStrategy0});
    constCons4666 = (IStrategoTerm)termFactory.makeListCons(generator.constHoverRule0, (IStrategoList)generator.constNil7);
    const7228 = termFactory.makeString("editor-resolve");
    constStrategy1 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7228});
    constReferenceRule0 = termFactory.makeAppl(SpoofaxGenerator._consReferenceRule_2, new IStrategoTerm[]{generator.const7120, generator.constStrategy1});
    constCons4667 = (IStrategoTerm)termFactory.makeListCons(generator.constReferenceRule0, (IStrategoList)generator.constCons4666);
    constCons4668 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4667);
    constReferences1 = termFactory.makeAppl(SpoofaxGenerator._consReferences_2, new IStrategoTerm[]{generator.const7000, generator.constCons4668});
    constCons4669 = (IStrategoTerm)termFactory.makeListCons(generator.constReferences1, (IStrategoList)generator.constNil7);
    constCons4670 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constNil7);
    constCons4671 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine0, (IStrategoList)generator.constCons4670);
    constCons4672 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4671);
    const7229 = termFactory.makeString(" This file can be used to specify reference resolving and hover help, and content completion.");
    constCommentLine18 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7229});
    constCons4673 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine18, (IStrategoList)generator.constCons4672);
    constCons4674 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4673);
    constReferences2 = termFactory.makeAppl(SpoofaxGenerator._consReferences_2, new IStrategoTerm[]{generator.const7000, generator.constCons4674});
    constCons4675 = (IStrategoTerm)termFactory.makeListCons(generator.constReferences2, (IStrategoList)generator.constCons4669);
    const7230 = termFactory.makeString("referenceDescriptor");
    const7231 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-references-descriptor'");
    const7232 = termFactory.makeString("-Outliner");
    const7233 = termFactory.makeString(" This file can be used for custom outliner rules.");
    constCommentLine19 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7233});
    constCons4676 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine19, (IStrategoList)generator.constCons4621);
    constCons4677 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4676);
    constOutliner0 = termFactory.makeAppl(SpoofaxGenerator._consOutliner_2, new IStrategoTerm[]{generator.const7000, generator.constCons4677});
    constCons4678 = (IStrategoTerm)termFactory.makeListCons(generator.constOutliner0, (IStrategoList)generator.constNil7);
    const7234 = termFactory.makeString("-Outliner.generated");
    const7235 = termFactory.makeString(" Default outliner        ");
    const7236 = termFactory.makeString("   _.<constructor>");
    constCommentLine20 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7236});
    constCons4679 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine20, (IStrategoList)generator.constCons4670);
    constCons4680 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4679);
    const7237 = termFactory.makeString("   <sort>._");
    constCommentLine21 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7237});
    constCons4681 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine21, (IStrategoList)generator.constCons4680);
    constCons4682 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4681);
    const7238 = termFactory.makeString("   <sort>.<constructor>");
    constCommentLine22 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7238});
    constCons4683 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine22, (IStrategoList)generator.constCons4682);
    constCons4684 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4683);
    const7239 = termFactory.makeString(" and quick outline views, and take one of the following forms:");
    constCommentLine23 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7239});
    constCons4685 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine23, (IStrategoList)generator.constCons4684);
    const7240 = termFactory.makeString(" Outliner rules indicate which syntactic constructs should be shown in the outline");
    constCommentLine24 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7240});
    constCons4686 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine24, (IStrategoList)generator.constCons4685);
    constCons4687 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4686);
    constOutliner1 = termFactory.makeAppl(SpoofaxGenerator._consOutliner_2, new IStrategoTerm[]{generator.const7235, generator.constCons4687});
    constCons4688 = (IStrategoTerm)termFactory.makeListCons(generator.constOutliner1, (IStrategoList)generator.constNil7);
    const7241 = termFactory.makeString("outlineDescriptor");
    const7242 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-outliner-descriptor'");
    const7243 = termFactory.makeString("\n	Start.Module\n	Definition.Entity\n");
    constCons4689 = (IStrategoTerm)termFactory.makeListCons(generator.const7243, (IStrategoList)generator.constNil7);
    const7244 = termFactory.makeString("\n		 	\n");
    const7245 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-outliner-descriptor'");
    const7246 = termFactory.makeString("\n	\n");
    constCons4690 = (IStrategoTerm)termFactory.makeListCons(generator.const7246, (IStrategoList)generator.constNil7);
    const7247 = termFactory.makeString("\n	 	\n");
    const7248 = termFactory.makeString("  and:         ");
    const7249 = termFactory.makeString("Outliner match:");
    const7250 = termFactory.makeString("  because:     ");
    const7251 = termFactory.makeString("MainDescriptor");
    const7252 = termFactory.makeString("-38923");
    const7253 = termFactory.makeString("File extensions (-e)");
    const7254 = termFactory.makeString("-Builders");
    const7255 = termFactory.makeString("-Colorer");
    const7256 = termFactory.makeString("-Completions");
    const7257 = termFactory.makeString("-Folding");
    const7258 = termFactory.makeString("\"Spoofax/IMP-generated editor for the ");
    const7259 = termFactory.makeString(" language\"");
    const7260 = termFactory.makeString(" General properties");
    const7261 = termFactory.makeString("http://strategoxt.org");
    constURL0 = termFactory.makeAppl(SpoofaxGenerator._consURL_1, new IStrategoTerm[]{generator.const7261});
    const7262 = termFactory.makeString("Root");
    constCons4691 = (IStrategoTerm)termFactory.makeListCons(generator.const7262, (IStrategoList)generator.constNil7);
    constValues0 = termFactory.makeAppl(SpoofaxGenerator._consValues_1, new IStrategoTerm[]{generator.constCons4691});
    constExtends0 = termFactory.makeAppl(SpoofaxGenerator._consExtends_1, new IStrategoTerm[]{generator.constValues0});
    const7263 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'default-spx-main-descriptor'");
    const7264 = termFactory.makeString("-Descriptor");
    constCons4692 = (IStrategoTerm)termFactory.makeListCons(generator.const7264, (IStrategoList)generator.constNil7);
    const7265 = termFactory.makeString("\"Spoofax/IMP-generated(using spoofaxlang) editor for the ");
    const7266 = termFactory.makeString(" language \"");
    const7267 = termFactory.makeString(" This file can be used for custom folding rules.");
    constCommentLine25 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7267});
    constCons4693 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine25, (IStrategoList)generator.constCons4621);
    constCons4694 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4693);
    constFolding0 = termFactory.makeAppl(SpoofaxGenerator._consFolding_2, new IStrategoTerm[]{generator.const7000, generator.constCons4694});
    constCons4695 = (IStrategoTerm)termFactory.makeListCons(generator.constFolding0, (IStrategoList)generator.constNil7);
    const7268 = termFactory.makeString("-Folding.generated");
    const7269 = termFactory.makeString(" Default folding definitions");
    const7270 = termFactory.makeString("   Definition._ (disabled)");
    constCommentLine26 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7270});
    constCons4696 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine26, (IStrategoList)generator.constCons4670);
    constCons4697 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4696);
    const7271 = termFactory.makeString(" To disable a folding rule defined elsewhere, add a (disabled) annotation:");
    constCommentLine27 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7271});
    constCons4698 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine27, (IStrategoList)generator.constCons4697);
    constCons4699 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4698);
    const7272 = termFactory.makeString("   _.Imports (folded)");
    constCommentLine28 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7272});
    constCons4700 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine28, (IStrategoList)generator.constCons4699);
    constCons4701 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4700);
    const7273 = termFactory.makeString(" a (folded) annotation:");
    constCommentLine29 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7273});
    constCons4702 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine29, (IStrategoList)generator.constCons4701);
    const7274 = termFactory.makeString(" To indicate that an element should always be folded, add");
    constCommentLine30 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7274});
    constCons4703 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine30, (IStrategoList)generator.constCons4702);
    constCons4704 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4703);
    constCons4705 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine20, (IStrategoList)generator.constCons4704);
    constCons4706 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4705);
    constCons4707 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine21, (IStrategoList)generator.constCons4706);
    constCons4708 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4707);
    constCons4709 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine22, (IStrategoList)generator.constCons4708);
    constCons4710 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4709);
    const7275 = termFactory.makeString(" and take one of the following forms:");
    constCommentLine31 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7275});
    constCons4711 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine31, (IStrategoList)generator.constCons4710);
    const7276 = termFactory.makeString(" Folding rules indicate which syntactic constructs can be folded,");
    constCommentLine32 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7276});
    constCons4712 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine32, (IStrategoList)generator.constCons4711);
    constCons4713 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4712);
    constFolding1 = termFactory.makeAppl(SpoofaxGenerator._consFolding_2, new IStrategoTerm[]{generator.const7269, generator.constCons4713});
    constCons4714 = (IStrategoTerm)termFactory.makeListCons(generator.constFolding1, (IStrategoList)generator.constNil7);
    const7277 = termFactory.makeString("foldingDescriptor");
    const7278 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-contentfolding-descriptor'");
    const7279 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-contentfolding-descriptor'");
    const7280 = termFactory.makeString("Folding match:");
    const7281 = termFactory.makeString("Property");
    constSort0 = termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{generator.const7281});
    constCons4715 = (IStrategoTerm)termFactory.makeListCons(generator.constSort0, (IStrategoList)generator.constNil7);
    const7282 = termFactory.makeString("property : Type");
    constString7 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7282});
    constCompletionPrefix0 = termFactory.makeAppl(SpoofaxGenerator._consCompletionPrefix_1, new IStrategoTerm[]{generator.constString7});
    const7283 = termFactory.makeString("<T>");
    constPlaceholder0 = termFactory.makeAppl(SpoofaxGenerator._consPlaceholder_1, new IStrategoTerm[]{generator.const7283});
    constCons4716 = (IStrategoTerm)termFactory.makeListCons(generator.constPlaceholder0, (IStrategoList)generator.constNil7);
    const7284 = termFactory.makeString(" : ");
    constString8 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7284});
    constCons4717 = (IStrategoTerm)termFactory.makeListCons(generator.constString8, (IStrategoList)generator.constCons4716);
    const7285 = termFactory.makeString("<x>");
    constPlaceholder1 = termFactory.makeAppl(SpoofaxGenerator._consPlaceholder_1, new IStrategoTerm[]{generator.const7285});
    constCons4718 = (IStrategoTerm)termFactory.makeListCons(generator.constPlaceholder1, (IStrategoList)generator.constCons4717);
    constBlank0 = termFactory.makeAppl(SpoofaxGenerator._consBlank_0, NO_TERMS);
    constCons4719 = (IStrategoTerm)termFactory.makeListCons(generator.constBlank0, (IStrategoList)generator.constNil7);
    constCompletionTemplateEx0 = termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplateEx_4, new IStrategoTerm[]{generator.constCons4715, generator.constCompletionPrefix0, generator.constCons4718, generator.constCons4719});
    constCons4720 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTemplateEx0, (IStrategoList)generator.constCons4670);
    constCons4721 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4720);
    constSort1 = termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{generator.const7032});
    constCons4722 = (IStrategoTerm)termFactory.makeListCons(generator.constSort1, (IStrategoList)generator.constNil7);
    constNoCompletionPrefix0 = termFactory.makeAppl(SpoofaxGenerator._consNoCompletionPrefix_0, NO_TERMS);
    constString9 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7180});
    constCons4723 = (IStrategoTerm)termFactory.makeListCons(generator.constString9, (IStrategoList)generator.constNil7);
    constCursor0 = termFactory.makeAppl(SpoofaxGenerator._consCursor_0, NO_TERMS);
    constCons4724 = (IStrategoTerm)termFactory.makeListCons(generator.constCursor0, (IStrategoList)generator.constCons4723);
    const7286 = termFactory.makeString(" {");
    constString10 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7286});
    constCons4725 = (IStrategoTerm)termFactory.makeListCons(generator.constString10, (IStrategoList)generator.constCons4724);
    const7287 = termFactory.makeString("<e>");
    constPlaceholder2 = termFactory.makeAppl(SpoofaxGenerator._consPlaceholder_1, new IStrategoTerm[]{generator.const7287});
    constCons4726 = (IStrategoTerm)termFactory.makeListCons(generator.constPlaceholder2, (IStrategoList)generator.constCons4725);
    const7288 = termFactory.makeString("entity ");
    constString11 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7288});
    constCons4727 = (IStrategoTerm)termFactory.makeListCons(generator.constString11, (IStrategoList)generator.constCons4726);
    constCompletionTemplateEx1 = termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplateEx_4, new IStrategoTerm[]{generator.constCons4722, generator.constNoCompletionPrefix0, generator.constCons4727, generator.constCons4719});
    constCons4728 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTemplateEx1, (IStrategoList)generator.constCons4721);
    constCons4729 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4728);
    const7289 = termFactory.makeString("Start");
    constSort2 = termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{generator.const7289});
    constCons4730 = (IStrategoTerm)termFactory.makeListCons(generator.constSort2, (IStrategoList)generator.constNil7);
    const7290 = termFactory.makeString("<m>");
    constPlaceholder3 = termFactory.makeAppl(SpoofaxGenerator._consPlaceholder_1, new IStrategoTerm[]{generator.const7290});
    constCons4731 = (IStrategoTerm)termFactory.makeListCons(generator.constPlaceholder3, (IStrategoList)generator.constNil7);
    constString12 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7191});
    constCons4732 = (IStrategoTerm)termFactory.makeListCons(generator.constString12, (IStrategoList)generator.constCons4731);
    constCompletionTemplateEx2 = termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplateEx_4, new IStrategoTerm[]{generator.constCons4730, generator.constNoCompletionPrefix0, generator.constCons4732, generator.constCons4719});
    constCons4733 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTemplateEx2, (IStrategoList)generator.constCons4729);
    constCons4734 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4733);
    const7291 = termFactory.makeString(" Syntax completion:");
    constCommentLine33 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7291});
    constCons4735 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine33, (IStrategoList)generator.constCons4734);
    constCons4736 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4735);
    constCompletions0 = termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, generator.constCons4736});
    constCons4737 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletions0, (IStrategoList)generator.constNil7);
    const7292 = termFactory.makeString(" This module is used to define content completion.");
    constCommentLine34 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7292});
    constCons4738 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine34, (IStrategoList)generator.constCons4672);
    constCons4739 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4738);
    constCompletions1 = termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, generator.constCons4739});
    constCons4740 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletions1, (IStrategoList)generator.constCons4737);
    const7293 = termFactory.makeString("-Completions.generated");
    const7294 = termFactory.makeString(" Semantic completion uses the semantic provider defined in YourLanguage-Builders.esv");
    constCommentLine35 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7294});
    constCons4741 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine35, (IStrategoList)generator.constCons4650);
    constCons4742 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4741);
    const7295 = termFactory.makeString(" to select identifiers in completion suggestions.");
    constCommentLine36 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7295});
    constCons4743 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine36, (IStrategoList)generator.constCons4742);
    const7296 = termFactory.makeString(" Completions make use of the identifier lexical defined in YourLanguage-Syntax.esv");
    constCommentLine37 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7296});
    constCons4744 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine37, (IStrategoList)generator.constCons4743);
    constCons4745 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4744);
    const7297 = termFactory.makeString(" completions should be proposed as the user types \".\".");
    constCommentLine38 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7297});
    constCons4746 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine38, (IStrategoList)generator.constCons4745);
    const7298 = termFactory.makeString(" The completion trigger uses a regular expression to specify that");
    constCommentLine39 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7298});
    constCons4747 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine39, (IStrategoList)generator.constCons4746);
    const7299 = termFactory.makeString(" to parse identifiers (used to set the text selection with suggestions).");
    constCommentLine40 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7299});
    constCons4748 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine40, (IStrategoList)generator.constCons4747);
    const7300 = termFactory.makeString(" and declares that [A-Za-z0-9_]+ may be used as a lexical pattern");
    constCommentLine41 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7300});
    constCons4749 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine41, (IStrategoList)generator.constCons4748);
    const7301 = termFactory.makeString(" This sets completion-function-call as the completion strategy,");
    constCommentLine42 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7301});
    constCons4750 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine42, (IStrategoList)generator.constCons4749);
    constCons4751 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4750);
    const7302 = termFactory.makeString("   completion trigger  : \"\\.\"");
    constCommentLine43 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7302});
    constCons4752 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine43, (IStrategoList)generator.constCons4751);
    const7303 = termFactory.makeString("   completion proposer : completion-function-call");
    constCommentLine44 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7303});
    constCons4753 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine44, (IStrategoList)generator.constCons4752);
    constCons4754 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4753);
    const7304 = termFactory.makeString(" Semantic content completion can be defined as follows:");
    constCommentLine45 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7304});
    constCons4755 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine45, (IStrategoList)generator.constCons4754);
    constCons4756 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4755);
    const7305 = termFactory.makeString("     <x> \" = \" <y> (blank)");
    constCommentLine46 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7305});
    constCons4757 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine46, (IStrategoList)generator.constCons4756);
    const7306 = termFactory.makeString("   completion template Statement : \"assignment\" =");
    constCommentLine47 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7306});
    constCons4758 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine47, (IStrategoList)generator.constCons4757);
    constCons4759 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4758);
    const7307 = termFactory.makeString(" Finally, you can override the prefix of the completion:");
    constCommentLine48 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7307});
    constCons4760 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine48, (IStrategoList)generator.constCons4759);
    constCons4761 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4760);
    const7308 = termFactory.makeString("     \"section \" <title> \"\\n\\t\" (blank)");
    constCommentLine49 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7308});
    constCons4762 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine49, (IStrategoList)generator.constCons4761);
    const7309 = termFactory.makeString("   completion template Section :");
    constCommentLine50 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7309});
    constCons4763 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine50, (IStrategoList)generator.constCons4762);
    constCons4764 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4763);
    const7310 = termFactory.makeString(" rule should trigger as follows:");
    constCommentLine51 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7310});
    constCons4765 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine51, (IStrategoList)generator.constCons4764);
    const7311 = termFactory.makeString(" You can specify a specific SDF sort for which a completion");
    constCommentLine52 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7311});
    constCons4766 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine52, (IStrategoList)generator.constCons4765);
    constCons4767 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4766);
    const7312 = termFactory.makeString("   completion template: \"section \" <title> \"\\n\\t\" (blank)");
    constCommentLine53 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7312});
    constCons4768 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine53, (IStrategoList)generator.constCons4767);
    constCons4769 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4768);
    const7313 = termFactory.makeString(" appear on blank lines:");
    constCommentLine54 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7313});
    constCons4770 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine54, (IStrategoList)generator.constCons4769);
    const7314 = termFactory.makeString(" Use the (blank) annotation if you want a template completion only to");
    constCommentLine55 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7314});
    constCons4771 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine55, (IStrategoList)generator.constCons4770);
    constCons4772 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4771);
    const7315 = termFactory.makeString(" enclosed in <> brackets.");
    constCommentLine56 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7315});
    constCons4773 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine56, (IStrategoList)generator.constCons4772);
    const7316 = termFactory.makeString(" In this template, the text selection expands to the \"e\" placeholder identifier");
    constCommentLine57 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7316});
    constCons4774 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine57, (IStrategoList)generator.constCons4773);
    const7317 = termFactory.makeString(" a template completion for the \"if\" keyword (note the use of \\n, \\t, and spaces).");
    constCommentLine58 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7317});
    constCons4775 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine58, (IStrategoList)generator.constCons4774);
    const7318 = termFactory.makeString(" This defines keyword completion for \"keyword\" and");
    constCommentLine59 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7318});
    constCons4776 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine59, (IStrategoList)generator.constCons4775);
    constCons4777 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4776);
    const7319 = termFactory.makeString("   completion template : \"if \" <e> \" then\\n\\t\" <s> \"\\nend\"");
    constCommentLine60 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7319});
    constCons4778 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine60, (IStrategoList)generator.constCons4777);
    const7320 = termFactory.makeString("   completion keyword  : \"keyword\"");
    constCommentLine61 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7320});
    constCons4779 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine61, (IStrategoList)generator.constCons4778);
    constCons4780 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4779);
    const7321 = termFactory.makeString(" Syntactic content completion can be defined as follows:");
    constCommentLine62 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7321});
    constCons4781 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine62, (IStrategoList)generator.constCons4780);
    constCons4782 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4781);
    constCompletions2 = termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, generator.constCons4782});
    constCons4783 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletions2, (IStrategoList)generator.constNil7);
    const7322 = termFactory.makeString("completionDescriptor");
    const7323 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-contentcompletion-descriptor'");
    const7324 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-contentcompletion-descriptor'");
    constCompletionTrigger0 = termFactory.makeAppl(SpoofaxGenerator._consCompletionTrigger_2, new IStrategoTerm[]{generator.constString2, generator.constNone0});
    constCons4784 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTrigger0, (IStrategoList)generator.constNil7);
    constCons4785 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4784);
    const7325 = termFactory.makeString("editor-complete");
    constStrategy2 = termFactory.makeAppl(SpoofaxGenerator._consStrategy_1, new IStrategoTerm[]{generator.const7325});
    constCompletionProposer0 = termFactory.makeAppl(SpoofaxGenerator._consCompletionProposer_1, new IStrategoTerm[]{generator.constStrategy2});
    constCons4786 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionProposer0, (IStrategoList)generator.constCons4785);
    constCons4787 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4786);
    const7326 = termFactory.makeString(" Semantic (identifier) completion:");
    constCommentLine63 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7326});
    constCons4788 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine63, (IStrategoList)generator.constCons4787);
    constCompletions3 = termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, generator.constCons4788});
    constCons4789 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletions3, (IStrategoList)generator.constNil7);
    const7327 = termFactory.makeString("prop");
    constString13 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7327});
    constCompletionPrefix1 = termFactory.makeAppl(SpoofaxGenerator._consCompletionPrefix_1, new IStrategoTerm[]{generator.constString13});
    constCompletionTemplateEx3 = termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplateEx_4, new IStrategoTerm[]{generator.constCons4715, generator.constCompletionPrefix1, generator.constCons4718, generator.constCons4719});
    constCons4790 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTemplateEx3, (IStrategoList)generator.constCons4670);
    constCons4791 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4790);
    constCons4792 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTemplateEx1, (IStrategoList)generator.constCons4791);
    constCons4793 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4792);
    constCons4794 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletionTemplateEx2, (IStrategoList)generator.constCons4793);
    constCons4795 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4794);
    constCons4796 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine33, (IStrategoList)generator.constCons4795);
    constCons4797 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4796);
    constCompletions4 = termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, generator.constCons4797});
    constCons4798 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletions4, (IStrategoList)generator.constCons4789);
    const7328 = termFactory.makeString(" This file is used to define content completion.");
    constCommentLine64 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7328});
    constCons4799 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine64, (IStrategoList)generator.constCons4672);
    constCons4800 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4799);
    constCompletions5 = termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, generator.constCons4800});
    constCons4801 = (IStrategoTerm)termFactory.makeListCons(generator.constCompletions5, (IStrategoList)generator.constCons4798);
    const7329 = termFactory.makeString(" Derived completions may follow");
    constCommentLine65 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7329});
    const7330 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'pattern-to-keywords-1'");
    const7331 = termFactory.makeString("-Colorer.generated");
    const7332 = termFactory.makeString("   ");
    const7333 = termFactory.makeString("Type");
    constSort3 = termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{generator.const7333});
    const7334 = termFactory.makeString("66");
    const7335 = termFactory.makeString("92");
    const7336 = termFactory.makeString("217");
    constColorRGB0 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7334, generator.const7335, generator.const7336});
    constNoColor0 = termFactory.makeAppl(SpoofaxGenerator._consNoColor_0, NO_TERMS);
    constBOLD0 = termFactory.makeAppl(SpoofaxGenerator._consBOLD_0, NO_TERMS);
    constAttribute0 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB0, generator.constNoColor0, generator.constBOLD0});
    constColorRule0 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constSort3, generator.constAttribute0});
    constCons4802 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule0, (IStrategoList)generator.constNil7);
    constCons4803 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4802);
    constColorer0 = termFactory.makeAppl(SpoofaxGenerator._consColorer_2, new IStrategoTerm[]{generator.const7332, generator.constCons4803});
    constCons4804 = (IStrategoTerm)termFactory.makeListCons(generator.constColorer0, (IStrategoList)generator.constNil7);
    const7337 = termFactory.makeString(" This file can be used for custom colorer rules.");
    constCommentLine66 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7337});
    constCons4805 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine66, (IStrategoList)generator.constCons4621);
    constCons4806 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4805);
    constColorer1 = termFactory.makeAppl(SpoofaxGenerator._consColorer_2, new IStrategoTerm[]{generator.const7000, generator.constCons4806});
    constCons4807 = (IStrategoTerm)termFactory.makeListCons(generator.constColorer1, (IStrategoList)generator.constCons4804);
    const7338 = termFactory.makeString(" System colors");
    const7339 = termFactory.makeString("default");
    constColorDefault0 = termFactory.makeAppl(SpoofaxGenerator._consColorDefault_0, NO_TERMS);
    constNORMAL0 = termFactory.makeAppl(SpoofaxGenerator._consNORMAL_0, NO_TERMS);
    constAttribute1 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorDefault0, generator.constNoColor0, generator.constNORMAL0});
    constColorDef0 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7339, generator.constAttribute1});
    constCons4808 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef0, (IStrategoList)generator.constNil7);
    const7340 = termFactory.makeString("brown");
    const7341 = termFactory.makeString("139");
    const7342 = termFactory.makeString("69");
    const7343 = termFactory.makeString("19");
    constColorRGB1 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7341, generator.const7342, generator.const7343});
    constAttribute2 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB1, generator.constNoColor0, generator.constNORMAL0});
    constColorDef1 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7340, generator.constAttribute2});
    constCons4809 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef1, (IStrategoList)generator.constCons4808);
    const7344 = termFactory.makeString("pink");
    const7345 = termFactory.makeString("255");
    const7346 = termFactory.makeString("105");
    const7347 = termFactory.makeString("180");
    constColorRGB2 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const7346, generator.const7347});
    constAttribute3 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB2, generator.constNoColor0, generator.constNORMAL0});
    constColorDef2 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7344, generator.constAttribute3});
    constCons4810 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef2, (IStrategoList)generator.constCons4809);
    const7348 = termFactory.makeString("orange");
    const7349 = termFactory.makeString("165");
    constColorRGB3 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const7349, generator.const6942});
    constAttribute4 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB3, generator.constNoColor0, generator.constNORMAL0});
    constColorDef3 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7348, generator.constAttribute4});
    constCons4811 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef3, (IStrategoList)generator.constCons4810);
    const7350 = termFactory.makeString("grey");
    const7351 = termFactory.makeString("gray");
    constAttributeRef0 = termFactory.makeAppl(SpoofaxGenerator._consAttributeRef_1, new IStrategoTerm[]{generator.const7351});
    constColorDef4 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7350, generator.constAttributeRef0});
    constCons4812 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef4, (IStrategoList)generator.constCons4811);
    const7352 = termFactory.makeString("128");
    constColorRGB4 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7352, generator.const7352, generator.const7352});
    constAttribute5 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB4, generator.constNoColor0, generator.constNORMAL0});
    constColorDef5 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7351, generator.constAttribute5});
    constCons4813 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef5, (IStrategoList)generator.constCons4812);
    const7353 = termFactory.makeString("black");
    constColorRGB5 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const6942, generator.const6942, generator.const6942});
    constAttribute6 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB5, generator.constNoColor0, generator.constNORMAL0});
    constColorDef6 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7353, generator.constAttribute6});
    constCons4814 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef6, (IStrategoList)generator.constCons4813);
    const7354 = termFactory.makeString("white");
    constColorRGB6 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const7345, generator.const7345});
    constAttribute7 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB6, generator.constNoColor0, generator.constNORMAL0});
    constColorDef7 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7354, generator.constAttribute7});
    constCons4815 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef7, (IStrategoList)generator.constCons4814);
    const7355 = termFactory.makeString("yellow");
    constColorRGB7 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const7345, generator.const6942});
    constAttribute8 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB7, generator.constNoColor0, generator.constNORMAL0});
    constColorDef8 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7355, generator.constAttribute8});
    constCons4816 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef8, (IStrategoList)generator.constCons4815);
    const7356 = termFactory.makeString("magenta");
    constColorRGB8 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const6942, generator.const7345});
    constAttribute9 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB8, generator.constNoColor0, generator.constNORMAL0});
    constColorDef9 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7356, generator.constAttribute9});
    constCons4817 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef9, (IStrategoList)generator.constCons4816);
    const7357 = termFactory.makeString("cyan");
    constColorRGB9 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const6942, generator.const7345, generator.const7345});
    constAttribute10 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB9, generator.constNoColor0, generator.constNORMAL0});
    constColorDef10 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7357, generator.constAttribute10});
    constCons4818 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef10, (IStrategoList)generator.constCons4817);
    const7358 = termFactory.makeString("blue");
    constColorRGB10 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const6942, generator.const6942, generator.const7345});
    constAttribute11 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB10, generator.constNoColor0, generator.constNORMAL0});
    constColorDef11 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7358, generator.constAttribute11});
    constCons4819 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef11, (IStrategoList)generator.constCons4818);
    const7359 = termFactory.makeString("darkblue");
    constColorRGB11 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const6942, generator.const6942, generator.const7352});
    constAttribute12 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB11, generator.constNoColor0, generator.constNORMAL0});
    constColorDef12 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7359, generator.constAttribute12});
    constCons4820 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef12, (IStrategoList)generator.constCons4819);
    const7360 = termFactory.makeString("green");
    constColorRGB12 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const6942, generator.const7345, generator.const6942});
    constAttribute13 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB12, generator.constNoColor0, generator.constNORMAL0});
    constColorDef13 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7360, generator.constAttribute13});
    constCons4821 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef13, (IStrategoList)generator.constCons4820);
    const7361 = termFactory.makeString("darkgreen");
    constColorRGB13 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const6942, generator.const7352, generator.const6942});
    constAttribute14 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB13, generator.constNoColor0, generator.constNORMAL0});
    constColorDef14 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7361, generator.constAttribute14});
    constCons4822 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef14, (IStrategoList)generator.constCons4821);
    const7362 = termFactory.makeString("red");
    constColorRGB14 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const6942, generator.const6942});
    constAttribute15 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB14, generator.constNoColor0, generator.constNORMAL0});
    constColorDef15 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7362, generator.constAttribute15});
    constCons4823 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef15, (IStrategoList)generator.constCons4822);
    const7363 = termFactory.makeString("darkred");
    constColorRGB15 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7352, generator.const6942, generator.const6942});
    constAttribute16 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB15, generator.constNoColor0, generator.constNORMAL0});
    constColorDef16 = termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{generator.const7363, generator.constAttribute16});
    constCons4824 = (IStrategoTerm)termFactory.makeListCons(generator.constColorDef16, (IStrategoList)generator.constCons4823);
    constCons4825 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4824);
    constColorer2 = termFactory.makeAppl(SpoofaxGenerator._consColorer_2, new IStrategoTerm[]{generator.const7338, generator.constCons4825});
    constCons4826 = (IStrategoTerm)termFactory.makeListCons(generator.constColorer2, (IStrategoList)generator.constNil7);
    const7364 = termFactory.makeString(" Default, token-based highlighting");
    constCons4827 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4670);
    constTK_LAYOUT0 = termFactory.makeAppl(SpoofaxGenerator._consTK_LAYOUT_0, NO_TERMS);
    constToken0 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_LAYOUT0});
    const7365 = termFactory.makeString("63");
    const7366 = termFactory.makeString("127");
    const7367 = termFactory.makeString("95");
    constColorRGB16 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7365, generator.const7366, generator.const7367});
    constITALIC0 = termFactory.makeAppl(SpoofaxGenerator._consITALIC_0, NO_TERMS);
    constAttribute17 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB16, generator.constNoColor0, generator.constITALIC0});
    constColorRule1 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken0, generator.constAttribute17});
    constCons4828 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule1, (IStrategoList)generator.constCons4827);
    constTK_OPERATOR0 = termFactory.makeAppl(SpoofaxGenerator._consTK_OPERATOR_0, NO_TERMS);
    constToken1 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_OPERATOR0});
    constColorRule2 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken1, generator.constAttribute12});
    constCons4829 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule2, (IStrategoList)generator.constCons4828);
    constTK_VAR0 = termFactory.makeAppl(SpoofaxGenerator._consTK_VAR_0, NO_TERMS);
    constToken2 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_VAR0});
    const7368 = termFactory.makeString("100");
    constColorRGB17 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7345, generator.const6942, generator.const7368});
    constAttribute18 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB17, generator.constNoColor0, generator.constITALIC0});
    constColorRule3 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken2, generator.constAttribute18});
    constCons4830 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule3, (IStrategoList)generator.constCons4829);
    constTK_NUMBER0 = termFactory.makeAppl(SpoofaxGenerator._consTK_NUMBER_0, NO_TERMS);
    constToken3 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_NUMBER0});
    constAttributeRef1 = termFactory.makeAppl(SpoofaxGenerator._consAttributeRef_1, new IStrategoTerm[]{generator.const7361});
    constColorRule4 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken3, generator.constAttributeRef1});
    constCons4831 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule4, (IStrategoList)generator.constCons4830);
    constTK_STRING0 = termFactory.makeAppl(SpoofaxGenerator._consTK_STRING_0, NO_TERMS);
    constToken4 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_STRING0});
    constAttributeRef2 = termFactory.makeAppl(SpoofaxGenerator._consAttributeRef_1, new IStrategoTerm[]{generator.const7358});
    constColorRule5 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken4, generator.constAttributeRef2});
    constCons4832 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule5, (IStrategoList)generator.constCons4831);
    constTK_IDENTIFIER0 = termFactory.makeAppl(SpoofaxGenerator._consTK_IDENTIFIER_0, NO_TERMS);
    constToken5 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_IDENTIFIER0});
    constAttributeRef3 = termFactory.makeAppl(SpoofaxGenerator._consAttributeRef_1, new IStrategoTerm[]{generator.const7339});
    constColorRule6 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken5, generator.constAttributeRef3});
    constCons4833 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule6, (IStrategoList)generator.constCons4832);
    constTK_KEYWORD0 = termFactory.makeAppl(SpoofaxGenerator._consTK_KEYWORD_0, NO_TERMS);
    constToken6 = termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{generator.constTK_KEYWORD0});
    const7369 = termFactory.makeString("85");
    constColorRGB18 = termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{generator.const7366, generator.const6942, generator.const7369});
    constAttribute19 = termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{generator.constColorRGB18, generator.constNoColor0, generator.constBOLD0});
    constColorRule7 = termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{generator.constToken6, generator.constAttribute19});
    constCons4834 = (IStrategoTerm)termFactory.makeListCons(generator.constColorRule7, (IStrategoList)generator.constCons4833);
    constCons4835 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4834);
    constColorer3 = termFactory.makeAppl(SpoofaxGenerator._consColorer_2, new IStrategoTerm[]{generator.const7364, generator.constCons4835});
    constCons4836 = (IStrategoTerm)termFactory.makeListCons(generator.constColorer3, (IStrategoList)generator.constCons4826);
    const7370 = termFactory.makeString("   environment _.FromMetaExpr: _ white");
    constCommentLine67 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7370});
    constCons4837 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine67, (IStrategoList)generator.constNil7);
    const7371 = termFactory.makeString("   environment _.ToMetaExpr:   _ 220 230 200");
    constCommentLine68 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7371});
    constCons4838 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine68, (IStrategoList)generator.constCons4837);
    const7372 = termFactory.makeString(" Example: background colors for ToMetaExpr/FromMetaExpr, if supported by the grammar");
    constCommentLine69 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7372});
    constCons4839 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine69, (IStrategoList)generator.constCons4838);
    constCons4840 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4839);
    const7373 = termFactory.makeString("   _.MethodDec: 255 0 0");
    constCommentLine70 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7373});
    constCons4841 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine70, (IStrategoList)generator.constCons4840);
    const7374 = termFactory.makeString(" Constructor-based highlighting");
    constCommentLine71 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7374});
    constCons4842 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine71, (IStrategoList)generator.constCons4841);
    constCons4843 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4842);
    const7375 = termFactory.makeString("   ClassBodyDec.MethodDec: yellow");
    constCommentLine72 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7375});
    constCons4844 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine72, (IStrategoList)generator.constCons4843);
    const7376 = termFactory.makeString(" Sort- and constructor-based highlighting");
    constCommentLine73 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7376});
    constCons4845 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine73, (IStrategoList)generator.constCons4844);
    constCons4846 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4845);
    const7377 = termFactory.makeString("   Id: yellow green");
    constCommentLine74 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7377});
    constCons4847 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine74, (IStrategoList)generator.constCons4846);
    const7378 = termFactory.makeString(" Sort-based highlighting with background color");
    constCommentLine75 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7378});
    constCons4848 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine75, (IStrategoList)generator.constCons4847);
    constCons4849 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4848);
    constColorer4 = termFactory.makeAppl(SpoofaxGenerator._consColorer_2, new IStrategoTerm[]{generator.const7000, generator.constCons4849});
    constCons4850 = (IStrategoTerm)termFactory.makeListCons(generator.constColorer4, (IStrategoList)generator.constCons4836);
    const7379 = termFactory.makeString("colorDescriptor");
    const7380 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-colorer-descriptor'");
    const7381 = termFactory.makeString(" 	\n");
    constCons4851 = (IStrategoTerm)termFactory.makeListCons(generator.const7381, (IStrategoList)generator.constNil7);
    const7382 = termFactory.makeString("colorDescriptor-generated");
    const7383 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-colorer-descriptor'");
    const7384 = termFactory.makeString("\n		\n");
    const7385 = termFactory.makeString("-Builders.generated");
    const7386 = termFactory.makeString("   on save : generate-java");
    constCommentLine76 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7386});
    constCons4852 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine76, (IStrategoList)generator.constNil7);
    constCommentLine77 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7332});
    constCons4853 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine77, (IStrategoList)generator.constCons4852);
    const7387 = termFactory.makeString(" The 'on save' handler can be used  to generate code as files are saved:");
    constCommentLine78 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7387});
    constCons4854 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine78, (IStrategoList)generator.constCons4853);
    constCommentLine79 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7064});
    constCons4855 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine79, (IStrategoList)generator.constCons4854);
    const7388 = termFactory.makeString("   refactoring Property*: \"Extract Entity\" =  extract-entity (source)");
    constCommentLine80 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7388});
    constCons4856 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine80, (IStrategoList)generator.constCons4855);
    constCons4857 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine79, (IStrategoList)generator.constCons4856);
    const7389 = termFactory.makeString(" refactoring is specified (<sort>.<constructor>).");
    constCommentLine81 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7389});
    constCons4858 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine81, (IStrategoList)generator.constCons4857);
    const7390 = termFactory.makeString(" Refactorings can be specified as shown below, whereby Property* indicates on which constructs the");
    constCommentLine82 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7390});
    constCons4859 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine82, (IStrategoList)generator.constCons4858);
    constCons4860 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4859);
    const7391 = termFactory.makeString("   pretty-print: prettyprint");
    constCommentLine83 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7391});
    constCons4861 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine83, (IStrategoList)generator.constCons4860);
    const7392 = termFactory.makeString("   pp-table: get-pp-table");
    constCommentLine84 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7392});
    constCons4862 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine84, (IStrategoList)generator.constCons4861);
    const7393 = termFactory.makeString(" or the layout definitions in the pp-table.");
    constCommentLine85 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7393});
    constCons4863 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine85, (IStrategoList)generator.constCons4862);
    const7394 = termFactory.makeString(" while newly inserted nodes are pretty printed using a custom pretty-print strategy, ");
    constCommentLine86 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7394});
    constCons4864 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine86, (IStrategoList)generator.constCons4863);
    const7395 = termFactory.makeString(" the original layout is preserved for unchanged fragments,");
    constCommentLine87 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7395});
    constCons4865 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine87, (IStrategoList)generator.constCons4864);
    const7396 = termFactory.makeString(" Refactorings are used for transformations that modify the original source code;");
    constCommentLine88 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7396});
    constCons4866 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine88, (IStrategoList)generator.constCons4865);
    constCons4867 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4866);
    const7397 = termFactory.makeString("                 after it has been analyzed/desugared by the observer.");
    constCommentLine89 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7397});
    constCons4868 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine89, (IStrategoList)generator.constCons4867);
  }

  private static void initConstants28(ITermFactory termFactory)
  { 
    constNil7 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constVS0 = termFactory.makeAppl(SpoofaxGenerator._consVS_0, NO_TERMS);
    const6941 = termFactory.makeString("1");
    constSOpt0 = termFactory.makeAppl(SpoofaxGenerator._consSOpt_2, new IStrategoTerm[]{generator.constVS0, generator.const6941});
    constCons4515 = (IStrategoTerm)termFactory.makeListCons(generator.constSOpt0, (IStrategoList)generator.constNil7);
    const6942 = termFactory.makeString("0");
    constSOpt1 = termFactory.makeAppl(SpoofaxGenerator._consSOpt_2, new IStrategoTerm[]{generator.constVS0, generator.const6942});
    constCons4516 = (IStrategoTerm)termFactory.makeListCons(generator.constSOpt1, (IStrategoList)generator.constNil7);
    constKW0 = termFactory.makeAppl(SpoofaxGenerator._consKW_0, NO_TERMS);
    const6943 = termFactory.makeString("?>");
    constS0 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6943});
    constFBOX0 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS0});
    constCons4517 = (IStrategoTerm)termFactory.makeListCons(generator.constFBOX0, (IStrategoList)generator.constNil7);
    constHS0 = termFactory.makeAppl(SpoofaxGenerator._consHS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(SpoofaxGenerator._consSOpt_2, new IStrategoTerm[]{generator.constHS0, generator.const6941});
    constCons4518 = (IStrategoTerm)termFactory.makeListCons(generator.constSOpt2, (IStrategoList)generator.constNil7);
    const6944 = termFactory.makeString("<?xml");
    constS1 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6944});
    constFBOX1 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS1});
    const6945 = termFactory.makeString(">");
    constS2 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6945});
    constFBOX2 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS2});
    constCons4519 = (IStrategoTerm)termFactory.makeListCons(generator.constFBOX2, (IStrategoList)generator.constNil7);
    const6946 = termFactory.makeString("<!DOCTYPE");
    constS3 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6946});
    constFBOX3 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS3});
    const6947 = termFactory.makeString("SYSTEM");
    constS4 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6947});
    constFBOX4 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS4});
    const6948 = termFactory.makeString("PUBLIC");
    constS5 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6948});
    constFBOX5 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS5});
    constSOpt3 = termFactory.makeAppl(SpoofaxGenerator._consSOpt_2, new IStrategoTerm[]{generator.constHS0, generator.const6942});
    constCons4520 = (IStrategoTerm)termFactory.makeListCons(generator.constSOpt3, (IStrategoList)generator.constNil7);
    const6949 = termFactory.makeString("<?");
    constS6 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6949});
    constFBOX6 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS6});
    const6950 = termFactory.makeString("]]>");
    constS7 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6950});
    constCons4521 = (IStrategoTerm)termFactory.makeListCons(generator.constS7, (IStrategoList)generator.constNil7);
    const6951 = termFactory.makeString("<![CDATA[");
    constS8 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6951});
    const6952 = termFactory.makeString(";");
    constS9 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6952});
    constCons4522 = (IStrategoTerm)termFactory.makeListCons(generator.constS9, (IStrategoList)generator.constNil7);
    const6953 = termFactory.makeString("&");
    constS10 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6953});
    const6954 = termFactory.makeString("=");
    constS11 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6954});
    constFBOX7 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS11});
    const6955 = termFactory.makeString("\"");
    constS12 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6955});
    constCons4523 = (IStrategoTerm)termFactory.makeListCons(generator.constS12, (IStrategoList)generator.constNil7);
    const6956 = termFactory.makeString("\\'");
    constS13 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6956});
    constCons4524 = (IStrategoTerm)termFactory.makeListCons(generator.constS13, (IStrategoList)generator.constNil7);
    const6957 = termFactory.makeString(":");
    constS14 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6957});
    constFBOX8 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS14});
    constNone0 = termFactory.makeAppl(SpoofaxGenerator._consNone_0, NO_TERMS);
    const6958 = termFactory.makeString("standalone");
    constQName0 = termFactory.makeAppl(SpoofaxGenerator._consQName_2, new IStrategoTerm[]{generator.constNone0, generator.const6958});
    const6959 = termFactory.makeString("version");
    constQName1 = termFactory.makeAppl(SpoofaxGenerator._consQName_2, new IStrategoTerm[]{generator.constNone0, generator.const6959});
    const6960 = termFactory.makeString("encoding");
    constQName2 = termFactory.makeAppl(SpoofaxGenerator._consQName_2, new IStrategoTerm[]{generator.constNone0, generator.const6960});
    const6961 = termFactory.makeString("/>");
    constS15 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6961});
    constFBOX9 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS15});
    constCons4525 = (IStrategoTerm)termFactory.makeListCons(generator.constFBOX9, (IStrategoList)generator.constNil7);
    const6962 = termFactory.makeString("<");
    constS16 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6962});
    constFBOX10 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS16});
    const6963 = termFactory.makeString("</");
    constS17 = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{generator.const6963});
    constFBOX11 = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, generator.constS17});
    const6964 = termFactory.makeInt(0);
    const6965 = termFactory.makeString("sdf-desugar");
    constCons4526 = (IStrategoTerm)termFactory.makeListCons(generator.const6965, (IStrategoList)generator.constNil7);
    const6966 = termFactory.makeString("implodePT");
    constCons4527 = (IStrategoTerm)termFactory.makeListCons(generator.const6966, (IStrategoList)generator.constCons4526);
    const6967 = termFactory.makeString("sdf2table");
    constCons4528 = (IStrategoTerm)termFactory.makeListCons(generator.const6967, (IStrategoList)generator.constCons4527);
    constIgnoreMissingCons0 = termFactory.makeAppl(SpoofaxGenerator._consIgnoreMissingCons_0, NO_TERMS);
    const6968 = termFactory.makeTuple();
    const6969 = termFactory.makeTuple(generator.constIgnoreMissingCons0, generator.const6968);
    const6970 = termFactory.makeString("--ignore-missing-cons");
    const6971 = termFactory.makeString("Ignore productions that do not have a constructor (default: produce error)");
    constHelpString0 = termFactory.makeAppl(SpoofaxGenerator._consHelpString_2, new IStrategoTerm[]{generator.const6970, generator.const6971});
    constAutoReportBugs0 = termFactory.makeAppl(SpoofaxGenerator._consAutoReportBugs_0, NO_TERMS);
    constCons4529 = (IStrategoTerm)termFactory.makeListCons(generator.constAutoReportBugs0, (IStrategoList)generator.constNil7);
    constOptionUsage0 = termFactory.makeAppl(SpoofaxGenerator._consOptionUsage_0, NO_TERMS);
    constCons4530 = (IStrategoTerm)termFactory.makeListCons(generator.constOptionUsage0, (IStrategoList)generator.constCons4529);
    const6972 = termFactory.makeString("Generates an abstract syntax definition in the rtg language\n          from a SDF concrete syntax definition.");
    constSummary0 = termFactory.makeAppl(SpoofaxGenerator._consSummary_1, new IStrategoTerm[]{generator.const6972});
    constCons4531 = (IStrategoTerm)termFactory.makeListCons(generator.constSummary0, (IStrategoList)generator.constCons4530);
    const6973 = termFactory.makeString("sdf2rtg [OPTIONS]");
    constUsage0 = termFactory.makeAppl(SpoofaxGenerator._consUsage_1, new IStrategoTerm[]{generator.const6973});
    constCons4532 = (IStrategoTerm)termFactory.makeListCons(generator.constUsage0, (IStrategoList)generator.constCons4531);
    constCurrentXTCRepository0 = termFactory.makeAppl(SpoofaxGenerator._consCurrentXTCRepository_0, NO_TERMS);
    constCons4533 = (IStrategoTerm)termFactory.makeListCons(generator.constCurrentXTCRepository0, (IStrategoList)generator.constNil7);
    constDefaultXTCRepository0 = termFactory.makeAppl(SpoofaxGenerator._consDefaultXTCRepository_0, NO_TERMS);
    constCons4534 = (IStrategoTerm)termFactory.makeListCons(generator.constDefaultXTCRepository0, (IStrategoList)generator.constCons4533);
    constConfig0 = termFactory.makeAppl(SpoofaxGenerator._consConfig_1, new IStrategoTerm[]{generator.constCons4534});
    constCons4535 = (IStrategoTerm)termFactory.makeListCons(generator.constConfig0, (IStrategoList)generator.constNil7);
    const6974 = termFactory.makeString("2002-2008");
    const6975 = termFactory.makeString("Stratego Software Foundation <stratego@cs.uu.nl>");
    constGNU_LGPL0 = termFactory.makeAppl(SpoofaxGenerator._consGNU_LGPL_2, new IStrategoTerm[]{generator.const6974, generator.const6975});
    constCons4536 = (IStrategoTerm)termFactory.makeListCons(generator.constGNU_LGPL0, (IStrategoList)generator.constCons4535);
    const6976 = termFactory.makeString("Martin Bravenboer");
    const6977 = termFactory.makeString("martin.bravenboer@gmail.com");
    constPerson0 = termFactory.makeAppl(SpoofaxGenerator._consPerson_2, new IStrategoTerm[]{generator.const6976, generator.const6977});
    constAuthor0 = termFactory.makeAppl(SpoofaxGenerator._consAuthor_1, new IStrategoTerm[]{generator.constPerson0});
    constCons4537 = (IStrategoTerm)termFactory.makeListCons(generator.constAuthor0, (IStrategoList)generator.constCons4536);
    constAutoProgram0 = termFactory.makeAppl(SpoofaxGenerator._consAutoProgram_0, NO_TERMS);
    constCons4538 = (IStrategoTerm)termFactory.makeListCons(generator.constAutoProgram0, (IStrategoList)generator.constCons4537);
    const6978 = termFactory.makeString("Specify main module in sdf definition");
    constSdfMainModuleFlag0 = termFactory.makeAppl(SpoofaxGenerator._consSdfMainModuleFlag_0, NO_TERMS);
    const6979 = termFactory.makeString(" [Main]");
    constCons4539 = (IStrategoTerm)termFactory.makeListCons(generator.const6979, (IStrategoList)generator.constNil7);
    const6980 = termFactory.makeString("-m mod | --main mod   ");
    const6981 = termFactory.makeString("--main");
    const6982 = termFactory.makeString("Main");
    const6983 = termFactory.makeString(") not found in definition");
    constCons4540 = (IStrategoTerm)termFactory.makeListCons(generator.const6983, (IStrategoList)generator.constNil7);
    const6984 = termFactory.makeString("** ERROR -- Specified main module (");
    constattrs0 = termFactory.makeAppl(SpoofaxGenerator._consattrs_1, new IStrategoTerm[]{generator.constNil7});
    const6985 = termFactory.makeString("-o");
    const6986 = termFactory.makeString("w");
    const6987 = termFactory.makeString(" is not a valid output format.");
    constCons4541 = (IStrategoTerm)termFactory.makeListCons(generator.const6987, (IStrategoList)generator.constNil7);
    const6988 = termFactory.makeString("pack-sdf: ");
    const6989 = termFactory.makeInt(1);
    conststderr0 = termFactory.makeAppl(SpoofaxGenerator._consstderr_0, NO_TERMS);
    const6990 = termFactory.makeString(" not found");
    constCons4542 = (IStrategoTerm)termFactory.makeListCons(generator.const6990, (IStrategoList)generator.constNil7);
    const6991 = termFactory.makeString("pack-sdf: error: module ");
    const6992 = termFactory.makeString("unknown location");
    const6993 = termFactory.makeString("\n      in file ");
    const6994 = termFactory.makeString("    imported from module ");
    const6995 = termFactory.makeString("at unknown location");
    const6996 = termFactory.makeString("\n        in file ");
    const6997 = termFactory.makeString("      module ");
    const6998 = termFactory.makeString("    imported from:");
    constCons4543 = (IStrategoTerm)termFactory.makeListCons(generator.const6998, (IStrategoList)generator.constNil7);
    const6999 = termFactory.makeTuple(generator.conststderr0, generator.constCons4543);
    const7000 = termFactory.makeString("");
    constCons4544 = (IStrategoTerm)termFactory.makeListCons(generator.const7000, (IStrategoList)generator.constNil7);
    const7001 = termFactory.makeTuple(generator.conststderr0, generator.constCons4544);
    const7002 = termFactory.makeString("sdf");
    const7003 = termFactory.makeInt(47);
    const7004 = termFactory.makeInt(46);
    const7005 = termFactory.makeString("  including ");
    const7006 = termFactory.makeString(" does not exist\n");
    constCons4545 = (IStrategoTerm)termFactory.makeListCons(generator.const7006, (IStrategoList)generator.constNil7);
    const7007 = termFactory.makeString("pack-sdf: error: file ");
    const7008 = termFactory.makeString(".sdf");
    constCons4546 = (IStrategoTerm)termFactory.makeListCons(generator.const7008, (IStrategoList)generator.constNil7);
    const7009 = termFactory.makeString("/");
    const7010 = termFactory.makeString(" from XTC repository");
    constCons4547 = (IStrategoTerm)termFactory.makeListCons(generator.const7010, (IStrategoList)generator.constNil7);
    const7011 = termFactory.makeString(" from ");
    constlayout0 = termFactory.makeAppl(SpoofaxGenerator._conslayout_0, NO_TERMS);
    constopt0 = termFactory.makeAppl(SpoofaxGenerator._consopt_1, new IStrategoTerm[]{generator.constlayout0});
    constcf0 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constopt0});
    constCons4548 = (IStrategoTerm)termFactory.makeListCons(generator.constcf0, (IStrategoList)generator.constNil7);
    const7012 = termFactory.makeString("Module");
    constsort0 = termFactory.makeAppl(SpoofaxGenerator._conssort_1, new IStrategoTerm[]{generator.const7012});
    constcf1 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constsort0});
    constCons4549 = (IStrategoTerm)termFactory.makeListCons(generator.constcf1, (IStrategoList)generator.constCons4548);
    constCons4550 = (IStrategoTerm)termFactory.makeListCons(generator.constcf0, (IStrategoList)generator.constCons4549);
    const7013 = termFactory.makeString("<START>");
    constsort1 = termFactory.makeAppl(SpoofaxGenerator._conssort_1, new IStrategoTerm[]{generator.const7013});
    constno_attrs0 = termFactory.makeAppl(SpoofaxGenerator._consno_attrs_0, NO_TERMS);
    constprod0 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4550, generator.constsort1, generator.constno_attrs0});
    constlex0 = termFactory.makeAppl(SpoofaxGenerator._conslex_1, new IStrategoTerm[]{generator.constlayout0});
    constCons4551 = (IStrategoTerm)termFactory.makeListCons(generator.constlex0, (IStrategoList)generator.constNil7);
    constcf2 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constlayout0});
    constprod1 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4551, generator.constcf2, generator.constno_attrs0});
    const7014 = termFactory.makeInt(32);
    constCons4552 = (IStrategoTerm)termFactory.makeListCons(generator.const7014, (IStrategoList)generator.constNil7);
    const7015 = termFactory.makeInt(13);
    constCons4553 = (IStrategoTerm)termFactory.makeListCons(generator.const7015, (IStrategoList)generator.constCons4552);
    const7016 = termFactory.makeInt(9);
    const7017 = termFactory.makeInt(10);
    constrange0 = termFactory.makeAppl(SpoofaxGenerator._consrange_2, new IStrategoTerm[]{generator.const7016, generator.const7017});
    constCons4554 = (IStrategoTerm)termFactory.makeListCons(generator.constrange0, (IStrategoList)generator.constCons4553);
    constchar_class0 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4554});
    constCons4555 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class0, (IStrategoList)generator.constNil7);
    constprefer0 = termFactory.makeAppl(SpoofaxGenerator._consprefer_0, NO_TERMS);
    constCons4556 = (IStrategoTerm)termFactory.makeListCons(generator.constprefer0, (IStrategoList)generator.constNil7);
    constattrs1 = termFactory.makeAppl(SpoofaxGenerator._consattrs_1, new IStrategoTerm[]{generator.constCons4556});
    constprod2 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4555, generator.constlex0, generator.constattrs1});
    constCons4557 = (IStrategoTerm)termFactory.makeListCons(generator.const7017, (IStrategoList)generator.constNil7);
    constappl0 = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod2, generator.constCons4557});
    constCons4558 = (IStrategoTerm)termFactory.makeListCons(generator.constappl0, (IStrategoList)generator.constNil7);
    constappl1 = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod1, generator.constCons4558});
    constCons4559 = (IStrategoTerm)termFactory.makeListCons(generator.constappl1, (IStrategoList)generator.constNil7);
    const7018 = termFactory.makeString("SourcePathName");
    const7019 = termFactory.makeString("-115458");
    const7020 = termFactory.makeString(" cannot be parsed\n");
    constCons4560 = (IStrategoTerm)termFactory.makeListCons(generator.const7020, (IStrategoList)generator.constNil7);
    const7021 = termFactory.makeString("pack-sdf: Error: module ");
    constSdf2Baf = new ImportTerm(termFactory, generator.class, "/org/strategoxt/imp/spoofax/generator/", "Sdf2.baf");
    const7022 = termFactory.makeString("PackSDFTable");
    constDR_DUMMY0 = termFactory.makeAppl(SpoofaxGenerator._consDR_DUMMY_0, NO_TERMS);
    constCons4561 = (IStrategoTerm)termFactory.makeListCons(generator.constDR_DUMMY0, (IStrategoList)generator.constNil7);
    const7023 = termFactory.makeString("225675");
    const7024 = termFactory.makeString("' does not correspond to filename.\n");
    constCons4562 = (IStrategoTerm)termFactory.makeListCons(generator.const7024, (IStrategoList)generator.constNil7);
    const7025 = termFactory.makeString("' in file '");
    const7026 = termFactory.makeString("pack-sdf: error: module name '");
    const7027 = termFactory.makeString("ImportedFrom");
    const7028 = termFactory.makeString("-213243");
    const7029 = termFactory.makeString("a -------------------- ");
    constprod3 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constNil7, generator.constcf0, generator.constno_attrs0});
    constappl2 = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod3, generator.constNil7});
    constiter_star0 = termFactory.makeAppl(SpoofaxGenerator._consiter_star_1, new IStrategoTerm[]{generator.constsort0});
    constcf3 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constiter_star0});
    constprod4 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constNil7, generator.constcf3, generator.constno_attrs0});
    constappl3 = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod4, generator.constNil7});
    const7030 = termFactory.makeTuple(generator.constappl2, generator.constappl3, generator.constappl2);
    constCons4563 = (IStrategoTerm)termFactory.makeListCons(generator.constcf1, (IStrategoList)generator.constNil7);
    constiter0 = termFactory.makeAppl(SpoofaxGenerator._consiter_1, new IStrategoTerm[]{generator.constsort0});
    constcf4 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constiter0});
    constprod5 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4563, generator.constcf4, generator.constno_attrs0});
    constCons4564 = (IStrategoTerm)termFactory.makeListCons(generator.constcf2, (IStrategoList)generator.constNil7);
    constprod6 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4564, generator.constcf0, generator.constno_attrs0});
    constappl4 = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod6, generator.constCons4559});
    const7031 = termFactory.makeString("SDF");
    constsort2 = termFactory.makeAppl(SpoofaxGenerator._conssort_1, new IStrategoTerm[]{generator.const7031});
    constcf5 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constsort2});
    constCons4565 = (IStrategoTerm)termFactory.makeListCons(generator.constcf5, (IStrategoList)generator.constCons4548);
    constCons4566 = (IStrategoTerm)termFactory.makeListCons(generator.constcf0, (IStrategoList)generator.constCons4565);
    constprod7 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4566, generator.constsort1, generator.constno_attrs0});
    const7032 = termFactory.makeString("Definition");
    constsort3 = termFactory.makeAppl(SpoofaxGenerator._conssort_1, new IStrategoTerm[]{generator.const7032});
    constcf6 = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{generator.constsort3});
    constCons4567 = (IStrategoTerm)termFactory.makeListCons(generator.constcf6, (IStrategoList)generator.constNil7);
    constCons4568 = (IStrategoTerm)termFactory.makeListCons(generator.constcf0, (IStrategoList)generator.constCons4567);
    const7033 = termFactory.makeString("definition");
    constlit0 = termFactory.makeAppl(SpoofaxGenerator._conslit_1, new IStrategoTerm[]{generator.const7033});
    constCons4569 = (IStrategoTerm)termFactory.makeListCons(generator.constlit0, (IStrategoList)generator.constCons4568);
    constcons0 = termFactory.makeAppl(SpoofaxGenerator._conscons_1, new IStrategoTerm[]{generator.const7033});
    constterm0 = termFactory.makeAppl(SpoofaxGenerator._consterm_1, new IStrategoTerm[]{generator.constcons0});
    constCons4570 = (IStrategoTerm)termFactory.makeListCons(generator.constterm0, (IStrategoList)generator.constNil7);
    constattrs2 = termFactory.makeAppl(SpoofaxGenerator._consattrs_1, new IStrategoTerm[]{generator.constCons4570});
    constprod8 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4569, generator.constcf5, generator.constattrs2});
    constCons4571 = (IStrategoTerm)termFactory.makeListCons(generator.constcf3, (IStrategoList)generator.constNil7);
    constprod9 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4571, generator.constcf6, generator.constno_attrs0});
    constCons4572 = (IStrategoTerm)termFactory.makeListCons(generator.constcf4, (IStrategoList)generator.constNil7);
    constprod10 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4572, generator.constcf3, generator.constno_attrs0});
    const7034 = termFactory.makeInt(110);
    constCons4573 = (IStrategoTerm)termFactory.makeListCons(generator.const7034, (IStrategoList)generator.constNil7);
    constchar_class1 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4573});
    constCons4574 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class1, (IStrategoList)generator.constNil7);
    const7035 = termFactory.makeInt(111);
    constCons4575 = (IStrategoTerm)termFactory.makeListCons(generator.const7035, (IStrategoList)generator.constNil7);
    constchar_class2 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4575});
    constCons4576 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class2, (IStrategoList)generator.constCons4574);
    const7036 = termFactory.makeInt(105);
    constCons4577 = (IStrategoTerm)termFactory.makeListCons(generator.const7036, (IStrategoList)generator.constNil7);
    constchar_class3 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4577});
    constCons4578 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class3, (IStrategoList)generator.constCons4576);
    const7037 = termFactory.makeInt(116);
    constCons4579 = (IStrategoTerm)termFactory.makeListCons(generator.const7037, (IStrategoList)generator.constNil7);
    constchar_class4 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4579});
    constCons4580 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class4, (IStrategoList)generator.constCons4578);
    constCons4581 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class3, (IStrategoList)generator.constCons4580);
    constCons4582 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class1, (IStrategoList)generator.constCons4581);
    constCons4583 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class3, (IStrategoList)generator.constCons4582);
    const7038 = termFactory.makeInt(102);
    constCons4584 = (IStrategoTerm)termFactory.makeListCons(generator.const7038, (IStrategoList)generator.constNil7);
    constchar_class5 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4584});
    constCons4585 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class5, (IStrategoList)generator.constCons4583);
    const7039 = termFactory.makeInt(101);
    constCons4586 = (IStrategoTerm)termFactory.makeListCons(generator.const7039, (IStrategoList)generator.constNil7);
    constchar_class6 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4586});
    constCons4587 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class6, (IStrategoList)generator.constCons4585);
    const7040 = termFactory.makeInt(100);
    constCons4588 = (IStrategoTerm)termFactory.makeListCons(generator.const7040, (IStrategoList)generator.constNil7);
    constchar_class7 = termFactory.makeAppl(SpoofaxGenerator._conschar_class_1, new IStrategoTerm[]{generator.constCons4588});
    constCons4589 = (IStrategoTerm)termFactory.makeListCons(generator.constchar_class7, (IStrategoList)generator.constCons4587);
    constprod11 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4589, generator.constlit0, generator.constno_attrs0});
    constCons4590 = (IStrategoTerm)termFactory.makeListCons(generator.const7035, (IStrategoList)generator.constCons4573);
    constCons4591 = (IStrategoTerm)termFactory.makeListCons(generator.const7036, (IStrategoList)generator.constCons4590);
    constCons4592 = (IStrategoTerm)termFactory.makeListCons(generator.const7037, (IStrategoList)generator.constCons4591);
    constCons4593 = (IStrategoTerm)termFactory.makeListCons(generator.const7036, (IStrategoList)generator.constCons4592);
    constCons4594 = (IStrategoTerm)termFactory.makeListCons(generator.const7034, (IStrategoList)generator.constCons4593);
    constCons4595 = (IStrategoTerm)termFactory.makeListCons(generator.const7036, (IStrategoList)generator.constCons4594);
    constCons4596 = (IStrategoTerm)termFactory.makeListCons(generator.const7038, (IStrategoList)generator.constCons4595);
    constCons4597 = (IStrategoTerm)termFactory.makeListCons(generator.const7039, (IStrategoList)generator.constCons4596);
    constCons4598 = (IStrategoTerm)termFactory.makeListCons(generator.const7040, (IStrategoList)generator.constCons4597);
    constappl5 = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod11, generator.constCons4598});
    constCons4599 = (IStrategoTerm)termFactory.makeListCons(generator.constcf0, (IStrategoList)generator.constCons4572);
    constCons4600 = (IStrategoTerm)termFactory.makeListCons(generator.constcf4, (IStrategoList)generator.constCons4599);
    constleft0 = termFactory.makeAppl(SpoofaxGenerator._consleft_0, NO_TERMS);
    constassoc0 = termFactory.makeAppl(SpoofaxGenerator._consassoc_1, new IStrategoTerm[]{generator.constleft0});
    constCons4601 = (IStrategoTerm)termFactory.makeListCons(generator.constassoc0, (IStrategoList)generator.constNil7);
    constattrs3 = termFactory.makeAppl(SpoofaxGenerator._consattrs_1, new IStrategoTerm[]{generator.constCons4601});
    constprod12 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4600, generator.constcf4, generator.constattrs3});
    const7041 = termFactory.makeString("--output-format");
    const7042 = termFactory.makeString("txt");
    const7043 = termFactory.makeString("ast");
    constCons4602 = (IStrategoTerm)termFactory.makeListCons(generator.const7043, (IStrategoList)generator.constNil7);
    const7044 = termFactory.makeString("asfix");
    constCons4603 = (IStrategoTerm)termFactory.makeListCons(generator.const7044, (IStrategoList)generator.constCons4602);
    constCons4604 = (IStrategoTerm)termFactory.makeListCons(generator.const7042, (IStrategoList)generator.constCons4603);
    const7045 = termFactory.makeString(", ");
    const7046 = termFactory.makeString(" is not a valid output format. Supported formats: ");
    const7047 = termFactory.makeString(")");
    constCons4605 = (IStrategoTerm)termFactory.makeListCons(generator.const7047, (IStrategoList)generator.constNil7);
    const7048 = termFactory.makeString("-of f            Use output format f (");
    const7049 = termFactory.makeString("-I");
    const7050 = termFactory.makeString("-Idef <lang.def>     Include modules from SDF definition <lang.def>");
    constIncludeXTC0 = termFactory.makeAppl(SpoofaxGenerator._consIncludeXTC_0, NO_TERMS);
    constCons4606 = (IStrategoTerm)termFactory.makeListCons(generator.constIncludeXTC0, (IStrategoList)generator.constNil7);
    const7051 = termFactory.makeString("-i");
    const7052 = termFactory.makeString(".");
    constIncludeDir0 = termFactory.makeAppl(SpoofaxGenerator._consIncludeDir_1, new IStrategoTerm[]{generator.const7052});
    const7053 = termFactory.makeString("Sdf2.baf");
    const7054 = termFactory.makeString("pack-sdf:   - ");
    const7055 = termFactory.makeString(" provides the modules ");
    constCons4607 = (IStrategoTerm)termFactory.makeListCons(generator.const7055, (IStrategoList)generator.constNil7);
    const7056 = termFactory.makeString("pack-sdf: SDF Syntax Definition ");
    const7057 = termFactory.makeString("-I|--Include <dir>   Include modules from directory <dir>");
    const7058 = termFactory.makeString("pack-sdf: warning: directory specified with -I does not exist: ");
    const7059 = termFactory.makeString("pack-sdf: warning: path specified with -I is a file, not a directory: ");
    const7060 = termFactory.makeString("-dep");
    const7061 = termFactory.makeString("--dep <file>         Write make dependencies to <file>");
    const7062 = termFactory.makeString(" \\\n	");
    const7063 = termFactory.makeString("<?>");
    const7064 = termFactory.makeString(" ");
    const7065 = termFactory.makeString("Internal error: with clause failed unexpectedly");
    const7066 = termFactory.makeString("Internal error: failure unexpected");
    constCritical0 = termFactory.makeAppl(SpoofaxGenerator._consCritical_0, NO_TERMS);
    const7067 = termFactory.makeString("[");
    const7068 = termFactory.makeString("]");
    const7069 = termFactory.makeString("(");
    const7070 = termFactory.makeInt(3);
    const7071 = termFactory.makeString(",");
    const7072 = termFactory.makeString(",_");
    constCons4608 = (IStrategoTerm)termFactory.makeListCons(generator.const7072, (IStrategoList)generator.constNil7);
    const7073 = termFactory.makeString(",..");
    constCons4609 = (IStrategoTerm)termFactory.makeListCons(generator.const7073, (IStrategoList)generator.constNil7);
    const7074 = termFactory.makeString("[_]");
    const7075 = termFactory.makeString("[..]");
    const7076 = termFactory.makeString("(..)");
    const7077 = termFactory.makeString("()");
    const7078 = termFactory.makeString("[]");
    const7079 = termFactory.makeString("implode-asfix");
    const7080 = termFactory.makeString("asfix-yield");
    const7081 = termFactory.makeString("abox-format");
    const7082 = termFactory.makeString("ast2abox");
    const7083 = termFactory.makeString("-p");
    const7084 = termFactory.makeString("abox2text");
    const7085 = termFactory.makeString("--width");
    const7086 = termFactory.makeString("parse-pp-table");
    const7087 = termFactory.makeString("sglr");
    const7088 = termFactory.makeString("-2A");
    const7089 = termFactory.makeString("-s");
    const7090 = termFactory.makeString("sglri");
    const7091 = termFactory.makeString("--start");
    const7092 = termFactory.makeString("Stratego-pretty.pp");
    constCons4610 = (IStrategoTerm)termFactory.makeListCons(generator.const7092, (IStrategoList)generator.constNil7);
    const7093 = termFactory.makeString("stratego-ensugar");
    const7094 = termFactory.makeString("-v");
    constCons4611 = (IStrategoTerm)termFactory.makeListCons(generator.const7094, (IStrategoList)generator.constNil7);
    const7095 = termFactory.makeString("sdf-ensugar");
    const7096 = termFactory.makeString("core-sdf-parenthesize");
    const7097 = termFactory.makeString("Sdf2.pp.af");
    constCons4612 = (IStrategoTerm)termFactory.makeListCons(generator.const7097, (IStrategoList)generator.constNil7);
    const7098 = termFactory.makeString("-m");
    const7099 = termFactory.makeString("-n");
    const7100 = termFactory.makeString("generated-nonterms");
    const7101 = termFactory.makeString("sdf2rtg: Rewriting syntax section failed");
    const7102 = termFactory.makeString("No production rules in RTG. Did you specify the right main module?");
    const7103 = termFactory.makeString("No start productions found. Did you specify any start-symbols in the syntax definition?");
    const7104 = termFactory.makeString("Rewriting production to nonterm failed");
    const7105 = termFactory.makeString("sdf2rtg: Rewriting production failed");
    const7106 = termFactory.makeString("context-free syntax in input hasn't been normalized to syntax");
    const7107 = termFactory.makeString("lexical syntax in input hasn't been normalized to syntax");
    const7108 = termFactory.makeString("production rule resulted in a direct cycle");
    constNilTerm0 = termFactory.makeAppl(SpoofaxGenerator._consNilTerm_0, NO_TERMS);
    constAppl0 = termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constNilTerm0, generator.constNil7});
    constCons4613 = (IStrategoTerm)termFactory.makeListCons(generator.constAppl0, (IStrategoList)generator.constNil7);
    constConsTerm0 = termFactory.makeAppl(SpoofaxGenerator._consConsTerm_0, NO_TERMS);
    constConcTerm0 = termFactory.makeAppl(SpoofaxGenerator._consConcTerm_0, NO_TERMS);
    constSomeTerm0 = termFactory.makeAppl(SpoofaxGenerator._consSomeTerm_0, NO_TERMS);
    constNoneTerm0 = termFactory.makeAppl(SpoofaxGenerator._consNoneTerm_0, NO_TERMS);
    constAppl1 = termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constNoneTerm0, generator.constNil7});
    constCons4614 = (IStrategoTerm)termFactory.makeListCons(generator.constAppl1, (IStrategoList)generator.constNil7);
    const7109 = termFactory.makeString("meta-var");
    constPlain0 = termFactory.makeAppl(SpoofaxGenerator._consPlain_1, new IStrategoTerm[]{generator.const7109});
    constTerm0 = termFactory.makeAppl(SpoofaxGenerator._consTerm_1, new IStrategoTerm[]{generator.constPlain0});
    constString0 = termFactory.makeAppl(SpoofaxGenerator._consString_0, NO_TERMS);
    constRef0 = termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{generator.constString0});
    constCons4615 = (IStrategoTerm)termFactory.makeListCons(generator.constRef0, (IStrategoList)generator.constNil7);
    constAppl2 = termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constTerm0, generator.constCons4615});
    constCons4616 = (IStrategoTerm)termFactory.makeListCons(generator.constAppl2, (IStrategoList)generator.constNil7);
    constInt0 = termFactory.makeAppl(SpoofaxGenerator._consInt_0, NO_TERMS);
    constRef1 = termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{generator.constInt0});
    constError0 = termFactory.makeAppl(SpoofaxGenerator._consError_0, NO_TERMS);
    constDebug0 = termFactory.makeAppl(SpoofaxGenerator._consDebug_0, NO_TERMS);
    constWarning0 = termFactory.makeAppl(SpoofaxGenerator._consWarning_0, NO_TERMS);
    const7110 = termFactory.makeString("Cannot generate a nice name for symbol");
    const7111 = termFactory.makeString("  Please report this bug at ");
    const7112 = termFactory.makeString("    - https://bugs.cs.uu.nl/browse/STR");
    const7113 = termFactory.makeString("    - or martin.bravenboer@gmail.com");
    const7114 = termFactory.makeString("  Resolution: falling back to the ugly name ");
    const7115 = termFactory.makeString("CharClass");
    const7116 = termFactory.makeString("Lit");
    const7117 = termFactory.makeString("CaseInsensitiveLit");
    const7118 = termFactory.makeString("ListPlusOf");
    const7119 = termFactory.makeString("ListStarOf");
    const7120 = termFactory.makeString("_");
    const7121 = termFactory.makeString("Opt");
    const7122 = termFactory.makeString("  ");
    constCons4617 = (IStrategoTerm)termFactory.makeListCons(generator.constcf2, (IStrategoList)generator.constCons4564);
    constprod13 = termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{generator.constCons4617, generator.constcf2, generator.constattrs3});
    const7123 = termFactory.makeInt(80);
    constStrategoSugarprettyPpAf = new ImportTerm(termFactory, generator.class, "/org/strategoxt/imp/spoofax/generator/", "Stratego-Sugar-pretty.pp.af");
    constEditorServiceprettyPpAf = new ImportTerm(termFactory, generator.class, "/org/strategoxt/imp/spoofax/generator/", "EditorService-pretty.pp.af");
    const7124 = termFactory.makeString("DescriptorPPTable");
    const7125 = termFactory.makeString("-56401");
    const7126 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'pp-fix-string-quotes'");
    const7127 = termFactory.makeString("esv");
    const7128 = termFactory.makeString("editor");
    const7129 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'output-descriptor-file'");
    constCons4618 = (IStrategoTerm)termFactory.makeListCons(generator.const7128, (IStrategoList)generator.constNil7);
    const7130 = termFactory.makeString("Illegal editor service descriptor output");
    const7131 = termFactory.makeString("Skipping");
    const7132 = termFactory.makeString("include");
    const7133 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'output-packed-descriptor-file'");
    const7134 = termFactory.makeString("java");
    const7135 = termFactory.makeString("Illegal Java output");
    const7136 = termFactory.makeString(".java");
    const7137 = termFactory.makeString("Illegal XML output");
    const7138 = termFactory.makeString("pp-java");
    const7139 = termFactory.makeString("PP-JAVA-STRING LIBRARY CALL FAILED; USING XTC INSTEAD");
    const7140 = termFactory.makeString("Generating");
    const7141 = termFactory.makeInt(4);
    const7142 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'spx-file-relative-path'");
    const7143 = termFactory.makeString("\n");
    const7144 = termFactory.makeString(".packed");
    const7145 = termFactory.makeString("IsImported");
    const7146 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'set-input-dir-prefix'");
    const7147 = termFactory.makeString("InputDirPrefix");
    const7148 = termFactory.makeString("-159177");
    const7149 = termFactory.makeString("Parsed module has ambiguities");
    const7150 = termFactory.makeString("Module name does not match file name");
    const7151 = termFactory.makeString("-597601");
    const7152 = termFactory.makeString("Unable to import module");
    const7153 = termFactory.makeString("Does not exist:");
    constEditorServiceTbl = new ImportTerm(termFactory, generator.class, "/org/strategoxt/imp/spoofax/generator/", "EditorService.tbl");
    const7154 = termFactory.makeString("CachedParseTableDescriptor");
    const7155 = termFactory.makeString("144048");
    const7156 = termFactory.makeString("ambiguity in literal or layout");
    constCons4619 = (IStrategoTerm)termFactory.makeListCons(generator.const7156, (IStrategoList)generator.constNil7);
    const7157 = termFactory.makeString(" or ");
    const7158 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'simplify-ambiguity-report'");
    const7159 = termFactory.makeString("\n       ");
    const7160 = termFactory.makeString("either ");
    const7161 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'simplify-ambiguity-element'");
    const7162 = termFactory.makeString("\n        ");
    const7163 = termFactory.makeString("list of ");
    const7164 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'simplify-ambiguity-element'");
    const7165 = termFactory.makeTuple(generator.const6964, generator.const6964, generator.const7000);
    const7166 = termFactory.makeInt(2);
    const7167 = termFactory.makeString("IsReservedClassName");
    const7168 = termFactory.makeString("-148424");
    const7169 = termFactory.makeString("N");
    const7170 = termFactory.makeString("-Syntax");
    const7171 = termFactory.makeString("-Syntax.generated");
    const7172 = termFactory.makeString(" See the imported file for a brief introduction and examples.");
    constCommentLine0 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7172});
    constCons4620 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine0, (IStrategoList)generator.constNil7);
    constCommentLine1 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7000});
    constCons4621 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4620);
    const7173 = termFactory.makeString(" This file can be used for custom syntax rules.");
    constCommentLine2 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7173});
    constCons4622 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine2, (IStrategoList)generator.constCons4621);
    constEmptyLine0 = termFactory.makeAppl(SpoofaxGenerator._consEmptyLine_0, NO_TERMS);
    constCons4623 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4622);
    constLanguage0 = termFactory.makeAppl(SpoofaxGenerator._consLanguage_2, new IStrategoTerm[]{generator.const7000, generator.constCons4623});
    constCons4624 = (IStrategoTerm)termFactory.makeListCons(generator.constLanguage0, (IStrategoList)generator.constNil7);
    constNoImports0 = termFactory.makeAppl(SpoofaxGenerator._consNoImports_0, NO_TERMS);
    const7174 = termFactory.makeString(" Syntax properties (static defaults)");
    const7175 = termFactory.makeString("[A-Za-z0-9_]+");
    constString1 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7175});
    constIdentifierLexical0 = termFactory.makeAppl(SpoofaxGenerator._consIdentifierLexical_1, new IStrategoTerm[]{generator.constString1});
    constCons4625 = (IStrategoTerm)termFactory.makeListCons(generator.constIdentifierLexical0, (IStrategoList)generator.constNil7);
    const7176 = termFactory.makeString(" Regular expression for identifiers:");
    constCommentLine3 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7176});
    constCons4626 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine3, (IStrategoList)generator.constCons4625);
    constCons4627 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4626);
    constString2 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const6957});
    constIndentDef0 = termFactory.makeAppl(SpoofaxGenerator._consIndentDef_1, new IStrategoTerm[]{generator.constString2});
    constCons4628 = (IStrategoTerm)termFactory.makeListCons(generator.constIndentDef0, (IStrategoList)generator.constNil7);
    constString3 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const6954});
    constIndentDef1 = termFactory.makeAppl(SpoofaxGenerator._consIndentDef_1, new IStrategoTerm[]{generator.constString3});
    constCons4629 = (IStrategoTerm)termFactory.makeListCons(generator.constIndentDef1, (IStrategoList)generator.constCons4628);
    constIndentDefs0 = termFactory.makeAppl(SpoofaxGenerator._consIndentDefs_1, new IStrategoTerm[]{generator.constCons4629});
    constCons4630 = (IStrategoTerm)termFactory.makeListCons(generator.constIndentDefs0, (IStrategoList)generator.constCons4627);
    const7177 = termFactory.makeString(" (indent after these tokens):");
    constCommentLine4 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7177});
    constCons4631 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine4, (IStrategoList)generator.constCons4630);
    const7178 = termFactory.makeString(" Automatic indent hints");
    constCommentLine5 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7178});
    constCons4632 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine5, (IStrategoList)generator.constCons4631);
    constCons4633 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4632);
    const7179 = termFactory.makeString("{");
    const7180 = termFactory.makeString("}");
    constFenceDef0 = termFactory.makeAppl(SpoofaxGenerator._consFenceDef_2, new IStrategoTerm[]{generator.const7179, generator.const7180});
    constCons4634 = (IStrategoTerm)termFactory.makeListCons(generator.constFenceDef0, (IStrategoList)generator.constNil7);
    constFenceDef1 = termFactory.makeAppl(SpoofaxGenerator._consFenceDef_2, new IStrategoTerm[]{generator.const7069, generator.const7047});
    constCons4635 = (IStrategoTerm)termFactory.makeListCons(generator.constFenceDef1, (IStrategoList)generator.constCons4634);
    constFenceDef2 = termFactory.makeAppl(SpoofaxGenerator._consFenceDef_2, new IStrategoTerm[]{generator.const7067, generator.const7068});
    constCons4636 = (IStrategoTerm)termFactory.makeListCons(generator.constFenceDef2, (IStrategoList)generator.constCons4635);
    constFenceDefs0 = termFactory.makeAppl(SpoofaxGenerator._consFenceDefs_1, new IStrategoTerm[]{generator.constCons4636});
    constCons4637 = (IStrategoTerm)termFactory.makeListCons(generator.constFenceDefs0, (IStrategoList)generator.constCons4633);
    const7181 = termFactory.makeString(" inserting, indenting brackets):");
    constCommentLine6 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7181});
    constCons4638 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine6, (IStrategoList)generator.constCons4637);
    const7182 = termFactory.makeString(" Fences (used for matching,");
    constCommentLine7 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7182});
    constCons4639 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine7, (IStrategoList)generator.constCons4638);
    constCons4640 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4639);
    const7183 = termFactory.makeString("/*");
    constString4 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7183});
    const7184 = termFactory.makeString("*");
    const7185 = termFactory.makeString("*/");
    constString5 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7185});
    constBlockCommentDef0 = termFactory.makeAppl(SpoofaxGenerator._consBlockCommentDef_3, new IStrategoTerm[]{generator.constString4, generator.const7184, generator.constString5});
    constBlockCommentDefs0 = termFactory.makeAppl(SpoofaxGenerator._consBlockCommentDefs_1, new IStrategoTerm[]{generator.constBlockCommentDef0});
    constCons4641 = (IStrategoTerm)termFactory.makeListCons(generator.constBlockCommentDefs0, (IStrategoList)generator.constCons4640);
    const7186 = termFactory.makeString("//");
    constString6 = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{generator.const7186});
    constLineCommentPrefix0 = termFactory.makeAppl(SpoofaxGenerator._consLineCommentPrefix_1, new IStrategoTerm[]{generator.constString6});
    constCons4642 = (IStrategoTerm)termFactory.makeListCons(generator.constLineCommentPrefix0, (IStrategoList)generator.constCons4641);
    const7187 = termFactory.makeString(" Comment constructs:");
    constCommentLine8 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7187});
    constCons4643 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine8, (IStrategoList)generator.constCons4642);
    constCons4644 = (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, (IStrategoList)generator.constCons4643);
    constLanguage1 = termFactory.makeAppl(SpoofaxGenerator._consLanguage_2, new IStrategoTerm[]{generator.const7174, generator.constCons4644});
    constCons4645 = (IStrategoTerm)termFactory.makeListCons(generator.constLanguage1, (IStrategoList)generator.constNil7);
    const7188 = termFactory.makeString("syntaxConfiguration");
    const7189 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-derived-syntax-descriptor'");
    constCons4646 = (IStrategoTerm)termFactory.makeListCons(generator.const7143, (IStrategoList)generator.constNil7);
    const7190 = termFactory.makeString("\n\n");
    const7191 = termFactory.makeString("module ");
    const7192 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spx-syntax-descriptor'");
    const7193 = termFactory.makeString("\n	");
    const7194 = termFactory.makeString("\n	 	\n	");
    const7195 = termFactory.makeString("main-descriptor");
    const7196 = termFactory.makeString(".spx");
    const7197 = termFactory.makeString("mainDescriptor");
    constCons4647 = (IStrategoTerm)termFactory.makeListCons(generator.const7197, (IStrategoList)generator.constNil7);
    const7198 = termFactory.makeString("src/");
    const7199 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'create-spxlang-main-descriptor'");
    const7200 = termFactory.makeString("pp main descriptor : ");
    const7201 = termFactory.makeString("\n	 			\n");
    constCons4648 = (IStrategoTerm)termFactory.makeListCons(generator.const7201, (IStrategoList)generator.constNil7);
    const7202 = termFactory.makeString(".generated  \n	 		\n");
    const7203 = termFactory.makeString("\n	 		\nimports ");
    const7204 = termFactory.makeString("\n	\nmodule ");
    const7205 = termFactory.makeString("package ");
    const7206 = termFactory.makeString("src");
    const7207 = termFactory.makeString("\n           ");
    const7208 = termFactory.makeString("editorservices.generated");
    const7209 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'output-spx-derived-editor-services'");
    const7210 = termFactory.makeString("\n		 			\n");
    constCons4649 = (IStrategoTerm)termFactory.makeListCons(generator.const7210, (IStrategoList)generator.constNil7);
    const7211 = termFactory.makeString("\n		 		\n");
    const7212 = termFactory.makeString(".generated\n		 		\n");
    const7213 = termFactory.makeString("editorservices");
    const7214 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'output-spx-editor-services'");
    const7215 = termFactory.makeString("\n	 		\n");
    const7216 = termFactory.makeString("-References.generated");
    const7217 = termFactory.makeString(" All semantic services may make use of the dynamic rules created by the observer.");
    constCommentLine9 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7217});
    constCons4650 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine9, (IStrategoList)generator.constNil7);
    const7218 = termFactory.makeString(" Reference resolving uses the semantic provider defined in YourLanguage-Builders.esv");
    constCommentLine10 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7218});
    constCons4651 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine10, (IStrategoList)generator.constCons4650);
    constCons4652 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4651);
    const7219 = termFactory.makeString("   hover FunctionCall : hover-help-function-call");
    constCommentLine11 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7219});
    constCons4653 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine11, (IStrategoList)generator.constCons4652);
    constCons4654 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4653);
    const7220 = termFactory.makeString(" Likewise, hover help can be specified as follows:");
    constCommentLine12 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7220});
    constCons4655 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine12, (IStrategoList)generator.constCons4654);
    constCons4656 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine1, (IStrategoList)generator.constCons4655);
    const7221 = termFactory.makeString(" will retrieve the AST node that declares it.");
    constCommentLine13 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7221});
    constCons4657 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine13, (IStrategoList)generator.constCons4656);
    const7222 = termFactory.makeString(" This defines that for each FunctionCall, resolve-function-call");
    constCommentLine14 = termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{generator.const7222});
    constCons4658 = (IStrategoTerm)termFactory.makeListCons(generator.constCommentLine14, (IStrategoList)generator.constCons4657);
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}