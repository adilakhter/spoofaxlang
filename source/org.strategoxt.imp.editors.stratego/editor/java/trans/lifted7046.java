package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted7046 extends Strategy 
{ 
  TermReference p_4867;

  TermReference q_4867;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23855:
    { 
      term = aux_$Declaration_0_2.instance.invoke(context, term, p_4867.value, q_4867.value);
      if(term == null)
        break Fail23855;
      if(true)
        return term;
    }
    return null;
  }
}