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

@SuppressWarnings("all") public class fetch_up_with_position_2_1 extends Strategy 
{ 
  public static fetch_up_with_position_2_1 instance = new fetch_up_with_position_2_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4898, Strategy h_4898, IStrategoTerm i_4898)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_up_with_position_2_1");
    Fail22703:
    { 
      IStrategoTerm term12115 = term;
      Success12115:
      { 
        Fail22704:
        { 
          IStrategoTerm p_4714 = null;
          IStrategoTerm q_4714 = null;
          IStrategoTerm s_4714 = null;
          IStrategoTerm t_4714 = null;
          IStrategoTerm x_4714 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22704;
          p_4714 = term.getSubterm(0);
          q_4714 = term.getSubterm(1);
          term = p_4714;
          IStrategoTerm term12116 = term;
          Success12116:
          { 
            Fail22705:
            { 
              term = g_4898.invoke(context, term);
              if(term == null)
                break Fail22705;
              { 
                if(true)
                  break Fail22704;
                if(true)
                  break Success12116;
              }
            }
            term = term12116;
          }
          term = p_4714;
          IStrategoTerm term12117 = term;
          Success12117:
          { 
            Fail22706:
            { 
              term = h_4898.invoke(context, term);
              if(term == null)
                break Fail22706;
              { 
                if(true)
                  break Fail22704;
                if(true)
                  break Success12117;
              }
            }
            term = term12117;
          }
          term = parent_at_position_0_1.instance.invoke(context, i_4898, q_4714);
          if(term == null)
            break Fail22704;
          x_4714 = term;
          term = init_0_0.instance.invoke(context, q_4714);
          if(term == null)
            break Fail22704;
          term = termFactory.makeTuple(x_4714, term);
          term = this.invoke(context, term, g_4898, h_4898, i_4898);
          if(term == null)
            break Fail22704;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22704;
          s_4714 = term.getSubterm(0);
          t_4714 = term.getSubterm(1);
          term = termFactory.makeTuple(s_4714, t_4714);
          if(true)
            break Success12115;
        }
        term = term12115;
        IStrategoTerm j_4714 = null;
        IStrategoTerm k_4714 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22703;
        k_4714 = term.getSubterm(0);
        j_4714 = term.getSubterm(1);
        term = g_4898.invoke(context, k_4714);
        if(term == null)
          break Fail22703;
        term = termFactory.makeTuple(k_4714, j_4714);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}