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

@SuppressWarnings("all") public class bigbagof_$Follow$Visited_0_0 extends Strategy 
{ 
  public static bigbagof_$Follow$Visited_0_0 instance = new bigbagof_$Follow$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_FollowVisited_0_0");
    Fail27446:
    { 
      TermReference h_4487 = new TermReference();
      TermReference i_4487 = new TermReference();
      if(i_4487.value == null)
        i_4487.value = term;
      else
        if(i_4487.value != term && !i_4487.value.match(term))
          break Fail27446;
      if(h_4487.value == null)
        h_4487.value = term;
      else
        if(h_4487.value != term && !h_4487.value.match(term))
          break Fail27446;
      Success11108:
      { 
        Fail27447:
        { 
          IStrategoTerm m_4487 = null;
          m_4487 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4487, generator.const7485, i_4487.value);
          if(term == null)
            break Fail27447;
          if(true)
            break Success11108;
        }
        term = generator.constNil7;
      }
      lifted10163 lifted101630 = new lifted10163();
      lifted101630.h_4487 = h_4487;
      lifted101630.i_4487 = i_4487;
      term = filter_1_0.instance.invoke(context, term, lifted101630);
      if(term == null)
        break Fail27446;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}