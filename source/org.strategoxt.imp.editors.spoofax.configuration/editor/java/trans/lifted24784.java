package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24784 extends Strategy 
{ 
  TermReference s_17584;

  TermReference t_17584;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87848:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, s_17584.value);
      if(term == null)
        break Fail87848;
      if(t_17584.value == null)
        t_17584.value = term;
      else
        if(t_17584.value != term && !t_17584.value.match(term))
          break Fail87848;
      if(true)
        return term;
    }
    return null;
  }
}