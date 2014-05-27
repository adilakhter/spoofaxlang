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

@SuppressWarnings("all") public class bigfold_$Current$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Current$Dir_1_0 instance = new bigfold_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_92090)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentDir_1_0");
    Fail76199:
    { 
      IStrategoTerm k_92090 = null;
      IStrategoTerm m_92090 = null;
      m_92090 = term;
      Success41827:
      { 
        Fail76200:
        { 
          IStrategoTerm n_92090 = null;
          IStrategoTerm p_92090 = null;
          IStrategoTerm q_92090 = null;
          p_92090 = term;
          n_92090 = trans.const15515;
          q_92090 = p_92090;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_92090, n_92090, trans.constCons7205);
          if(term == null)
            break Fail76200;
          if(true)
            break Success41827;
        }
        term = trans.constNil11;
      }
      k_92090 = term;
      term = m_92090;
      term = termFactory.makeTuple(k_92090, term);
      term = j_92090.invoke(context, term, lifted21614.instance);
      if(term == null)
        break Fail76199;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}