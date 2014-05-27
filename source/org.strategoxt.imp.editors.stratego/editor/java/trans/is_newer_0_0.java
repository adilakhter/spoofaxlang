package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
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
    Fail21461:
    { 
      IStrategoTerm r_4202 = null;
      IStrategoTerm s_4202 = null;
      IStrategoTerm t_4202 = null;
      IStrategoTerm u_4202 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21461;
      r_4202 = term.getSubterm(0);
      s_4202 = term.getSubterm(1);
      t_4202 = term;
      term = file_exists_0_0.instance.invoke(context, r_4202);
      if(term == null)
        break Fail21461;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21461;
      u_4202 = term;
      term = file_exists_0_0.instance.invoke(context, s_4202);
      if(term == null)
        break Fail21461;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21461;
      term = termFactory.makeTuple(u_4202, term);
      term = gt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21461;
      term = t_4202;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}