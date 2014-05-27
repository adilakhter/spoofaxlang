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

@SuppressWarnings("all") final class lifted24772 extends Strategy 
{ 
  public static final lifted24772 instance = new lifted24772();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87860:
    { 
      IStrategoTerm z_17578 = null;
      IStrategoTerm j_17579 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87860;
      j_17579 = term.getSubterm(0);
      IStrategoTerm arg30018 = term.getSubterm(1);
      z_17578 = arg30018;
      term = aux_get_config_reference_0_2.instance.invoke(context, j_17579, arg30018, z_17578);
      if(term == null)
        break Fail87860;
      if(true)
        return term;
    }
    return null;
  }
}