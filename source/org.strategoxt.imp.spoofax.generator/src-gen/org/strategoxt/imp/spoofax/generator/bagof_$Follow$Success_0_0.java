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

@SuppressWarnings("all") public class bagof_$Follow$Success_0_0 extends Strategy 
{ 
  public static bagof_$Follow$Success_0_0 instance = new bagof_$Follow$Success_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_FollowSuccess_0_0");
    Fail27477:
    { 
      TermReference h_4492 = new TermReference();
      TermReference i_4492 = new TermReference();
      if(i_4492.value == null)
        i_4492.value = term;
      else
        if(i_4492.value != term && !i_4492.value.match(term))
          break Fail27477;
      if(h_4492.value == null)
        h_4492.value = term;
      else
        if(h_4492.value != term && !h_4492.value.match(term))
          break Fail27477;
      Success11117:
      { 
        Fail27478:
        { 
          IStrategoTerm m_4492 = null;
          m_4492 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, m_4492, generator.const7487, i_4492.value);
          if(term == null)
            break Fail27478;
          if(true)
            break Success11117;
        }
        term = generator.constNil7;
      }
      lifted10175 lifted101750 = new lifted10175();
      lifted101750.h_4492 = h_4492;
      lifted101750.i_4492 = i_4492;
      term = filter_1_0.instance.invoke(context, term, lifted101750);
      if(term == null)
        break Fail27477;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}