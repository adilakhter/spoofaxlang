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

@SuppressWarnings("all") final class lifted21622 extends Strategy 
{ 
  TermReference i_92093;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76357:
    { 
      term = aux_$Current$Dir_0_1.instance.invoke(context, term, i_92093.value);
      if(term == null)
        break Fail76357;
      if(true)
        return term;
    }
    return null;
  }
}