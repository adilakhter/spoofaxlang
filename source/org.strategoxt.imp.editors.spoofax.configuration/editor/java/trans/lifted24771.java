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

@SuppressWarnings("all") final class lifted24771 extends Strategy 
{ 
  public static final lifted24771 instance = new lifted24771();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87861:
    { 
      IStrategoTerm l_17578 = null;
      IStrategoTerm w_17578 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87861;
      w_17578 = term.getSubterm(0);
      IStrategoTerm arg30017 = term.getSubterm(1);
      l_17578 = arg30017;
      term = aux_get_config_reference_0_2.instance.invoke(context, w_17578, arg30017, l_17578);
      if(term == null)
        break Fail87861;
      if(true)
        return term;
    }
    return null;
  }
}