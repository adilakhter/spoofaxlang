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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4188)
  { 
    context.push("is_endangered_name_0_1");
    Fail21377:
    { 
      IStrategoTerm c_4188 = null;
      IStrategoTerm d_4188 = null;
      IStrategoTerm e_4188 = null;
      IStrategoTerm f_4188 = null;
      c_4188 = term;
      term = b_4188;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail21377;
      IStrategoTerm arg7663 = ((IStrategoList)term).head();
      if(arg7663.getTermType() != IStrategoTerm.TUPLE || arg7663.getSubtermCount() != 2)
        break Fail21377;
      d_4188 = arg7663.getSubterm(0);
      e_4188 = arg7663.getSubterm(1);
      f_4188 = ((IStrategoList)term).tail();
      term = c_4188;
      IStrategoTerm term11502 = term;
      Success11468:
      { 
        Fail21378:
        { 
          term = is_endangered_name_0_2.instance.invoke(context, term, d_4188, e_4188);
          if(term == null)
            break Fail21378;
          if(true)
            break Success11468;
        }
        term = this.invoke(context, term11502, f_4188);
        if(term == null)
          break Fail21377;
      }
      term = c_4188;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}