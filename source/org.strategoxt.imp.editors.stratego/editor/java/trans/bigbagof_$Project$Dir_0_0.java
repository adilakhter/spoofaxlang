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

@SuppressWarnings("all") public class bigbagof_$Project$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Project$Dir_0_0 instance = new bigbagof_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ProjectDir_0_0");
    Fail23392:
    { 
      TermReference s_4831 = new TermReference();
      if(s_4831.value == null)
        s_4831.value = term;
      else
        if(s_4831.value != term && !s_4831.value.match(term))
          break Fail23392;
      Success12577:
      { 
        Fail23393:
        { 
          IStrategoTerm v_4831 = null;
          IStrategoTerm x_4831 = null;
          IStrategoTerm y_4831 = null;
          x_4831 = term;
          v_4831 = trans.const4475;
          y_4831 = x_4831;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4831, v_4831, trans.constCons2047);
          if(term == null)
            break Fail23393;
          if(true)
            break Success12577;
        }
        term = trans.constNil4;
      }
      lifted6971 lifted69710 = new lifted6971();
      lifted69710.s_4831 = s_4831;
      term = filter_1_0.instance.invoke(context, term, lifted69710);
      if(term == null)
        break Fail23392;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}