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

@SuppressWarnings("all") public class fold_$Is$Imported$Failed_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported$Failed_1_0 instance = new fold_$Is$Imported$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4324)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImportedFailed_1_0");
    Fail22194:
    { 
      IStrategoTerm q_4324 = null;
      IStrategoTerm u_4324 = null;
      IStrategoTerm w_4324 = null;
      q_4324 = term;
      w_4324 = term;
      Success11959:
      { 
        Fail22195:
        { 
          IStrategoTerm y_4324 = null;
          y_4324 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4324, trans.const4366, q_4324);
          if(term == null)
            break Fail22195;
          if(true)
            break Success11959;
        }
        term = trans.constNil3;
      }
      u_4324 = term;
      term = w_4324;
      term = termFactory.makeTuple(u_4324, term);
      term = t_4324.invoke(context, term, lifted6796.instance);
      if(term == null)
        break Fail22194;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}