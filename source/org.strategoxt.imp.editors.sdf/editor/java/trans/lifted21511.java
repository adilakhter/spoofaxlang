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

@SuppressWarnings("all") final class lifted21511 extends Strategy 
{ 
  Strategy h_92023;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76511:
    { 
      IStrategoTerm f_92023 = null;
      f_92023 = term;
      term = h_92023.invoke(context, term);
      if(term == null)
        break Fail76511;
      IStrategoTerm term41462 = term;
      Success41929:
      { 
        Fail76512:
        { 
          if(term != f_92023 && !f_92023.match(term))
            break Fail76512;
          { 
            if(true)
              break Fail76511;
            if(true)
              break Success41929;
          }
        }
        term = term41462;
      }
      if(true)
        return term;
    }
    return null;
  }
}