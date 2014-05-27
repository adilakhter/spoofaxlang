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

@SuppressWarnings("all") final class lifted6775 extends Strategy 
{ 
  public static final lifted6775 instance = new lifted6775();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24148:
    { 
      IStrategoTerm term12196 = term;
      Success12799:
      { 
        Fail24149:
        { 
          IStrategoTerm h_4737 = null;
          h_4737 = term;
          term = equal_0_1.instance.invoke(context, h_4737, trans.constNone0);
          if(term == null)
            break Fail24149;
          { 
            if(true)
              break Fail24148;
            if(true)
              break Success12799;
          }
        }
        term = term12196;
      }
      if(true)
        return term;
    }
    return null;
  }
}