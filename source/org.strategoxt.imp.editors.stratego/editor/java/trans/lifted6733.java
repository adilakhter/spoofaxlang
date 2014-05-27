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

@SuppressWarnings("all") final class lifted6733 extends Strategy 
{ 
  public static final lifted6733 instance = new lifted6733();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24209:
    { 
      IStrategoTerm r_4726 = null;
      IStrategoTerm t_4726 = null;
      t_4726 = term;
      term = collect_vars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24209;
      IStrategoTerm term12162 = term;
      Success12829:
      { 
        Fail24210:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail24210;
          { 
            if(true)
              break Fail24209;
            if(true)
              break Success12829;
          }
        }
        term = term12162;
      }
      r_4726 = term;
      term = t_4726;
      term = termFactory.makeAppl(Main._consScope_2, new IStrategoTerm[]{r_4726, term});
      if(true)
        return term;
    }
    return null;
  }
}