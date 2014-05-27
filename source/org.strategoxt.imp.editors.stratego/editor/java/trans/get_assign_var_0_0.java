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

@SuppressWarnings("all") public class get_assign_var_0_0 extends Strategy 
{ 
  public static get_assign_var_0_0 instance = new get_assign_var_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail21858:
    { 
      IStrategoTerm term11966 = term;
      IStrategoConstructor cons556 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11838:
      { 
        if(cons556 == Main._consAssign_2)
        { 
          Fail21859:
          { 
            IStrategoTerm q_4269 = null;
            q_4269 = term.getSubterm(0);
            term = q_4269;
            if(true)
              break Success11838;
          }
          term = term11966;
        }
        if(cons556 == Main._consAM_2)
        { 
          IStrategoTerm r_4269 = null;
          r_4269 = term.getSubterm(1);
          term = r_4269;
        }
        else
        { 
          break Fail21858;
        }
      }
      if(true)
        return term;
    }
    context.push("get_assign_var_0_0");
    context.popOnFailure();
    return null;
  }
}