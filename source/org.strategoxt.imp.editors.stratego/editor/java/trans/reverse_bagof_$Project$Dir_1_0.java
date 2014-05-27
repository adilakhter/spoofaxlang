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

@SuppressWarnings("all") public class reverse_bagof_$Project$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Project$Dir_1_0 instance = new reverse_bagof_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4278)
  { 
    context.push("reverse_bagof_ProjectDir_1_0");
    Fail21919:
    { 
      TermReference s_4278 = new TermReference();
      if(s_4278.value == null)
        s_4278.value = term;
      else
        if(s_4278.value != term && !s_4278.value.match(term))
          break Fail21919;
      Success11869:
      { 
        Fail21920:
        { 
          IStrategoTerm w_4278 = null;
          IStrategoTerm y_4278 = null;
          IStrategoTerm z_4278 = null;
          y_4278 = term;
          w_4278 = trans.const4265;
          z_4278 = y_4278;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4278, w_4278, trans.constCons1966);
          if(term == null)
            break Fail21920;
          if(true)
            break Success11869;
        }
        term = trans.constNil3;
      }
      lifted6702 lifted67020 = new lifted6702();
      lifted67020.s_4278 = s_4278;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67020, u_4278);
      if(term == null)
        break Fail21919;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}