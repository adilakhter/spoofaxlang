package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24780 extends Strategy 
{ 
  public static final lifted24780 instance = new lifted24780();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87852:
    { 
      IStrategoTerm n_17583 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87852;
      n_17583 = term.getSubterm(0);
      IStrategoTerm arg30022 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, n_17583, arg30022);
      if(term == null)
        break Fail87852;
      if(true)
        return term;
    }
    return null;
  }
}