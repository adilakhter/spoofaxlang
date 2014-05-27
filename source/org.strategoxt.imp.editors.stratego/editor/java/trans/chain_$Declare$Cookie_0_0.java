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

@SuppressWarnings("all") public class chain_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static chain_$Declare$Cookie_0_0 instance = new chain_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_DeclareCookie_0_0");
    Fail23637:
    { 
      IStrategoTerm term12782 = term;
      Success12652:
      { 
        Fail23638:
        { 
          IStrategoTerm f_4873 = null;
          IStrategoTerm i_4873 = null;
          IStrategoTerm k_4873 = null;
          f_4873 = term;
          k_4873 = term;
          Success12653:
          { 
            Fail23639:
            { 
              IStrategoTerm m_4873 = null;
              m_4873 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, m_4873, trans.const4568, f_4873);
              if(term == null)
                break Fail23639;
              if(true)
                break Success12653;
            }
            term = trans.constNil4;
          }
          i_4873 = term;
          term = k_4873;
          term = termFactory.makeTuple(i_4873, term);
          term = foldl_1_0.instance.invoke(context, term, lifted7054.instance);
          if(term == null)
            break Fail23638;
          if(true)
            break Success12652;
        }
        term = term12782;
        IStrategoTerm s_4872 = null;
        IStrategoTerm v_4872 = null;
        IStrategoTerm x_4872 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23637;
        s_4872 = term.getSubterm(0);
        x_4872 = term;
        Success12654:
        { 
          Fail23640:
          { 
            IStrategoTerm y_4872 = null;
            IStrategoTerm a_4873 = null;
            IStrategoTerm b_4873 = null;
            a_4873 = term;
            y_4872 = trans.const4568;
            b_4873 = a_4873;
            term = termFactory.annotateTerm(termFactory.makeTuple(s_4872, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_rule_0_2.instance.invoke(context, b_4873, y_4872, term);
            if(term == null)
              break Fail23640;
            if(true)
              break Success12654;
          }
          term = trans.constNil4;
        }
        v_4872 = term;
        term = x_4872;
        term = termFactory.makeTuple(v_4872, term);
        term = foldl_1_0.instance.invoke(context, term, lifted7055.instance);
        if(term == null)
          break Fail23637;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}