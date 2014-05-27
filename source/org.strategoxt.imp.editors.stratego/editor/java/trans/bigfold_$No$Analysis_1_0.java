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

@SuppressWarnings("all") public class bigfold_$No$Analysis_1_0 extends Strategy 
{ 
  public static bigfold_$No$Analysis_1_0 instance = new bigfold_$No$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4302)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_NoAnalysis_1_0");
    Fail22064:
    { 
      IStrategoTerm k_4302 = null;
      IStrategoTerm m_4302 = null;
      m_4302 = term;
      Success11906:
      { 
        Fail22065:
        { 
          IStrategoTerm n_4302 = null;
          IStrategoTerm p_4302 = null;
          IStrategoTerm q_4302 = null;
          p_4302 = term;
          n_4302 = trans.const4349;
          q_4302 = p_4302;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4302, n_4302, trans.constCons1966);
          if(term == null)
            break Fail22065;
          if(true)
            break Success11906;
        }
        term = trans.constNil3;
      }
      k_4302 = term;
      term = m_4302;
      term = termFactory.makeTuple(k_4302, term);
      term = j_4302.invoke(context, term, lifted6750.instance);
      if(term == null)
        break Fail22064;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}