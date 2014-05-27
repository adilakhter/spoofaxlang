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

@SuppressWarnings("all") public class bigchain_$Base$Package_0_0 extends Strategy 
{ 
  public static bigchain_$Base$Package_0_0 instance = new bigchain_$Base$Package_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_BasePackage_0_0");
    Fail27282:
    { 
      IStrategoTerm h_4459 = null;
      IStrategoTerm j_4459 = null;
      j_4459 = term;
      Success11060:
      { 
        Fail27283:
        { 
          IStrategoTerm k_4459 = null;
          IStrategoTerm m_4459 = null;
          IStrategoTerm n_4459 = null;
          m_4459 = term;
          k_4459 = generator.const7448;
          n_4459 = m_4459;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, n_4459, k_4459, generator.constCons4561);
          if(term == null)
            break Fail27283;
          if(true)
            break Success11060;
        }
        term = generator.constNil7;
      }
      h_4459 = term;
      term = j_4459;
      term = termFactory.makeTuple(h_4459, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10107.instance);
      if(term == null)
        break Fail27282;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}