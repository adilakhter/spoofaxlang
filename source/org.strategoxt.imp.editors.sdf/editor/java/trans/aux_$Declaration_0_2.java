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

@SuppressWarnings("all") public class aux_$Declaration_0_2 extends Strategy 
{ 
  public static aux_$Declaration_0_2 instance = new aux_$Declaration_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_92111, IStrategoTerm g_92111)
  { 
    Fail76293:
    { 
      IStrategoTerm term41935 = term;
      Success41855:
      { 
        Fail76294:
        { 
          IStrategoTerm u_92106 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail76294;
          IStrategoTerm arg26225 = term.getSubterm(0);
          if(arg26225.getTermType() != IStrategoTerm.STRING || !"-415135".equals(((IStrategoString)arg26225).stringValue()))
            break Fail76294;
          u_92106 = term.getSubterm(1);
          term = u_92106;
          if(true)
            break Success41855;
        }
        term = term41935;
        IStrategoTerm q_92106 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail76293;
        IStrategoTerm arg26226 = term.getSubterm(0);
        if(arg26226.getTermType() != IStrategoTerm.STRING || !"130226".equals(((IStrategoString)arg26226).stringValue()))
          break Fail76293;
        q_92106 = term.getSubterm(1);
        term = q_92106;
      }
      if(true)
        return term;
    }
    context.push("aux_Declaration_0_2");
    context.popOnFailure();
    return null;
  }
}