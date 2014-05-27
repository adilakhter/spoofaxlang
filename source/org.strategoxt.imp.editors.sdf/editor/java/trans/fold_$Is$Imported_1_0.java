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

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_92082)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail76149:
    { 
      IStrategoTerm k_92082 = null;
      IStrategoTerm o_92082 = null;
      IStrategoTerm q_92082 = null;
      k_92082 = term;
      q_92082 = term;
      Success41814:
      { 
        Fail76150:
        { 
          IStrategoTerm s_92082 = null;
          s_92082 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_92082, trans.const15450, k_92082);
          if(term == null)
            break Fail76150;
          if(true)
            break Success41814;
        }
        term = trans.constNil11;
      }
      o_92082 = term;
      term = q_92082;
      term = termFactory.makeTuple(o_92082, term);
      term = n_92082.invoke(context, term, lifted21597.instance);
      if(term == null)
        break Fail76149;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}