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

@SuppressWarnings("all") final class lifted6901 extends Strategy 
{ 
  public static final lifted6901 instance = new lifted6901();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24009:
    { 
      IStrategoTerm term12525 = term;
      Success12733:
      { 
        Fail24010:
        { 
          term = propose_completion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24010;
          if(true)
            break Success12733;
        }
        term = origin_track_forced_1_0.instance.invoke(context, term12525, declare_bodies_0_0.instance);
        if(term == null)
          break Fail24009;
      }
      if(true)
        return term;
    }
    return null;
  }
}