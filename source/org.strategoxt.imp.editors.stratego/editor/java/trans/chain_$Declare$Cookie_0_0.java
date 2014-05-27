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
    Fail22161:
    { 
      IStrategoTerm term12073 = term;
      Success11943:
      { 
        Fail22162:
        { 
          IStrategoTerm n_4319 = null;
          IStrategoTerm q_4319 = null;
          IStrategoTerm s_4319 = null;
          n_4319 = term;
          s_4319 = term;
          Success11944:
          { 
            Fail22163:
            { 
              IStrategoTerm u_4319 = null;
              u_4319 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, u_4319, trans.const4358, n_4319);
              if(term == null)
                break Fail22163;
              if(true)
                break Success11944;
            }
            term = trans.constNil3;
          }
          q_4319 = term;
          term = s_4319;
          term = termFactory.makeTuple(q_4319, term);
          term = foldl_1_0.instance.invoke(context, term, lifted6783.instance);
          if(term == null)
            break Fail22162;
          if(true)
            break Success11943;
        }
        term = term12073;
        IStrategoTerm a_4319 = null;
        IStrategoTerm d_4319 = null;
        IStrategoTerm f_4319 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22161;
        a_4319 = term.getSubterm(0);
        f_4319 = term;
        Success11945:
        { 
          Fail22164:
          { 
            IStrategoTerm g_4319 = null;
            IStrategoTerm i_4319 = null;
            IStrategoTerm j_4319 = null;
            i_4319 = term;
            g_4319 = trans.const4358;
            j_4319 = i_4319;
            term = termFactory.annotateTerm(termFactory.makeTuple(a_4319, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_rule_0_2.instance.invoke(context, j_4319, g_4319, term);
            if(term == null)
              break Fail22164;
            if(true)
              break Success11945;
          }
          term = trans.constNil3;
        }
        d_4319 = term;
        term = f_4319;
        term = termFactory.makeTuple(d_4319, term);
        term = foldl_1_0.instance.invoke(context, term, lifted6784.instance);
        if(term == null)
          break Fail22161;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}