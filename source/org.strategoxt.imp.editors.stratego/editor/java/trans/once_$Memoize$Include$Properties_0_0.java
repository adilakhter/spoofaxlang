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
    Fail22228:
    { 
      IStrategoTerm g_4330 = null;
      TermReference h_4330 = new TermReference();
      TermReference i_4330 = new TermReference();
      TermReference j_4330 = new TermReference();
      IStrategoTerm k_4330 = null;
      IStrategoTerm l_4330 = null;
      IStrategoTerm n_4330 = null;
      IStrategoTerm p_4330 = null;
      if(i_4330.value == null)
        i_4330.value = term;
      else
        if(i_4330.value != term && !i_4330.value.match(term))
          break Fail22228;
      if(h_4330.value == null)
        h_4330.value = term;
      else
        if(h_4330.value != term && !h_4330.value.match(term))
          break Fail22228;
      n_4330 = term;
      p_4330 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, p_4330, trans.const4374, i_4330.value);
      if(term == null)
        break Fail22228;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22228;
      g_4330 = term.getSubterm(0);
      l_4330 = term.getSubterm(1);
      k_4330 = term.getSubterm(2);
      term = g_4330;
      lifted6809 lifted68090 = new lifted6809();
      lifted68090.h_4330 = h_4330;
      lifted68090.i_4330 = i_4330;
      lifted68090.j_4330 = j_4330;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68090);
      if(term == null)
        break Fail22228;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22228;
      term = hashtable_put_0_2.instance.invoke(context, k_4330, l_4330, term);
      if(term == null)
        break Fail22228;
      term = n_4330;
      if(j_4330.value == null)
        break Fail22228;
      term = j_4330.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}