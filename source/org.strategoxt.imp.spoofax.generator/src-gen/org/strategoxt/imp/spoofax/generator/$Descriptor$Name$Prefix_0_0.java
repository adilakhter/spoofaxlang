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

@SuppressWarnings("all") public class $Descriptor$Name$Prefix_0_0 extends Strategy 
{ 
  public static $Descriptor$Name$Prefix_0_0 instance = new $Descriptor$Name$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DescriptorNamePrefix_0_0");
    Fail27713:
    { 
      TermReference h_4532 = new TermReference();
      IStrategoTerm k_4532 = null;
      IStrategoTerm m_4532 = null;
      IStrategoTerm n_4532 = null;
      if(h_4532.value == null)
        h_4532.value = term;
      else
        if(h_4532.value != term && !h_4532.value.match(term))
          break Fail27713;
      m_4532 = term;
      k_4532 = generator.const7899;
      n_4532 = m_4532;
      term = dr_lookup_rule_0_2.instance.invoke(context, n_4532, k_4532, generator.constCons4561);
      if(term == null)
        break Fail27713;
      lifted10257 lifted102570 = new lifted10257();
      lifted102570.h_4532 = h_4532;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102570);
      if(term == null)
        break Fail27713;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}