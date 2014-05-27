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

@SuppressWarnings("all") final class lifted24746 extends Strategy 
{ 
  TermReference e_17564;

  TermReference f_17564;

  Strategy p_17564;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail87890:
    { 
      IStrategoTerm k_17564 = null;
      IStrategoTerm l_17564 = null;
      IStrategoTerm x_17564 = null;
      IStrategoTerm y_17564 = null;
      IStrategoTerm a_17565 = null;
      IStrategoTerm b_17565 = null;
      IStrategoTerm c_17565 = null;
      k_17564 = term;
      if(e_17564.value == null)
        break Fail87890;
      term = e_17564.value;
      l_17564 = e_17564.value;
      a_17565 = term;
      x_17564 = trans.const17872;
      b_17565 = a_17565;
      y_17564 = trans.constCons8528;
      c_17565 = b_17565;
      term = termFactory.makeTuple(trans.const17873, l_17564);
      term = dr_set_rule_0_3.instance.invoke(context, c_17565, x_17564, y_17564, term);
      if(term == null)
        break Fail87890;
      term = k_17564;
      if(f_17564.value == null)
        break Fail87890;
      term = p_17564.invoke(context, f_17564.value);
      if(term == null)
        break Fail87890;
      if(true)
        return term;
    }
    return null;
  }
}