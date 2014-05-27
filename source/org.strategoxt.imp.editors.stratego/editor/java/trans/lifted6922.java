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

@SuppressWarnings("all") final class lifted6922 extends Strategy 
{ 
  public static final lifted6922 instance = new lifted6922();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23984:
    { 
      IStrategoTerm term12546 = term;
      Success12726:
      { 
        Fail23985:
        { 
          term = is_congruence_signature_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23985;
          { 
            if(true)
              break Fail23984;
            if(true)
              break Success12726;
          }
        }
        term = term12546;
      }
      if(true)
        return term;
    }
    return null;
  }
}