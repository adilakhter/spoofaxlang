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

@SuppressWarnings("all") final class lifted21514 extends Strategy 
{ 
  TermReference s_92023;

  Strategy z_92110;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76506:
    { 
      term = at_position_1_1.instance.invoke(context, term, z_92110, s_92023.value);
      if(term == null)
        break Fail76506;
      if(true)
        return term;
    }
    return null;
  }
}