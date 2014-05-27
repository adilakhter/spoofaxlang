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

@SuppressWarnings("all") final class lifted6903 extends Strategy 
{ 
  TermReference w_4802;

  TermReference x_4802;

  TermReference y_4802;

  TermReference z_4802;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24001:
    { 
      if(y_4802.value == null)
        break Fail24001;
      term = list_loop_1_0.instance.invoke(context, y_4802.value, lifted6904.instance);
      if(term == null)
        break Fail24001;
      if(w_4802.value == null)
        break Fail24001;
      term = alltd_1_0.instance.invoke(context, w_4802.value, lifted6906.instance);
      if(term == null)
        break Fail24001;
      if(x_4802.value == null)
        x_4802.value = term;
      else
        if(x_4802.value != term && !x_4802.value.match(term))
          break Fail24001;
      if(y_4802.value == null)
        break Fail24001;
      term = map_1_0.instance.invoke(context, y_4802.value, lifted6908.instance);
      if(term == null)
        break Fail24001;
      if(z_4802.value == null)
        z_4802.value = term;
      else
        if(z_4802.value != term && !z_4802.value.match(term))
          break Fail24001;
      term = all_keys_$Outer$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24001;
      term = map_1_0.instance.invoke(context, term, lifted6910.instance);
      if(term == null)
        break Fail24001;
      if(true)
        return term;
    }
    return null;
  }
}