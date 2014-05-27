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

@SuppressWarnings("all") final class lifted24795 extends Strategy 
{ 
  TermReference o_17589;

  TermReference p_17589;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87837:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, o_17589.value, p_17589.value);
      if(term == null)
        break Fail87837;
      if(true)
        return term;
    }
    return null;
  }
}