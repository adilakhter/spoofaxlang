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
    Fail22937:
    { 
      IStrategoTerm j_4756 = null;
      IStrategoTerm k_4756 = null;
      IStrategoTerm l_4756 = null;
      IStrategoTerm m_4756 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22937;
      j_4756 = term.getSubterm(0);
      k_4756 = term.getSubterm(1);
      l_4756 = term;
      term = file_exists_0_0.instance.invoke(context, j_4756);
      if(term == null)
        break Fail22937;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22937;
      m_4756 = term;
      term = file_exists_0_0.instance.invoke(context, k_4756);
      if(term == null)
        break Fail22937;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22937;
      term = termFactory.makeTuple(m_4756, term);
      term = gt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22937;
      term = l_4756;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}