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

@SuppressWarnings("all") public class bagof_$Project$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Project$Dir_0_0 instance = new bagof_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ProjectDir_0_0");
    Fail21921:
    { 
      TermReference a_4279 = new TermReference();
      if(a_4279.value == null)
        a_4279.value = term;
      else
        if(a_4279.value != term && !a_4279.value.match(term))
          break Fail21921;
      Success11870:
      { 
        Fail21922:
        { 
          IStrategoTerm d_4279 = null;
          IStrategoTerm f_4279 = null;
          IStrategoTerm g_4279 = null;
          f_4279 = term;
          d_4279 = trans.const4265;
          g_4279 = f_4279;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4279, d_4279, trans.constCons1966);
          if(term == null)
            break Fail21922;
          if(true)
            break Success11870;
        }
        term = trans.constNil3;
      }
      lifted6703 lifted67030 = new lifted6703();
      lifted67030.a_4279 = a_4279;
      term = filter_1_0.instance.invoke(context, term, lifted67030);
      if(term == null)
        break Fail21921;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}