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

@SuppressWarnings("all") final class lifted21509 extends Strategy 
{ 
  Strategy h_92023;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76509:
    { 
      lifted21510 lifted215100 = new lifted21510();
      lifted215100.h_92023 = h_92023;
      term = repeat_1_0.instance.invoke(context, term, lifted215100);
      if(term == null)
        break Fail76509;
      if(true)
        return term;
    }
    return null;
  }
}