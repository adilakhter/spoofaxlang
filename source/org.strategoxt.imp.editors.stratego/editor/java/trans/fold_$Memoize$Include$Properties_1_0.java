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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4882)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_MemoizeIncludeProperties_1_0");
    Fail23696:
    { 
      IStrategoTerm l_4882 = null;
      IStrategoTerm p_4882 = null;
      IStrategoTerm r_4882 = null;
      l_4882 = term;
      r_4882 = term;
      Success12675:
      { 
        Fail23697:
        { 
          IStrategoTerm t_4882 = null;
          t_4882 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4882, trans.const4584, l_4882);
          if(term == null)
            break Fail23697;
          if(true)
            break Success12675;
        }
        term = trans.constNil4;
      }
      p_4882 = term;
      term = r_4882;
      term = termFactory.makeTuple(p_4882, term);
      term = o_4882.invoke(context, term, lifted7076.instance);
      if(term == null)
        break Fail23696;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}