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

@SuppressWarnings("all") public class bigfold_$Content$Proposals_1_0 extends Strategy 
{ 
  public static bigfold_$Content$Proposals_1_0 instance = new bigfold_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4890)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ContentProposals_1_0");
    Fail23747:
    { 
      IStrategoTerm v_4890 = null;
      IStrategoTerm x_4890 = null;
      x_4890 = term;
      Success12688:
      { 
        Fail23748:
        { 
          IStrategoTerm y_4890 = null;
          IStrategoTerm a_4891 = null;
          IStrategoTerm b_4891 = null;
          a_4891 = term;
          y_4890 = trans.const4611;
          b_4891 = a_4891;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_4891, y_4890, trans.constCons2047);
          if(term == null)
            break Fail23748;
          if(true)
            break Success12688;
        }
        term = trans.constNil4;
      }
      v_4890 = term;
      term = x_4890;
      term = termFactory.makeTuple(v_4890, term);
      term = u_4890.invoke(context, term, lifted7094.instance);
      if(term == null)
        break Fail23747;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}