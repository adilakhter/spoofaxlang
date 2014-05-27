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

@SuppressWarnings("all") public class chain_$Project$Dir_0_0 extends Strategy 
{ 
  public static chain_$Project$Dir_0_0 instance = new chain_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ProjectDir_0_0");
    Fail76179:
    { 
      IStrategoTerm l_92087 = null;
      IStrategoTerm n_92087 = null;
      n_92087 = term;
      Success41823:
      { 
        Fail76180:
        { 
          IStrategoTerm o_92087 = null;
          IStrategoTerm q_92087 = null;
          IStrategoTerm r_92087 = null;
          q_92087 = term;
          o_92087 = trans.const15517;
          r_92087 = q_92087;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_92087, o_92087, trans.constCons7205);
          if(term == null)
            break Fail76180;
          if(true)
            break Success41823;
        }
        term = trans.constNil11;
      }
      l_92087 = term;
      term = n_92087;
      term = termFactory.makeTuple(l_92087, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21608.instance);
      if(term == null)
        break Fail76179;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}