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

@SuppressWarnings("all") final class lifted6875 extends Strategy 
{ 
  public static final lifted6875 instance = new lifted6875();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24027:
    { 
      IStrategoTerm u_4793 = null;
      IStrategoTerm w_4793 = null;
      w_4793 = term;
      term = signature_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24027;
      u_4793 = term;
      term = w_4793;
      Success12737:
      { 
        Fail24028:
        { 
          term = declare_cookie_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24028;
          if(true)
            break Success12737;
        }
        term = trans.const4595;
      }
      term = termFactory.makeTuple(u_4793, term);
      if(true)
        return term;
    }
    return null;
  }
}