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

@SuppressWarnings("all") public class fold_$Usage_1_0 extends Strategy 
{ 
  public static fold_$Usage_1_0 instance = new fold_$Usage_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_92108)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Usage_1_0");
    Fail76306:
    { 
      IStrategoTerm f_92108 = null;
      IStrategoTerm j_92108 = null;
      IStrategoTerm l_92108 = null;
      f_92108 = term;
      l_92108 = term;
      Success41857:
      { 
        Fail76307:
        { 
          IStrategoTerm n_92108 = null;
          n_92108 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_92108, trans.const15535, f_92108);
          if(term == null)
            break Fail76307;
          if(true)
            break Success41857;
        }
        term = trans.constNil11;
      }
      j_92108 = term;
      term = l_92108;
      term = termFactory.makeTuple(j_92108, term);
      term = i_92108.invoke(context, term, lifted21651.instance);
      if(term == null)
        break Fail76306;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}