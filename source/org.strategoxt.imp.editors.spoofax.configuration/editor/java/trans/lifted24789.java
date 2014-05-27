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

@SuppressWarnings("all") final class lifted24789 extends Strategy 
{ 
  public static final lifted24789 instance = new lifted24789();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87843:
    { 
      IStrategoTerm l_17587 = null;
      IStrategoTerm u_17587 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87843;
      u_17587 = term.getSubterm(0);
      IStrategoTerm arg30027 = term.getSubterm(1);
      l_17587 = arg30027;
      term = aux_$Is$Imported_0_2.instance.invoke(context, u_17587, arg30027, l_17587);
      if(term == null)
        break Fail87843;
      if(true)
        return term;
    }
    return null;
  }
}