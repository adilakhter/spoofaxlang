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

@SuppressWarnings("all") public class fold_$Declare$Cookie_1_0 extends Strategy 
{ 
  public static fold_$Declare$Cookie_1_0 instance = new fold_$Declare$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DeclareCookie_1_0");
    Fail22153:
    { 
      IStrategoTerm term12067 = term;
      Success11937:
      { 
        Fail22154:
        { 
          IStrategoTerm q_4317 = null;
          IStrategoTerm u_4317 = null;
          IStrategoTerm w_4317 = null;
          q_4317 = term;
          w_4317 = term;
          Success11938:
          { 
            Fail22155:
            { 
              IStrategoTerm y_4317 = null;
              y_4317 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, y_4317, trans.const4358, q_4317);
              if(term == null)
                break Fail22155;
              if(true)
                break Success11938;
            }
            term = trans.constNil3;
          }
          u_4317 = term;
          term = w_4317;
          term = termFactory.makeTuple(u_4317, term);
          term = k_4345.invoke(context, term, lifted6779.instance);
          if(term == null)
            break Fail22154;
          if(true)
            break Success11937;
        }
        term = term12067;
        IStrategoTerm c_4317 = null;
        IStrategoTerm g_4317 = null;
        IStrategoTerm i_4317 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22153;
        c_4317 = term.getSubterm(0);
        i_4317 = term;
        Success11939:
        { 
          Fail22156:
          { 
            IStrategoTerm j_4317 = null;
            IStrategoTerm l_4317 = null;
            IStrategoTerm m_4317 = null;
            l_4317 = term;
            j_4317 = trans.const4358;
            m_4317 = l_4317;
            term = termFactory.annotateTerm(termFactory.makeTuple(c_4317, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_rule_0_2.instance.invoke(context, m_4317, j_4317, term);
            if(term == null)
              break Fail22156;
            if(true)
              break Success11939;
          }
          term = trans.constNil3;
        }
        g_4317 = term;
        term = i_4317;
        term = termFactory.makeTuple(g_4317, term);
        term = k_4345.invoke(context, term, lifted6780.instance);
        if(term == null)
          break Fail22153;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}