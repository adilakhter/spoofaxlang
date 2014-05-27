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

@SuppressWarnings("all") public class position_of_term_1_1 extends Strategy 
{ 
  public static position_of_term_1_1 instance = new position_of_term_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4206, IStrategoTerm x_4205)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail21482:
    { 
      IStrategoTerm y_4205 = null;
      IStrategoTerm z_4205 = null;
      IStrategoTerm a_4206 = null;
      IStrategoTerm b_4206 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail21482;
      y_4205 = ((IStrategoList)term).head();
      a_4206 = ((IStrategoList)term).tail();
      Success11528:
      { 
        Fail21483:
        { 
          IStrategoTerm c_4206 = null;
          c_4206 = term;
          term = position_of_term_1_0.instance.invoke(context, y_4205, d_4206);
          if(term == null)
            break Fail21483;
          z_4205 = term;
          term = c_4206;
          { 
            IStrategoList list184;
            list184 = checkListTail(z_4205);
            if(list184 == null)
              break Fail21482;
            term = (IStrategoTerm)termFactory.makeListCons(x_4205, list184);
            b_4206 = term;
            if(true)
              break Success11528;
          }
        }
        IStrategoTerm g_4206 = null;
        g_4206 = a_4206;
        term = inc_0_0.instance.invoke(context, x_4205);
        if(term == null)
          break Fail21482;
        term = this.invoke(context, g_4206, d_4206, term);
        if(term == null)
          break Fail21482;
        b_4206 = term;
      }
      term = b_4206;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}