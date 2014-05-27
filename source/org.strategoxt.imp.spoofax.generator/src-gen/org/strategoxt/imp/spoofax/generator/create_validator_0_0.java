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

@SuppressWarnings("all") public class create_validator_0_0 extends Strategy 
{ 
  public static create_validator_0_0 instance = new create_validator_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_validator_0_0");
    Fail26318:
    { 
      IStrategoTerm n_4328 = null;
      IStrategoTerm o_4328 = null;
      IStrategoTerm p_4328 = null;
      IStrategoTerm v_4328 = null;
      term = get_main_class_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26318;
      term = termFactory.makeTuple(term, generator.const7491);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26318;
      n_4328 = term;
      term = parse_controller_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26318;
      o_4328 = term;
      term = get_package_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26318;
      v_4328 = term;
      term = termFactory.makeAppl(SpoofaxGenerator._consCompilationUnit_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consPackageDec_2, new IStrategoTerm[]{generator.constNil7, v_4328})}), generator.constCons4928, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consClassDecHead_5, new IStrategoTerm[]{generator.constCons4929, termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{n_4328}), generator.constNone0, generator.constSome0, generator.constNone0}), termFactory.makeAppl(SpoofaxGenerator._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consMethodDec_2, new IStrategoTerm[]{generator.constMethodDecHead0, termFactory.makeAppl(SpoofaxGenerator._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{o_4328})}), generator.constId13})}), generator.constNil7})})}), (IStrategoList)generator.constNil7)})}), (IStrategoList)generator.constNil7)})}), (IStrategoList)generator.constNil7)});
      p_4328 = term;
      IStrategoTerm term10662 = term;
      Success10562:
      { 
        Fail26319:
        { 
          IStrategoTerm q_4328 = null;
          q_4328 = term;
          IStrategoTerm term10663 = term;
          Success10563:
          { 
            Fail26320:
            { 
              term = java_to_path_0_0.instance.invoke(context, p_4328);
              if(term == null)
                break Fail26320;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26320;
              { 
                if(true)
                  break Fail26319;
                if(true)
                  break Success10563;
              }
            }
            term = term10663;
          }
          term = q_4328;
          { 
            IStrategoTerm g_4689 = null;
            term = p_4328;
            g_4689 = p_4328;
            term = java_to_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26318;
            term = output_java_file_0_1.instance.invoke(context, g_4689, term);
            if(term == null)
              break Fail26318;
            if(true)
              break Success10562;
          }
        }
        term = term10662;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}