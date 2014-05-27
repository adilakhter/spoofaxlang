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

@SuppressWarnings("all") final class lifted24760 extends Strategy 
{ 
  TermReference j_17571;

  Strategy e_17590;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87865:
    { 
      term = at_position_1_1.instance.invoke(context, term, e_17590, j_17571.value);
      if(term == null)
        break Fail87865;
      if(true)
        return term;
    }
    return null;
  }
}