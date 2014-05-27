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

@SuppressWarnings("all") final class lifted24788 extends Strategy 
{ 
  public static final lifted24788 instance = new lifted24788();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87844:
    { 
      IStrategoTerm z_17586 = null;
      IStrategoTerm i_17587 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87844;
      i_17587 = term.getSubterm(0);
      IStrategoTerm arg30026 = term.getSubterm(1);
      z_17586 = arg30026;
      term = aux_$Is$Imported_0_2.instance.invoke(context, i_17587, arg30026, z_17586);
      if(term == null)
        break Fail87844;
      if(true)
        return term;
    }
    return null;
  }
}