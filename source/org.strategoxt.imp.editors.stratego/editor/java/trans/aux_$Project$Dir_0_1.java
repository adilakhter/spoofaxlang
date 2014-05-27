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

@SuppressWarnings("all") public class aux_$Project$Dir_0_1 extends Strategy 
{ 
  public static aux_$Project$Dir_0_1 instance = new aux_$Project$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_4833)
  { 
    Fail23400:
    { 
      IStrategoTerm h_4833 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23400;
      IStrategoTerm arg8361 = term.getSubterm(0);
      if(arg8361.getTermType() != IStrategoTerm.STRING || !"-231360".equals(((IStrategoString)arg8361).stringValue()))
        break Fail23400;
      h_4833 = term.getSubterm(1);
      term = h_4833;
      if(true)
        return term;
    }
    context.push("aux_ProjectDir_0_1");
    context.popOnFailure();
    return null;
  }
}