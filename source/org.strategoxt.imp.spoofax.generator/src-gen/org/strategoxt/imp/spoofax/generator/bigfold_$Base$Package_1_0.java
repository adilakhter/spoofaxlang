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

@SuppressWarnings("all") public class bigfold_$Base$Package_1_0 extends Strategy 
{ 
  public static bigfold_$Base$Package_1_0 instance = new bigfold_$Base$Package_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4458)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_BasePackage_1_0");
    Fail27278:
    { 
      IStrategoTerm k_4458 = null;
      IStrategoTerm m_4458 = null;
      m_4458 = term;
      Success11058:
      { 
        Fail27279:
        { 
          IStrategoTerm n_4458 = null;
          IStrategoTerm p_4458 = null;
          IStrategoTerm q_4458 = null;
          p_4458 = term;
          n_4458 = generator.const7448;
          q_4458 = p_4458;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4458, n_4458, generator.constCons4561);
          if(term == null)
            break Fail27279;
          if(true)
            break Success11058;
        }
        term = generator.constNil7;
      }
      k_4458 = term;
      term = m_4458;
      term = termFactory.makeTuple(k_4458, term);
      term = j_4458.invoke(context, term, lifted10105.instance);
      if(term == null)
        break Fail27278;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}