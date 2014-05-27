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

@SuppressWarnings("all") public class bigfold_$Parse$Table_1_0 extends Strategy 
{ 
  public static bigfold_$Parse$Table_1_0 instance = new bigfold_$Parse$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4502)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ParseTable_1_0");
    Fail27542:
    { 
      IStrategoTerm g_4502 = null;
      IStrategoTerm i_4502 = null;
      i_4502 = term;
      Success11132:
      { 
        Fail27543:
        { 
          IStrategoTerm j_4502 = null;
          IStrategoTerm l_4502 = null;
          IStrategoTerm m_4502 = null;
          l_4502 = term;
          j_4502 = generator.const7871;
          m_4502 = l_4502;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4502, j_4502, generator.constCons4561);
          if(term == null)
            break Fail27543;
          if(true)
            break Success11132;
        }
        term = generator.constNil7;
      }
      g_4502 = term;
      term = i_4502;
      term = termFactory.makeTuple(g_4502, term);
      term = f_4502.invoke(context, term, lifted10195.instance);
      if(term == null)
        break Fail27542;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}