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

@SuppressWarnings("all") public class declare_svar_signatures_0_2 extends Strategy 
{ 
  public static declare_svar_signatures_0_2 instance = new declare_svar_signatures_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4805, IStrategoTerm k_4805)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_svar_signatures_0_2");
    Fail23202:
    { 
      IStrategoTerm l_4805 = null;
      IStrategoTerm o_4805 = null;
      IStrategoTerm q_4805 = null;
      IStrategoTerm r_4805 = null;
      l_4805 = term;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23202;
      if(term.getSubterm(0) != k_4805 && !k_4805.match(term.getSubterm(0)))
        break Fail23202;
      q_4805 = term;
      o_4805 = trans.const4568;
      r_4805 = q_4805;
      term = termFactory.makeTuple(trans.const4569, j_4805);
      term = dr_set_rule_0_3.instance.invoke(context, r_4805, o_4805, l_4805, term);
      if(term == null)
        break Fail23202;
      term = l_4805;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}