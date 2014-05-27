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

@SuppressWarnings("all") final class lifted6700 extends Strategy 
{ 
  public static final lifted6700 instance = new lifted6700();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24233:
    { 
      IStrategoTerm term12130 = term;
      Success12831:
      { 
        Fail24234:
        { 
          term = is_debug_clause_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24234;
          { 
            if(true)
              break Fail24233;
            if(true)
              break Success12831;
          }
        }
        term = term12130;
      }
      if(true)
        return term;
    }
    return null;
  }
}