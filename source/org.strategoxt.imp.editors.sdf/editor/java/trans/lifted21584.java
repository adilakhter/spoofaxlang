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

@SuppressWarnings("all") final class lifted21584 extends Strategy 
{ 
  Strategy d_92076;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76396:
    { 
      lifted21585 lifted215850 = new lifted21585();
      lifted215850.d_92076 = d_92076;
      term = fun_1_0.instance.invoke(context, term, lifted215850);
      if(term == null)
        break Fail76396;
      if(true)
        return term;
    }
    return null;
  }
}