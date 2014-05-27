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
    Fail23698:
    { 
      IStrategoTerm x_4882 = null;
      IStrategoTerm a_4883 = null;
      IStrategoTerm c_4883 = null;
      x_4882 = term;
      c_4883 = term;
      Success12676:
      { 
        Fail23699:
        { 
          IStrategoTerm e_4883 = null;
          e_4883 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4883, trans.const4584, x_4882);
          if(term == null)
            break Fail23699;
          if(true)
            break Success12676;
        }
        term = trans.constNil4;
      }
      a_4883 = term;
      term = c_4883;
      term = termFactory.makeTuple(a_4883, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7077.instance);
      if(term == null)
        break Fail23698;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}