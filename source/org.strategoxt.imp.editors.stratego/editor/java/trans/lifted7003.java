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

@SuppressWarnings("all") final class lifted7003 extends Strategy 
{ 
  public static final lifted7003 instance = new lifted7003();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23898:
    { 
      IStrategoTerm h_4847 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23898;
      h_4847 = term.getSubterm(0);
      IStrategoTerm arg8377 = term.getSubterm(1);
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, h_4847, arg8377);
      if(term == null)
        break Fail23898;
      if(true)
        return term;
    }
    return null;
  }
}