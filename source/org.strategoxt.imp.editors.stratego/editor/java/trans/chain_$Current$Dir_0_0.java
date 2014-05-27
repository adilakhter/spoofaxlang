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

@SuppressWarnings("all") public class chain_$Current$Dir_0_0 extends Strategy 
{ 
  public static chain_$Current$Dir_0_0 instance = new chain_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentDir_0_0");
    Fail22096:
    { 
      IStrategoTerm k_4308 = null;
      IStrategoTerm m_4308 = null;
      m_4308 = term;
      Success11916:
      { 
        Fail22097:
        { 
          IStrategoTerm n_4308 = null;
          IStrategoTerm p_4308 = null;
          IStrategoTerm q_4308 = null;
          p_4308 = term;
          n_4308 = trans.const4346;
          q_4308 = p_4308;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4308, n_4308, trans.constCons1966);
          if(term == null)
            break Fail22097;
          if(true)
            break Success11916;
        }
        term = trans.constNil3;
      }
      k_4308 = term;
      term = m_4308;
      term = termFactory.makeTuple(k_4308, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6762.instance);
      if(term == null)
        break Fail22096;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}