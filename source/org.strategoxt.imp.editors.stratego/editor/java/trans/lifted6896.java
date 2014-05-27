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

@SuppressWarnings("all") final class lifted6896 extends Strategy 
{ 
  public static final lifted6896 instance = new lifted6896();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24012:
    { 
      IStrategoTerm term12522 = term;
      Success12734:
      { 
        Fail24013:
        { 
          term = declare_bodies_svar_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24013;
          if(true)
            break Success12734;
        }
        term = declare_bodies_top_0_0.instance.invoke(context, term12522);
        if(term == null)
          break Fail24012;
      }
      if(true)
        return term;
    }
    return null;
  }
}