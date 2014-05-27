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
    Fail87677:
    { 
      IStrategoTerm t_17568 = null;
      IStrategoTerm u_17568 = null;
      IStrategoTerm v_17568 = null;
      IStrategoTerm w_17568 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87677;
      t_17568 = term.getSubterm(0);
      u_17568 = term.getSubterm(1);
      v_17568 = term;
      term = file_exists_0_0.instance.invoke(context, t_17568);
      if(term == null)
        break Fail87677;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87677;
      w_17568 = term;
      term = file_exists_0_0.instance.invoke(context, u_17568);
      if(term == null)
        break Fail87677;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87677;
      term = termFactory.makeTuple(w_17568, term);
      term = gt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87677;
      term = v_17568;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}