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

@SuppressWarnings("all") final class lifted6860 extends Strategy 
{ 
  public static final lifted6860 instance = new lifted6860();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24058:
    { 
      IStrategoTerm term12423 = term;
      Success12755:
      { 
        Fail24059:
        { 
          IStrategoTerm p_4777 = null;
          p_4777 = term;
          term = has_extension_0_1.instance.invoke(context, p_4777, trans.const4467);
          if(term == null)
            break Fail24059;
          if(true)
            break Success12755;
        }
        term = term12423;
        IStrategoTerm r_4777 = null;
        r_4777 = term;
        term = has_extension_0_1.instance.invoke(context, r_4777, trans.const4578);
        if(term == null)
          break Fail24058;
      }
      if(true)
        return term;
    }
    return null;
  }
}