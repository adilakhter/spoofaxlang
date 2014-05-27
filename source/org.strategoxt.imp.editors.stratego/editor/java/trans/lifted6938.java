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

@SuppressWarnings("all") final class lifted6938 extends Strategy 
{ 
  public static final lifted6938 instance = new lifted6938();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23958:
    { 
      IStrategoTerm term12643 = term;
      Success12712:
      { 
        Fail23959:
        { 
          IStrategoTerm term12644 = term;
          IStrategoConstructor cons603 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success12713:
          { 
            if(cons603 == Main._consRootApp_1)
            { 
              Fail23960:
              { 
                if(true)
                  break Success12713;
              }
              term = term12644;
            }
            if(cons603 == Main._consApp_2)
            { }
            else
            { 
              break Fail23959;
            }
          }
          { 
            if(true)
              break Fail23958;
            if(true)
              break Success12712;
          }
        }
        term = term12643;
      }
      if(true)
        return term;
    }
    return null;
  }
}