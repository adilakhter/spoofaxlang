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

@SuppressWarnings("all") public class insert_at_index_0_2 extends Strategy 
{ 
  public static insert_at_index_0_2 instance = new insert_at_index_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_4898, IStrategoTerm m_4898)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("insert_at_index_0_2");
    Fail22750:
    { 
      IStrategoTerm term12144 = term;
      Success12143:
      { 
        Fail22751:
        { 
          IStrategoTerm u_4721 = null;
          IStrategoTerm x_4721 = null;
          u_4721 = term;
          term = m_4898;
          IStrategoTerm term12145 = term;
          Success12144:
          { 
            Fail22752:
            { 
              term = is_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22752;
              { 
                if(true)
                  break Fail22751;
                if(true)
                  break Success12144;
              }
            }
            term = term12145;
          }
          x_4721 = u_4721;
          term = (IStrategoTerm)termFactory.makeListCons(m_4898, (IStrategoList)trans.constNil4);
          term = this.invoke(context, x_4721, l_4898, term);
          if(term == null)
            break Fail22751;
          if(true)
            break Success12143;
        }
        term = term12144;
        IStrategoTerm n_4721 = null;
        IStrategoTerm o_4721 = null;
        IStrategoTerm p_4721 = null;
        n_4721 = term;
        term = split_at_0_1.instance.invoke(context, n_4721, l_4898);
        if(term == null)
          break Fail22750;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22750;
        o_4721 = term.getSubterm(0);
        p_4721 = term.getSubterm(1);
        term = (IStrategoTerm)termFactory.makeListCons(o_4721, termFactory.makeListCons(m_4898, termFactory.makeListCons(p_4721, (IStrategoList)trans.constNil4)));
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22750;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}