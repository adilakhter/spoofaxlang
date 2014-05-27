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

@SuppressWarnings("all") final class lifted7006 extends Strategy 
{ 
  public static final lifted7006 instance = new lifted7006();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23895:
    { 
      IStrategoTerm p_4848 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23895;
      p_4848 = term.getSubterm(0);
      IStrategoTerm arg8380 = term.getSubterm(1);
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, p_4848, arg8380);
      if(term == null)
        break Fail23895;
      if(true)
        return term;
    }
    return null;
  }
}