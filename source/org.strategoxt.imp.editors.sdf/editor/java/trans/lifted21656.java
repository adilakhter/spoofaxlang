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

@SuppressWarnings("all") final class lifted21656 extends Strategy 
{ 
  TermReference c_92110;

  TermReference d_92110;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76323:
    { 
      term = aux_$Usage_0_2.instance.invoke(context, term, c_92110.value, d_92110.value);
      if(term == null)
        break Fail76323;
      if(true)
        return term;
    }
    return null;
  }
}