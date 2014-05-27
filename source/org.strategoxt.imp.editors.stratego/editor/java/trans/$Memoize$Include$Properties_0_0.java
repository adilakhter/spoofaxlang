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

@SuppressWarnings("all") public class $Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static $Memoize$Include$Properties_0_0 instance = new $Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("MemoizeIncludeProperties_0_0");
    Fail23709:
    { 
      TermReference v_4884 = new TermReference();
      TermReference w_4884 = new TermReference();
      IStrategoTerm a_4885 = null;
      if(w_4884.value == null)
        w_4884.value = term;
      else
        if(w_4884.value != term && !w_4884.value.match(term))
          break Fail23709;
      if(v_4884.value == null)
        v_4884.value = term;
      else
        if(v_4884.value != term && !v_4884.value.match(term))
          break Fail23709;
      a_4885 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, a_4885, trans.const4584, w_4884.value);
      if(term == null)
        break Fail23709;
      lifted7083 lifted70830 = new lifted7083();
      lifted70830.v_4884 = v_4884;
      lifted70830.w_4884 = w_4884;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70830);
      if(term == null)
        break Fail23709;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}