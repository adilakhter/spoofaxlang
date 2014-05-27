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

@SuppressWarnings("all") final class lifted21616 extends Strategy 
{ 
  public static final lifted21616 instance = new lifted21616();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76363:
    { 
      IStrategoTerm p_92091 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76363;
      p_92091 = term.getSubterm(0);
      IStrategoTerm arg26209 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, p_92091, arg26209);
      if(term == null)
        break Fail76363;
      if(true)
        return term;
    }
    return null;
  }
}