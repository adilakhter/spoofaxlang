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

@SuppressWarnings("all") final class lifted6779 extends Strategy 
{ 
  TermReference t_4738;

  TermReference u_4738;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24146:
    { 
      IStrategoTerm term12202 = term;
      Success12798:
      { 
        Fail24147:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail24147;
          if(t_4738.value == null)
            t_4738.value = term.getSubterm(0);
          else
            if(t_4738.value != term.getSubterm(0) && !t_4738.value.match(term.getSubterm(0)))
              break Fail24147;
          if(u_4738.value == null)
            u_4738.value = term.getSubterm(1);
          else
            if(u_4738.value != term.getSubterm(1) && !u_4738.value.match(term.getSubterm(1)))
              break Fail24147;
          { 
            if(true)
              break Fail24146;
            if(true)
              break Success12798;
          }
        }
        term = term12202;
      }
      if(true)
        return term;
    }
    return null;
  }
}