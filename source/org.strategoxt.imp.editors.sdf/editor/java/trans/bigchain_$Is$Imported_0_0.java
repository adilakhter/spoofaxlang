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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail76151:
    { 
      IStrategoTerm w_92082 = null;
      IStrategoTerm z_92082 = null;
      IStrategoTerm b_92083 = null;
      w_92082 = term;
      b_92083 = term;
      Success41815:
      { 
        Fail76152:
        { 
          IStrategoTerm d_92083 = null;
          d_92083 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_92083, trans.const15450, w_92082);
          if(term == null)
            break Fail76152;
          if(true)
            break Success41815;
        }
        term = trans.constNil11;
      }
      z_92082 = term;
      term = b_92083;
      term = termFactory.makeTuple(z_92082, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21598.instance);
      if(term == null)
        break Fail76151;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}