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

@SuppressWarnings("all") public class chain_$Is$Imported_0_0 extends Strategy 
{ 
  public static chain_$Is$Imported_0_0 instance = new chain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsImported_0_0");
    Fail21966:
    { 
      IStrategoTerm e_4286 = null;
      IStrategoTerm h_4286 = null;
      IStrategoTerm j_4286 = null;
      e_4286 = term;
      j_4286 = term;
      Success11881:
      { 
        Fail21967:
        { 
          IStrategoTerm l_4286 = null;
          l_4286 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4286, trans.const4327, e_4286);
          if(term == null)
            break Fail21967;
          if(true)
            break Success11881;
        }
        term = trans.constNil3;
      }
      h_4286 = term;
      term = j_4286;
      term = termFactory.makeTuple(h_4286, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6717.instance);
      if(term == null)
        break Fail21966;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}