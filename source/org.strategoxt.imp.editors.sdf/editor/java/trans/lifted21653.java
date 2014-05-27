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

@SuppressWarnings("all") final class lifted21653 extends Strategy 
{ 
  public static final lifted21653 instance = new lifted21653();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76326:
    { 
      IStrategoTerm d_92109 = null;
      IStrategoTerm l_92109 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76326;
      l_92109 = term.getSubterm(0);
      IStrategoTerm arg26230 = term.getSubterm(1);
      d_92109 = arg26230;
      term = aux_$Usage_0_2.instance.invoke(context, l_92109, arg26230, d_92109);
      if(term == null)
        break Fail76326;
      if(true)
        return term;
    }
    return null;
  }
}