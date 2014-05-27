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

@SuppressWarnings("all") final class lifted6999 extends Strategy 
{ 
  TermReference r_4844;

  TermReference s_4844;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23902:
    { 
      term = aux_$Source$Dir_0_1.instance.invoke(context, term, r_4844.value);
      if(term == null)
        break Fail23902;
      if(s_4844.value == null)
        s_4844.value = term;
      else
        if(s_4844.value != term && !s_4844.value.match(term))
          break Fail23902;
      if(true)
        return term;
    }
    return null;
  }
}