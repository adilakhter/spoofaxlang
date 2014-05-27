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

@SuppressWarnings("all") public class bagof_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static bagof_$Is$No$Conflict_0_0 instance = new bagof_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsNoConflict_0_0");
    Fail23786:
    { 
      TermReference q_4897 = new TermReference();
      TermReference r_4897 = new TermReference();
      if(r_4897.value == null)
        r_4897.value = term;
      else
        if(r_4897.value != term && !r_4897.value.match(term))
          break Fail23786;
      if(q_4897.value == null)
        q_4897.value = term;
      else
        if(q_4897.value != term && !q_4897.value.match(term))
          break Fail23786;
      Success12701:
      { 
        Fail23787:
        { 
          IStrategoTerm v_4897 = null;
          v_4897 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_4897, trans.const4637, r_4897.value);
          if(term == null)
            break Fail23787;
          if(true)
            break Success12701;
        }
        term = trans.constNil4;
      }
      lifted7110 lifted71100 = new lifted7110();
      lifted71100.q_4897 = q_4897;
      lifted71100.r_4897 = r_4897;
      term = filter_1_0.instance.invoke(context, term, lifted71100);
      if(term == null)
        break Fail23786;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}