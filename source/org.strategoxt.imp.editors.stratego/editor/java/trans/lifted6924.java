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

@SuppressWarnings("all") final class lifted6924 extends Strategy 
{ 
  public static final lifted6924 instance = new lifted6924();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23982:
    { 
      IStrategoTerm term12548 = term;
      IStrategoConstructor cons606 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12725:
      { 
        if(cons606 == Main._consRootApp_1)
        { 
          Fail23983:
          { 
            if(true)
              break Success12725;
          }
          term = term12548;
        }
        if(cons606 == Main._consApp_2)
        { }
        else
        { 
          break Fail23982;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}