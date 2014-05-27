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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4899)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DeclareCookie_1_0");
    Fail23625:
    { 
      IStrategoTerm term12773 = term;
      Success12643:
      { 
        Fail23626:
        { 
          IStrategoTerm i_4870 = null;
          IStrategoTerm m_4870 = null;
          IStrategoTerm o_4870 = null;
          i_4870 = term;
          o_4870 = term;
          Success12644:
          { 
            Fail23627:
            { 
              IStrategoTerm q_4870 = null;
              q_4870 = term;
              term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4870, trans.const4568, i_4870);
              if(term == null)
                break Fail23627;
              if(true)
                break Success12644;
            }
            term = trans.constNil4;
          }
          m_4870 = term;
          term = o_4870;
          term = termFactory.makeTuple(m_4870, term);
          term = b_4899.invoke(context, term, lifted7048.instance);
          if(term == null)
            break Fail23626;
          if(true)
            break Success12643;
        }
        term = term12773;
        IStrategoTerm u_4869 = null;
        IStrategoTerm y_4869 = null;
        IStrategoTerm a_4870 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23625;
        u_4869 = term.getSubterm(0);
        a_4870 = term;
        Success12645:
        { 
          Fail23628:
          { 
            IStrategoTerm b_4870 = null;
            IStrategoTerm d_4870 = null;
            IStrategoTerm e_4870 = null;
            d_4870 = term;
            b_4870 = trans.const4568;
            e_4870 = d_4870;
            term = termFactory.annotateTerm(termFactory.makeTuple(u_4869, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4870, b_4870, term);
            if(term == null)
              break Fail23628;
            if(true)
              break Success12645;
          }
          term = trans.constNil4;
        }
        y_4869 = term;
        term = a_4870;
        term = termFactory.makeTuple(y_4869, term);
        term = b_4899.invoke(context, term, lifted7049.instance);
        if(term == null)
          break Fail23625;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}