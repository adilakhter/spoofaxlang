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

@SuppressWarnings("all") final class lifted6943 extends Strategy 
{ 
  public static final lifted6943 instance = new lifted6943();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23945:
    { 
      IStrategoTerm term12661 = term;
      Success12704:
      { 
        Fail23946:
        { 
          term = is_constructor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23946;
          { 
            if(true)
              break Fail23945;
            if(true)
              break Success12704;
          }
        }
        term = term12661;
      }
      if(true)
        return term;
    }
    return null;
  }
}