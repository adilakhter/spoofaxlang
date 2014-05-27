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

@SuppressWarnings("all") final class lifted6876 extends Strategy 
{ 
  public static final lifted6876 instance = new lifted6876();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24029:
    { 
      IStrategoTerm g_4793 = null;
      IStrategoTerm h_4793 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail24029;
      g_4793 = term.getSubterm(0);
      h_4793 = term.getSubterm(1);
      IStrategoTerm term12487 = term;
      Success12738:
      { 
        Fail24030:
        { 
          IStrategoTerm i_4793 = null;
          i_4793 = term;
          term = h_4793;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 0)
            break Fail24030;
          term = i_4793;
          { 
            IStrategoTerm j_4793 = null;
            IStrategoTerm z_4793 = null;
            j_4793 = term;
            z_4793 = term;
            term = dr_undefine_rule_0_2.instance.invoke(context, z_4793, trans.const4568, g_4793);
            if(term == null)
              break Fail24029;
            term = j_4793;
            if(true)
              break Success12738;
          }
        }
        term = term12487;
        IStrategoTerm k_4793 = null;
        IStrategoTerm a_4794 = null;
        IStrategoTerm c_4794 = null;
        IStrategoTerm d_4794 = null;
        k_4793 = term;
        c_4794 = term;
        a_4794 = trans.const4568;
        d_4794 = c_4794;
        term = termFactory.makeTuple(trans.const4569, h_4793);
        term = dr_set_rule_0_3.instance.invoke(context, d_4794, a_4794, g_4793, term);
        if(term == null)
          break Fail24029;
        term = k_4793;
      }
      if(true)
        return term;
    }
    return null;
  }
}