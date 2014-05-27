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

@SuppressWarnings("all") public class bigchain_$Content$Proposals_0_0 extends Strategy 
{ 
  public static bigchain_$Content$Proposals_0_0 instance = new bigchain_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ContentProposals_0_0");
    Fail23751:
    { 
      IStrategoTerm s_4891 = null;
      IStrategoTerm u_4891 = null;
      u_4891 = term;
      Success12690:
      { 
        Fail23752:
        { 
          IStrategoTerm v_4891 = null;
          IStrategoTerm x_4891 = null;
          IStrategoTerm y_4891 = null;
          x_4891 = term;
          v_4891 = trans.const4611;
          y_4891 = x_4891;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4891, v_4891, trans.constCons2047);
          if(term == null)
            break Fail23752;
          if(true)
            break Success12690;
        }
        term = trans.constNil4;
      }
      s_4891 = term;
      term = u_4891;
      term = termFactory.makeTuple(s_4891, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7096.instance);
      if(term == null)
        break Fail23751;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}