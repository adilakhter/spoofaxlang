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

@SuppressWarnings("all") public class continue_to_label_$Decorated$Ast_0_1 extends Strategy 
{ 
  public static continue_to_label_$Decorated$Ast_0_1 instance = new continue_to_label_$Decorated$Ast_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_4846)
  { 
    context.push("continue_to_label_DecoratedAst_0_1");
    Fail23482:
    { 
      IStrategoTerm k_4846 = null;
      k_4846 = term;
      term = dr_continue_0_2.instance.invoke(context, k_4846, trans.const4565, i_4846);
      if(term == null)
        break Fail23482;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}