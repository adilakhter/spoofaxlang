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

@SuppressWarnings("all") public class bagof_$Project$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Project$Dir_0_0 instance = new bagof_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ProjectDir_0_0");
    Fail76186:
    { 
      TermReference u_92088 = new TermReference();
      if(u_92088.value == null)
        u_92088.value = term;
      else
        if(u_92088.value != term && !u_92088.value.match(term))
          break Fail76186;
      Success41826:
      { 
        Fail76187:
        { 
          IStrategoTerm x_92088 = null;
          IStrategoTerm z_92088 = null;
          IStrategoTerm a_92089 = null;
          z_92088 = term;
          x_92088 = trans.const15517;
          a_92089 = z_92088;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_92089, x_92088, trans.constCons7205);
          if(term == null)
            break Fail76187;
          if(true)
            break Success41826;
        }
        term = trans.constNil11;
      }
      lifted21612 lifted216120 = new lifted21612();
      lifted216120.u_92088 = u_92088;
      term = filter_1_0.instance.invoke(context, term, lifted216120);
      if(term == null)
        break Fail76186;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}