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

@SuppressWarnings("all") final class lifted6792 extends Strategy 
{ 
  public static final lifted6792 instance = new lifted6792();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24139:
    { 
      IStrategoTerm term12214 = term;
      Success12797:
      { 
        Fail24140:
        { 
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24140;
          { 
            if(true)
              break Fail24139;
            if(true)
              break Success12797;
          }
        }
        term = term12214;
      }
      if(true)
        return term;
    }
    return null;
  }
}