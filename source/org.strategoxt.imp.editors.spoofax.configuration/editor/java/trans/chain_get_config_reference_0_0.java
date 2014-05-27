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
    Fail22965:
    { 
      IStrategoTerm r_4635 = null;
      IStrategoTerm t_4635 = null;
      t_4635 = term;
      Success12213:
      { 
        Fail22966:
        { 
          IStrategoTerm u_4635 = null;
          IStrategoTerm w_4635 = null;
          IStrategoTerm x_4635 = null;
          w_4635 = term;
          u_4635 = trans.const4482;
          x_4635 = w_4635;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4635, u_4635, trans.constCons2047);
          if(term == null)
            break Fail22966;
          if(true)
            break Success12213;
        }
        term = trans.constNil4;
      }
      r_4635 = term;
      term = t_4635;
      term = termFactory.makeTuple(r_4635, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6888.instance);
      if(term == null)
        break Fail22965;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}