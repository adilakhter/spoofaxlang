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

@SuppressWarnings("all") public class is_non_terminal_0_0 extends Strategy 
{ 
  public static is_non_terminal_0_0 instance = new is_non_terminal_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_non_terminal_0_0");
    Fail76077:
    { 
      IStrategoTerm term41869 = term;
      IStrategoConstructor cons1791 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41789:
      { 
        if(cons1791 == Main._conssort_1)
        { 
          Fail76078:
          { 
            if(true)
              break Success41789;
          }
          term = term41869;
        }
        Success41790:
        { 
          if(cons1791 == Main._consopt_1)
          { 
            Fail76079:
            { 
              if(true)
                break Success41790;
            }
            term = term41869;
          }
          term = is_iter_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76077;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}