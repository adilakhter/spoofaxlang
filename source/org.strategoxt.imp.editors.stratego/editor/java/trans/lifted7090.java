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

@SuppressWarnings("all") final class lifted7090 extends Strategy 
{ 
  TermReference q_4888;

  TermReference r_4888;

  TermReference s_4888;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23811:
    { 
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, term, q_4888.value, r_4888.value);
      if(term == null)
        break Fail23811;
      if(s_4888.value == null)
        s_4888.value = term;
      else
        if(s_4888.value != term && !s_4888.value.match(term))
          break Fail23811;
      if(true)
        return term;
    }
    return null;
  }
}