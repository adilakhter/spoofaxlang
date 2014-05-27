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

@SuppressWarnings("all") final class lifted21645 extends Strategy 
{ 
  TermReference f_92105;

  TermReference g_92105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76334:
    { 
      term = aux_$Declaration_0_2.instance.invoke(context, term, f_92105.value, g_92105.value);
      if(term == null)
        break Fail76334;
      if(true)
        return term;
    }
    return null;
  }
}