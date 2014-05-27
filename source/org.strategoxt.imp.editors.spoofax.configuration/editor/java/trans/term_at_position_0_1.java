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

@SuppressWarnings("all") public class term_at_position_0_1 extends Strategy 
{ 
  public static term_at_position_0_1 instance = new term_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4628)
  { 
    context.push("term_at_position_0_1");
    Fail22892:
    { 
      TermReference o_4628 = new TermReference();
      IStrategoTerm p_4628 = null;
      p_4628 = term;
      lifted6876 lifted68760 = new lifted6876();
      lifted68760.o_4628 = o_4628;
      term = at_position_1_1.instance.invoke(context, term, lifted68760, m_4628);
      if(term == null)
        break Fail22892;
      term = p_4628;
      if(o_4628.value == null)
        break Fail22892;
      term = o_4628.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}