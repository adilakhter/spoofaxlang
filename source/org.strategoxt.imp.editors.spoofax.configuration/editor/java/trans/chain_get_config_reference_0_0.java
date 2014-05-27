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

@SuppressWarnings("all") public class chain_get_config_reference_0_0 extends Strategy 
{ 
  public static chain_get_config_reference_0_0 instance = new chain_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_get_config_reference_0_0");
    Fail87773:
    { 
      IStrategoTerm o_17579 = null;
      IStrategoTerm q_17579 = null;
      q_17579 = term;
      Success47300:
      { 
        Fail87774:
        { 
          IStrategoTerm r_17579 = null;
          IStrategoTerm t_17579 = null;
          IStrategoTerm u_17579 = null;
          t_17579 = term;
          r_17579 = trans.const17869;
          u_17579 = t_17579;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_17579, r_17579, trans.constCons8528);
          if(term == null)
            break Fail87774;
          if(true)
            break Success47300;
        }
        term = trans.constNil14;
      }
      o_17579 = term;
      term = q_17579;
      term = termFactory.makeTuple(o_17579, term);
      term = foldl_1_0.instance.invoke(context, term, lifted24773.instance);
      if(term == null)
        break Fail87773;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}