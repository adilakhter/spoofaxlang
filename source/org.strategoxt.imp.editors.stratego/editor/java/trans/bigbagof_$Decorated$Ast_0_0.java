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

@SuppressWarnings("all") public class bigbagof_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static bigbagof_$Decorated$Ast_0_0 instance = new bigbagof_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_DecoratedAst_0_0");
    Fail22020:
    { 
      TermReference y_4294 = new TermReference();
      if(y_4294.value == null)
        y_4294.value = term;
      else
        if(y_4294.value != term && !y_4294.value.match(term))
          break Fail22020;
      Success11896:
      { 
        Fail22021:
        { 
          IStrategoTerm b_4295 = null;
          IStrategoTerm d_4295 = null;
          IStrategoTerm e_4295 = null;
          d_4295 = term;
          b_4295 = trans.const4355;
          e_4295 = d_4295;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4295, b_4295, trans.constCons1966);
          if(term == null)
            break Fail22021;
          if(true)
            break Success11896;
        }
        term = trans.constNil3;
      }
      lifted6736 lifted67360 = new lifted6736();
      lifted67360.y_4294 = y_4294;
      term = filter_1_0.instance.invoke(context, term, lifted67360);
      if(term == null)
        break Fail22020;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}