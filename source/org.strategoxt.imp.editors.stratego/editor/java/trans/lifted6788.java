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

@SuppressWarnings("all") final class lifted6788 extends Strategy 
{ 
  TermReference m_4320;

  TermReference n_4320;

  TermReference o_4320;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22366:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, m_4320.value, n_4320.value);
      if(term == null)
        break Fail22366;
      if(o_4320.value == null)
        o_4320.value = term;
      else
        if(o_4320.value != term && !o_4320.value.match(term))
          break Fail22366;
      if(true)
        return term;
    }
    return null;
  }
}