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

@SuppressWarnings("all") final class lifted6813 extends Strategy 
{ 
  public static final lifted6813 instance = new lifted6813();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22341:
    { 
      IStrategoTerm r_4331 = null;
      IStrategoTerm w_4331 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22341;
      r_4331 = term.getSubterm(1);
      w_4331 = term;
      term = dr_undefine_rule_0_2.instance.invoke(context, w_4331, trans.const4358, r_4331);
      if(term == null)
        break Fail22341;
      if(true)
        return term;
    }
    return null;
  }
}