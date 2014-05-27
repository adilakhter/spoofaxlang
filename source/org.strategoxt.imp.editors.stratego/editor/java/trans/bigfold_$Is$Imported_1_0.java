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

@SuppressWarnings("all") public class bigfold_$Is$Imported_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported_1_0 instance = new bigfold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4838)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail23436:
    { 
      IStrategoTerm n_4838 = null;
      IStrategoTerm r_4838 = null;
      IStrategoTerm t_4838 = null;
      n_4838 = term;
      t_4838 = term;
      Success12587:
      { 
        Fail23437:
        { 
          IStrategoTerm v_4838 = null;
          v_4838 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, v_4838, trans.const4537, n_4838);
          if(term == null)
            break Fail23437;
          if(true)
            break Success12587;
        }
        term = trans.constNil4;
      }
      r_4838 = term;
      term = t_4838;
      term = termFactory.makeTuple(r_4838, term);
      term = q_4838.invoke(context, term, lifted6985.instance);
      if(term == null)
        break Fail23436;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}