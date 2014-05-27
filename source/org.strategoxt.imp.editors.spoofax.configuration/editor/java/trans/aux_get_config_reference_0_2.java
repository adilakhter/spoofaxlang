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

@SuppressWarnings("all") public class aux_get_config_reference_0_2 extends Strategy 
{ 
  public static aux_get_config_reference_0_2 instance = new aux_get_config_reference_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_17581, IStrategoTerm r_17581)
  { 
    Fail87783:
    { 
      IStrategoTerm s_17581 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87783;
      IStrategoTerm arg30020 = term.getSubterm(0);
      if(arg30020.getTermType() != IStrategoTerm.STRING || !"-763437".equals(((IStrategoString)arg30020).stringValue()))
        break Fail87783;
      s_17581 = term.getSubterm(1);
      term = s_17581;
      if(true)
        return term;
    }
    context.push("aux_get_config_reference_0_2");
    context.popOnFailure();
    return null;
  }
}