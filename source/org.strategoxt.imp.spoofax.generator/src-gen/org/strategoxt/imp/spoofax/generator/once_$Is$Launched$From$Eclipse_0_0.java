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

@SuppressWarnings("all") public class once_$Is$Launched$From$Eclipse_0_0 extends Strategy 
{ 
  public static once_$Is$Launched$From$Eclipse_0_0 instance = new once_$Is$Launched$From$Eclipse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsLaunchedFromEclipse_0_0");
    Fail27682:
    { 
      IStrategoTerm w_4526 = null;
      TermReference x_4526 = new TermReference();
      TermReference y_4526 = new TermReference();
      TermReference z_4526 = new TermReference();
      IStrategoTerm a_4527 = null;
      IStrategoTerm b_4527 = null;
      IStrategoTerm d_4527 = null;
      IStrategoTerm e_4527 = null;
      IStrategoTerm g_4527 = null;
      IStrategoTerm h_4527 = null;
      if(y_4526.value == null)
        y_4526.value = term;
      else
        if(y_4526.value != term && !y_4526.value.match(term))
          break Fail27682;
      if(x_4526.value == null)
        x_4526.value = term;
      else
        if(x_4526.value != term && !x_4526.value.match(term))
          break Fail27682;
      d_4527 = term;
      g_4527 = term;
      e_4527 = generator.const7895;
      h_4527 = g_4527;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, h_4527, e_4527, generator.constCons4561);
      if(term == null)
        break Fail27682;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27682;
      w_4526 = term.getSubterm(0);
      b_4527 = term.getSubterm(1);
      a_4527 = term.getSubterm(2);
      term = w_4526;
      lifted10245 lifted102450 = new lifted10245();
      lifted102450.x_4526 = x_4526;
      lifted102450.y_4526 = y_4526;
      lifted102450.z_4526 = z_4526;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102450);
      if(term == null)
        break Fail27682;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27682;
      term = hashtable_put_0_2.instance.invoke(context, a_4527, b_4527, term);
      if(term == null)
        break Fail27682;
      term = d_4527;
      if(z_4526.value == null)
        break Fail27682;
      term = z_4526.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}