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

@SuppressWarnings("all") public class aux_$Project$Dir_0_1 extends Strategy 
{ 
  public static aux_$Project$Dir_0_1 instance = new aux_$Project$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_92089)
  { 
    Fail76189:
    { 
      IStrategoTerm j_92089 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76189;
      IStrategoTerm arg26206 = term.getSubterm(0);
      if(arg26206.getTermType() != IStrategoTerm.STRING || !"-231360".equals(((IStrategoString)arg26206).stringValue()))
        break Fail76189;
      j_92089 = term.getSubterm(1);
      term = j_92089;
      if(true)
        return term;
    }
    context.push("aux_ProjectDir_0_1");
    context.popOnFailure();
    return null;
  }
}