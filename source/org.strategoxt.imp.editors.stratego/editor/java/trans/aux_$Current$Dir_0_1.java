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

@SuppressWarnings("all") public class aux_$Current$Dir_0_1 extends Strategy 
{ 
  public static aux_$Current$Dir_0_1 instance = new aux_$Current$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_4310)
  { 
    Fail22106:
    { 
      IStrategoTerm i_4310 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22106;
      IStrategoTerm arg7927 = term.getSubterm(0);
      if(arg7927.getTermType() != IStrategoTerm.STRING || !"-237042".equals(((IStrategoString)arg7927).stringValue()))
        break Fail22106;
      i_4310 = term.getSubterm(1);
      term = i_4310;
      if(true)
        return term;
    }
    context.push("aux_CurrentDir_0_1");
    context.popOnFailure();
    return null;
  }
}