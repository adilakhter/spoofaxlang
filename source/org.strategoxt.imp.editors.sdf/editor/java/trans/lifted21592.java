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

@SuppressWarnings("all") final class lifted21592 extends Strategy 
{ 
  TermReference s_92079;

  TermReference t_92079;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76387:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, s_92079.value);
      if(term == null)
        break Fail76387;
      if(t_92079.value == null)
        t_92079.value = term;
      else
        if(t_92079.value != term && !t_92079.value.match(term))
          break Fail76387;
      if(true)
        return term;
    }
    return null;
  }
}