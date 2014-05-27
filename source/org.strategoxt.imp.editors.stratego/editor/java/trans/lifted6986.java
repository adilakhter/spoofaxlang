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

@SuppressWarnings("all") final class lifted6986 extends Strategy 
{ 
  public static final lifted6986 instance = new lifted6986();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23915:
    { 
      IStrategoTerm a_4839 = null;
      IStrategoTerm j_4839 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23915;
      j_4839 = term.getSubterm(0);
      IStrategoTerm arg8368 = term.getSubterm(1);
      a_4839 = arg8368;
      term = aux_$Is$Imported_0_2.instance.invoke(context, j_4839, arg8368, a_4839);
      if(term == null)
        break Fail23915;
      if(true)
        return term;
    }
    return null;
  }
}