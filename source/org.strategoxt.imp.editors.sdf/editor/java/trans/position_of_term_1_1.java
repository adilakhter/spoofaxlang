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

@SuppressWarnings("all") public class position_of_term_1_1 extends Strategy 
{ 
  public static position_of_term_1_1 instance = new position_of_term_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_92024, IStrategoTerm i_92024)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail75702:
    { 
      IStrategoTerm j_92024 = null;
      IStrategoTerm k_92024 = null;
      IStrategoTerm l_92024 = null;
      IStrategoTerm m_92024 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail75702;
      j_92024 = ((IStrategoList)term).head();
      l_92024 = ((IStrategoList)term).tail();
      Success41451:
      { 
        Fail75703:
        { 
          IStrategoTerm n_92024 = null;
          n_92024 = term;
          term = position_of_term_1_0.instance.invoke(context, j_92024, o_92024);
          if(term == null)
            break Fail75703;
          k_92024 = term;
          term = n_92024;
          { 
            IStrategoList list660;
            list660 = checkListTail(k_92024);
            if(list660 == null)
              break Fail75702;
            term = (IStrategoTerm)termFactory.makeListCons(i_92024, list660);
            m_92024 = term;
            if(true)
              break Success41451;
          }
        }
        IStrategoTerm r_92024 = null;
        r_92024 = l_92024;
        term = inc_0_0.instance.invoke(context, i_92024);
        if(term == null)
          break Fail75702;
        term = this.invoke(context, r_92024, o_92024, term);
        if(term == null)
          break Fail75702;
        m_92024 = term;
      }
      term = m_92024;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}