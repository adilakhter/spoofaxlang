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

@SuppressWarnings("all") public class aux_$Source$Dir_0_1 extends Strategy 
{ 
  public static aux_$Source$Dir_0_1 instance = new aux_$Source$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_4292)
  { 
    Fail22002:
    { 
      IStrategoTerm g_4292 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22002;
      IStrategoTerm arg7909 = term.getSubterm(0);
      if(arg7909.getTermType() != IStrategoTerm.STRING || !"1354".equals(((IStrategoString)arg7909).stringValue()))
        break Fail22002;
      g_4292 = term.getSubterm(1);
      term = g_4292;
      if(true)
        return term;
    }
    context.push("aux_SourceDir_0_1");
    context.popOnFailure();
    return null;
  }
}