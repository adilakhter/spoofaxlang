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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4759, IStrategoTerm p_4759)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail22958:
    { 
      IStrategoTerm q_4759 = null;
      IStrategoTerm r_4759 = null;
      IStrategoTerm s_4759 = null;
      IStrategoTerm t_4759 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22958;
      q_4759 = ((IStrategoList)term).head();
      s_4759 = ((IStrategoList)term).tail();
      Success12237:
      { 
        Fail22959:
        { 
          IStrategoTerm u_4759 = null;
          u_4759 = term;
          term = position_of_term_1_0.instance.invoke(context, q_4759, v_4759);
          if(term == null)
            break Fail22959;
          r_4759 = term;
          term = u_4759;
          { 
            IStrategoList list195;
            list195 = checkListTail(r_4759);
            if(list195 == null)
              break Fail22958;
            term = (IStrategoTerm)termFactory.makeListCons(p_4759, list195);
            t_4759 = term;
            if(true)
              break Success12237;
          }
        }
        IStrategoTerm y_4759 = null;
        y_4759 = s_4759;
        term = inc_0_0.instance.invoke(context, p_4759);
        if(term == null)
          break Fail22958;
        term = this.invoke(context, y_4759, v_4759, term);
        if(term == null)
          break Fail22958;
        t_4759 = term;
      }
      term = t_4759;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}