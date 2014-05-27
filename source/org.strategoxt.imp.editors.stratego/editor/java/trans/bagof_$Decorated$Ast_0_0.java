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
    Fail22025:
    { 
      TermReference y_4295 = new TermReference();
      if(y_4295.value == null)
        y_4295.value = term;
      else
        if(y_4295.value != term && !y_4295.value.match(term))
          break Fail22025;
      Success11898:
      { 
        Fail22026:
        { 
          IStrategoTerm b_4296 = null;
          IStrategoTerm d_4296 = null;
          IStrategoTerm e_4296 = null;
          d_4296 = term;
          b_4296 = trans.const4355;
          e_4296 = d_4296;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4296, b_4296, trans.constCons1966);
          if(term == null)
            break Fail22026;
          if(true)
            break Success11898;
        }
        term = trans.constNil3;
      }
      lifted6739 lifted67390 = new lifted6739();
      lifted67390.y_4295 = y_4295;
      term = filter_1_0.instance.invoke(context, term, lifted67390);
      if(term == null)
        break Fail22025;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}