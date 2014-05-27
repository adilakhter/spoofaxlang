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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail76129:
    { 
      TermReference k_92079 = new TermReference();
      if(k_92079.value == null)
        k_92079.value = term;
      else
        if(k_92079.value != term && !k_92079.value.match(term))
          break Fail76129;
      Success41810:
      { 
        Fail76130:
        { 
          IStrategoTerm n_92079 = null;
          IStrategoTerm p_92079 = null;
          IStrategoTerm q_92079 = null;
          p_92079 = term;
          n_92079 = trans.const15448;
          q_92079 = p_92079;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_92079, n_92079, trans.constCons7205);
          if(term == null)
            break Fail76130;
          if(true)
            break Success41810;
        }
        term = trans.constNil11;
      }
      lifted21591 lifted215910 = new lifted21591();
      lifted215910.k_92079 = k_92079;
      term = filter_1_0.instance.invoke(context, term, lifted215910);
      if(term == null)
        break Fail76129;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}