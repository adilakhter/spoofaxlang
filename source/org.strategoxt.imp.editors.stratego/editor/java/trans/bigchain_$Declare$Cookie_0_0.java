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
    Fail22157:
    { 
      IStrategoTerm term12070 = term;
      Success11940:
      { 
        Fail22158:
        { 
          IStrategoTerm p_4318 = null;
          IStrategoTerm s_4318 = null;
          IStrategoTerm u_4318 = null;
          p_4318 = term;
          u_4318 = term;
          Success11941:
          { 
            Fail22159:
            { 
              IStrategoTerm w_4318 = null;
              w_4318 = term;
              term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4318, trans.const4358, p_4318);
              if(term == null)
                break Fail22159;
              if(true)
                break Success11941;
            }
            term = trans.constNil3;
          }
          s_4318 = term;
          term = u_4318;
          term = termFactory.makeTuple(s_4318, term);
          term = foldl_1_0.instance.invoke(context, term, lifted6781.instance);
          if(term == null)
            break Fail22158;
          if(true)
            break Success11940;
        }
        term = term12070;
        IStrategoTerm c_4318 = null;
        IStrategoTerm f_4318 = null;
        IStrategoTerm h_4318 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22157;
        c_4318 = term.getSubterm(0);
        h_4318 = term;
        Success11942:
        { 
          Fail22160:
          { 
            IStrategoTerm i_4318 = null;
            IStrategoTerm k_4318 = null;
            IStrategoTerm l_4318 = null;
            k_4318 = term;
            i_4318 = trans.const4358;
            l_4318 = k_4318;
            term = termFactory.annotateTerm(termFactory.makeTuple(c_4318, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_all_rules_0_2.instance.invoke(context, l_4318, i_4318, term);
            if(term == null)
              break Fail22160;
            if(true)
              break Success11942;
          }
          term = trans.constNil3;
        }
        f_4318 = term;
        term = h_4318;
        term = termFactory.makeTuple(f_4318, term);
        term = foldl_1_0.instance.invoke(context, term, lifted6782.instance);
        if(term == null)
          break Fail22157;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}