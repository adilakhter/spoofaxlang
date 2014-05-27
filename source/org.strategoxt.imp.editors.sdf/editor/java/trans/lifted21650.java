package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21650 extends Strategy 
{ 
  public static final lifted21650 instance = new lifted21650();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76329:
    { 
      IStrategoTerm u_92107 = null;
      IStrategoTerm d_92108 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76329;
      d_92108 = term.getSubterm(0);
      IStrategoTerm arg26227 = term.getSubterm(1);
      u_92107 = arg26227;
      term = aux_$Usage_0_2.instance.invoke(context, d_92108, arg26227, u_92107);
      if(term == null)
        break Fail76329;
      if(true)
        return term;
    }
    return null;
  }
}