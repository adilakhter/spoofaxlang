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

@SuppressWarnings("all") final class lifted24770 extends Strategy 
{ 
  public static final lifted24770 instance = new lifted24770();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87862:
    { 
      IStrategoTerm x_17577 = null;
      IStrategoTerm i_17578 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87862;
      i_17578 = term.getSubterm(0);
      IStrategoTerm arg30016 = term.getSubterm(1);
      x_17577 = arg30016;
      term = aux_get_config_reference_0_2.instance.invoke(context, i_17578, arg30016, x_17577);
      if(term == null)
        break Fail87862;
      if(true)
        return term;
    }
    return null;
  }
}