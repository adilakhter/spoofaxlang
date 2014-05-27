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

@SuppressWarnings("all") public class bigfold_$Declare$Cookie_1_0 extends Strategy 
{ 
  public static bigfold_$Declare$Cookie_1_0 instance = new bigfold_$Declare$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DeclareCookie_1_0");
    Fail22149:
    { 
      IStrategoTerm term12064 = term;
      Success11934:
      { 
        Fail22150:
        { 
          IStrategoTerm q_4316 = null;
          IStrategoTerm u_4316 = null;
          IStrategoTerm w_4316 = null;
          q_4316 = term;
          w_4316 = term;
          Success11935:
          { 
            Fail22151:
            { 
              IStrategoTerm y_4316 = null;
              y_4316 = term;
              term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4316, trans.const4358, q_4316);
              if(term == null)
                break Fail22151;
              if(true)
                break Success11935;
            }
            term = trans.constNil3;
          }
          u_4316 = term;
          term = w_4316;
          term = termFactory.makeTuple(u_4316, term);
          term = j_4345.invoke(context, term, lifted6777.instance);
          if(term == null)
            break Fail22150;
          if(true)
            break Success11934;
        }
        term = term12064;
        IStrategoTerm c_4316 = null;
        IStrategoTerm g_4316 = null;
        IStrategoTerm i_4316 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22149;
        c_4316 = term.getSubterm(0);
        i_4316 = term;
        Success11936:
        { 
          Fail22152:
          { 
            IStrategoTerm j_4316 = null;
            IStrategoTerm l_4316 = null;
            IStrategoTerm m_4316 = null;
            l_4316 = term;
            j_4316 = trans.const4358;
            m_4316 = l_4316;
            term = termFactory.annotateTerm(termFactory.makeTuple(c_4316, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4316, j_4316, term);
            if(term == null)
              break Fail22152;
            if(true)
              break Success11936;
          }
          term = trans.constNil3;
        }
        g_4316 = term;
        term = i_4316;
        term = termFactory.makeTuple(g_4316, term);
        term = j_4345.invoke(context, term, lifted6778.instance);
        if(term == null)
          break Fail22149;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}