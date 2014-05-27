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

@SuppressWarnings("all") public class bigchain_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static bigchain_$Memoize$Include$Properties_0_0 instance = new bigchain_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_MemoizeIncludeProperties_0_0");
    Fail22222:
    { 
      IStrategoTerm f_4329 = null;
      IStrategoTerm i_4329 = null;
      IStrategoTerm k_4329 = null;
      f_4329 = term;
      k_4329 = term;
      Success11967:
      { 
        Fail22223:
        { 
          IStrategoTerm m_4329 = null;
          m_4329 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4329, trans.const4374, f_4329);
          if(term == null)
            break Fail22223;
          if(true)
            break Success11967;
        }
        term = trans.constNil3;
      }
      i_4329 = term;
      term = k_4329;
      term = termFactory.makeTuple(i_4329, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6806.instance);
      if(term == null)
        break Fail22222;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}