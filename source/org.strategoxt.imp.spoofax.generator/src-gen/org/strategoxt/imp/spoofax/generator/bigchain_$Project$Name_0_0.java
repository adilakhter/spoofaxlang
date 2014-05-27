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

@SuppressWarnings("all") public class bigchain_$Project$Name_0_0 extends Strategy 
{ 
  public static bigchain_$Project$Name_0_0 instance = new bigchain_$Project$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ProjectName_0_0");
    Fail27572:
    { 
      IStrategoTerm k_4507 = null;
      IStrategoTerm m_4507 = null;
      m_4507 = term;
      Success11141:
      { 
        Fail27573:
        { 
          IStrategoTerm n_4507 = null;
          IStrategoTerm p_4507 = null;
          IStrategoTerm q_4507 = null;
          p_4507 = term;
          n_4507 = generator.const7876;
          q_4507 = p_4507;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4507, n_4507, generator.constCons4561);
          if(term == null)
            break Fail27573;
          if(true)
            break Success11141;
        }
        term = generator.constNil7;
      }
      k_4507 = term;
      term = m_4507;
      term = termFactory.makeTuple(k_4507, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10206.instance);
      if(term == null)
        break Fail27572;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}