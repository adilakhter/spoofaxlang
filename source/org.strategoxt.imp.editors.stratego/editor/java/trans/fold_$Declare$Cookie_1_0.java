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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4899)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DeclareCookie_1_0");
    Fail23629:
    { 
      IStrategoTerm term12776 = term;
      Success12646:
      { 
        Fail23630:
        { 
          IStrategoTerm i_4871 = null;
          IStrategoTerm m_4871 = null;
          IStrategoTerm o_4871 = null;
          i_4871 = term;
          o_4871 = term;
          Success12647:
          { 
            Fail23631:
            { 
              IStrategoTerm q_4871 = null;
              q_4871 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, q_4871, trans.const4568, i_4871);
              if(term == null)
                break Fail23631;
              if(true)
                break Success12647;
            }
            term = trans.constNil4;
          }
          m_4871 = term;
          term = o_4871;
          term = termFactory.makeTuple(m_4871, term);
          term = c_4899.invoke(context, term, lifted7050.instance);
          if(term == null)
            break Fail23630;
          if(true)
            break Success12646;
        }
        term = term12776;
        IStrategoTerm u_4870 = null;
        IStrategoTerm y_4870 = null;
        IStrategoTerm a_4871 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23629;
        u_4870 = term.getSubterm(0);
        a_4871 = term;
        Success12648:
        { 
          Fail23632:
          { 
            IStrategoTerm b_4871 = null;
            IStrategoTerm d_4871 = null;
            IStrategoTerm e_4871 = null;
            d_4871 = term;
            b_4871 = trans.const4568;
            e_4871 = d_4871;
            term = termFactory.annotateTerm(termFactory.makeTuple(u_4870, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_rule_0_2.instance.invoke(context, e_4871, b_4871, term);
            if(term == null)
              break Fail23632;
            if(true)
              break Success12648;
          }
          term = trans.constNil4;
        }
        y_4870 = term;
        term = a_4871;
        term = termFactory.makeTuple(y_4870, term);
        term = c_4899.invoke(context, term, lifted7051.instance);
        if(term == null)
          break Fail23629;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}