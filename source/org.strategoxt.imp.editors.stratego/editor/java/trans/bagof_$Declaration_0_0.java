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

@SuppressWarnings("all") public class bagof_$Declaration_0_0 extends Strategy 
{ 
  public static bagof_$Declaration_0_0 instance = new bagof_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Declaration_0_0");
    Fail23605:
    { 
      TermReference p_4867 = new TermReference();
      TermReference q_4867 = new TermReference();
      if(q_4867.value == null)
        q_4867.value = term;
      else
        if(q_4867.value != term && !q_4867.value.match(term))
          break Fail23605;
      if(p_4867.value == null)
        p_4867.value = term;
      else
        if(p_4867.value != term && !p_4867.value.match(term))
          break Fail23605;
      Success12635:
      { 
        Fail23606:
        { 
          IStrategoTerm u_4867 = null;
          u_4867 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4867, trans.const4570, q_4867.value);
          if(term == null)
            break Fail23606;
          if(true)
            break Success12635;
        }
        term = trans.constNil4;
      }
      lifted7046 lifted70460 = new lifted7046();
      lifted70460.p_4867 = p_4867;
      lifted70460.q_4867 = q_4867;
      term = filter_1_0.instance.invoke(context, term, lifted70460);
      if(term == null)
        break Fail23605;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}