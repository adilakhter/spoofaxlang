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

@SuppressWarnings("all") final class lifted6952 extends Strategy 
{ 
  public static final lifted6952 instance = new lifted6952();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23942:
    { 
      IStrategoTerm term12680 = term;
      Success12703:
      { 
        Fail23943:
        { 
          term = global_constraint_error_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23943;
          if(true)
            break Success12703;
        }
        term = constraint_warning_0_0.instance.invoke(context, term12680);
        if(term == null)
          break Fail23942;
      }
      if(true)
        return term;
    }
    return null;
  }
}