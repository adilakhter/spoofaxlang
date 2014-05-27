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

@SuppressWarnings("all") public class bigchain_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static bigchain_$Decorated$Ast_0_0 instance = new bigchain_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DecoratedAst_0_0");
    Fail23492:
    { 
      IStrategoTerm w_4847 = null;
      IStrategoTerm y_4847 = null;
      y_4847 = term;
      Success12603:
      { 
        Fail23493:
        { 
          IStrategoTerm z_4847 = null;
          IStrategoTerm b_4848 = null;
          IStrategoTerm c_4848 = null;
          b_4848 = term;
          z_4847 = trans.const4565;
          c_4848 = b_4848;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4848, z_4847, trans.constCons2047);
          if(term == null)
            break Fail23493;
          if(true)
            break Success12603;
        }
        term = trans.constNil4;
      }
      w_4847 = term;
      term = y_4847;
      term = termFactory.makeTuple(w_4847, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7005.instance);
      if(term == null)
        break Fail23492;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}