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

@SuppressWarnings("all") final class lifted6882 extends Strategy 
{ 
  public static final lifted6882 instance = new lifted6882();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24023:
    { 
      IStrategoTerm term12492 = term;
      Success12735:
      { 
        Fail24024:
        { 
          term = propose_completion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24024;
          if(true)
            break Success12735;
        }
        term = origin_track_forced_1_0.instance.invoke(context, term12492, declare_bodies_0_0.instance);
        if(term == null)
          break Fail24023;
      }
      if(true)
        return term;
    }
    return null;
  }
}