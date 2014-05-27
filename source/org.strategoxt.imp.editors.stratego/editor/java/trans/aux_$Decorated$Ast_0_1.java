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

@SuppressWarnings("all") public class aux_$Decorated$Ast_0_1 extends Strategy 
{ 
  public static aux_$Decorated$Ast_0_1 instance = new aux_$Decorated$Ast_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4296)
  { 
    Fail22028:
    { 
      IStrategoTerm n_4296 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22028;
      IStrategoTerm arg7914 = term.getSubterm(0);
      if(arg7914.getTermType() != IStrategoTerm.STRING || !"-581518".equals(((IStrategoString)arg7914).stringValue()))
        break Fail22028;
      n_4296 = term.getSubterm(1);
      term = n_4296;
      if(true)
        return term;
    }
    context.push("aux_DecoratedAst_0_1");
    context.popOnFailure();
    return null;
  }
}