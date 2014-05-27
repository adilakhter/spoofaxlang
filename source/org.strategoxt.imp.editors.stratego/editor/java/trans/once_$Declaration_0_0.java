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

@SuppressWarnings("all") public class once_$Declaration_0_0 extends Strategy 
{ 
  public static once_$Declaration_0_0 instance = new once_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Declaration_0_0");
    Fail23602:
    { 
      IStrategoTerm y_4866 = null;
      TermReference z_4866 = new TermReference();
      TermReference a_4867 = new TermReference();
      TermReference b_4867 = new TermReference();
      IStrategoTerm c_4867 = null;
      IStrategoTerm d_4867 = null;
      IStrategoTerm f_4867 = null;
      IStrategoTerm h_4867 = null;
      if(a_4867.value == null)
        a_4867.value = term;
      else
        if(a_4867.value != term && !a_4867.value.match(term))
          break Fail23602;
      if(z_4866.value == null)
        z_4866.value = term;
      else
        if(z_4866.value != term && !z_4866.value.match(term))
          break Fail23602;
      f_4867 = term;
      h_4867 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, h_4867, trans.const4570, a_4867.value);
      if(term == null)
        break Fail23602;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23602;
      y_4866 = term.getSubterm(0);
      d_4867 = term.getSubterm(1);
      c_4867 = term.getSubterm(2);
      term = y_4866;
      lifted7044 lifted70440 = new lifted7044();
      lifted70440.z_4866 = z_4866;
      lifted70440.a_4867 = a_4867;
      lifted70440.b_4867 = b_4867;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70440);
      if(term == null)
        break Fail23602;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23602;
      term = hashtable_put_0_2.instance.invoke(context, c_4867, d_4867, term);
      if(term == null)
        break Fail23602;
      term = f_4867;
      if(b_4867.value == null)
        break Fail23602;
      term = b_4867.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}