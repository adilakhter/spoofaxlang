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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4889, IStrategoTerm t_4889)
  { 
    Fail23737:
    { 
      IStrategoTerm u_4889 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23737;
      IStrategoTerm arg8452 = term.getSubterm(0);
      if(arg8452.getTermType() != IStrategoTerm.STRING || !"-802723".equals(((IStrategoString)arg8452).stringValue()))
        break Fail23737;
      u_4889 = term.getSubterm(1);
      term = u_4889;
      if(true)
        return term;
    }
    context.push("aux_OuterCookie_0_2");
    context.popOnFailure();
    return null;
  }
}