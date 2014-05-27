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

@SuppressWarnings("all") final class lifted6753 extends Strategy 
{ 
  public static final lifted6753 instance = new lifted6753();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22401:
    { 
      IStrategoTerm w_4303 = null;
      IStrategoTerm g_4304 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22401;
      g_4304 = term.getSubterm(0);
      IStrategoTerm arg7922 = term.getSubterm(1);
      w_4303 = arg7922;
      term = aux_$No$Analysis_0_2.instance.invoke(context, g_4304, arg7922, w_4303);
      if(term == null)
        break Fail22401;
      if(true)
        return term;
    }
    return null;
  }
}