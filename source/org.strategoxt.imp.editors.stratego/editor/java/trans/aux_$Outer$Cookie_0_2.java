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

@SuppressWarnings("all") public class aux_$Outer$Cookie_0_2 extends Strategy 
{ 
  public static aux_$Outer$Cookie_0_2 instance = new aux_$Outer$Cookie_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_4336, IStrategoTerm b_4336)
  { 
    Fail22261:
    { 
      IStrategoTerm c_4336 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22261;
      IStrategoTerm arg7985 = term.getSubterm(0);
      if(arg7985.getTermType() != IStrategoTerm.STRING || !"-802723".equals(((IStrategoString)arg7985).stringValue()))
        break Fail22261;
      c_4336 = term.getSubterm(1);
      term = c_4336;
      if(true)
        return term;
    }
    context.push("aux_OuterCookie_0_2");
    context.popOnFailure();
    return null;
  }
}