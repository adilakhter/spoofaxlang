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
    Fail23334:
    { 
      IStrategoTerm term12675 = term;
      IStrategoConstructor cons600 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12547:
      { 
        if(cons600 == Main._consAssign_2)
        { 
          Fail23335:
          { 
            IStrategoTerm i_4823 = null;
            i_4823 = term.getSubterm(0);
            term = i_4823;
            if(true)
              break Success12547;
          }
          term = term12675;
        }
        if(cons600 == Main._consAM_2)
        { 
          IStrategoTerm j_4823 = null;
          j_4823 = term.getSubterm(1);
          term = j_4823;
        }
        else
        { 
          break Fail23334;
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