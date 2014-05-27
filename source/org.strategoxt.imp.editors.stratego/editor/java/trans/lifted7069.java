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

@SuppressWarnings("all") final class lifted7069 extends Strategy 
{ 
  public static final lifted7069 instance = new lifted7069();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23832:
    { 
      IStrategoTerm g_4879 = null;
      IStrategoTerm o_4879 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23832;
      o_4879 = term.getSubterm(0);
      IStrategoTerm arg8439 = term.getSubterm(1);
      g_4879 = arg8439;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, o_4879, arg8439, g_4879);
      if(term == null)
        break Fail23832;
      if(true)
        return term;
    }
    return null;
  }
}