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

@SuppressWarnings("all") final class lifted24781 extends Strategy 
{ 
  public static final lifted24781 instance = new lifted24781();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87851:
    { 
      IStrategoTerm y_17583 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87851;
      y_17583 = term.getSubterm(0);
      IStrategoTerm arg30023 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, y_17583, arg30023);
      if(term == null)
        break Fail87851;
      if(true)
        return term;
    }
    return null;
  }
}