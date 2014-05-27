package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21569 extends Strategy 
{ 
  public static final lifted21569 instance = new lifted21569();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76407:
    { 
      IStrategoTerm term41832 = term;
      Success41863:
      { 
        Fail76408:
        { 
          term = bracket_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76408;
          if(true)
            break Success41863;
        }
        term = reject_0_0.instance.invoke(context, term41832);
        if(term == null)
          break Fail76407;
      }
      if(true)
        return term;
    }
    return null;
  }
}