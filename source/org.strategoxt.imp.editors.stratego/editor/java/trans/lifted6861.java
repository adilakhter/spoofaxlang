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

@SuppressWarnings("all") final class lifted6861 extends Strategy 
{ 
  public static final lifted6861 instance = new lifted6861();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24057:
    { 
      IStrategoTerm r_4784 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail24057;
      IStrategoTerm arg8219 = term.getSubterm(0);
      if(arg8219.getTermType() != IStrategoTerm.STRING || !"stratego.include".equals(((IStrategoString)arg8219).stringValue()))
        break Fail24057;
      r_4784 = term.getSubterm(1);
      term = r_4784;
      if(true)
        return term;
    }
    return null;
  }
}