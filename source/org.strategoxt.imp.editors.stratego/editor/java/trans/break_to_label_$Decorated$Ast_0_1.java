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

@SuppressWarnings("all") public class break_to_label_$Decorated$Ast_0_1 extends Strategy 
{ 
  public static break_to_label_$Decorated$Ast_0_1 instance = new break_to_label_$Decorated$Ast_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_4846)
  { 
    context.push("break_to_label_DecoratedAst_0_1");
    Fail23485:
    { 
      IStrategoTerm r_4846 = null;
      r_4846 = term;
      term = dr_break_0_2.instance.invoke(context, r_4846, trans.const4565, p_4846);
      if(term == null)
        break Fail23485;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}