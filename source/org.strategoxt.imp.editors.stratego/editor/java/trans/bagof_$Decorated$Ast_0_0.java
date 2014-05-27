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

@SuppressWarnings("all") public class bagof_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static bagof_$Decorated$Ast_0_0 instance = new bagof_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_DecoratedAst_0_0");
    Fail23501:
    { 
      TermReference q_4849 = new TermReference();
      if(q_4849.value == null)
        q_4849.value = term;
      else
        if(q_4849.value != term && !q_4849.value.match(term))
          break Fail23501;
      Success12607:
      { 
        Fail23502:
        { 
          IStrategoTerm t_4849 = null;
          IStrategoTerm v_4849 = null;
          IStrategoTerm w_4849 = null;
          v_4849 = term;
          t_4849 = trans.const4565;
          w_4849 = v_4849;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4849, t_4849, trans.constCons2047);
          if(term == null)
            break Fail23502;
          if(true)
            break Success12607;
        }
        term = trans.constNil4;
      }
      lifted7010 lifted70100 = new lifted7010();
      lifted70100.q_4849 = q_4849;
      term = filter_1_0.instance.invoke(context, term, lifted70100);
      if(term == null)
        break Fail23501;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}