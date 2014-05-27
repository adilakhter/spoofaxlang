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

@SuppressWarnings("all") public class bigbagof_$Project$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Project$Dir_0_0 instance = new bigbagof_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ProjectDir_0_0");
    Fail76181:
    { 
      TermReference u_92087 = new TermReference();
      if(u_92087.value == null)
        u_92087.value = term;
      else
        if(u_92087.value != term && !u_92087.value.match(term))
          break Fail76181;
      Success41824:
      { 
        Fail76182:
        { 
          IStrategoTerm x_92087 = null;
          IStrategoTerm z_92087 = null;
          IStrategoTerm a_92088 = null;
          z_92087 = term;
          x_92087 = trans.const15517;
          a_92088 = z_92087;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_92088, x_92087, trans.constCons7205);
          if(term == null)
            break Fail76182;
          if(true)
            break Success41824;
        }
        term = trans.constNil11;
      }
      lifted21609 lifted216090 = new lifted21609();
      lifted216090.u_92087 = u_92087;
      term = filter_1_0.instance.invoke(context, term, lifted216090);
      if(term == null)
        break Fail76181;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}