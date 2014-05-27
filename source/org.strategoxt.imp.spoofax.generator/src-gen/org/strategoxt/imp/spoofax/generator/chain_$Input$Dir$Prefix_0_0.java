package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class chain_$Input$Dir$Prefix_0_0 extends Strategy 
{ 
  public static chain_$Input$Dir$Prefix_0_0 instance = new chain_$Input$Dir$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_InputDirPrefix_0_0");
    Fail27128:
    { 
      IStrategoTerm k_4434 = null;
      IStrategoTerm m_4434 = null;
      m_4434 = term;
      Success11019:
      { 
        Fail27129:
        { 
          IStrategoTerm n_4434 = null;
          IStrategoTerm p_4434 = null;
          IStrategoTerm q_4434 = null;
          p_4434 = term;
          n_4434 = generator.const7147;
          q_4434 = p_4434;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4434, n_4434, generator.constCons4561);
          if(term == null)
            break Fail27129;
          if(true)
            break Success11019;
        }
        term = generator.constNil7;
      }
      k_4434 = term;
      term = m_4434;
      term = termFactory.makeTuple(k_4434, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10054.instance);
      if(term == null)
        break Fail27128;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}