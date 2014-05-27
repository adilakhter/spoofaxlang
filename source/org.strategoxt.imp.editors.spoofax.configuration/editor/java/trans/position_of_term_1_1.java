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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4628, IStrategoTerm c_4628)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail22890:
    { 
      IStrategoTerm d_4628 = null;
      IStrategoTerm e_4628 = null;
      IStrategoTerm f_4628 = null;
      IStrategoTerm g_4628 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22890;
      d_4628 = ((IStrategoList)term).head();
      f_4628 = ((IStrategoList)term).tail();
      Success12197:
      { 
        Fail22891:
        { 
          IStrategoTerm h_4628 = null;
          h_4628 = term;
          term = position_of_term_1_0.instance.invoke(context, d_4628, i_4628);
          if(term == null)
            break Fail22891;
          e_4628 = term;
          term = h_4628;
          { 
            IStrategoList list194;
            list194 = checkListTail(e_4628);
            if(list194 == null)
              break Fail22890;
            term = (IStrategoTerm)termFactory.makeListCons(c_4628, list194);
            g_4628 = term;
            if(true)
              break Success12197;
          }
        }
        IStrategoTerm l_4628 = null;
        l_4628 = f_4628;
        term = inc_0_0.instance.invoke(context, c_4628);
        if(term == null)
          break Fail22890;
        term = this.invoke(context, l_4628, i_4628, term);
        if(term == null)
          break Fail22890;
        g_4628 = term;
      }
      term = g_4628;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}