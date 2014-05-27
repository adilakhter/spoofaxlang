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

@SuppressWarnings("all") public class once_$Jar$Locations_0_0 extends Strategy 
{ 
  public static once_$Jar$Locations_0_0 instance = new once_$Jar$Locations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_JarLocations_0_0");
    Fail27604:
    { 
      IStrategoTerm s_4512 = null;
      TermReference t_4512 = new TermReference();
      TermReference u_4512 = new TermReference();
      IStrategoTerm v_4512 = null;
      IStrategoTerm w_4512 = null;
      IStrategoTerm y_4512 = null;
      IStrategoTerm z_4512 = null;
      IStrategoTerm b_4513 = null;
      IStrategoTerm c_4513 = null;
      if(t_4512.value == null)
        t_4512.value = term;
      else
        if(t_4512.value != term && !t_4512.value.match(term))
          break Fail27604;
      y_4512 = term;
      b_4513 = term;
      z_4512 = generator.const7880;
      c_4513 = b_4513;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, c_4513, z_4512, generator.constCons4561);
      if(term == null)
        break Fail27604;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27604;
      s_4512 = term.getSubterm(0);
      w_4512 = term.getSubterm(1);
      v_4512 = term.getSubterm(2);
      term = s_4512;
      lifted10218 lifted102180 = new lifted10218();
      lifted102180.t_4512 = t_4512;
      lifted102180.u_4512 = u_4512;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102180);
      if(term == null)
        break Fail27604;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27604;
      term = hashtable_put_0_2.instance.invoke(context, v_4512, w_4512, term);
      if(term == null)
        break Fail27604;
      term = y_4512;
      if(u_4512.value == null)
        break Fail27604;
      term = u_4512.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}