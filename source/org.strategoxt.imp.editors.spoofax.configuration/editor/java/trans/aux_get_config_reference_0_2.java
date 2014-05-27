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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4637, IStrategoTerm u_4637)
  { 
    Fail22975:
    { 
      IStrategoTerm v_4637 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22975;
      IStrategoTerm arg8045 = term.getSubterm(0);
      if(arg8045.getTermType() != IStrategoTerm.STRING || !"-763437".equals(((IStrategoString)arg8045).stringValue()))
        break Fail22975;
      v_4637 = term.getSubterm(1);
      term = v_4637;
      if(true)
        return term;
    }
    context.push("aux_get_config_reference_0_2");
    context.popOnFailure();
    return null;
  }
}