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

@SuppressWarnings("all") public class once_$Main$Descriptor_0_0 extends Strategy 
{ 
  public static once_$Main$Descriptor_0_0 instance = new once_$Main$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_MainDescriptor_0_0");
    Fail27236:
    { 
      IStrategoTerm u_4451 = null;
      TermReference v_4451 = new TermReference();
      TermReference w_4451 = new TermReference();
      IStrategoTerm x_4451 = null;
      IStrategoTerm y_4451 = null;
      IStrategoTerm a_4452 = null;
      IStrategoTerm b_4452 = null;
      IStrategoTerm d_4452 = null;
      IStrategoTerm e_4452 = null;
      if(v_4451.value == null)
        v_4451.value = term;
      else
        if(v_4451.value != term && !v_4451.value.match(term))
          break Fail27236;
      a_4452 = term;
      d_4452 = term;
      b_4452 = generator.const7251;
      e_4452 = d_4452;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, e_4452, b_4452, generator.constCons4561);
      if(term == null)
        break Fail27236;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27236;
      u_4451 = term.getSubterm(0);
      y_4451 = term.getSubterm(1);
      x_4451 = term.getSubterm(2);
      term = u_4451;
      lifted10092 lifted100920 = new lifted10092();
      lifted100920.v_4451 = v_4451;
      lifted100920.w_4451 = w_4451;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100920);
      if(term == null)
        break Fail27236;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27236;
      term = hashtable_put_0_2.instance.invoke(context, x_4451, y_4451, term);
      if(term == null)
        break Fail27236;
      term = a_4452;
      if(w_4451.value == null)
        break Fail27236;
      term = w_4451.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}