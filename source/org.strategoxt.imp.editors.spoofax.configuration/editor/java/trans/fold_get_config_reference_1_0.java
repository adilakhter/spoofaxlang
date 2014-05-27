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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17578)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_get_config_reference_1_0");
    Fail87769:
    { 
      IStrategoTerm o_17578 = null;
      IStrategoTerm q_17578 = null;
      q_17578 = term;
      Success47298:
      { 
        Fail87770:
        { 
          IStrategoTerm r_17578 = null;
          IStrategoTerm t_17578 = null;
          IStrategoTerm u_17578 = null;
          t_17578 = term;
          r_17578 = trans.const17869;
          u_17578 = t_17578;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_17578, r_17578, trans.constCons8528);
          if(term == null)
            break Fail87770;
          if(true)
            break Success47298;
        }
        term = trans.constNil14;
      }
      o_17578 = term;
      term = q_17578;
      term = termFactory.makeTuple(o_17578, term);
      term = n_17578.invoke(context, term, lifted24771.instance);
      if(term == null)
        break Fail87769;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}