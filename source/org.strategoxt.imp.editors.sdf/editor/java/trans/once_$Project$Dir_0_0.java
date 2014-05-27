package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class once_$Project$Dir_0_0 extends Strategy 
{ 
  public static once_$Project$Dir_0_0 instance = new once_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ProjectDir_0_0");
    Fail76183:
    { 
      IStrategoTerm b_92088 = null;
      TermReference c_92088 = new TermReference();
      TermReference d_92088 = new TermReference();
      IStrategoTerm e_92088 = null;
      IStrategoTerm f_92088 = null;
      IStrategoTerm h_92088 = null;
      IStrategoTerm i_92088 = null;
      IStrategoTerm k_92088 = null;
      IStrategoTerm l_92088 = null;
      if(c_92088.value == null)
        c_92088.value = term;
      else
        if(c_92088.value != term && !c_92088.value.match(term))
          break Fail76183;
      h_92088 = term;
      k_92088 = term;
      i_92088 = trans.const15517;
      l_92088 = k_92088;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, l_92088, i_92088, trans.constCons7205);
      if(term == null)
        break Fail76183;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76183;
      b_92088 = term.getSubterm(0);
      f_92088 = term.getSubterm(1);
      e_92088 = term.getSubterm(2);
      term = b_92088;
      lifted21610 lifted216100 = new lifted21610();
      lifted216100.c_92088 = c_92088;
      lifted216100.d_92088 = d_92088;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216100);
      if(term == null)
        break Fail76183;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76183;
      term = hashtable_put_0_2.instance.invoke(context, e_92088, f_92088, term);
      if(term == null)
        break Fail76183;
      term = h_92088;
      if(d_92088.value == null)
        break Fail76183;
      term = d_92088.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}