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

@SuppressWarnings("all") public class once_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static once_$Outer$Cookie_0_0 instance = new once_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_OuterCookie_0_0");
    Fail22255:
    { 
      IStrategoTerm x_4334 = null;
      TermReference y_4334 = new TermReference();
      TermReference z_4334 = new TermReference();
      TermReference a_4335 = new TermReference();
      IStrategoTerm b_4335 = null;
      IStrategoTerm c_4335 = null;
      IStrategoTerm e_4335 = null;
      IStrategoTerm g_4335 = null;
      if(z_4334.value == null)
        z_4334.value = term;
      else
        if(z_4334.value != term && !z_4334.value.match(term))
          break Fail22255;
      if(y_4334.value == null)
        y_4334.value = term;
      else
        if(y_4334.value != term && !y_4334.value.match(term))
          break Fail22255;
      e_4335 = term;
      g_4335 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, g_4335, trans.const4394, z_4334.value);
      if(term == null)
        break Fail22255;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22255;
      x_4334 = term.getSubterm(0);
      c_4335 = term.getSubterm(1);
      b_4335 = term.getSubterm(2);
      term = x_4334;
      lifted6819 lifted68190 = new lifted6819();
      lifted68190.y_4334 = y_4334;
      lifted68190.z_4334 = z_4334;
      lifted68190.a_4335 = a_4335;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68190);
      if(term == null)
        break Fail22255;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22255;
      term = hashtable_put_0_2.instance.invoke(context, b_4335, c_4335, term);
      if(term == null)
        break Fail22255;
      term = e_4335;
      if(a_4335.value == null)
        break Fail22255;
      term = a_4335.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}