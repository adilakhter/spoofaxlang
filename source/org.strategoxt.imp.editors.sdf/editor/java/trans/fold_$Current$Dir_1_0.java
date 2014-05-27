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

@SuppressWarnings("all") public class fold_$Current$Dir_1_0 extends Strategy 
{ 
  public static fold_$Current$Dir_1_0 instance = new fold_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_92090)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentDir_1_0");
    Fail76201:
    { 
      IStrategoTerm w_92090 = null;
      IStrategoTerm y_92090 = null;
      y_92090 = term;
      Success41828:
      { 
        Fail76202:
        { 
          IStrategoTerm z_92090 = null;
          IStrategoTerm b_92091 = null;
          IStrategoTerm c_92091 = null;
          b_92091 = term;
          z_92090 = trans.const15515;
          c_92091 = b_92091;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_92091, z_92090, trans.constCons7205);
          if(term == null)
            break Fail76202;
          if(true)
            break Success41828;
        }
        term = trans.constNil11;
      }
      w_92090 = term;
      term = y_92090;
      term = termFactory.makeTuple(w_92090, term);
      term = v_92090.invoke(context, term, lifted21615.instance);
      if(term == null)
        break Fail76201;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}