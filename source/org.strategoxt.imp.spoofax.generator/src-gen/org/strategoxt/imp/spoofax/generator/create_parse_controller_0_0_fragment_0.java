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

@SuppressWarnings("all") final class create_parse_controller_0_0_fragment_0 extends Strategy 
{ 
  TermReference n_4365;

  TermReference q_4689;

  TermReference p_4689;

  TermReference o_4689;

  TermReference n_4689;

  TermReference o_4365;

  TermReference p_4365;

  TermReference q_4365;

  TermReference r_4365;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28549:
    { 
      if(o_4365.value == null || (n_4365.value == null || (q_4365.value == null || p_4365.value == null)))
        break Fail28549;
      term = termFactory.makeAppl(SpoofaxGenerator._consCompilationUnit_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consPackageDec_2, new IStrategoTerm[]{generator.constNil7, o_4365.value})}), generator.constCons4983, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassDecHead_5, new IStrategoTerm[]{generator.constCons4929, termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{q_4365.value}), generator.constNone0, generator.constSome1, generator.constNone0}), termFactory.makeAppl(SpoofaxGenerator._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5060, generator.constClassOrInterfaceType5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId57, termFactory.makeAppl(SpoofaxGenerator._consNewInstance_4, new IStrategoTerm[]{generator.constNone0, generator.constClassOrInterfaceType5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{n_4365.value}), (IStrategoList)generator.constNil7)})}), (IStrategoList)generator.constNil7), generator.constNone0})}), (IStrategoList)generator.constNil7)}), termFactory.makeListCons(generator.constFieldDec3, termFactory.makeListCons(generator.constFieldDec2, termFactory.makeListCons(generator.constFieldDec1, termFactory.makeListCons(generator.constFieldDec0, termFactory.makeListCons(generator.constMethodDec2, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead5, termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{q_4365.value})}), generator.constId46}), generator.constExprName6})}), (IStrategoList)generator.constNil7)})}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead4, termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consTry_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLocalVarDec_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId52, termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{q_4365.value})}), generator.constNone0})})}), generator.constNone0, generator.constId56}), generator.constCons5025})}), (IStrategoList)generator.constNil7)})}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLocalVarDec_3, new IStrategoTerm[]{generator.constNil7, generator.constClassOrInterfaceType8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId51, termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{q_4365.value})}), generator.constNone0})})}), generator.constNone0, generator.constId56}), generator.constCons5024})}), (IStrategoList)generator.constNil7)})}), termFactory.makeListCons(generator.constLocalVarDecStm0, termFactory.makeListCons(generator.constIf5, termFactory.makeListCons(generator.constIf4, termFactory.makeListCons(generator.constIf3, termFactory.makeListCons(generator.constIf2, termFactory.makeListCons(generator.constExprStm4, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{generator.constMethod4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{q_4365.value})}), generator.constNone0})})}), (IStrategoList)generator.constNil7)})}), (IStrategoList)generator.constNil7)))))))))}), generator.constCons5038}), (IStrategoList)generator.constNil7)})}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead3, termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{p_4365.value})}), generator.constNone0})})}), generator.constNone0, generator.constId41}), generator.constNil7}), generator.constNone0, generator.constId42}), generator.constNil7}), generator.constNone0, generator.constId43}), generator.constNil7}), generator.constNone0, generator.constId44}), generator.constNil7})})}), (IStrategoList)generator.constNil7)})}), (IStrategoList)generator.constCons5003)))))))))})}), (IStrategoList)generator.constNil7)});
      if(o_4689.value == null)
        o_4689.value = term;
      else
        if(o_4689.value != term && !o_4689.value.match(term))
          break Fail28549;
      if(q_4689.value == null)
        q_4689.value = term;
      else
        if(q_4689.value != term && !q_4689.value.match(term))
          break Fail28549;
      term = java_to_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28549;
      if(p_4689.value == null)
        p_4689.value = term;
      else
        if(p_4689.value != term && !p_4689.value.match(term))
          break Fail28549;
      if(q_4689.value == null)
        break Fail28549;
      term = q_4689.value;
      if(p_4689.value == null)
        break Fail28549;
      term = p_4689.value;
      if(n_4689.value == null)
        n_4689.value = term;
      else
        if(n_4689.value != term && !n_4689.value.match(term))
          break Fail28549;
      if(o_4689.value == null)
        break Fail28549;
      term = output_java_file_0_1.instance.invoke(context, o_4689.value, n_4689.value);
      if(term == null)
        break Fail28549;
      if(o_4365.value == null || (p_4365.value == null || q_4365.value == null))
        break Fail28549;
      term = termFactory.makeAppl(SpoofaxGenerator._consCompilationUnit_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consPackageDec_2, new IStrategoTerm[]{generator.constNil7, o_4365.value})}), generator.constNil7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassDecHead_5, new IStrategoTerm[]{generator.constCons4929, termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{p_4365.value}), generator.constNone0, termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSuperDec_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassType_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{q_4365.value})}), generator.constNone0})})}), generator.constNone0}), generator.constClassBody0}), (IStrategoList)generator.constNil7)});
      if(r_4365.value == null)
        r_4365.value = term;
      else
        if(r_4365.value != term && !r_4365.value.match(term))
          break Fail28549;
      IStrategoTerm term10958 = term;
      Success11286:
      { 
        Fail28550:
        { 
          IStrategoTerm s_4365 = null;
          s_4365 = term;
          IStrategoTerm term10959 = term;
          Success11287:
          { 
            Fail28551:
            { 
              if(r_4365.value == null)
                break Fail28551;
              term = java_to_path_0_0.instance.invoke(context, r_4365.value);
              if(term == null)
                break Fail28551;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28551;
              { 
                if(true)
                  break Fail28550;
                if(true)
                  break Success11287;
              }
            }
            term = term10959;
          }
          term = s_4365;
          { 
            if(r_4365.value == null)
              break Fail28549;
            term = output_java_file_0_0.instance.invoke(context, r_4365.value);
            if(term == null)
              break Fail28549;
            if(true)
              break Success11286;
          }
        }
        term = term10958;
      }
      if(true)
        return term;
    }
    return null;
  }
}