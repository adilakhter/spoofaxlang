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

@SuppressWarnings("all") public class $No$Analysis_0_0 extends Strategy 
{ 
  public static $No$Analysis_0_0 instance = new $No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("NoAnalysis_0_0");
    Fail23555:
    { 
      TermReference k_4859 = new TermReference();
      TermReference l_4859 = new TermReference();
      IStrategoTerm o_4859 = null;
      IStrategoTerm q_4859 = null;
      IStrategoTerm r_4859 = null;
      if(l_4859.value == null)
        l_4859.value = term;
      else
        if(l_4859.value != term && !l_4859.value.match(term))
          break Fail23555;
      if(k_4859.value == null)
        k_4859.value = term;
      else
        if(k_4859.value != term && !k_4859.value.match(term))
          break Fail23555;
      q_4859 = term;
      o_4859 = trans.const4559;
      r_4859 = q_4859;
      term = dr_lookup_rule_0_2.instance.invoke(context, r_4859, o_4859, trans.constCons2047);
      if(term == null)
        break Fail23555;
      lifted7029 lifted70290 = new lifted7029();
      lifted70290.k_4859 = k_4859;
      lifted70290.l_4859 = l_4859;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70290);
      if(term == null)
        break Fail23555;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}