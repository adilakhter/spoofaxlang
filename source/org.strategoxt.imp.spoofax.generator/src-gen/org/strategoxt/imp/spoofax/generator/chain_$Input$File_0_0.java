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

@SuppressWarnings("all") public class chain_$Input$File_0_0 extends Strategy 
{ 
  public static chain_$Input$File_0_0 instance = new chain_$Input$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_InputFile_0_0");
    Fail27522:
    { 
      IStrategoTerm h_4499 = null;
      IStrategoTerm j_4499 = null;
      j_4499 = term;
      Success11128:
      { 
        Fail27523:
        { 
          IStrategoTerm k_4499 = null;
          IStrategoTerm m_4499 = null;
          IStrategoTerm n_4499 = null;
          m_4499 = term;
          k_4499 = generator.const7868;
          n_4499 = m_4499;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4499, k_4499, generator.constCons4561);
          if(term == null)
            break Fail27523;
          if(true)
            break Success11128;
        }
        term = generator.constNil7;
      }
      h_4499 = term;
      term = j_4499;
      term = termFactory.makeTuple(h_4499, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10189.instance);
      if(term == null)
        break Fail27522;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}