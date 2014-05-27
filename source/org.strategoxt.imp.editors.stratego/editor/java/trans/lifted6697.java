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

@SuppressWarnings("all") final class lifted6697 extends Strategy 
{ 
  public static final lifted6697 instance = new lifted6697();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22457:
    { 
      IStrategoTerm d_4277 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22457;
      d_4277 = term.getSubterm(0);
      IStrategoTerm arg7891 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, d_4277, arg7891);
      if(term == null)
        break Fail22457;
      if(true)
        return term;
    }
    return null;
  }
}