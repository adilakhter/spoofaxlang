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

@SuppressWarnings("all") final class lifted21610 extends Strategy 
{ 
  TermReference c_92088;

  TermReference d_92088;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76369:
    { 
      term = aux_$Project$Dir_0_1.instance.invoke(context, term, c_92088.value);
      if(term == null)
        break Fail76369;
      if(d_92088.value == null)
        d_92088.value = term;
      else
        if(d_92088.value != term && !d_92088.value.match(term))
          break Fail76369;
      if(true)
        return term;
    }
    return null;
  }
}