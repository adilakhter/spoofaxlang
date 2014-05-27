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

@SuppressWarnings("all") final class lifted6757 extends Strategy 
{ 
  public static final lifted6757 instance = new lifted6757();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24182:
    { 
      IStrategoTerm term12174 = term;
      IStrategoConstructor cons610 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12819:
      { 
        if(cons610 == Main._consImport_1)
        { 
          Fail24183:
          { 
            if(true)
              break Success12819;
          }
          term = term12174;
        }
        if(cons610 == Main._consImportWildcard_1)
        { }
        else
        { 
          break Fail24182;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}