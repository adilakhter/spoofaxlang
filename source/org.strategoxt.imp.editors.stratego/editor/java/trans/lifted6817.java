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

@SuppressWarnings("all") final class lifted6817 extends Strategy 
{ 
  public static final lifted6817 instance = new lifted6817();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22337:
    { 
      IStrategoTerm i_4334 = null;
      IStrategoTerm q_4334 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22337;
      q_4334 = term.getSubterm(0);
      IStrategoTerm arg7984 = term.getSubterm(1);
      i_4334 = arg7984;
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, q_4334, arg7984, i_4334);
      if(term == null)
        break Fail22337;
      if(true)
        return term;
    }
    return null;
  }
}