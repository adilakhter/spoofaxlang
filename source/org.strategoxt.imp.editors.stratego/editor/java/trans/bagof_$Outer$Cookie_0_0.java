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

@SuppressWarnings("all") public class bagof_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static bagof_$Outer$Cookie_0_0 instance = new bagof_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_OuterCookie_0_0");
    Fail22258:
    { 
      TermReference o_4335 = new TermReference();
      TermReference p_4335 = new TermReference();
      if(p_4335.value == null)
        p_4335.value = term;
      else
        if(p_4335.value != term && !p_4335.value.match(term))
          break Fail22258;
      if(o_4335.value == null)
        o_4335.value = term;
      else
        if(o_4335.value != term && !o_4335.value.match(term))
          break Fail22258;
      Success11978:
      { 
        Fail22259:
        { 
          IStrategoTerm t_4335 = null;
          t_4335 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4335, trans.const4394, p_4335.value);
          if(term == null)
            break Fail22259;
          if(true)
            break Success11978;
        }
        term = trans.constNil3;
      }
      lifted6821 lifted68210 = new lifted6821();
      lifted68210.o_4335 = o_4335;
      lifted68210.p_4335 = p_4335;
      term = filter_1_0.instance.invoke(context, term, lifted68210);
      if(term == null)
        break Fail22258;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}