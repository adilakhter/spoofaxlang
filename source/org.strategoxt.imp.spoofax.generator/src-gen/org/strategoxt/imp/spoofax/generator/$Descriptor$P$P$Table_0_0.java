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

@SuppressWarnings("all") public class $Descriptor$P$P$Table_0_0 extends Strategy 
{ 
  public static $Descriptor$P$P$Table_0_0 instance = new $Descriptor$P$P$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DescriptorPPTable_0_0");
    Fail27111:
    { 
      TermReference t_4431 = new TermReference();
      IStrategoTerm w_4431 = null;
      IStrategoTerm y_4431 = null;
      IStrategoTerm z_4431 = null;
      if(t_4431.value == null)
        t_4431.value = term;
      else
        if(t_4431.value != term && !t_4431.value.match(term))
          break Fail27111;
      y_4431 = term;
      w_4431 = generator.const7124;
      z_4431 = y_4431;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_4431, w_4431, generator.constCons4561);
      if(term == null)
        break Fail27111;
      lifted10050 lifted100500 = new lifted10050();
      lifted100500.t_4431 = t_4431;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100500);
      if(term == null)
        break Fail27111;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}