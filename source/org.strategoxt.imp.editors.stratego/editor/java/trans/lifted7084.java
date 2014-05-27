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

@SuppressWarnings("all") final class lifted7084 extends Strategy 
{ 
  public static final lifted7084 instance = new lifted7084();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23817:
    { 
      IStrategoTerm j_4885 = null;
      IStrategoTerm o_4885 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23817;
      j_4885 = term.getSubterm(1);
      o_4885 = term;
      term = dr_undefine_rule_0_2.instance.invoke(context, o_4885, trans.const4568, j_4885);
      if(term == null)
        break Fail23817;
      if(true)
        return term;
    }
    return null;
  }
}