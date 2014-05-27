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

@SuppressWarnings("all") final class lifted6759 extends Strategy 
{ 
  public static final lifted6759 instance = new lifted6759();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24181:
    { 
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24181;
      term = try_1_0.instance.invoke(context, term, resugar_$Let_0_0.instance);
      if(term == null)
        break Fail24181;
      if(true)
        return term;
    }
    return null;
  }
}