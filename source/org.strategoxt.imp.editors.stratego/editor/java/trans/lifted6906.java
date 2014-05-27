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

@SuppressWarnings("all") final class lifted6906 extends Strategy 
{ 
  public static final lifted6906 instance = new lifted6906();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24003:
    { 
      IStrategoTerm term12527 = term;
      Success12732:
      { 
        Fail24004:
        { 
          term = propose_completion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24004;
          if(true)
            break Success12732;
        }
        term = origin_track_forced_1_0.instance.invoke(context, term12527, declare_bodies_0_0.instance);
        if(term == null)
          break Fail24003;
      }
      if(true)
        return term;
    }
    return null;
  }
}