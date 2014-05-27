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

@SuppressWarnings("all") public class is_endangered_name_0_1 extends Strategy 
{ 
  public static is_endangered_name_0_1 instance = new is_endangered_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4741)
  { 
    context.push("is_endangered_name_0_1");
    Fail22853:
    { 
      IStrategoTerm u_4741 = null;
      IStrategoTerm v_4741 = null;
      IStrategoTerm w_4741 = null;
      IStrategoTerm x_4741 = null;
      u_4741 = term;
      term = t_4741;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22853;
      IStrategoTerm arg8130 = ((IStrategoList)term).head();
      if(arg8130.getTermType() != IStrategoTerm.TUPLE || arg8130.getSubtermCount() != 2)
        break Fail22853;
      v_4741 = arg8130.getSubterm(0);
      w_4741 = arg8130.getSubterm(1);
      x_4741 = ((IStrategoList)term).tail();
      term = u_4741;
      IStrategoTerm term12211 = term;
      Success12177:
      { 
        Fail22854:
        { 
          term = is_endangered_name_0_2.instance.invoke(context, term, v_4741, w_4741);
          if(term == null)
            break Fail22854;
          if(true)
            break Success12177;
        }
        term = this.invoke(context, term12211, x_4741);
        if(term == null)
          break Fail22853;
      }
      term = u_4741;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}