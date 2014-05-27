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

@SuppressWarnings("all") public class chain_$Content$Proposals_0_0 extends Strategy 
{ 
  public static chain_$Content$Proposals_0_0 instance = new chain_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ContentProposals_0_0");
    Fail23753:
    { 
      IStrategoTerm d_4892 = null;
      IStrategoTerm f_4892 = null;
      f_4892 = term;
      Success12691:
      { 
        Fail23754:
        { 
          IStrategoTerm g_4892 = null;
          IStrategoTerm i_4892 = null;
          IStrategoTerm j_4892 = null;
          i_4892 = term;
          g_4892 = trans.const4611;
          j_4892 = i_4892;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4892, g_4892, trans.constCons2047);
          if(term == null)
            break Fail23754;
          if(true)
            break Success12691;
        }
        term = trans.constNil4;
      }
      d_4892 = term;
      term = f_4892;
      term = termFactory.makeTuple(d_4892, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7097.instance);
      if(term == null)
        break Fail23753;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}