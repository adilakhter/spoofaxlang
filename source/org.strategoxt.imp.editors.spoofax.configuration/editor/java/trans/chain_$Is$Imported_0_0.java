package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
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
    Fail87825:
    { 
      IStrategoTerm h_17588 = null;
      IStrategoTerm k_17588 = null;
      IStrategoTerm m_17588 = null;
      h_17588 = term;
      m_17588 = term;
      Success47314:
      { 
        Fail87826:
        { 
          IStrategoTerm o_17588 = null;
          o_17588 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_17588, trans.const17874, h_17588);
          if(term == null)
            break Fail87826;
          if(true)
            break Success47314;
        }
        term = trans.constNil14;
      }
      k_17588 = term;
      term = m_17588;
      term = termFactory.makeTuple(k_17588, term);
      term = foldl_1_0.instance.invoke(context, term, lifted24791.instance);
      if(term == null)
        break Fail87825;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}