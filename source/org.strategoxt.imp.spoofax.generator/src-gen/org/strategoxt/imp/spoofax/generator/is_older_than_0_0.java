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

@SuppressWarnings("all") public class is_older_than_0_0 extends Strategy 
{ 
  public static is_older_than_0_0 instance = new is_older_than_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_older_than_0_0");
    Fail25812:
    { 
      IStrategoTerm r_4264 = null;
      IStrategoTerm s_4264 = null;
      TermReference t_4264 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25812;
      r_4264 = term.getSubterm(0);
      s_4264 = term.getSubterm(1);
      term = file_exists_0_0.instance.invoke(context, r_4264);
      if(term == null)
        break Fail25812;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25812;
      if(t_4264.value == null)
        t_4264.value = term;
      else
        if(t_4264.value != term && !t_4264.value.match(term))
          break Fail25812;
      term = s_4264;
      lifted9254 lifted92540 = new lifted9254();
      lifted92540.t_4264 = t_4264;
      term = list_loop_1_0.instance.invoke(context, term, lifted92540);
      if(term == null)
        break Fail25812;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}