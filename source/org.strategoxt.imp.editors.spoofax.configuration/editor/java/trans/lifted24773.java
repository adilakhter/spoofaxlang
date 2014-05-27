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

@SuppressWarnings("all") final class lifted24773 extends Strategy 
{ 
  public static final lifted24773 instance = new lifted24773();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87859:
    { 
      IStrategoTerm m_17579 = null;
      IStrategoTerm w_17579 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87859;
      w_17579 = term.getSubterm(0);
      IStrategoTerm arg30019 = term.getSubterm(1);
      m_17579 = arg30019;
      term = aux_get_config_reference_0_2.instance.invoke(context, w_17579, arg30019, m_17579);
      if(term == null)
        break Fail87859;
      if(true)
        return term;
    }
    return null;
  }
}