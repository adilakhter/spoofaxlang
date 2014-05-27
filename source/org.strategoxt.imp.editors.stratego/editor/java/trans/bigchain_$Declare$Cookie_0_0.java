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

@SuppressWarnings("all") public class bigchain_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static bigchain_$Declare$Cookie_0_0 instance = new bigchain_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DeclareCookie_0_0");
    Fail23633:
    { 
      IStrategoTerm term12779 = term;
      Success12649:
      { 
        Fail23634:
        { 
          IStrategoTerm h_4872 = null;
          IStrategoTerm k_4872 = null;
          IStrategoTerm m_4872 = null;
          h_4872 = term;
          m_4872 = term;
          Success12650:
          { 
            Fail23635:
            { 
              IStrategoTerm o_4872 = null;
              o_4872 = term;
              term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4872, trans.const4568, h_4872);
              if(term == null)
                break Fail23635;
              if(true)
                break Success12650;
            }
            term = trans.constNil4;
          }
          k_4872 = term;
          term = m_4872;
          term = termFactory.makeTuple(k_4872, term);
          term = foldl_1_0.instance.invoke(context, term, lifted7052.instance);
          if(term == null)
            break Fail23634;
          if(true)
            break Success12649;
        }
        term = term12779;
        IStrategoTerm u_4871 = null;
        IStrategoTerm x_4871 = null;
        IStrategoTerm z_4871 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23633;
        u_4871 = term.getSubterm(0);
        z_4871 = term;
        Success12651:
        { 
          Fail23636:
          { 
            IStrategoTerm a_4872 = null;
            IStrategoTerm c_4872 = null;
            IStrategoTerm d_4872 = null;
            c_4872 = term;
            a_4872 = trans.const4568;
            d_4872 = c_4872;
            term = termFactory.annotateTerm(termFactory.makeTuple(u_4871, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4872, a_4872, term);
            if(term == null)
              break Fail23636;
            if(true)
              break Success12651;
          }
          term = trans.constNil4;
        }
        x_4871 = term;
        term = z_4871;
        term = termFactory.makeTuple(x_4871, term);
        term = foldl_1_0.instance.invoke(context, term, lifted7053.instance);
        if(term == null)
          break Fail23633;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}