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

@SuppressWarnings("all") public class fold_$Project$Dir_1_0 extends Strategy 
{ 
  public static fold_$Project$Dir_1_0 instance = new fold_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_92086)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ProjectDir_1_0");
    Fail76175:
    { 
      IStrategoTerm p_92086 = null;
      IStrategoTerm r_92086 = null;
      r_92086 = term;
      Success41821:
      { 
        Fail76176:
        { 
          IStrategoTerm s_92086 = null;
          IStrategoTerm u_92086 = null;
          IStrategoTerm v_92086 = null;
          u_92086 = term;
          s_92086 = trans.const15517;
          v_92086 = u_92086;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_92086, s_92086, trans.constCons7205);
          if(term == null)
            break Fail76176;
          if(true)
            break Success41821;
        }
        term = trans.constNil11;
      }
      p_92086 = term;
      term = r_92086;
      term = termFactory.makeTuple(p_92086, term);
      term = o_92086.invoke(context, term, lifted21606.instance);
      if(term == null)
        break Fail76175;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}