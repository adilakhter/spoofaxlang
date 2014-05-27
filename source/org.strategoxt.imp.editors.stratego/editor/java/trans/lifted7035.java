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

@SuppressWarnings("all") final class lifted7035 extends Strategy 
{ 
  TermReference t_4862;

  TermReference u_4862;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23866:
    { 
      term = aux_$Current$Dir_0_1.instance.invoke(context, term, t_4862.value);
      if(term == null)
        break Fail23866;
      if(u_4862.value == null)
        u_4862.value = term;
      else
        if(u_4862.value != term && !u_4862.value.match(term))
          break Fail23866;
      if(true)
        return term;
    }
    return null;
  }
}