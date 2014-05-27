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

@SuppressWarnings("all") final class lifted21647 extends Strategy 
{ 
  TermReference v_92105;

  TermReference w_92105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76332:
    { 
      term = aux_$Declaration_0_2.instance.invoke(context, term, v_92105.value, w_92105.value);
      if(term == null)
        break Fail76332;
      if(true)
        return term;
    }
    return null;
  }
}