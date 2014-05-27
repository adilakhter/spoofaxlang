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

@SuppressWarnings("all") final class lifted6716 extends Strategy 
{ 
  public static final lifted6716 instance = new lifted6716();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22438:
    { 
      IStrategoTerm u_4285 = null;
      IStrategoTerm c_4286 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22438;
      c_4286 = term.getSubterm(0);
      IStrategoTerm arg7902 = term.getSubterm(1);
      u_4285 = arg7902;
      term = aux_$Is$Imported_0_2.instance.invoke(context, c_4286, arg7902, u_4285);
      if(term == null)
        break Fail22438;
      if(true)
        return term;
    }
    return null;
  }
}