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

@SuppressWarnings("all") final class lifted6762 extends Strategy 
{ 
  public static final lifted6762 instance = new lifted6762();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24178:
    { 
      IStrategoTerm z_4732 = null;
      z_4732 = term;
      IStrategoTerm term12175 = term;
      Success12817:
      { 
        Fail24179:
        { 
          IStrategoTerm term12176 = term;
          IStrategoConstructor cons609 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success12818:
          { 
            if(cons609 == Main._consImport_1)
            { 
              Fail24180:
              { 
                if(true)
                  break Success12818;
              }
              term = term12176;
            }
            if(cons609 == Main._consImportWildcard_1)
            { }
            else
            { 
              break Fail24179;
            }
          }
          { 
            if(true)
              break Fail24178;
            if(true)
              break Success12817;
          }
        }
        term = term12175;
      }
      term = declare_globals_0_0.instance.invoke(context, z_4732);
      if(term == null)
        break Fail24178;
      if(true)
        return term;
    }
    return null;
  }
}