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

@SuppressWarnings("all") public class chain_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static chain_$Outer$Cookie_0_0 instance = new chain_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_OuterCookie_0_0");
    Fail22251:
    { 
      IStrategoTerm h_4334 = null;
      IStrategoTerm k_4334 = null;
      IStrategoTerm m_4334 = null;
      h_4334 = term;
      m_4334 = term;
      Success11975:
      { 
        Fail22252:
        { 
          IStrategoTerm o_4334 = null;
          o_4334 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4334, trans.const4394, h_4334);
          if(term == null)
            break Fail22252;
          if(true)
            break Success11975;
        }
        term = trans.constNil3;
      }
      k_4334 = term;
      term = m_4334;
      term = termFactory.makeTuple(k_4334, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6817.instance);
      if(term == null)
        break Fail22251;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}