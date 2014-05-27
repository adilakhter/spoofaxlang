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

@SuppressWarnings("all") public class bigfold_$Usage_1_0 extends Strategy 
{ 
  public static bigfold_$Usage_1_0 instance = new bigfold_$Usage_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_92107)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Usage_1_0");
    Fail76304:
    { 
      IStrategoTerm t_92107 = null;
      IStrategoTerm x_92107 = null;
      IStrategoTerm z_92107 = null;
      t_92107 = term;
      z_92107 = term;
      Success41856:
      { 
        Fail76305:
        { 
          IStrategoTerm b_92108 = null;
          b_92108 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_92108, trans.const15535, t_92107);
          if(term == null)
            break Fail76305;
          if(true)
            break Success41856;
        }
        term = trans.constNil11;
      }
      x_92107 = term;
      term = z_92107;
      term = termFactory.makeTuple(x_92107, term);
      term = w_92107.invoke(context, term, lifted21650.instance);
      if(term == null)
        break Fail76304;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}