package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail76153:
    { 
      IStrategoTerm h_92083 = null;
      IStrategoTerm k_92083 = null;
      IStrategoTerm m_92083 = null;
      h_92083 = term;
      m_92083 = term;
      Success41816:
      { 
        Fail76154:
        { 
          IStrategoTerm o_92083 = null;
          o_92083 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_92083, trans.const15450, h_92083);
          if(term == null)
            break Fail76154;
          if(true)
            break Success41816;
        }
        term = trans.constNil11;
      }
      k_92083 = term;
      term = m_92083;
      term = termFactory.makeTuple(k_92083, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21599.instance);
      if(term == null)
        break Fail76153;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}