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

@SuppressWarnings("all") final class lifted6941 extends Strategy 
{ 
  public static final lifted6941 instance = new lifted6941();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23948:
    { 
      IStrategoTerm term12651 = term;
      Success12705:
      { 
        Fail23949:
        { 
          IStrategoTerm term12652 = term;
          IStrategoConstructor cons601 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success12706:
          { 
            if(cons601 == Main._consRootApp_1)
            { 
              Fail23950:
              { 
                if(true)
                  break Success12706;
              }
              term = term12652;
            }
            if(cons601 == Main._consApp_2)
            { }
            else
            { 
              break Fail23949;
            }
          }
          { 
            if(true)
              break Fail23948;
            if(true)
              break Success12705;
          }
        }
        term = term12651;
      }
      if(true)
        return term;
    }
    return null;
  }
}