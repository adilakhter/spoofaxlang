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

@SuppressWarnings("all") public class chain_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static chain_$Is$No$Conflict_0_0 instance = new chain_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsNoConflict_0_0");
    Fail22303:
    { 
      IStrategoTerm r_4342 = null;
      IStrategoTerm u_4342 = null;
      IStrategoTerm w_4342 = null;
      r_4342 = term;
      w_4342 = term;
      Success11989:
      { 
        Fail22304:
        { 
          IStrategoTerm y_4342 = null;
          y_4342 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4342, trans.const4427, r_4342);
          if(term == null)
            break Fail22304;
          if(true)
            break Success11989;
        }
        term = trans.constNil3;
      }
      u_4342 = term;
      term = w_4342;
      term = termFactory.makeTuple(u_4342, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6835.instance);
      if(term == null)
        break Fail22303;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}