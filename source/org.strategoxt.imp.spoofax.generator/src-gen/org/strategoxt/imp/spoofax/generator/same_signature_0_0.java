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

@SuppressWarnings("all") public class same_signature_0_0 extends Strategy 
{ 
  public static same_signature_0_0 instance = new same_signature_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("same_signature_0_0");
    Fail25906:
    { 
      IStrategoTerm v_4276 = null;
      IStrategoTerm w_4276 = null;
      IStrategoTerm x_4276 = null;
      IStrategoTerm y_4276 = null;
      IStrategoTerm c_4277 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25906;
      v_4276 = term.getSubterm(0);
      w_4276 = term.getSubterm(1);
      x_4276 = term;
      term = get_constructor_0_0.instance.invoke(context, v_4276);
      if(term == null)
        break Fail25906;
      y_4276 = term;
      term = get_constructor_0_0.instance.invoke(context, w_4276);
      if(term == null)
        break Fail25906;
      term = termFactory.makeTuple(y_4276, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25906;
      term = get_arguments_0_0.instance.invoke(context, v_4276);
      if(term == null)
        break Fail25906;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25906;
      c_4277 = term;
      term = get_arguments_0_0.instance.invoke(context, w_4276);
      if(term == null)
        break Fail25906;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25906;
      term = termFactory.makeTuple(c_4277, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25906;
      term = v_4276;
      IStrategoTerm term10327 = term;
      Success10256:
      { 
        Fail25907:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25907;
          { 
            if(true)
              break Fail25906;
            if(true)
              break Success10256;
          }
        }
        term = term10327;
      }
      term = w_4276;
      IStrategoTerm term10328 = term;
      Success10257:
      { 
        Fail25908:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25908;
          { 
            if(true)
              break Fail25906;
            if(true)
              break Success10257;
          }
        }
        term = term10328;
      }
      term = x_4276;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}