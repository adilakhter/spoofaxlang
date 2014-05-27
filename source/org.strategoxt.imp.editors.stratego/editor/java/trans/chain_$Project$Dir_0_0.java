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

@SuppressWarnings("all") public class chain_$Project$Dir_0_0 extends Strategy 
{ 
  public static chain_$Project$Dir_0_0 instance = new chain_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ProjectDir_0_0");
    Fail21914:
    { 
      IStrategoTerm r_4277 = null;
      IStrategoTerm t_4277 = null;
      t_4277 = term;
      Success11867:
      { 
        Fail21915:
        { 
          IStrategoTerm u_4277 = null;
          IStrategoTerm w_4277 = null;
          IStrategoTerm x_4277 = null;
          w_4277 = term;
          u_4277 = trans.const4265;
          x_4277 = w_4277;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4277, u_4277, trans.constCons1966);
          if(term == null)
            break Fail21915;
          if(true)
            break Success11867;
        }
        term = trans.constNil3;
      }
      r_4277 = term;
      term = t_4277;
      term = termFactory.makeTuple(r_4277, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6699.instance);
      if(term == null)
        break Fail21914;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}