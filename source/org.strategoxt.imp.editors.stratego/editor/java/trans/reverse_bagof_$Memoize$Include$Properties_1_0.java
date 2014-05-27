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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4330)
  { 
    context.push("reverse_bagof_MemoizeIncludeProperties_1_0");
    Fail22229:
    { 
      TermReference q_4330 = new TermReference();
      TermReference r_4330 = new TermReference();
      if(r_4330.value == null)
        r_4330.value = term;
      else
        if(r_4330.value != term && !r_4330.value.match(term))
          break Fail22229;
      if(q_4330.value == null)
        q_4330.value = term;
      else
        if(q_4330.value != term && !q_4330.value.match(term))
          break Fail22229;
      Success11970:
      { 
        Fail22230:
        { 
          IStrategoTerm w_4330 = null;
          w_4330 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4330, trans.const4374, r_4330.value);
          if(term == null)
            break Fail22230;
          if(true)
            break Success11970;
        }
        term = trans.constNil3;
      }
      lifted6810 lifted68100 = new lifted6810();
      lifted68100.q_4330 = q_4330;
      lifted68100.r_4330 = r_4330;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted68100, t_4330);
      if(term == null)
        break Fail22229;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}