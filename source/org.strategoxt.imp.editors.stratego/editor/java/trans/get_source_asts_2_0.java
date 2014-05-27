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

@SuppressWarnings("all") public class get_source_asts_2_0 extends Strategy 
{ 
  public static get_source_asts_2_0 instance = new get_source_asts_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4733, Strategy p_4733)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_source_asts_2_0");
    Fail22814:
    { 
      IStrategoTerm k_4733 = null;
      IStrategoTerm m_4733 = null;
      IStrategoTerm n_4733 = null;
      k_4733 = term;
      term = get_source_files_2_0.instance.invoke(context, k_4733, o_4733, p_4733);
      if(term == null)
        break Fail22814;
      term = parse_source_files_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22814;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22814;
      m_4733 = term.getSubterm(0);
      n_4733 = term.getSubterm(1);
      term = termFactory.makeTuple(m_4733, n_4733);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}