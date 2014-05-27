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

@SuppressWarnings("all") public class bigfold_$Project$Name_1_0 extends Strategy 
{ 
  public static bigfold_$Project$Name_1_0 instance = new bigfold_$Project$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4506)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ProjectName_1_0");
    Fail27568:
    { 
      IStrategoTerm n_4506 = null;
      IStrategoTerm p_4506 = null;
      p_4506 = term;
      Success11139:
      { 
        Fail27569:
        { 
          IStrategoTerm q_4506 = null;
          IStrategoTerm s_4506 = null;
          IStrategoTerm t_4506 = null;
          s_4506 = term;
          q_4506 = generator.const7876;
          t_4506 = s_4506;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4506, q_4506, generator.constCons4561);
          if(term == null)
            break Fail27569;
          if(true)
            break Success11139;
        }
        term = generator.constNil7;
      }
      n_4506 = term;
      term = p_4506;
      term = termFactory.makeTuple(n_4506, term);
      term = m_4506.invoke(context, term, lifted10204.instance);
      if(term == null)
        break Fail27568;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}