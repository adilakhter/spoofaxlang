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

@SuppressWarnings("all") public class once_$Is$Import$Failed_0_0 extends Strategy 
{ 
  public static once_$Is$Import$Failed_0_0 instance = new once_$Is$Import$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImportFailed_0_0");
    Fail76235:
    { 
      IStrategoTerm y_92096 = null;
      TermReference z_92096 = new TermReference();
      TermReference a_92097 = new TermReference();
      TermReference b_92097 = new TermReference();
      IStrategoTerm c_92097 = null;
      IStrategoTerm d_92097 = null;
      IStrategoTerm f_92097 = null;
      IStrategoTerm g_92097 = null;
      IStrategoTerm i_92097 = null;
      IStrategoTerm j_92097 = null;
      if(a_92097.value == null)
        a_92097.value = term;
      else
        if(a_92097.value != term && !a_92097.value.match(term))
          break Fail76235;
      if(z_92096.value == null)
        z_92096.value = term;
      else
        if(z_92096.value != term && !z_92096.value.match(term))
          break Fail76235;
      f_92097 = term;
      i_92097 = term;
      g_92097 = trans.const15520;
      j_92097 = i_92097;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, j_92097, g_92097, trans.constCons7205);
      if(term == null)
        break Fail76235;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76235;
      y_92096 = term.getSubterm(0);
      d_92097 = term.getSubterm(1);
      c_92097 = term.getSubterm(2);
      term = y_92096;
      lifted21628 lifted216280 = new lifted21628();
      lifted216280.z_92096 = z_92096;
      lifted216280.a_92097 = a_92097;
      lifted216280.b_92097 = b_92097;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216280);
      if(term == null)
        break Fail76235;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76235;
      term = hashtable_put_0_2.instance.invoke(context, c_92097, d_92097, term);
      if(term == null)
        break Fail76235;
      term = f_92097;
      if(b_92097.value == null)
        break Fail76235;
      term = b_92097.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}