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

@SuppressWarnings("all") final class lifted6954 extends Strategy 
{ 
  public static final lifted6954 instance = new lifted6954();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23940:
    { 
      IStrategoTerm term12681 = term;
      Success12702:
      { 
        Fail23941:
        { 
          term = global_constraint_error_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23941;
          if(true)
            break Success12702;
        }
        term = constraint_error_0_0.instance.invoke(context, term12681);
        if(term == null)
          break Fail23940;
      }
      if(true)
        return term;
    }
    return null;
  }
}