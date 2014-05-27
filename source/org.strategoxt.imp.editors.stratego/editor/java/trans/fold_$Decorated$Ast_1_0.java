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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4847)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DecoratedAst_1_0");
    Fail23490:
    { 
      IStrategoTerm l_4847 = null;
      IStrategoTerm n_4847 = null;
      n_4847 = term;
      Success12602:
      { 
        Fail23491:
        { 
          IStrategoTerm o_4847 = null;
          IStrategoTerm q_4847 = null;
          IStrategoTerm r_4847 = null;
          q_4847 = term;
          o_4847 = trans.const4565;
          r_4847 = q_4847;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4847, o_4847, trans.constCons2047);
          if(term == null)
            break Fail23491;
          if(true)
            break Success12602;
        }
        term = trans.constNil4;
      }
      l_4847 = term;
      term = n_4847;
      term = termFactory.makeTuple(l_4847, term);
      term = k_4847.invoke(context, term, lifted7004.instance);
      if(term == null)
        break Fail23490;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}