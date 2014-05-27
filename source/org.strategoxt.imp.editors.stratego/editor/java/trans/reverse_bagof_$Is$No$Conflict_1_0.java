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

@SuppressWarnings("all") public class reverse_bagof_$Is$No$Conflict_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$No$Conflict_1_0 instance = new reverse_bagof_$Is$No$Conflict_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4897)
  { 
    context.push("reverse_bagof_IsNoConflict_1_0");
    Fail23784:
    { 
      TermReference j_4897 = new TermReference();
      TermReference k_4897 = new TermReference();
      if(k_4897.value == null)
        k_4897.value = term;
      else
        if(k_4897.value != term && !k_4897.value.match(term))
          break Fail23784;
      if(j_4897.value == null)
        j_4897.value = term;
      else
        if(j_4897.value != term && !j_4897.value.match(term))
          break Fail23784;
      Success12700:
      { 
        Fail23785:
        { 
          IStrategoTerm p_4897 = null;
          p_4897 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4897, trans.const4637, k_4897.value);
          if(term == null)
            break Fail23785;
          if(true)
            break Success12700;
        }
        term = trans.constNil4;
      }
      lifted7109 lifted71090 = new lifted7109();
      lifted71090.j_4897 = j_4897;
      lifted71090.k_4897 = k_4897;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted71090, m_4897);
      if(term == null)
        break Fail23784;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}