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

@SuppressWarnings("all") final class lifted21585 extends Strategy 
{ 
  Strategy d_92076;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76397:
    { 
      term = quoted_1_0.instance.invoke(context, term, d_92076);
      if(term == null)
        break Fail76397;
      if(true)
        return term;
    }
    return null;
  }
}