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

@SuppressWarnings("all") public class $No$Existing$Descriptor_0_0 extends Strategy 
{ 
  public static $No$Existing$Descriptor_0_0 instance = new $No$Existing$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("NoExistingDescriptor_0_0");
    Fail27345:
    { 
      TermReference i_4470 = new TermReference();
      TermReference j_4470 = new TermReference();
      IStrategoTerm m_4470 = null;
      IStrategoTerm o_4470 = null;
      IStrategoTerm p_4470 = null;
      if(j_4470.value == null)
        j_4470.value = term;
      else
        if(j_4470.value != term && !j_4470.value.match(term))
          break Fail27345;
      if(i_4470.value == null)
        i_4470.value = term;
      else
        if(i_4470.value != term && !i_4470.value.match(term))
          break Fail27345;
      o_4470 = term;
      m_4470 = generator.const7463;
      p_4470 = o_4470;
      term = dr_lookup_rule_0_2.instance.invoke(context, p_4470, m_4470, generator.constCons4561);
      if(term == null)
        break Fail27345;
      lifted10131 lifted101310 = new lifted10131();
      lifted101310.i_4470 = i_4470;
      lifted101310.j_4470 = j_4470;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101310);
      if(term == null)
        break Fail27345;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}