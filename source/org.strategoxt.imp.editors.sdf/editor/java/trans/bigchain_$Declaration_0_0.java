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

@SuppressWarnings("all") public class bigchain_$Declaration_0_0 extends Strategy 
{ 
  public static bigchain_$Declaration_0_0 instance = new bigchain_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Declaration_0_0");
    Fail76281:
    { 
      IStrategoTerm k_92104 = null;
      IStrategoTerm n_92104 = null;
      IStrategoTerm p_92104 = null;
      k_92104 = term;
      p_92104 = term;
      Success41850:
      { 
        Fail76282:
        { 
          IStrategoTerm r_92104 = null;
          r_92104 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_92104, trans.const15522, k_92104);
          if(term == null)
            break Fail76282;
          if(true)
            break Success41850;
        }
        term = trans.constNil11;
      }
      n_92104 = term;
      term = p_92104;
      term = termFactory.makeTuple(n_92104, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21643.instance);
      if(term == null)
        break Fail76281;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}