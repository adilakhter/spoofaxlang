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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4850)
  { 
    Fail23504:
    { 
      IStrategoTerm f_4850 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23504;
      IStrategoTerm arg8381 = term.getSubterm(0);
      if(arg8381.getTermType() != IStrategoTerm.STRING || !"-581518".equals(((IStrategoString)arg8381).stringValue()))
        break Fail23504;
      f_4850 = term.getSubterm(1);
      term = f_4850;
      if(true)
        return term;
    }
    context.push("aux_DecoratedAst_0_1");
    context.popOnFailure();
    return null;
  }
}