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

@SuppressWarnings("all") public class once_$Is$Imported_0_0 extends Strategy 
{ 
  public static once_$Is$Imported_0_0 instance = new once_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImported_0_0");
    Fail87829:
    { 
      IStrategoTerm x_17588 = null;
      TermReference y_17588 = new TermReference();
      TermReference z_17588 = new TermReference();
      TermReference a_17589 = new TermReference();
      IStrategoTerm b_17589 = null;
      IStrategoTerm c_17589 = null;
      IStrategoTerm e_17589 = null;
      IStrategoTerm g_17589 = null;
      if(z_17588.value == null)
        z_17588.value = term;
      else
        if(z_17588.value != term && !z_17588.value.match(term))
          break Fail87829;
      if(y_17588.value == null)
        y_17588.value = term;
      else
        if(y_17588.value != term && !y_17588.value.match(term))
          break Fail87829;
      e_17589 = term;
      g_17589 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, g_17589, trans.const17874, z_17588.value);
      if(term == null)
        break Fail87829;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail87829;
      x_17588 = term.getSubterm(0);
      c_17589 = term.getSubterm(1);
      b_17589 = term.getSubterm(2);
      term = x_17588;
      lifted24793 lifted247930 = new lifted24793();
      lifted247930.y_17588 = y_17588;
      lifted247930.z_17588 = z_17588;
      lifted247930.a_17589 = a_17589;
      term = split_fetch_1_0.instance.invoke(context, term, lifted247930);
      if(term == null)
        break Fail87829;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87829;
      term = hashtable_put_0_2.instance.invoke(context, b_17589, c_17589, term);
      if(term == null)
        break Fail87829;
      term = e_17589;
      if(a_17589.value == null)
        break Fail87829;
      term = a_17589.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}