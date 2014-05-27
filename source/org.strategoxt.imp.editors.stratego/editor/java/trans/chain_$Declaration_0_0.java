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

@SuppressWarnings("all") public class chain_$Declaration_0_0 extends Strategy 
{ 
  public static chain_$Declaration_0_0 instance = new chain_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Declaration_0_0");
    Fail22122:
    { 
      IStrategoTerm q_4312 = null;
      IStrategoTerm t_4312 = null;
      IStrategoTerm v_4312 = null;
      q_4312 = term;
      v_4312 = term;
      Success11923:
      { 
        Fail22123:
        { 
          IStrategoTerm x_4312 = null;
          x_4312 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4312, trans.const4360, q_4312);
          if(term == null)
            break Fail22123;
          if(true)
            break Success11923;
        }
        term = trans.constNil3;
      }
      t_4312 = term;
      term = v_4312;
      term = termFactory.makeTuple(t_4312, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6771.instance);
      if(term == null)
        break Fail22122;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}