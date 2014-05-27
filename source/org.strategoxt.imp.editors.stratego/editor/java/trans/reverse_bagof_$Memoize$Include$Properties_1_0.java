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

@SuppressWarnings("all") public class reverse_bagof_$Memoize$Include$Properties_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Memoize$Include$Properties_1_0 instance = new reverse_bagof_$Memoize$Include$Properties_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4884)
  { 
    context.push("reverse_bagof_MemoizeIncludeProperties_1_0");
    Fail23705:
    { 
      TermReference i_4884 = new TermReference();
      TermReference j_4884 = new TermReference();
      if(j_4884.value == null)
        j_4884.value = term;
      else
        if(j_4884.value != term && !j_4884.value.match(term))
          break Fail23705;
      if(i_4884.value == null)
        i_4884.value = term;
      else
        if(i_4884.value != term && !i_4884.value.match(term))
          break Fail23705;
      Success12679:
      { 
        Fail23706:
        { 
          IStrategoTerm o_4884 = null;
          o_4884 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4884, trans.const4584, j_4884.value);
          if(term == null)
            break Fail23706;
          if(true)
            break Success12679;
        }
        term = trans.constNil4;
      }
      lifted7081 lifted70810 = new lifted7081();
      lifted70810.i_4884 = i_4884;
      lifted70810.j_4884 = j_4884;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70810, l_4884);
      if(term == null)
        break Fail23705;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}