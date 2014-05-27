package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class position_of_term_1_1 extends Strategy 
{ 
  public static position_of_term_1_1 instance = new position_of_term_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_17572, IStrategoTerm z_17571)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail87698:
    { 
      IStrategoTerm a_17572 = null;
      IStrategoTerm b_17572 = null;
      IStrategoTerm c_17572 = null;
      IStrategoTerm d_17572 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail87698;
      a_17572 = ((IStrategoList)term).head();
      c_17572 = ((IStrategoList)term).tail();
      Success47284:
      { 
        Fail87699:
        { 
          IStrategoTerm e_17572 = null;
          e_17572 = term;
          term = position_of_term_1_0.instance.invoke(context, a_17572, f_17572);
          if(term == null)
            break Fail87699;
          b_17572 = term;
          term = e_17572;
          { 
            IStrategoList list758;
            list758 = checkListTail(b_17572);
            if(list758 == null)
              break Fail87698;
            term = (IStrategoTerm)termFactory.makeListCons(z_17571, list758);
            d_17572 = term;
            if(true)
              break Success47284;
          }
        }
        IStrategoTerm i_17572 = null;
        i_17572 = c_17572;
        term = inc_0_0.instance.invoke(context, z_17571);
        if(term == null)
          break Fail87698;
        term = this.invoke(context, i_17572, f_17572, term);
        if(term == null)
          break Fail87698;
        d_17572 = term;
      }
      term = d_17572;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}