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

@SuppressWarnings("all") public class apply_textual_change_0_0 extends Strategy 
{ 
  public static apply_textual_change_0_0 instance = new apply_textual_change_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("apply_textual_change_0_0");
    Fail25941:
    { 
      IStrategoTerm w_4281 = null;
      IStrategoTerm x_4281 = null;
      IStrategoTerm y_4281 = null;
      IStrategoTerm z_4281 = null;
      IStrategoTerm a_4282 = null;
      IStrategoTerm b_4282 = null;
      IStrategoTerm c_4282 = null;
      IStrategoTerm d_4282 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25941;
      x_4281 = term.getSubterm(0);
      w_4281 = term.getSubterm(1);
      term = w_4281;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25941;
      a_4282 = term.getSubterm(0);
      b_4282 = term.getSubterm(1);
      term = x_4281;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25941;
      IStrategoTerm arg6256 = term.getSubterm(0);
      if(arg6256.getTermType() != IStrategoTerm.TUPLE || arg6256.getSubtermCount() != 2)
        break Fail25941;
      y_4281 = arg6256.getSubterm(0);
      z_4281 = arg6256.getSubterm(1);
      c_4282 = term.getSubterm(1);
      term = termFactory.makeTuple(y_4281, a_4282);
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25941;
      d_4282 = term;
      term = termFactory.makeTuple(z_4281, a_4282);
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25941;
      term = termFactory.makeTuple(b_4282, c_4282, d_4282, term);
      term = replace_in_text_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25941;
      term = termFactory.makeTuple(a_4282, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}