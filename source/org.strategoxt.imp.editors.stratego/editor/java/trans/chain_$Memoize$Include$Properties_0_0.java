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
    Fail22224:
    { 
      IStrategoTerm q_4329 = null;
      IStrategoTerm t_4329 = null;
      IStrategoTerm v_4329 = null;
      q_4329 = term;
      v_4329 = term;
      Success11968:
      { 
        Fail22225:
        { 
          IStrategoTerm x_4329 = null;
          x_4329 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4329, trans.const4374, q_4329);
          if(term == null)
            break Fail22225;
          if(true)
            break Success11968;
        }
        term = trans.constNil3;
      }
      t_4329 = term;
      term = v_4329;
      term = termFactory.makeTuple(t_4329, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6807.instance);
      if(term == null)
        break Fail22224;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}