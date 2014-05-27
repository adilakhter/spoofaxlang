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

@SuppressWarnings("all") public class reverse_bagof_$Project$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Project$Dir_1_0 instance = new reverse_bagof_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4832)
  { 
    context.push("reverse_bagof_ProjectDir_1_0");
    Fail23395:
    { 
      TermReference k_4832 = new TermReference();
      if(k_4832.value == null)
        k_4832.value = term;
      else
        if(k_4832.value != term && !k_4832.value.match(term))
          break Fail23395;
      Success12578:
      { 
        Fail23396:
        { 
          IStrategoTerm o_4832 = null;
          IStrategoTerm q_4832 = null;
          IStrategoTerm r_4832 = null;
          q_4832 = term;
          o_4832 = trans.const4475;
          r_4832 = q_4832;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4832, o_4832, trans.constCons2047);
          if(term == null)
            break Fail23396;
          if(true)
            break Success12578;
        }
        term = trans.constNil4;
      }
      lifted6973 lifted69730 = new lifted6973();
      lifted69730.k_4832 = k_4832;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted69730, m_4832);
      if(term == null)
        break Fail23395;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}