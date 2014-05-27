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

@SuppressWarnings("all") public class chain_$Is$Imported_0_0 extends Strategy 
{ 
  public static chain_$Is$Imported_0_0 instance = new chain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsImported_0_0");
    Fail23442:
    { 
      IStrategoTerm w_4839 = null;
      IStrategoTerm z_4839 = null;
      IStrategoTerm b_4840 = null;
      w_4839 = term;
      b_4840 = term;
      Success12590:
      { 
        Fail23443:
        { 
          IStrategoTerm d_4840 = null;
          d_4840 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4840, trans.const4537, w_4839);
          if(term == null)
            break Fail23443;
          if(true)
            break Success12590;
        }
        term = trans.constNil4;
      }
      z_4839 = term;
      term = b_4840;
      term = termFactory.makeTuple(z_4839, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6988.instance);
      if(term == null)
        break Fail23442;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}