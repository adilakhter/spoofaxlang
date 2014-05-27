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

@SuppressWarnings("all") public class concat_modules_0_0 extends Strategy 
{ 
  public static concat_modules_0_0 instance = new concat_modules_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("concat_modules_0_0");
    Fail25500:
    { 
      IStrategoTerm t_4226 = null;
      IStrategoTerm u_4226 = null;
      IStrategoTerm v_4226 = null;
      IStrategoTerm w_4226 = null;
      IStrategoTerm x_4226 = null;
      IStrategoTerm y_4226 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25500;
      IStrategoTerm arg5932 = term.getSubterm(0);
      if(arg5932.getTermType() != IStrategoTerm.TUPLE || arg5932.getSubtermCount() != 3)
        break Fail25500;
      t_4226 = arg5932.getSubterm(0);
      u_4226 = arg5932.getSubterm(1);
      v_4226 = arg5932.getSubterm(2);
      IStrategoTerm arg5933 = term.getSubterm(1);
      if(arg5933.getTermType() != IStrategoTerm.TUPLE || arg5933.getSubtermCount() != 3)
        break Fail25500;
      w_4226 = arg5933.getSubterm(0);
      x_4226 = arg5933.getSubterm(1);
      y_4226 = arg5933.getSubterm(2);
      term = (IStrategoTerm)termFactory.makeListCons(v_4226, termFactory.makeListCons(generator.constappl4, termFactory.makeListCons(generator.constappl4, termFactory.makeListCons(w_4226, (IStrategoList)generator.constNil7))));
      term = concat_layout_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25500;
      term = termFactory.makeTuple(t_4226, termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod12, (IStrategoTerm)termFactory.makeListCons(u_4226, termFactory.makeListCons(term, termFactory.makeListCons(x_4226, (IStrategoList)generator.constNil7)))}), y_4226);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}