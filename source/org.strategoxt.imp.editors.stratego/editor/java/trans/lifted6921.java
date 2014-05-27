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

@SuppressWarnings("all") final class lifted6921 extends Strategy 
{ 
  public static final lifted6921 instance = new lifted6921();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23986:
    { 
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23986;
      IStrategoTerm term12544 = term;
      Success12727:
      { 
        Fail23987:
        { 
          term = is_congruence_signature_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23987;
          { 
            if(true)
              break Fail23986;
            if(true)
              break Success12727;
          }
        }
        term = term12544;
      }
      if(true)
        return term;
    }
    return null;
  }
}