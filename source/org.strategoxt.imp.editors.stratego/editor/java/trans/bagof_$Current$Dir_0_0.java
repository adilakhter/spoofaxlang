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

@SuppressWarnings("all") public class bagof_$Current$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Current$Dir_0_0 instance = new bagof_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentDir_0_0");
    Fail23579:
    { 
      TermReference l_4863 = new TermReference();
      if(l_4863.value == null)
        l_4863.value = term;
      else
        if(l_4863.value != term && !l_4863.value.match(term))
          break Fail23579;
      Success12628:
      { 
        Fail23580:
        { 
          IStrategoTerm o_4863 = null;
          IStrategoTerm q_4863 = null;
          IStrategoTerm r_4863 = null;
          q_4863 = term;
          o_4863 = trans.const4556;
          r_4863 = q_4863;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4863, o_4863, trans.constCons2047);
          if(term == null)
            break Fail23580;
          if(true)
            break Success12628;
        }
        term = trans.constNil4;
      }
      lifted7037 lifted70370 = new lifted7037();
      lifted70370.l_4863 = l_4863;
      term = filter_1_0.instance.invoke(context, term, lifted70370);
      if(term == null)
        break Fail23579;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}