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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail23015:
    { 
      IStrategoTerm z_4643 = null;
      IStrategoTerm c_4644 = null;
      IStrategoTerm e_4644 = null;
      z_4643 = term;
      e_4644 = term;
      Success12226:
      { 
        Fail23016:
        { 
          IStrategoTerm g_4644 = null;
          g_4644 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4644, trans.const4487, z_4643);
          if(term == null)
            break Fail23016;
          if(true)
            break Success12226;
        }
        term = trans.constNil4;
      }
      c_4644 = term;
      term = e_4644;
      term = termFactory.makeTuple(c_4644, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6905.instance);
      if(term == null)
        break Fail23015;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}