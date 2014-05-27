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

@SuppressWarnings("all") public class throw_$Decorated$Ast_1_1 extends Strategy 
{ 
  public static throw_$Decorated$Ast_1_1 instance = new throw_$Decorated$Ast_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4292, IStrategoTerm m_4292)
  { 
    context.push("throw_DecoratedAst_1_1");
    Fail22005:
    { 
      IStrategoTerm p_4292 = null;
      p_4292 = term;
      term = dr_throw_1_2.instance.invoke(context, p_4292, n_4292, m_4292, trans.const4355);
      if(term == null)
        break Fail22005;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}