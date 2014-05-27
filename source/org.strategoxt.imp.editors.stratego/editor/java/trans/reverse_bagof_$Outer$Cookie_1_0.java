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

@SuppressWarnings("all") public class reverse_bagof_$Outer$Cookie_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Outer$Cookie_1_0 instance = new reverse_bagof_$Outer$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4889)
  { 
    context.push("reverse_bagof_OuterCookie_1_0");
    Fail23732:
    { 
      TermReference z_4888 = new TermReference();
      TermReference a_4889 = new TermReference();
      if(a_4889.value == null)
        a_4889.value = term;
      else
        if(a_4889.value != term && !a_4889.value.match(term))
          break Fail23732;
      if(z_4888.value == null)
        z_4888.value = term;
      else
        if(z_4888.value != term && !z_4888.value.match(term))
          break Fail23732;
      Success12686:
      { 
        Fail23733:
        { 
          IStrategoTerm f_4889 = null;
          f_4889 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, f_4889, trans.const4604, a_4889.value);
          if(term == null)
            break Fail23733;
          if(true)
            break Success12686;
        }
        term = trans.constNil4;
      }
      lifted7091 lifted70910 = new lifted7091();
      lifted70910.z_4888 = z_4888;
      lifted70910.a_4889 = a_4889;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70910, c_4889);
      if(term == null)
        break Fail23732;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}