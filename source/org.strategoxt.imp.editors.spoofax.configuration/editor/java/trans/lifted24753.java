package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24753 extends Strategy 
{ 
  public static final lifted24753 instance = new lifted24753();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87873:
    { 
      IStrategoTerm term47301 = term;
      Success47319:
      { 
        Fail87874:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail87874;
          if(true)
            break Success47319;
        }
        term = term47301;
        IStrategoTerm term47302 = term;
        Success47320:
        { 
          Fail87875:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
              break Fail87875;
            if(true)
              break Success47320;
          }
          term = term47302;
          IStrategoTerm term47303 = term;
          Success47321:
          { 
            Fail87876:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
                break Fail87876;
              if(true)
                break Success47321;
            }
            term = term47303;
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail87873;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}