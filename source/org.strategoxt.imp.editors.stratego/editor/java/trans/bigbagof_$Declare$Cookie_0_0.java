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

@SuppressWarnings("all") public class bigbagof_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static bigbagof_$Declare$Cookie_0_0 instance = new bigbagof_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigbagof_DeclareCookie_0_0");
    Fail23641:
    { 
      IStrategoTerm term12785 = term;
      Success12655:
      { 
        Fail23642:
        { 
          TermReference x_4873 = new TermReference();
          TermReference y_4873 = new TermReference();
          if(y_4873.value == null)
            y_4873.value = term;
          else
            if(y_4873.value != term && !y_4873.value.match(term))
              break Fail23642;
          if(x_4873.value == null)
            x_4873.value = term;
          else
            if(x_4873.value != term && !x_4873.value.match(term))
              break Fail23642;
          Success12656:
          { 
            Fail23643:
            { 
              IStrategoTerm c_4874 = null;
              c_4874 = term;
              term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4874, trans.const4568, y_4873.value);
              if(term == null)
                break Fail23643;
              if(true)
                break Success12656;
            }
            term = trans.constNil4;
          }
          lifted7056 lifted70560 = new lifted7056();
          lifted70560.x_4873 = x_4873;
          lifted70560.y_4873 = y_4873;
          term = filter_1_0.instance.invoke(context, term, lifted70560);
          if(term == null)
            break Fail23642;
          if(true)
            break Success12655;
        }
        term = term12785;
        TermReference p_4873 = new TermReference();
        TermReference q_4873 = new TermReference();
        if(p_4873.value == null)
          p_4873.value = term;
        else
          if(p_4873.value != term && !p_4873.value.match(term))
            break Fail23641;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23641;
        if(q_4873.value == null)
          q_4873.value = term.getSubterm(0);
        else
          if(q_4873.value != term.getSubterm(0) && !q_4873.value.match(term.getSubterm(0)))
            break Fail23641;
        Success12657:
        { 
          Fail23644:
          { 
            IStrategoTerm t_4873 = null;
            IStrategoTerm v_4873 = null;
            IStrategoTerm w_4873 = null;
            v_4873 = term;
            t_4873 = trans.const4568;
            term = v_4873;
            w_4873 = v_4873;
            if(q_4873.value == null)
              break Fail23644;
            term = termFactory.annotateTerm(termFactory.makeTuple(q_4873.value, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4873, t_4873, term);
            if(term == null)
              break Fail23644;
            if(true)
              break Success12657;
          }
          term = trans.constNil4;
        }
        lifted7057 lifted70570 = new lifted7057();
        lifted70570.q_4873 = q_4873;
        lifted70570.p_4873 = p_4873;
        term = filter_1_0.instance.invoke(context, term, lifted70570);
        if(term == null)
          break Fail23641;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}