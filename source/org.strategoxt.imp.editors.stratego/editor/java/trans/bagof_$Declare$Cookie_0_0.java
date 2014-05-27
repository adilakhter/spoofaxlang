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

@SuppressWarnings("all") public class bagof_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static bagof_$Declare$Cookie_0_0 instance = new bagof_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bagof_DeclareCookie_0_0");
    Fail23651:
    { 
      IStrategoTerm term12792 = term;
      Success12662:
      { 
        Fail23652:
        { 
          TermReference x_4875 = new TermReference();
          TermReference y_4875 = new TermReference();
          if(y_4875.value == null)
            y_4875.value = term;
          else
            if(y_4875.value != term && !y_4875.value.match(term))
              break Fail23652;
          if(x_4875.value == null)
            x_4875.value = term;
          else
            if(x_4875.value != term && !x_4875.value.match(term))
              break Fail23652;
          Success12663:
          { 
            Fail23653:
            { 
              IStrategoTerm c_4876 = null;
              c_4876 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, c_4876, trans.const4568, y_4875.value);
              if(term == null)
                break Fail23653;
              if(true)
                break Success12663;
            }
            term = trans.constNil4;
          }
          lifted7062 lifted70620 = new lifted7062();
          lifted70620.x_4875 = x_4875;
          lifted70620.y_4875 = y_4875;
          term = filter_1_0.instance.invoke(context, term, lifted70620);
          if(term == null)
            break Fail23652;
          if(true)
            break Success12662;
        }
        term = term12792;
        TermReference p_4875 = new TermReference();
        TermReference q_4875 = new TermReference();
        if(p_4875.value == null)
          p_4875.value = term;
        else
          if(p_4875.value != term && !p_4875.value.match(term))
            break Fail23651;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23651;
        if(q_4875.value == null)
          q_4875.value = term.getSubterm(0);
        else
          if(q_4875.value != term.getSubterm(0) && !q_4875.value.match(term.getSubterm(0)))
            break Fail23651;
        Success12664:
        { 
          Fail23654:
          { 
            IStrategoTerm t_4875 = null;
            IStrategoTerm v_4875 = null;
            IStrategoTerm w_4875 = null;
            v_4875 = term;
            t_4875 = trans.const4568;
            term = v_4875;
            w_4875 = v_4875;
            if(q_4875.value == null)
              break Fail23654;
            term = termFactory.annotateTerm(termFactory.makeTuple(q_4875.value, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_rule_0_2.instance.invoke(context, w_4875, t_4875, term);
            if(term == null)
              break Fail23654;
            if(true)
              break Success12664;
          }
          term = trans.constNil4;
        }
        lifted7063 lifted70630 = new lifted7063();
        lifted70630.q_4875 = q_4875;
        lifted70630.p_4875 = p_4875;
        term = filter_1_0.instance.invoke(context, term, lifted70630);
        if(term == null)
          break Fail23651;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}