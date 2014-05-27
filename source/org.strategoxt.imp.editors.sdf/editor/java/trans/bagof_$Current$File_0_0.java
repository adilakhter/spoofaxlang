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

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail76134:
    { 
      TermReference k_92080 = new TermReference();
      if(k_92080.value == null)
        k_92080.value = term;
      else
        if(k_92080.value != term && !k_92080.value.match(term))
          break Fail76134;
      Success41812:
      { 
        Fail76135:
        { 
          IStrategoTerm n_92080 = null;
          IStrategoTerm p_92080 = null;
          IStrategoTerm q_92080 = null;
          p_92080 = term;
          n_92080 = trans.const15448;
          q_92080 = p_92080;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_92080, n_92080, trans.constCons7205);
          if(term == null)
            break Fail76135;
          if(true)
            break Success41812;
        }
        term = trans.constNil11;
      }
      lifted21594 lifted215940 = new lifted21594();
      lifted215940.k_92080 = k_92080;
      term = filter_1_0.instance.invoke(context, term, lifted215940);
      if(term == null)
        break Fail76134;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}