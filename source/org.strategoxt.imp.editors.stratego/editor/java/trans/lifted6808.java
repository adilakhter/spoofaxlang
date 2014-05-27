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

@SuppressWarnings("all") final class lifted6808 extends Strategy 
{ 
  TermReference u_4751;

  TermReference v_4751;

  Strategy f_4752;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24109:
    { 
      IStrategoTerm a_4752 = null;
      IStrategoTerm b_4752 = null;
      IStrategoTerm n_4752 = null;
      IStrategoTerm o_4752 = null;
      IStrategoTerm q_4752 = null;
      IStrategoTerm r_4752 = null;
      IStrategoTerm s_4752 = null;
      a_4752 = term;
      if(u_4751.value == null)
        break Fail24109;
      term = u_4751.value;
      b_4752 = u_4751.value;
      q_4752 = term;
      n_4752 = trans.const4473;
      r_4752 = q_4752;
      o_4752 = trans.constCons2047;
      s_4752 = r_4752;
      term = termFactory.makeTuple(trans.const4474, b_4752);
      term = dr_set_rule_0_3.instance.invoke(context, s_4752, n_4752, o_4752, term);
      if(term == null)
        break Fail24109;
      term = a_4752;
      if(v_4751.value == null)
        break Fail24109;
      term = f_4752.invoke(context, v_4751.value);
      if(term == null)
        break Fail24109;
      if(true)
        return term;
    }
    return null;
  }
}