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

@SuppressWarnings("all") final class lifted7058 extends Strategy 
{ 
  TermReference q_4874;

  TermReference r_4874;

  TermReference s_4874;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23843:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, q_4874.value, r_4874.value);
      if(term == null)
        break Fail23843;
      if(s_4874.value == null)
        s_4874.value = term;
      else
        if(s_4874.value != term && !s_4874.value.match(term))
          break Fail23843;
      if(true)
        return term;
    }
    return null;
  }
}