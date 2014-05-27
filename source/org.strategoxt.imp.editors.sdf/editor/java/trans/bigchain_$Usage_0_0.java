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

@SuppressWarnings("all") public class bigchain_$Usage_0_0 extends Strategy 
{ 
  public static bigchain_$Usage_0_0 instance = new bigchain_$Usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Usage_0_0");
    Fail76308:
    { 
      IStrategoTerm r_92108 = null;
      IStrategoTerm u_92108 = null;
      IStrategoTerm w_92108 = null;
      r_92108 = term;
      w_92108 = term;
      Success41858:
      { 
        Fail76309:
        { 
          IStrategoTerm y_92108 = null;
          y_92108 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_92108, trans.const15535, r_92108);
          if(term == null)
            break Fail76309;
          if(true)
            break Success41858;
        }
        term = trans.constNil11;
      }
      u_92108 = term;
      term = w_92108;
      term = termFactory.makeTuple(u_92108, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21652.instance);
      if(term == null)
        break Fail76308;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}