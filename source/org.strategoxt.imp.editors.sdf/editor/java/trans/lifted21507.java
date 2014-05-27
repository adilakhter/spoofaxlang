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

@SuppressWarnings("all") final class lifted21507 extends Strategy 
{ 
  public static final lifted21507 instance = new lifted21507();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76514:
    { 
      IStrategoTerm term41459 = term;
      Success41930:
      { 
        Fail76515:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail76515;
          if(true)
            break Success41930;
        }
        term = term41459;
        IStrategoTerm term41460 = term;
        Success41931:
        { 
          Fail76516:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
              break Fail76516;
            if(true)
              break Success41931;
          }
          term = term41460;
          IStrategoTerm term41461 = term;
          Success41932:
          { 
            Fail76517:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
                break Fail76517;
              if(true)
                break Success41932;
            }
            term = term41461;
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail76514;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}