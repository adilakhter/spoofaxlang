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

@SuppressWarnings("all") public class fold_$Project$Dir_1_0 extends Strategy 
{ 
  public static fold_$Project$Dir_1_0 instance = new fold_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4276)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ProjectDir_1_0");
    Fail21910:
    { 
      IStrategoTerm v_4276 = null;
      IStrategoTerm x_4276 = null;
      x_4276 = term;
      Success11865:
      { 
        Fail21911:
        { 
          IStrategoTerm y_4276 = null;
          IStrategoTerm a_4277 = null;
          IStrategoTerm b_4277 = null;
          a_4277 = term;
          y_4276 = trans.const4265;
          b_4277 = a_4277;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4277, y_4276, trans.constCons1966);
          if(term == null)
            break Fail21911;
          if(true)
            break Success11865;
        }
        term = trans.constNil3;
      }
      v_4276 = term;
      term = x_4276;
      term = termFactory.makeTuple(v_4276, term);
      term = u_4276.invoke(context, term, lifted6697.instance);
      if(term == null)
        break Fail21910;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}