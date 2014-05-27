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

@SuppressWarnings("all") final class lifted6819 extends Strategy 
{ 
  Strategy o_4758;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24089:
    { 
      IStrategoTerm m_4758 = null;
      m_4758 = term;
      term = o_4758.invoke(context, term);
      if(term == null)
        break Fail24089;
      IStrategoTerm term12303 = term;
      Success12763:
      { 
        Fail24090:
        { 
          if(term != m_4758 && !m_4758.match(term))
            break Fail24090;
          { 
            if(true)
              break Fail24089;
            if(true)
              break Success12763;
          }
        }
        term = term12303;
      }
      if(true)
        return term;
    }
    return null;
  }
}