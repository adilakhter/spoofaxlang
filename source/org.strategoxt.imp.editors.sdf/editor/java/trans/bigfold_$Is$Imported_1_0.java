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

@SuppressWarnings("all") public class bigfold_$Is$Imported_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported_1_0 instance = new bigfold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_92082)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail76147:
    { 
      IStrategoTerm y_92081 = null;
      IStrategoTerm c_92082 = null;
      IStrategoTerm e_92082 = null;
      y_92081 = term;
      e_92082 = term;
      Success41813:
      { 
        Fail76148:
        { 
          IStrategoTerm g_92082 = null;
          g_92082 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_92082, trans.const15450, y_92081);
          if(term == null)
            break Fail76148;
          if(true)
            break Success41813;
        }
        term = trans.constNil11;
      }
      c_92082 = term;
      term = e_92082;
      term = termFactory.makeTuple(c_92082, term);
      term = b_92082.invoke(context, term, lifted21596.instance);
      if(term == null)
        break Fail76147;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}