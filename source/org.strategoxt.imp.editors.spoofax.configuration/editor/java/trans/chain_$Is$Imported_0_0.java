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

@SuppressWarnings("all") public class chain_$Is$Imported_0_0 extends Strategy 
{ 
  public static chain_$Is$Imported_0_0 instance = new chain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsImported_0_0");
    Fail23017:
    { 
      IStrategoTerm k_4644 = null;
      IStrategoTerm n_4644 = null;
      IStrategoTerm p_4644 = null;
      k_4644 = term;
      p_4644 = term;
      Success12227:
      { 
        Fail23018:
        { 
          IStrategoTerm r_4644 = null;
          r_4644 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4644, trans.const4487, k_4644);
          if(term == null)
            break Fail23018;
          if(true)
            break Success12227;
        }
        term = trans.constNil4;
      }
      n_4644 = term;
      term = p_4644;
      term = termFactory.makeTuple(n_4644, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6906.instance);
      if(term == null)
        break Fail23017;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}