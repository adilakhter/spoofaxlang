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

@SuppressWarnings("all") public class fetch_up_with_position_1_1 extends Strategy 
{ 
  public static fetch_up_with_position_1_1 instance = new fetch_up_with_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4160, IStrategoTerm j_4160)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_up_with_position_1_1");
    Fail21226:
    { 
      IStrategoTerm k_4160 = null;
      IStrategoTerm l_4160 = null;
      IStrategoTerm m_4160 = null;
      IStrategoTerm n_4160 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21226;
      k_4160 = term.getSubterm(0);
      l_4160 = term.getSubterm(1);
      term = termFactory.makeTuple(k_4160, l_4160);
      term = fetch_up_with_position_2_1.instance.invoke(context, term, o_4160, _Fail.instance, j_4160);
      if(term == null)
        break Fail21226;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21226;
      m_4160 = term.getSubterm(0);
      n_4160 = term.getSubterm(1);
      term = termFactory.makeTuple(m_4160, n_4160);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}