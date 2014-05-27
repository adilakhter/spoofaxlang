package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigbagof_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static bigbagof_$Outer$Cookie_0_0 instance = new bigbagof_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_OuterCookie_0_0");
    Fail22253:
    { 
      TermReference r_4334 = new TermReference();
      TermReference s_4334 = new TermReference();
      if(s_4334.value == null)
        s_4334.value = term;
      else
        if(s_4334.value != term && !s_4334.value.match(term))
          break Fail22253;
      if(r_4334.value == null)
        r_4334.value = term;
      else
        if(r_4334.value != term && !r_4334.value.match(term))
          break Fail22253;
      Success11976:
      { 
        Fail22254:
        { 
          IStrategoTerm w_4334 = null;
          w_4334 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4334, trans.const4394, s_4334.value);
          if(term == null)
            break Fail22254;
          if(true)
            break Success11976;
        }
        term = trans.constNil3;
      }
      lifted6818 lifted68180 = new lifted6818();
      lifted68180.r_4334 = r_4334;
      lifted68180.s_4334 = s_4334;
      term = filter_1_0.instance.invoke(context, term, lifted68180);
      if(term == null)
        break Fail22253;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}