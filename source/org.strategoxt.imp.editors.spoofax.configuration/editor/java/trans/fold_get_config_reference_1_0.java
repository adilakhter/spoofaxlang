package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_get_config_reference_1_0 extends Strategy 
{ 
  public static fold_get_config_reference_1_0 instance = new fold_get_config_reference_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4634)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_get_config_reference_1_0");
    Fail22961:
    { 
      IStrategoTerm r_4634 = null;
      IStrategoTerm t_4634 = null;
      t_4634 = term;
      Success12211:
      { 
        Fail22962:
        { 
          IStrategoTerm u_4634 = null;
          IStrategoTerm w_4634 = null;
          IStrategoTerm x_4634 = null;
          w_4634 = term;
          u_4634 = trans.const4482;
          x_4634 = w_4634;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4634, u_4634, trans.constCons2047);
          if(term == null)
            break Fail22962;
          if(true)
            break Success12211;
        }
        term = trans.constNil4;
      }
      r_4634 = term;
      term = t_4634;
      term = termFactory.makeTuple(r_4634, term);
      term = q_4634.invoke(context, term, lifted6886.instance);
      if(term == null)
        break Fail22961;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}