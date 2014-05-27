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

@SuppressWarnings("all") public class chain_$Declaration_0_0 extends Strategy 
{ 
  public static chain_$Declaration_0_0 instance = new chain_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Declaration_0_0");
    Fail23598:
    { 
      IStrategoTerm i_4866 = null;
      IStrategoTerm l_4866 = null;
      IStrategoTerm n_4866 = null;
      i_4866 = term;
      n_4866 = term;
      Success12632:
      { 
        Fail23599:
        { 
          IStrategoTerm p_4866 = null;
          p_4866 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4866, trans.const4570, i_4866);
          if(term == null)
            break Fail23599;
          if(true)
            break Success12632;
        }
        term = trans.constNil4;
      }
      l_4866 = term;
      term = n_4866;
      term = termFactory.makeTuple(l_4866, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7042.instance);
      if(term == null)
        break Fail23598;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}