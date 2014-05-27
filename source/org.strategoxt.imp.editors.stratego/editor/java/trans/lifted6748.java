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

@SuppressWarnings("all") final class lifted6748 extends Strategy 
{ 
  public static final lifted6748 instance = new lifted6748();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24192:
    { 
      IStrategoTerm term12167 = term;
      Success12826:
      { 
        Fail24193:
        { 
          term = global_constraint_error_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24193;
          if(true)
            break Success12826;
        }
        term = constraint_error_0_0.instance.invoke(context, term12167);
        if(term == null)
          break Fail24192;
      }
      if(true)
        return term;
    }
    return null;
  }
}