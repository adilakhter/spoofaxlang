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

@SuppressWarnings("all") public class fold_$Memoize$Include$Properties_1_0 extends Strategy 
{ 
  public static fold_$Memoize$Include$Properties_1_0 instance = new fold_$Memoize$Include$Properties_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4328)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_MemoizeIncludeProperties_1_0");
    Fail22220:
    { 
      IStrategoTerm t_4328 = null;
      IStrategoTerm x_4328 = null;
      IStrategoTerm z_4328 = null;
      t_4328 = term;
      z_4328 = term;
      Success11966:
      { 
        Fail22221:
        { 
          IStrategoTerm b_4329 = null;
          b_4329 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4329, trans.const4374, t_4328);
          if(term == null)
            break Fail22221;
          if(true)
            break Success11966;
        }
        term = trans.constNil3;
      }
      x_4328 = term;
      term = z_4328;
      term = termFactory.makeTuple(x_4328, term);
      term = w_4328.invoke(context, term, lifted6805.instance);
      if(term == null)
        break Fail22220;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}