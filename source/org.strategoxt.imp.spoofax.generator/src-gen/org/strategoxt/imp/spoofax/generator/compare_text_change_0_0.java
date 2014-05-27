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

@SuppressWarnings("all") public class compare_text_change_0_0 extends Strategy 
{ 
  public static compare_text_change_0_0 instance = new compare_text_change_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("compare_text_change_0_0");
    Fail25943:
    { 
      IStrategoTerm y_4282 = null;
      IStrategoTerm z_4282 = null;
      IStrategoTerm a_4283 = null;
      IStrategoTerm b_4283 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25943;
      IStrategoTerm arg6257 = term.getSubterm(0);
      if(arg6257.getTermType() != IStrategoTerm.TUPLE || arg6257.getSubtermCount() != 2)
        break Fail25943;
      IStrategoTerm arg6258 = arg6257.getSubterm(0);
      if(arg6258.getTermType() != IStrategoTerm.TUPLE || arg6258.getSubtermCount() != 2)
        break Fail25943;
      y_4282 = arg6258.getSubterm(0);
      a_4283 = arg6258.getSubterm(1);
      IStrategoTerm arg6259 = term.getSubterm(1);
      if(arg6259.getTermType() != IStrategoTerm.TUPLE || arg6259.getSubtermCount() != 2)
        break Fail25943;
      IStrategoTerm arg6260 = arg6259.getSubterm(0);
      if(arg6260.getTermType() != IStrategoTerm.TUPLE || arg6260.getSubtermCount() != 2)
        break Fail25943;
      z_4282 = arg6260.getSubterm(0);
      b_4283 = arg6260.getSubterm(1);
      IStrategoTerm term10357 = term;
      Success10283:
      { 
        Fail25944:
        { 
          Success10284:
          { 
            Fail25945:
            { 
              term = termFactory.makeTuple(y_4282, z_4282);
              term = lt_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25945;
              if(true)
                break Success10284;
            }
            term = termFactory.makeTuple(y_4282, z_4282);
            term = eq_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25944;
            term = termFactory.makeTuple(a_4283, b_4283);
            term = lt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25944;
          }
          { 
            if(true)
              break Fail25943;
            if(true)
              break Success10283;
          }
        }
        term = term10357;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}