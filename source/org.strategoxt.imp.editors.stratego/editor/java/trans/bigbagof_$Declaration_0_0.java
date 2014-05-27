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
    Fail22124:
    { 
      TermReference a_4313 = new TermReference();
      TermReference b_4313 = new TermReference();
      if(b_4313.value == null)
        b_4313.value = term;
      else
        if(b_4313.value != term && !b_4313.value.match(term))
          break Fail22124;
      if(a_4313.value == null)
        a_4313.value = term;
      else
        if(a_4313.value != term && !a_4313.value.match(term))
          break Fail22124;
      Success11924:
      { 
        Fail22125:
        { 
          IStrategoTerm f_4313 = null;
          f_4313 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4313, trans.const4360, b_4313.value);
          if(term == null)
            break Fail22125;
          if(true)
            break Success11924;
        }
        term = trans.constNil3;
      }
      lifted6772 lifted67720 = new lifted6772();
      lifted67720.a_4313 = a_4313;
      lifted67720.b_4313 = b_4313;
      term = filter_1_0.instance.invoke(context, term, lifted67720);
      if(term == null)
        break Fail22124;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}