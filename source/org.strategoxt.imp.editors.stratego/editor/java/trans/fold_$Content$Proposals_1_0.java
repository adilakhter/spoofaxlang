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

@SuppressWarnings("all") public class fold_$Content$Proposals_1_0 extends Strategy 
{ 
  public static fold_$Content$Proposals_1_0 instance = new fold_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4891)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ContentProposals_1_0");
    Fail23749:
    { 
      IStrategoTerm h_4891 = null;
      IStrategoTerm j_4891 = null;
      j_4891 = term;
      Success12689:
      { 
        Fail23750:
        { 
          IStrategoTerm k_4891 = null;
          IStrategoTerm m_4891 = null;
          IStrategoTerm n_4891 = null;
          m_4891 = term;
          k_4891 = trans.const4611;
          n_4891 = m_4891;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4891, k_4891, trans.constCons2047);
          if(term == null)
            break Fail23750;
          if(true)
            break Success12689;
        }
        term = trans.constNil4;
      }
      h_4891 = term;
      term = j_4891;
      term = termFactory.makeTuple(h_4891, term);
      term = g_4891.invoke(context, term, lifted7095.instance);
      if(term == null)
        break Fail23749;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}