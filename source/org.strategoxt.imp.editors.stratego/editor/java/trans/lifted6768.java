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

@SuppressWarnings("all") final class lifted6768 extends Strategy 
{ 
  public static final lifted6768 instance = new lifted6768();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22386:
    { 
      IStrategoTerm i_4311 = null;
      IStrategoTerm r_4311 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22386;
      r_4311 = term.getSubterm(0);
      IStrategoTerm arg7928 = term.getSubterm(1);
      i_4311 = arg7928;
      term = aux_$Declaration_0_2.instance.invoke(context, r_4311, arg7928, i_4311);
      if(term == null)
        break Fail22386;
      if(true)
        return term;
    }
    return null;
  }
}