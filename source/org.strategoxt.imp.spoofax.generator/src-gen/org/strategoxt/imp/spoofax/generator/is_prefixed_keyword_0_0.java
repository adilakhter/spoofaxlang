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

@SuppressWarnings("all") public class is_prefixed_keyword_0_0 extends Strategy 
{ 
  public static is_prefixed_keyword_0_0 instance = new is_prefixed_keyword_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_prefixed_keyword_0_0");
    Fail26202:
    { 
      IStrategoTerm j_4312 = null;
      IStrategoTerm k_4312 = null;
      IStrategoTerm l_4312 = null;
      IStrategoTerm n_4312 = null;
      term = explode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26202;
      j_4312 = term;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail26202;
      k_4312 = ((IStrategoList)term).head();
      l_4312 = ((IStrategoList)term).tail();
      term = k_4312;
      IStrategoTerm term10572 = term;
      Success10492:
      { 
        Fail26203:
        { 
          term = is_alpha_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26203;
          { 
            if(true)
              break Fail26202;
            if(true)
              break Success10492;
          }
        }
        term = term10572;
      }
      term = l_4312;
      n_4312 = l_4312;
      IStrategoList list399;
      list399 = checkListTail(n_4312);
      if(list399 == null)
        break Fail26202;
      term = SRTS_one.instance.invoke(context, j_4312, is_alpha_0_0.instance);
      if(term == null)
        break Fail26202;
      IStrategoTerm term10573 = term;
      Success10493:
      { 
        Fail26204:
        { 
          term = SRTS_one.instance.invoke(context, term, lifted9400.instance);
          if(term == null)
            break Fail26204;
          { 
            if(true)
              break Fail26202;
            if(true)
              break Success10493;
          }
        }
        term = term10573;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}