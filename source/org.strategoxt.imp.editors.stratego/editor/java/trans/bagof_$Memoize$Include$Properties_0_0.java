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

@SuppressWarnings("all") public class bagof_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static bagof_$Memoize$Include$Properties_0_0 instance = new bagof_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_MemoizeIncludeProperties_0_0");
    Fail23707:
    { 
      TermReference p_4884 = new TermReference();
      TermReference q_4884 = new TermReference();
      if(q_4884.value == null)
        q_4884.value = term;
      else
        if(q_4884.value != term && !q_4884.value.match(term))
          break Fail23707;
      if(p_4884.value == null)
        p_4884.value = term;
      else
        if(p_4884.value != term && !p_4884.value.match(term))
          break Fail23707;
      Success12680:
      { 
        Fail23708:
        { 
          IStrategoTerm u_4884 = null;
          u_4884 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4884, trans.const4584, q_4884.value);
          if(term == null)
            break Fail23708;
          if(true)
            break Success12680;
        }
        term = trans.constNil4;
      }
      lifted7082 lifted70820 = new lifted7082();
      lifted70820.p_4884 = p_4884;
      lifted70820.q_4884 = q_4884;
      term = filter_1_0.instance.invoke(context, term, lifted70820);
      if(term == null)
        break Fail23707;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}