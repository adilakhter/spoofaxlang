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

@SuppressWarnings("all") final class lifted24777 extends Strategy 
{ 
  TermReference a_17581;

  TermReference b_17581;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87855:
    { 
      term = aux_get_config_reference_0_2.instance.invoke(context, term, a_17581.value, b_17581.value);
      if(term == null)
        break Fail87855;
      if(true)
        return term;
    }
    return null;
  }
}