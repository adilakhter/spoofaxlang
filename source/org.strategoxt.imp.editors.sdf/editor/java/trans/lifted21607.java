package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21607 extends Strategy 
{ 
  public static final lifted21607 instance = new lifted21607();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76372:
    { 
      IStrategoTerm i_92087 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76372;
      i_92087 = term.getSubterm(0);
      IStrategoTerm arg26204 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, i_92087, arg26204);
      if(term == null)
        break Fail76372;
      if(true)
        return term;
    }
    return null;
  }
}