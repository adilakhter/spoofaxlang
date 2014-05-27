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

@SuppressWarnings("all") final class lifted6815 extends Strategy 
{ 
  public static final lifted6815 instance = new lifted6815();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24092:
    { 
      IStrategoTerm term12300 = term;
      Success12764:
      { 
        Fail24093:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail24093;
          if(true)
            break Success12764;
        }
        term = term12300;
        IStrategoTerm term12301 = term;
        Success12765:
        { 
          Fail24094:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
              break Fail24094;
            if(true)
              break Success12765;
          }
          term = term12301;
          IStrategoTerm term12302 = term;
          Success12766:
          { 
            Fail24095:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
                break Fail24095;
              if(true)
                break Success12766;
            }
            term = term12302;
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail24092;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}