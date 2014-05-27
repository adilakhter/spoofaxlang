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

@SuppressWarnings("all") final class lifted6770 extends Strategy 
{ 
  Strategy x_4734;

  Strategy y_4734;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24162:
    { 
      IStrategoTerm term12186 = term;
      Success12808:
      { 
        Fail24163:
        { 
          IStrategoTerm w_4734 = null;
          w_4734 = term;
          term = x_4734.invoke(context, term);
          if(term == null)
            break Fail24163;
          term = w_4734;
          if(true)
            break Success12808;
        }
        term = get_source_files_2_0.instance.invoke(context, term12186, x_4734, y_4734);
        if(term == null)
          break Fail24162;
      }
      if(true)
        return term;
    }
    return null;
  }
}