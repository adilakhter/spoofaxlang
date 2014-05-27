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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4284)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail21960:
    { 
      IStrategoTerm v_4284 = null;
      IStrategoTerm z_4284 = null;
      IStrategoTerm b_4285 = null;
      v_4284 = term;
      b_4285 = term;
      Success11878:
      { 
        Fail21961:
        { 
          IStrategoTerm d_4285 = null;
          d_4285 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4285, trans.const4327, v_4284);
          if(term == null)
            break Fail21961;
          if(true)
            break Success11878;
        }
        term = trans.constNil3;
      }
      z_4284 = term;
      term = b_4285;
      term = termFactory.makeTuple(z_4284, term);
      term = y_4284.invoke(context, term, lifted6714.instance);
      if(term == null)
        break Fail21960;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}