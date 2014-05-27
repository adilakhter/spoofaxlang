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

@SuppressWarnings("all") public class bigbagof_$Is$Import$Failed_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Import$Failed_0_0 instance = new bigbagof_$Is$Import$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImportFailed_0_0");
    Fail76233:
    { 
      TermReference q_92096 = new TermReference();
      TermReference r_92096 = new TermReference();
      if(r_92096.value == null)
        r_92096.value = term;
      else
        if(r_92096.value != term && !r_92096.value.match(term))
          break Fail76233;
      if(q_92096.value == null)
        q_92096.value = term;
      else
        if(q_92096.value != term && !q_92096.value.match(term))
          break Fail76233;
      Success41838:
      { 
        Fail76234:
        { 
          IStrategoTerm u_92096 = null;
          IStrategoTerm w_92096 = null;
          IStrategoTerm x_92096 = null;
          w_92096 = term;
          u_92096 = trans.const15520;
          x_92096 = w_92096;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_92096, u_92096, trans.constCons7205);
          if(term == null)
            break Fail76234;
          if(true)
            break Success41838;
        }
        term = trans.constNil11;
      }
      lifted21627 lifted216270 = new lifted21627();
      lifted216270.q_92096 = q_92096;
      lifted216270.r_92096 = r_92096;
      term = filter_1_0.instance.invoke(context, term, lifted216270);
      if(term == null)
        break Fail76233;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}