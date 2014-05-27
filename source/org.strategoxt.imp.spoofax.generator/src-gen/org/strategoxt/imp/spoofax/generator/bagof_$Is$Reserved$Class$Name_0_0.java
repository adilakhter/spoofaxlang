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

@SuppressWarnings("all") public class bagof_$Is$Reserved$Class$Name_0_0 extends Strategy 
{ 
  public static bagof_$Is$Reserved$Class$Name_0_0 instance = new bagof_$Is$Reserved$Class$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsReservedClassName_0_0");
    Fail27213:
    { 
      TermReference h_4448 = new TermReference();
      TermReference i_4448 = new TermReference();
      if(i_4448.value == null)
        i_4448.value = term;
      else
        if(i_4448.value != term && !i_4448.value.match(term))
          break Fail27213;
      if(h_4448.value == null)
        h_4448.value = term;
      else
        if(h_4448.value != term && !h_4448.value.match(term))
          break Fail27213;
      Success11043:
      { 
        Fail27214:
        { 
          IStrategoTerm m_4448 = null;
          m_4448 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, m_4448, generator.const7167, i_4448.value);
          if(term == null)
            break Fail27214;
          if(true)
            break Success11043;
        }
        term = generator.constNil7;
      }
      lifted10085 lifted100850 = new lifted10085();
      lifted100850.h_4448 = h_4448;
      lifted100850.i_4448 = i_4448;
      term = filter_1_0.instance.invoke(context, term, lifted100850);
      if(term == null)
        break Fail27213;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}