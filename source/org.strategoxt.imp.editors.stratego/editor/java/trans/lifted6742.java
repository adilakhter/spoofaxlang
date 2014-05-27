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

@SuppressWarnings("all") final class lifted6742 extends Strategy 
{ 
  TermReference i_4728;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24199:
    { 
      term = is_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24199;
      term = has_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24199;
      if(i_4728.value == null)
        i_4728.value = term;
      else
        if(i_4728.value != term && !i_4728.value.match(term))
          break Fail24199;
      if(true)
        return term;
    }
    return null;
  }
}