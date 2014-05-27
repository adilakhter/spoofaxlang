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

@SuppressWarnings("all") public class once_$Input$File_0_0 extends Strategy 
{ 
  public static once_$Input$File_0_0 instance = new once_$Input$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_InputFile_0_0");
    Fail27526:
    { 
      IStrategoTerm x_4499 = null;
      TermReference y_4499 = new TermReference();
      TermReference z_4499 = new TermReference();
      IStrategoTerm a_4500 = null;
      IStrategoTerm b_4500 = null;
      IStrategoTerm d_4500 = null;
      IStrategoTerm e_4500 = null;
      IStrategoTerm g_4500 = null;
      IStrategoTerm h_4500 = null;
      if(y_4499.value == null)
        y_4499.value = term;
      else
        if(y_4499.value != term && !y_4499.value.match(term))
          break Fail27526;
      d_4500 = term;
      g_4500 = term;
      e_4500 = generator.const7868;
      h_4500 = g_4500;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, h_4500, e_4500, generator.constCons4561);
      if(term == null)
        break Fail27526;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27526;
      x_4499 = term.getSubterm(0);
      b_4500 = term.getSubterm(1);
      a_4500 = term.getSubterm(2);
      term = x_4499;
      lifted10191 lifted101910 = new lifted10191();
      lifted101910.y_4499 = y_4499;
      lifted101910.z_4499 = z_4499;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101910);
      if(term == null)
        break Fail27526;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27526;
      term = hashtable_put_0_2.instance.invoke(context, a_4500, b_4500, term);
      if(term == null)
        break Fail27526;
      term = d_4500;
      if(z_4499.value == null)
        break Fail27526;
      term = z_4499.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}