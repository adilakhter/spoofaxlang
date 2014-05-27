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

@SuppressWarnings("all") final class lifted7089 extends Strategy 
{ 
  TermReference j_4888;

  TermReference k_4888;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23812:
    { 
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, term, j_4888.value, k_4888.value);
      if(term == null)
        break Fail23812;
      if(true)
        return term;
    }
    return null;
  }
}