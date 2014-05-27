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

@SuppressWarnings("all") public class bigbagof_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static bigbagof_$Memoize$Include$Properties_0_0 instance = new bigbagof_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_MemoizeIncludeProperties_0_0");
    Fail23702:
    { 
      TermReference s_4883 = new TermReference();
      TermReference t_4883 = new TermReference();
      if(t_4883.value == null)
        t_4883.value = term;
      else
        if(t_4883.value != term && !t_4883.value.match(term))
          break Fail23702;
      if(s_4883.value == null)
        s_4883.value = term;
      else
        if(s_4883.value != term && !s_4883.value.match(term))
          break Fail23702;
      Success12678:
      { 
        Fail23703:
        { 
          IStrategoTerm x_4883 = null;
          x_4883 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4883, trans.const4584, t_4883.value);
          if(term == null)
            break Fail23703;
          if(true)
            break Success12678;
        }
        term = trans.constNil4;
      }
      lifted7079 lifted70790 = new lifted7079();
      lifted70790.s_4883 = s_4883;
      lifted70790.t_4883 = t_4883;
      term = filter_1_0.instance.invoke(context, term, lifted70790);
      if(term == null)
        break Fail23702;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}