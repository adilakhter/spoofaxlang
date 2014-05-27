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

@SuppressWarnings("all") public class reverse_bagof_$Project$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Project$Dir_1_0 instance = new reverse_bagof_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_92088)
  { 
    context.push("reverse_bagof_ProjectDir_1_0");
    Fail76184:
    { 
      TermReference m_92088 = new TermReference();
      if(m_92088.value == null)
        m_92088.value = term;
      else
        if(m_92088.value != term && !m_92088.value.match(term))
          break Fail76184;
      Success41825:
      { 
        Fail76185:
        { 
          IStrategoTerm q_92088 = null;
          IStrategoTerm s_92088 = null;
          IStrategoTerm t_92088 = null;
          s_92088 = term;
          q_92088 = trans.const15517;
          t_92088 = s_92088;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_92088, q_92088, trans.constCons7205);
          if(term == null)
            break Fail76185;
          if(true)
            break Success41825;
        }
        term = trans.constNil11;
      }
      lifted21611 lifted216110 = new lifted21611();
      lifted216110.m_92088 = m_92088;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216110, o_92088);
      if(term == null)
        break Fail76184;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}