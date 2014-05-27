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

@SuppressWarnings("all") public class bigfold_$Is$Import$Failed_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Import$Failed_1_0 instance = new bigfold_$Is$Import$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_92094)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImportFailed_1_0");
    Fail76225:
    { 
      IStrategoTerm t_92094 = null;
      IStrategoTerm v_92094 = null;
      v_92094 = term;
      Success41834:
      { 
        Fail76226:
        { 
          IStrategoTerm w_92094 = null;
          IStrategoTerm y_92094 = null;
          IStrategoTerm z_92094 = null;
          y_92094 = term;
          w_92094 = trans.const15520;
          z_92094 = y_92094;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_92094, w_92094, trans.constCons7205);
          if(term == null)
            break Fail76226;
          if(true)
            break Success41834;
        }
        term = trans.constNil11;
      }
      t_92094 = term;
      term = v_92094;
      term = termFactory.makeTuple(t_92094, term);
      term = s_92094.invoke(context, term, lifted21623.instance);
      if(term == null)
        break Fail76225;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}