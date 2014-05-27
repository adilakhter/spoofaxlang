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

@SuppressWarnings("all") final class lifted6911 extends Strategy 
{ 
  public static final lifted6911 instance = new lifted6911();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23996:
    { 
      IStrategoTerm term12529 = term;
      IStrategoConstructor cons607 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12729:
      { 
        if(cons607 == Main._consVar_1)
        { 
          Fail23997:
          { 
            term = declare_var_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23997;
            if(true)
              break Success12729;
          }
          term = term12529;
        }
        Success12730:
        { 
          if(cons607 == Main._consApp_2)
          { 
            Fail23998:
            { 
              if(true)
                break Success12730;
            }
            term = term12529;
          }
          if(cons607 == Main._consRootApp_1)
          { }
          else
          { 
            break Fail23996;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}