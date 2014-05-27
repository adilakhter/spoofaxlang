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

@SuppressWarnings("all") public class aux_$Warn$Analysis_0_2 extends Strategy 
{ 
  public static aux_$Warn$Analysis_0_2 instance = new aux_$Warn$Analysis_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_4854, IStrategoTerm z_4854)
  { 
    Fail23530:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"-504485".equals(((IStrategoString)term).stringValue()))
        break Fail23530;
      term = y_4854;
      if(true)
        return term;
    }
    context.push("aux_WarnAnalysis_0_2");
    context.popOnFailure();
    return null;
  }
}