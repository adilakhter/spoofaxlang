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

@SuppressWarnings("all") public class is_iter_0_0 extends Strategy 
{ 
  public static is_iter_0_0 instance = new is_iter_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76080:
    { 
      IStrategoTerm term41871 = term;
      IStrategoConstructor cons1792 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41791:
      { 
        if(cons1792 == Main._consiter_1)
        { 
          Fail76081:
          { 
            if(true)
              break Success41791;
          }
          term = term41871;
        }
        Success41792:
        { 
          if(cons1792 == Main._consiter_star_1)
          { 
            Fail76082:
            { 
              if(true)
                break Success41792;
            }
            term = term41871;
          }
          Success41793:
          { 
            if(cons1792 == Main._consiter_sep_2)
            { 
              Fail76083:
              { 
                if(true)
                  break Success41793;
              }
              term = term41871;
            }
            if(cons1792 == Main._consiter_star_sep_2)
            { }
            else
            { 
              break Fail76080;
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("is_iter_0_0");
    context.popOnFailure();
    return null;
  }
}