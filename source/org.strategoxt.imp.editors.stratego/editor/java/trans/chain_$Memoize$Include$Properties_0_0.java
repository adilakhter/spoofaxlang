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

@SuppressWarnings("all") public class chain_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static chain_$Memoize$Include$Properties_0_0 instance = new chain_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_MemoizeIncludeProperties_0_0");
    Fail23700:
    { 
      IStrategoTerm i_4883 = null;
      IStrategoTerm l_4883 = null;
      IStrategoTerm n_4883 = null;
      i_4883 = term;
      n_4883 = term;
      Success12677:
      { 
        Fail23701:
        { 
          IStrategoTerm p_4883 = null;
          p_4883 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4883, trans.const4584, i_4883);
          if(term == null)
            break Fail23701;
          if(true)
            break Success12677;
        }
        term = trans.constNil4;
      }
      l_4883 = term;
      term = n_4883;
      term = termFactory.makeTuple(l_4883, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7078.instance);
      if(term == null)
        break Fail23700;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}