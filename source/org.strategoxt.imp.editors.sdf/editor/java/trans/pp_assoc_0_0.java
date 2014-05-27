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

@SuppressWarnings("all") public class pp_assoc_0_0 extends Strategy 
{ 
  public static pp_assoc_0_0 instance = new pp_assoc_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail75771:
    { 
      IStrategoTerm term41519 = term;
      IStrategoConstructor cons1778 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41505:
      { 
        if(cons1778 == Main._consassoc_0)
        { 
          Fail75772:
          { 
            term = trans.const15494;
            if(true)
              break Success41505;
          }
          term = term41519;
        }
        Success41506:
        { 
          if(cons1778 == Main._consleft_0)
          { 
            Fail75773:
            { 
              term = trans.const15495;
              if(true)
                break Success41506;
            }
            term = term41519;
          }
          Success41507:
          { 
            if(cons1778 == Main._consright_0)
            { 
              Fail75774:
              { 
                term = trans.const15496;
                if(true)
                  break Success41507;
              }
              term = term41519;
            }
            if(cons1778 == Main._consnon_assoc_0)
            { 
              term = trans.const15497;
            }
            else
            { 
              break Fail75771;
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("pp_assoc_0_0");
    context.popOnFailure();
    return null;
  }
}