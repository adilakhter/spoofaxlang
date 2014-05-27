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

@SuppressWarnings("all") public class bigbagof_$Declaration_0_0 extends Strategy 
{ 
  public static bigbagof_$Declaration_0_0 instance = new bigbagof_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Declaration_0_0");
    Fail23600:
    { 
      TermReference s_4866 = new TermReference();
      TermReference t_4866 = new TermReference();
      if(t_4866.value == null)
        t_4866.value = term;
      else
        if(t_4866.value != term && !t_4866.value.match(term))
          break Fail23600;
      if(s_4866.value == null)
        s_4866.value = term;
      else
        if(s_4866.value != term && !s_4866.value.match(term))
          break Fail23600;
      Success12633:
      { 
        Fail23601:
        { 
          IStrategoTerm x_4866 = null;
          x_4866 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4866, trans.const4570, t_4866.value);
          if(term == null)
            break Fail23601;
          if(true)
            break Success12633;
        }
        term = trans.constNil4;
      }
      lifted7043 lifted70430 = new lifted7043();
      lifted70430.s_4866 = s_4866;
      lifted70430.t_4866 = t_4866;
      term = filter_1_0.instance.invoke(context, term, lifted70430);
      if(term == null)
        break Fail23600;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}