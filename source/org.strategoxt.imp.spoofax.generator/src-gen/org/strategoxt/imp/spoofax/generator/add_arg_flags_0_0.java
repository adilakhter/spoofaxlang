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

@SuppressWarnings("all") public class add_arg_flags_0_0 extends Strategy 
{ 
  public static add_arg_flags_0_0 instance = new add_arg_flags_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_arg_flags_0_0");
    Fail25579:
    { 
      IStrategoTerm term10105 = term;
      Success10082:
      { 
        Fail25580:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25580;
          IStrategoTerm arg5950 = term.getSubterm(1);
          if(arg5950.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5950).isEmpty())
            break Fail25580;
          term = generator.constNil7;
          if(true)
            break Success10082;
        }
        term = term10105;
        IStrategoTerm u_4238 = null;
        IStrategoTerm v_4238 = null;
        IStrategoTerm w_4238 = null;
        IStrategoTerm x_4238 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail25579;
        u_4238 = term.getSubterm(0);
        v_4238 = term.getSubterm(1);
        x_4238 = term;
        term = v_4238;
        term = termFactory.makeTuple(u_4238, term);
        term = separate_by_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25579;
        w_4238 = term;
        term = x_4238;
        IStrategoList list382;
        list382 = checkListTail(w_4238);
        if(list382 == null)
          break Fail25579;
        term = (IStrategoTerm)termFactory.makeListCons(u_4238, list382);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}