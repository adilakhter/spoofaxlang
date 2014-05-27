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

@SuppressWarnings("all") final class lifted7004 extends Strategy 
{ 
  public static final lifted7004 instance = new lifted7004();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23897:
    { 
      IStrategoTerm t_4847 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23897;
      t_4847 = term.getSubterm(0);
      IStrategoTerm arg8378 = term.getSubterm(1);
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, t_4847, arg8378);
      if(term == null)
        break Fail23897;
      if(true)
        return term;
    }
    return null;
  }
}