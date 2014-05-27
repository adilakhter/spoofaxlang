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

@SuppressWarnings("all") public class reverse_bagof_$Declare$Cookie_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Declare$Cookie_1_0 instance = new reverse_bagof_$Declare$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("reverse_bagof_DeclareCookie_1_0");
    Fail22171:
    { 
      IStrategoTerm term12080 = term;
      Success11950:
      { 
        Fail22172:
        { 
          TermReference q_4321 = new TermReference();
          TermReference r_4321 = new TermReference();
          if(r_4321.value == null)
            r_4321.value = term;
          else
            if(r_4321.value != term && !r_4321.value.match(term))
              break Fail22172;
          if(q_4321.value == null)
            q_4321.value = term;
          else
            if(q_4321.value != term && !q_4321.value.match(term))
              break Fail22172;
          Success11951:
          { 
            Fail22173:
            { 
              IStrategoTerm w_4321 = null;
              w_4321 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, w_4321, trans.const4358, r_4321.value);
              if(term == null)
                break Fail22173;
              if(true)
                break Success11951;
            }
            term = trans.constNil3;
          }
          lifted6789 lifted67890 = new lifted6789();
          lifted67890.q_4321 = q_4321;
          lifted67890.r_4321 = r_4321;
          term = reverse_filter_2_0.instance.invoke(context, term, lifted67890, l_4345);
          if(term == null)
            break Fail22172;
          if(true)
            break Success11950;
        }
        term = term12080;
        TermReference h_4321 = new TermReference();
        TermReference i_4321 = new TermReference();
        if(h_4321.value == null)
          h_4321.value = term;
        else
          if(h_4321.value != term && !h_4321.value.match(term))
            break Fail22171;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22171;
        if(i_4321.value == null)
          i_4321.value = term.getSubterm(0);
        else
          if(i_4321.value != term.getSubterm(0) && !i_4321.value.match(term.getSubterm(0)))
            break Fail22171;
        Success11952:
        { 
          Fail22174:
          { 
            IStrategoTerm m_4321 = null;
            IStrategoTerm o_4321 = null;
            IStrategoTerm p_4321 = null;
            o_4321 = term;
            m_4321 = trans.const4358;
            term = o_4321;
            p_4321 = o_4321;
            if(i_4321.value == null)
              break Fail22174;
            term = termFactory.annotateTerm(termFactory.makeTuple(i_4321.value, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_rule_0_2.instance.invoke(context, p_4321, m_4321, term);
            if(term == null)
              break Fail22174;
            if(true)
              break Success11952;
          }
          term = trans.constNil3;
        }
        lifted6790 lifted67900 = new lifted6790();
        lifted67900.i_4321 = i_4321;
        lifted67900.h_4321 = h_4321;
        term = reverse_filter_2_0.instance.invoke(context, term, lifted67900, l_4345);
        if(term == null)
          break Fail22171;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}