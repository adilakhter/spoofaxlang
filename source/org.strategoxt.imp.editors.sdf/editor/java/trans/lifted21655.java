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

@SuppressWarnings("all") final class lifted21655 extends Strategy 
{ 
  TermReference t_92109;

  TermReference u_92109;

  TermReference v_92109;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76324:
    { 
      term = aux_$Usage_0_2.instance.invoke(context, term, t_92109.value, u_92109.value);
      if(term == null)
        break Fail76324;
      if(v_92109.value == null)
        v_92109.value = term;
      else
        if(v_92109.value != term && !v_92109.value.match(term))
          break Fail76324;
      if(true)
        return term;
    }
    return null;
  }
}