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

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4285)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail21962:
    { 
      IStrategoTerm h_4285 = null;
      IStrategoTerm l_4285 = null;
      IStrategoTerm n_4285 = null;
      h_4285 = term;
      n_4285 = term;
      Success11879:
      { 
        Fail21963:
        { 
          IStrategoTerm p_4285 = null;
          p_4285 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4285, trans.const4327, h_4285);
          if(term == null)
            break Fail21963;
          if(true)
            break Success11879;
        }
        term = trans.constNil3;
      }
      l_4285 = term;
      term = n_4285;
      term = termFactory.makeTuple(l_4285, term);
      term = k_4285.invoke(context, term, lifted6715.instance);
      if(term == null)
        break Fail21962;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}