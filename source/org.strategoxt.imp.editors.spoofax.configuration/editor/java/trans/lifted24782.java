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

@SuppressWarnings("all") final class lifted24782 extends Strategy 
{ 
  public static final lifted24782 instance = new lifted24782();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87850:
    { 
      IStrategoTerm j_17584 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87850;
      j_17584 = term.getSubterm(0);
      IStrategoTerm arg30024 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, j_17584, arg30024);
      if(term == null)
        break Fail87850;
      if(true)
        return term;
    }
    return null;
  }
}