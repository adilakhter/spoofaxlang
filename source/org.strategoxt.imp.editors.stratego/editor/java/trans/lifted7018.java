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

@SuppressWarnings("all") final class lifted7018 extends Strategy 
{ 
  TermReference z_4853;

  TermReference a_4854;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23883:
    { 
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, term, z_4853.value, a_4854.value);
      if(term == null)
        break Fail23883;
      if(true)
        return term;
    }
    return null;
  }
}