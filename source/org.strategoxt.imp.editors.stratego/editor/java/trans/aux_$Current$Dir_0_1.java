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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4863)
  { 
    Fail23582:
    { 
      IStrategoTerm a_4864 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23582;
      IStrategoTerm arg8394 = term.getSubterm(0);
      if(arg8394.getTermType() != IStrategoTerm.STRING || !"-237042".equals(((IStrategoString)arg8394).stringValue()))
        break Fail23582;
      a_4864 = term.getSubterm(1);
      term = a_4864;
      if(true)
        return term;
    }
    context.push("aux_CurrentDir_0_1");
    context.popOnFailure();
    return null;
  }
}