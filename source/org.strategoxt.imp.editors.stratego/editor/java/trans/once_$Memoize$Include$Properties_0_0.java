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

@SuppressWarnings("all") public class once_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static once_$Memoize$Include$Properties_0_0 instance = new once_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_MemoizeIncludeProperties_0_0");
    Fail23704:
    { 
      IStrategoTerm y_4883 = null;
      TermReference z_4883 = new TermReference();
      TermReference a_4884 = new TermReference();
      TermReference b_4884 = new TermReference();
      IStrategoTerm c_4884 = null;
      IStrategoTerm d_4884 = null;
      IStrategoTerm f_4884 = null;
      IStrategoTerm h_4884 = null;
      if(a_4884.value == null)
        a_4884.value = term;
      else
        if(a_4884.value != term && !a_4884.value.match(term))
          break Fail23704;
      if(z_4883.value == null)
        z_4883.value = term;
      else
        if(z_4883.value != term && !z_4883.value.match(term))
          break Fail23704;
      f_4884 = term;
      h_4884 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, h_4884, trans.const4584, a_4884.value);
      if(term == null)
        break Fail23704;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23704;
      y_4883 = term.getSubterm(0);
      d_4884 = term.getSubterm(1);
      c_4884 = term.getSubterm(2);
      term = y_4883;
      lifted7080 lifted70800 = new lifted7080();
      lifted70800.z_4883 = z_4883;
      lifted70800.a_4884 = a_4884;
      lifted70800.b_4884 = b_4884;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70800);
      if(term == null)
        break Fail23704;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23704;
      term = hashtable_put_0_2.instance.invoke(context, c_4884, d_4884, term);
      if(term == null)
        break Fail23704;
      term = f_4884;
      if(b_4884.value == null)
        break Fail23704;
      term = b_4884.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}