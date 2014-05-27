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

@SuppressWarnings("all") public class bigchain_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static bigchain_$Outer$Cookie_0_0 instance = new bigchain_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_OuterCookie_0_0");
    Fail23725:
    { 
      IStrategoTerm o_4887 = null;
      IStrategoTerm r_4887 = null;
      IStrategoTerm t_4887 = null;
      o_4887 = term;
      t_4887 = term;
      Success12683:
      { 
        Fail23726:
        { 
          IStrategoTerm v_4887 = null;
          v_4887 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, v_4887, trans.const4604, o_4887);
          if(term == null)
            break Fail23726;
          if(true)
            break Success12683;
        }
        term = trans.constNil4;
      }
      r_4887 = term;
      term = t_4887;
      term = termFactory.makeTuple(r_4887, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7087.instance);
      if(term == null)
        break Fail23725;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}