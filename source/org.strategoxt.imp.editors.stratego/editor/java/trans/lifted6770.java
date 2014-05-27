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

@SuppressWarnings("all") final class lifted6770 extends Strategy 
{ 
  public static final lifted6770 instance = new lifted6770();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22384:
    { 
      IStrategoTerm g_4312 = null;
      IStrategoTerm o_4312 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22384;
      o_4312 = term.getSubterm(0);
      IStrategoTerm arg7930 = term.getSubterm(1);
      g_4312 = arg7930;
      term = aux_$Declaration_0_2.instance.invoke(context, o_4312, arg7930, g_4312);
      if(term == null)
        break Fail22384;
      if(true)
        return term;
    }
    return null;
  }
}