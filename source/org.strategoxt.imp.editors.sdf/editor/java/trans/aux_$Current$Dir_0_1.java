package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Current$Dir_0_1 extends Strategy 
{ 
  public static aux_$Current$Dir_0_1 instance = new aux_$Current$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_92093)
  { 
    Fail76215:
    { 
      IStrategoTerm q_92093 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76215;
      IStrategoTerm arg26211 = term.getSubterm(0);
      if(arg26211.getTermType() != IStrategoTerm.STRING || !"-237042".equals(((IStrategoString)arg26211).stringValue()))
        break Fail76215;
      q_92093 = term.getSubterm(1);
      term = q_92093;
      if(true)
        return term;
    }
    context.push("aux_CurrentDir_0_1");
    context.popOnFailure();
    return null;
  }
}