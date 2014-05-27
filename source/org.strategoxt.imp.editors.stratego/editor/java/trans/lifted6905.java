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

@SuppressWarnings("all") final class lifted6905 extends Strategy 
{ 
  TermReference a_4803;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24006:
    { 
      IStrategoTerm b_4803 = null;
      IStrategoTerm c_4803 = null;
      IStrategoTerm p_4803 = null;
      IStrategoTerm r_4803 = null;
      IStrategoTerm s_4803 = null;
      term = $Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24006;
      b_4803 = term;
      c_4803 = term;
      r_4803 = term;
      p_4803 = trans.const4604;
      s_4803 = r_4803;
      term = termFactory.makeTuple(trans.const4605, b_4803);
      term = dr_set_rule_0_3.instance.invoke(context, s_4803, p_4803, a_4803.value, term);
      if(term == null)
        break Fail24006;
      term = c_4803;
      if(true)
        return term;
    }
    return null;
  }
}