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

@SuppressWarnings("all") final class lifted6866 extends Strategy 
{ 
  public static final lifted6866 instance = new lifted6866();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24035:
    { 
      term = try_1_0.instance.invoke(context, term, lifted6867.instance);
      if(term == null)
        break Fail24035;
      if(true)
        return term;
    }
    return null;
  }
}