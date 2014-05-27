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

@SuppressWarnings("all") final class lifted6849 extends Strategy 
{ 
  TermReference b_4777;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24061:
    { 
      IStrategoTerm c_4777 = null;
      IStrategoTerm e_4777 = null;
      IStrategoTerm f_4777 = null;
      e_4777 = term;
      c_4777 = trans.constCritical0;
      f_4777 = e_4777;
      term = log_0_3.instance.invoke(context, f_4777, c_4777, trans.const4574, b_4777.value);
      if(term == null)
        break Fail24061;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24061;
      if(true)
        return term;
    }
    return null;
  }
}