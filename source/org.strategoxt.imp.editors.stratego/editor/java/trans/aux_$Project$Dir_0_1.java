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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_4279)
  { 
    Fail21924:
    { 
      IStrategoTerm p_4279 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21924;
      IStrategoTerm arg7894 = term.getSubterm(0);
      if(arg7894.getTermType() != IStrategoTerm.STRING || !"-231360".equals(((IStrategoString)arg7894).stringValue()))
        break Fail21924;
      p_4279 = term.getSubterm(1);
      term = p_4279;
      if(true)
        return term;
    }
    context.push("aux_ProjectDir_0_1");
    context.popOnFailure();
    return null;
  }
}