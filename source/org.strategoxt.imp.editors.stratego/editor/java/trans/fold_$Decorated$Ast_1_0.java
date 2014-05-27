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

@SuppressWarnings("all") public class fold_$Decorated$Ast_1_0 extends Strategy 
{ 
  public static fold_$Decorated$Ast_1_0 instance = new fold_$Decorated$Ast_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4293)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DecoratedAst_1_0");
    Fail22014:
    { 
      IStrategoTerm t_4293 = null;
      IStrategoTerm v_4293 = null;
      v_4293 = term;
      Success11893:
      { 
        Fail22015:
        { 
          IStrategoTerm w_4293 = null;
          IStrategoTerm y_4293 = null;
          IStrategoTerm z_4293 = null;
          y_4293 = term;
          w_4293 = trans.const4355;
          z_4293 = y_4293;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4293, w_4293, trans.constCons1966);
          if(term == null)
            break Fail22015;
          if(true)
            break Success11893;
        }
        term = trans.constNil3;
      }
      t_4293 = term;
      term = v_4293;
      term = termFactory.makeTuple(t_4293, term);
      term = s_4293.invoke(context, term, lifted6733.instance);
      if(term == null)
        break Fail22014;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}