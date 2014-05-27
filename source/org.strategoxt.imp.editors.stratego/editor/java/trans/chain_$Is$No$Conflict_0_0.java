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

@SuppressWarnings("all") public class chain_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static chain_$Is$No$Conflict_0_0 instance = new chain_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsNoConflict_0_0");
    Fail23779:
    { 
      IStrategoTerm j_4896 = null;
      IStrategoTerm m_4896 = null;
      IStrategoTerm o_4896 = null;
      j_4896 = term;
      o_4896 = term;
      Success12698:
      { 
        Fail23780:
        { 
          IStrategoTerm q_4896 = null;
          q_4896 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4896, trans.const4637, j_4896);
          if(term == null)
            break Fail23780;
          if(true)
            break Success12698;
        }
        term = trans.constNil4;
      }
      m_4896 = term;
      term = o_4896;
      term = termFactory.makeTuple(m_4896, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7106.instance);
      if(term == null)
        break Fail23779;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}