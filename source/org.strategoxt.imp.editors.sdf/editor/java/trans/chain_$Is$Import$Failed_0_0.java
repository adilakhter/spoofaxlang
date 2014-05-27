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

@SuppressWarnings("all") public class chain_$Is$Import$Failed_0_0 extends Strategy 
{ 
  public static chain_$Is$Import$Failed_0_0 instance = new chain_$Is$Import$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsImportFailed_0_0");
    Fail76231:
    { 
      IStrategoTerm h_92096 = null;
      IStrategoTerm j_92096 = null;
      j_92096 = term;
      Success41837:
      { 
        Fail76232:
        { 
          IStrategoTerm k_92096 = null;
          IStrategoTerm m_92096 = null;
          IStrategoTerm n_92096 = null;
          m_92096 = term;
          k_92096 = trans.const15520;
          n_92096 = m_92096;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_92096, k_92096, trans.constCons7205);
          if(term == null)
            break Fail76232;
          if(true)
            break Success41837;
        }
        term = trans.constNil11;
      }
      h_92096 = term;
      term = j_92096;
      term = termFactory.makeTuple(h_92096, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21626.instance);
      if(term == null)
        break Fail76231;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}