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

@SuppressWarnings("all") final class lifted6741 extends Strategy 
{ 
  Strategy f_4728;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24202:
    { 
      IStrategoTerm term12166 = term;
      Success12827:
      { 
        Fail24203:
        { 
          term = f_4728.invoke(context, term);
          if(term == null)
            break Fail24203;
          { 
            if(true)
              break Fail24202;
            if(true)
              break Success12827;
          }
        }
        term = term12166;
      }
      if(true)
        return term;
    }
    return null;
  }
}