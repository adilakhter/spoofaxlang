package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Is$Import$Failed_1_0 extends Strategy 
{ 
  public static fold_$Is$Import$Failed_1_0 instance = new fold_$Is$Import$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_92095)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImportFailed_1_0");
    Fail76227:
    { 
      IStrategoTerm h_92095 = null;
      IStrategoTerm j_92095 = null;
      j_92095 = term;
      Success41835:
      { 
        Fail76228:
        { 
          IStrategoTerm k_92095 = null;
          IStrategoTerm m_92095 = null;
          IStrategoTerm n_92095 = null;
          m_92095 = term;
          k_92095 = trans.const15520;
          n_92095 = m_92095;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_92095, k_92095, trans.constCons7205);
          if(term == null)
            break Fail76228;
          if(true)
            break Success41835;
        }
        term = trans.constNil11;
      }
      h_92095 = term;
      term = j_92095;
      term = termFactory.makeTuple(h_92095, term);
      term = g_92095.invoke(context, term, lifted21624.instance);
      if(term == null)
        break Fail76227;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}