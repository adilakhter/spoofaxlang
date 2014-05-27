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

@SuppressWarnings("all") public class aux_$Is$No$Conflict_0_2 extends Strategy 
{ 
  public static aux_$Is$No$Conflict_0_2 instance = new aux_$Is$No$Conflict_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4344, IStrategoTerm l_4344)
  { 
    Fail22313:
    { 
      IStrategoTerm m_4344 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22313;
      IStrategoTerm arg7995 = term.getSubterm(0);
      if(arg7995.getTermType() != IStrategoTerm.STRING || !"17917".equals(((IStrategoString)arg7995).stringValue()))
        break Fail22313;
      m_4344 = term.getSubterm(1);
      term = m_4344;
      if(true)
        return term;
    }
    context.push("aux_IsNoConflict_0_2");
    context.popOnFailure();
    return null;
  }
}