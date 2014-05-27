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

@SuppressWarnings("all") final class lifted6912 extends Strategy 
{ 
  public static final lifted6912 instance = new lifted6912();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23999:
    { 
      IStrategoTerm term12528 = term;
      Success12731:
      { 
        Fail24000:
        { 
          term = propose_completion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24000;
          if(true)
            break Success12731;
        }
        term = origin_track_forced_1_0.instance.invoke(context, term12528, declare_bodies_0_0.instance);
        if(term == null)
          break Fail23999;
      }
      if(true)
        return term;
    }
    return null;
  }
}