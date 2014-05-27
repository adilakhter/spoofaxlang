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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4343)
  { 
    context.push("reverse_bagof_IsNoConflict_1_0");
    Fail22308:
    { 
      TermReference r_4343 = new TermReference();
      TermReference s_4343 = new TermReference();
      if(s_4343.value == null)
        s_4343.value = term;
      else
        if(s_4343.value != term && !s_4343.value.match(term))
          break Fail22308;
      if(r_4343.value == null)
        r_4343.value = term;
      else
        if(r_4343.value != term && !r_4343.value.match(term))
          break Fail22308;
      Success11991:
      { 
        Fail22309:
        { 
          IStrategoTerm x_4343 = null;
          x_4343 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4343, trans.const4427, s_4343.value);
          if(term == null)
            break Fail22309;
          if(true)
            break Success11991;
        }
        term = trans.constNil3;
      }
      lifted6838 lifted68380 = new lifted6838();
      lifted68380.r_4343 = r_4343;
      lifted68380.s_4343 = s_4343;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted68380, u_4343);
      if(term == null)
        break Fail22308;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}