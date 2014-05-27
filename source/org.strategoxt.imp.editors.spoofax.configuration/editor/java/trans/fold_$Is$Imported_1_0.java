package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4643)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail23013:
    { 
      IStrategoTerm n_4643 = null;
      IStrategoTerm r_4643 = null;
      IStrategoTerm t_4643 = null;
      n_4643 = term;
      t_4643 = term;
      Success12225:
      { 
        Fail23014:
        { 
          IStrategoTerm v_4643 = null;
          v_4643 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_4643, trans.const4487, n_4643);
          if(term == null)
            break Fail23014;
          if(true)
            break Success12225;
        }
        term = trans.constNil4;
      }
      r_4643 = term;
      term = t_4643;
      term = termFactory.makeTuple(r_4643, term);
      term = q_4643.invoke(context, term, lifted6904.instance);
      if(term == null)
        break Fail23013;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}