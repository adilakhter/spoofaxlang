package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_newer_0_0 extends Strategy 
{ 
  public static is_newer_0_0 instance = new is_newer_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_newer_0_0");
    Fail22869:
    { 
      IStrategoTerm w_4624 = null;
      IStrategoTerm x_4624 = null;
      IStrategoTerm y_4624 = null;
      IStrategoTerm z_4624 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22869;
      w_4624 = term.getSubterm(0);
      x_4624 = term.getSubterm(1);
      y_4624 = term;
      term = file_exists_0_0.instance.invoke(context, w_4624);
      if(term == null)
        break Fail22869;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22869;
      z_4624 = term;
      term = file_exists_0_0.instance.invoke(context, x_4624);
      if(term == null)
        break Fail22869;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22869;
      term = termFactory.makeTuple(z_4624, term);
      term = gt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22869;
      term = y_4624;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}