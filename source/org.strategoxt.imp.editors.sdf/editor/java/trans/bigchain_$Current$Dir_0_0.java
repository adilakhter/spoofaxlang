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

@SuppressWarnings("all") public class bigchain_$Current$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Current$Dir_0_0 instance = new bigchain_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentDir_0_0");
    Fail76203:
    { 
      IStrategoTerm h_92091 = null;
      IStrategoTerm j_92091 = null;
      j_92091 = term;
      Success41829:
      { 
        Fail76204:
        { 
          IStrategoTerm k_92091 = null;
          IStrategoTerm m_92091 = null;
          IStrategoTerm n_92091 = null;
          m_92091 = term;
          k_92091 = trans.const15515;
          n_92091 = m_92091;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, n_92091, k_92091, trans.constCons7205);
          if(term == null)
            break Fail76204;
          if(true)
            break Success41829;
        }
        term = trans.constNil11;
      }
      h_92091 = term;
      term = j_92091;
      term = termFactory.makeTuple(h_92091, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21616.instance);
      if(term == null)
        break Fail76203;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}