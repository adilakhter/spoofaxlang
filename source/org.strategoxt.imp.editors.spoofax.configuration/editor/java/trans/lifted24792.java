package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24792 extends Strategy 
{ 
  TermReference r_17588;

  TermReference s_17588;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87840:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, r_17588.value, s_17588.value);
      if(term == null)
        break Fail87840;
      if(true)
        return term;
    }
    return null;
  }
}