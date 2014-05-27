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

@SuppressWarnings("all") final class lifted7079 extends Strategy 
{ 
  TermReference s_4883;

  TermReference t_4883;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23822:
    { 
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, term, s_4883.value, t_4883.value);
      if(term == null)
        break Fail23822;
      if(true)
        return term;
    }
    return null;
  }
}