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

@SuppressWarnings("all") public class fold_$Is$No$Conflict_1_0 extends Strategy 
{ 
  public static fold_$Is$No$Conflict_1_0 instance = new fold_$Is$No$Conflict_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsNoConflict_1_0");
    Fail22299:
    { 
      IStrategoTerm u_4341 = null;
      IStrategoTerm y_4341 = null;
      IStrategoTerm a_4342 = null;
      u_4341 = term;
      a_4342 = term;
      Success11987:
      { 
        Fail22300:
        { 
          IStrategoTerm c_4342 = null;
          c_4342 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4342, trans.const4427, u_4341);
          if(term == null)
            break Fail22300;
          if(true)
            break Success11987;
        }
        term = trans.constNil3;
      }
      y_4341 = term;
      term = a_4342;
      term = termFactory.makeTuple(y_4341, term);
      term = x_4341.invoke(context, term, lifted6833.instance);
      if(term == null)
        break Fail22299;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}