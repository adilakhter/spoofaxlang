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

@SuppressWarnings("all") public class bigfold_$Memoize$Include$Properties_1_0 extends Strategy 
{ 
  public static bigfold_$Memoize$Include$Properties_1_0 instance = new bigfold_$Memoize$Include$Properties_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4328)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_MemoizeIncludeProperties_1_0");
    Fail22218:
    { 
      IStrategoTerm h_4328 = null;
      IStrategoTerm l_4328 = null;
      IStrategoTerm n_4328 = null;
      h_4328 = term;
      n_4328 = term;
      Success11965:
      { 
        Fail22219:
        { 
          IStrategoTerm p_4328 = null;
          p_4328 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4328, trans.const4374, h_4328);
          if(term == null)
            break Fail22219;
          if(true)
            break Success11965;
        }
        term = trans.constNil3;
      }
      l_4328 = term;
      term = n_4328;
      term = termFactory.makeTuple(l_4328, term);
      term = k_4328.invoke(context, term, lifted6804.instance);
      if(term == null)
        break Fail22218;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}