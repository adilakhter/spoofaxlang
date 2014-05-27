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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_17572)
  { 
    context.push("term_at_position_0_1");
    Fail87700:
    { 
      TermReference l_17572 = new TermReference();
      IStrategoTerm m_17572 = null;
      m_17572 = term;
      lifted24761 lifted247610 = new lifted24761();
      lifted247610.l_17572 = l_17572;
      term = at_position_1_1.instance.invoke(context, term, lifted247610, j_17572);
      if(term == null)
        break Fail87700;
      term = m_17572;
      if(l_17572.value == null)
        break Fail87700;
      term = l_17572.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}