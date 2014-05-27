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

@SuppressWarnings("all") public class fold_$Declaration_1_0 extends Strategy 
{ 
  public static fold_$Declaration_1_0 instance = new fold_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4311)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Declaration_1_0");
    Fail22118:
    { 
      IStrategoTerm t_4311 = null;
      IStrategoTerm x_4311 = null;
      IStrategoTerm z_4311 = null;
      t_4311 = term;
      z_4311 = term;
      Success11921:
      { 
        Fail22119:
        { 
          IStrategoTerm b_4312 = null;
          b_4312 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4312, trans.const4360, t_4311);
          if(term == null)
            break Fail22119;
          if(true)
            break Success11921;
        }
        term = trans.constNil3;
      }
      x_4311 = term;
      term = z_4311;
      term = termFactory.makeTuple(x_4311, term);
      term = w_4311.invoke(context, term, lifted6769.instance);
      if(term == null)
        break Fail22118;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}