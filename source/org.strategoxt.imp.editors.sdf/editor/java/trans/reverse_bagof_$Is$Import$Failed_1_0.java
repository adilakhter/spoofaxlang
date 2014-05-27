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

@SuppressWarnings("all") public class reverse_bagof_$Is$Import$Failed_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Import$Failed_1_0 instance = new reverse_bagof_$Is$Import$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_92097)
  { 
    context.push("reverse_bagof_IsImportFailed_1_0");
    Fail76236:
    { 
      TermReference k_92097 = new TermReference();
      TermReference l_92097 = new TermReference();
      if(l_92097.value == null)
        l_92097.value = term;
      else
        if(l_92097.value != term && !l_92097.value.match(term))
          break Fail76236;
      if(k_92097.value == null)
        k_92097.value = term;
      else
        if(k_92097.value != term && !k_92097.value.match(term))
          break Fail76236;
      Success41839:
      { 
        Fail76237:
        { 
          IStrategoTerm p_92097 = null;
          IStrategoTerm r_92097 = null;
          IStrategoTerm s_92097 = null;
          r_92097 = term;
          p_92097 = trans.const15520;
          s_92097 = r_92097;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_92097, p_92097, trans.constCons7205);
          if(term == null)
            break Fail76237;
          if(true)
            break Success41839;
        }
        term = trans.constNil11;
      }
      lifted21629 lifted216290 = new lifted21629();
      lifted216290.k_92097 = k_92097;
      lifted216290.l_92097 = l_92097;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216290, n_92097);
      if(term == null)
        break Fail76236;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}