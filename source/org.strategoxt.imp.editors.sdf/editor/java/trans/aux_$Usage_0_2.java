package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Usage_0_2 extends Strategy 
{ 
  public static aux_$Usage_0_2 instance = new aux_$Usage_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_92110, IStrategoTerm w_92110)
  { 
    Fail76320:
    { 
      IStrategoTerm x_92110 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76320;
      IStrategoTerm arg26231 = term.getSubterm(0);
      if(arg26231.getTermType() != IStrategoTerm.STRING || !"184525".equals(((IStrategoString)arg26231).stringValue()))
        break Fail76320;
      x_92110 = term.getSubterm(1);
      term = x_92110;
      if(true)
        return term;
    }
    context.push("aux_Usage_0_2");
    context.popOnFailure();
    return null;
  }
}