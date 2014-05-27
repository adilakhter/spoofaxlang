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
    Fail23496:
    { 
      TermReference q_4848 = new TermReference();
      if(q_4848.value == null)
        q_4848.value = term;
      else
        if(q_4848.value != term && !q_4848.value.match(term))
          break Fail23496;
      Success12605:
      { 
        Fail23497:
        { 
          IStrategoTerm t_4848 = null;
          IStrategoTerm v_4848 = null;
          IStrategoTerm w_4848 = null;
          v_4848 = term;
          t_4848 = trans.const4565;
          w_4848 = v_4848;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4848, t_4848, trans.constCons2047);
          if(term == null)
            break Fail23497;
          if(true)
            break Success12605;
        }
        term = trans.constNil4;
      }
      lifted7007 lifted70070 = new lifted7007();
      lifted70070.q_4848 = q_4848;
      term = filter_1_0.instance.invoke(context, term, lifted70070);
      if(term == null)
        break Fail23496;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}