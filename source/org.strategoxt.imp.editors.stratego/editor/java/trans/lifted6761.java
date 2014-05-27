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

@SuppressWarnings("all") final class lifted6761 extends Strategy 
{ 
  public static final lifted6761 instance = new lifted6761();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22393:
    { 
      IStrategoTerm h_4308 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22393;
      h_4308 = term.getSubterm(0);
      IStrategoTerm arg7925 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, h_4308, arg7925);
      if(term == null)
        break Fail22393;
      if(true)
        return term;
    }
    return null;
  }
}