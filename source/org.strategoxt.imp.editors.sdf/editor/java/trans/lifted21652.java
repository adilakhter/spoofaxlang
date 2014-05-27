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

@SuppressWarnings("all") final class lifted21652 extends Strategy 
{ 
  public static final lifted21652 instance = new lifted21652();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76327:
    { 
      IStrategoTerm s_92108 = null;
      IStrategoTerm a_92109 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76327;
      a_92109 = term.getSubterm(0);
      IStrategoTerm arg26229 = term.getSubterm(1);
      s_92108 = arg26229;
      term = aux_$Usage_0_2.instance.invoke(context, a_92109, arg26229, s_92108);
      if(term == null)
        break Fail76327;
      if(true)
        return term;
    }
    return null;
  }
}