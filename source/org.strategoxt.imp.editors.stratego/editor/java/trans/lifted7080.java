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

@SuppressWarnings("all") final class lifted7080 extends Strategy 
{ 
  TermReference z_4883;

  TermReference a_4884;

  TermReference b_4884;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23821:
    { 
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, term, z_4883.value, a_4884.value);
      if(term == null)
        break Fail23821;
      if(b_4884.value == null)
        b_4884.value = term;
      else
        if(b_4884.value != term && !b_4884.value.match(term))
          break Fail23821;
      if(true)
        return term;
    }
    return null;
  }
}