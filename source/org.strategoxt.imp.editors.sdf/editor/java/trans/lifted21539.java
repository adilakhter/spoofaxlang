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

@SuppressWarnings("all") final class lifted21539 extends Strategy 
{ 
  public static final lifted21539 instance = new lifted21539();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76426:
    { 
      IStrategoTerm term41634 = term;
      IStrategoConstructor cons1793 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41867:
      { 
        if(cons1793 == Main._conscf_1)
        { 
          Fail76427:
          { 
            IStrategoTerm a_92046 = null;
            a_92046 = term.getSubterm(0);
            term = a_92046;
            if(true)
              break Success41867;
          }
          term = term41634;
        }
        if(cons1793 == Main._conslex_1)
        { 
          IStrategoTerm b_92046 = null;
          b_92046 = term.getSubterm(0);
          term = b_92046;
        }
        else
        { 
          break Fail76426;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}