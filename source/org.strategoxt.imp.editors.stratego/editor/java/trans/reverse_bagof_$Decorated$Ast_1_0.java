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

@SuppressWarnings("all") public class reverse_bagof_$Decorated$Ast_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Decorated$Ast_1_0 instance = new reverse_bagof_$Decorated$Ast_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4295)
  { 
    context.push("reverse_bagof_DecoratedAst_1_0");
    Fail22023:
    { 
      TermReference q_4295 = new TermReference();
      if(q_4295.value == null)
        q_4295.value = term;
      else
        if(q_4295.value != term && !q_4295.value.match(term))
          break Fail22023;
      Success11897:
      { 
        Fail22024:
        { 
          IStrategoTerm u_4295 = null;
          IStrategoTerm w_4295 = null;
          IStrategoTerm x_4295 = null;
          w_4295 = term;
          u_4295 = trans.const4355;
          x_4295 = w_4295;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4295, u_4295, trans.constCons1966);
          if(term == null)
            break Fail22024;
          if(true)
            break Success11897;
        }
        term = trans.constNil3;
      }
      lifted6738 lifted67380 = new lifted6738();
      lifted67380.q_4295 = q_4295;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67380, s_4295);
      if(term == null)
        break Fail22023;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}