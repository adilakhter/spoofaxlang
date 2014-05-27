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

@SuppressWarnings("all") public class bigbagof_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static bigbagof_$Outer$Cookie_0_0 instance = new bigbagof_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_OuterCookie_0_0");
    Fail23729:
    { 
      TermReference j_4888 = new TermReference();
      TermReference k_4888 = new TermReference();
      if(k_4888.value == null)
        k_4888.value = term;
      else
        if(k_4888.value != term && !k_4888.value.match(term))
          break Fail23729;
      if(j_4888.value == null)
        j_4888.value = term;
      else
        if(j_4888.value != term && !j_4888.value.match(term))
          break Fail23729;
      Success12685:
      { 
        Fail23730:
        { 
          IStrategoTerm o_4888 = null;
          o_4888 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4888, trans.const4604, k_4888.value);
          if(term == null)
            break Fail23730;
          if(true)
            break Success12685;
        }
        term = trans.constNil4;
      }
      lifted7089 lifted70890 = new lifted7089();
      lifted70890.j_4888 = j_4888;
      lifted70890.k_4888 = k_4888;
      term = filter_1_0.instance.invoke(context, term, lifted70890);
      if(term == null)
        break Fail23729;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}