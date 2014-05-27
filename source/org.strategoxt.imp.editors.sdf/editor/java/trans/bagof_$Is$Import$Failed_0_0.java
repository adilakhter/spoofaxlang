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

@SuppressWarnings("all") public class bagof_$Is$Import$Failed_0_0 extends Strategy 
{ 
  public static bagof_$Is$Import$Failed_0_0 instance = new bagof_$Is$Import$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImportFailed_0_0");
    Fail76238:
    { 
      TermReference t_92097 = new TermReference();
      TermReference u_92097 = new TermReference();
      if(u_92097.value == null)
        u_92097.value = term;
      else
        if(u_92097.value != term && !u_92097.value.match(term))
          break Fail76238;
      if(t_92097.value == null)
        t_92097.value = term;
      else
        if(t_92097.value != term && !t_92097.value.match(term))
          break Fail76238;
      Success41840:
      { 
        Fail76239:
        { 
          IStrategoTerm x_92097 = null;
          IStrategoTerm z_92097 = null;
          IStrategoTerm a_92098 = null;
          z_92097 = term;
          x_92097 = trans.const15520;
          a_92098 = z_92097;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_92098, x_92097, trans.constCons7205);
          if(term == null)
            break Fail76239;
          if(true)
            break Success41840;
        }
        term = trans.constNil11;
      }
      lifted21630 lifted216300 = new lifted21630();
      lifted216300.t_92097 = t_92097;
      lifted216300.u_92097 = u_92097;
      term = filter_1_0.instance.invoke(context, term, lifted216300);
      if(term == null)
        break Fail76238;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}