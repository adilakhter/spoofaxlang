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

@SuppressWarnings("all") public class bigfold_$Decorated$Ast_1_0 extends Strategy 
{ 
  public static bigfold_$Decorated$Ast_1_0 instance = new bigfold_$Decorated$Ast_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4846)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DecoratedAst_1_0");
    Fail23488:
    { 
      IStrategoTerm z_4846 = null;
      IStrategoTerm b_4847 = null;
      b_4847 = term;
      Success12601:
      { 
        Fail23489:
        { 
          IStrategoTerm c_4847 = null;
          IStrategoTerm e_4847 = null;
          IStrategoTerm f_4847 = null;
          e_4847 = term;
          c_4847 = trans.const4565;
          f_4847 = e_4847;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4847, c_4847, trans.constCons2047);
          if(term == null)
            break Fail23489;
          if(true)
            break Success12601;
        }
        term = trans.constNil4;
      }
      z_4846 = term;
      term = b_4847;
      term = termFactory.makeTuple(z_4846, term);
      term = y_4846.invoke(context, term, lifted7003.instance);
      if(term == null)
        break Fail23488;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}