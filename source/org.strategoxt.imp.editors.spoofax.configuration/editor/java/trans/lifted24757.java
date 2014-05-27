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

@SuppressWarnings("all") final class lifted24757 extends Strategy 
{ 
  Strategy y_17570;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87870:
    { 
      IStrategoTerm w_17570 = null;
      w_17570 = term;
      term = y_17570.invoke(context, term);
      if(term == null)
        break Fail87870;
      IStrategoTerm term47304 = term;
      Success47318:
      { 
        Fail87871:
        { 
          if(term != w_17570 && !w_17570.match(term))
            break Fail87871;
          { 
            if(true)
              break Fail87870;
            if(true)
              break Success47318;
          }
        }
        term = term47304;
      }
      if(true)
        return term;
    }
    return null;
  }
}