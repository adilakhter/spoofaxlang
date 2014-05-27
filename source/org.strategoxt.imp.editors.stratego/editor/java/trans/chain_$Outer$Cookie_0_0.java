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
    Fail23727:
    { 
      IStrategoTerm z_4887 = null;
      IStrategoTerm c_4888 = null;
      IStrategoTerm e_4888 = null;
      z_4887 = term;
      e_4888 = term;
      Success12684:
      { 
        Fail23728:
        { 
          IStrategoTerm g_4888 = null;
          g_4888 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4888, trans.const4604, z_4887);
          if(term == null)
            break Fail23728;
          if(true)
            break Success12684;
        }
        term = trans.constNil4;
      }
      c_4888 = term;
      term = e_4888;
      term = termFactory.makeTuple(c_4888, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7088.instance);
      if(term == null)
        break Fail23727;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}