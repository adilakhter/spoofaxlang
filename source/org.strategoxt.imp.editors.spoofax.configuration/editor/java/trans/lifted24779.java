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

@SuppressWarnings("all") final class lifted24779 extends Strategy 
{ 
  public static final lifted24779 instance = new lifted24779();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87853:
    { 
      IStrategoTerm b_17583 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87853;
      b_17583 = term.getSubterm(0);
      IStrategoTerm arg30021 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, b_17583, arg30021);
      if(term == null)
        break Fail87853;
      if(true)
        return term;
    }
    return null;
  }
}