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

@SuppressWarnings("all") public class bigfold_$Source$Path$Name_1_0 extends Strategy 
{ 
  public static bigfold_$Source$Path$Name_1_0 instance = new bigfold_$Source$Path$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4416)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_SourcePathName_1_0");
    Fail27018:
    { 
      IStrategoTerm g_4416 = null;
      IStrategoTerm k_4416 = null;
      IStrategoTerm m_4416 = null;
      g_4416 = term;
      m_4416 = term;
      Success10988:
      { 
        Fail27019:
        { 
          IStrategoTerm o_4416 = null;
          o_4416 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4416, generator.const7018, g_4416);
          if(term == null)
            break Fail27019;
          if(true)
            break Success10988;
        }
        term = generator.constNil7;
      }
      k_4416 = term;
      term = m_4416;
      term = termFactory.makeTuple(k_4416, term);
      term = j_4416.invoke(context, term, lifted10015.instance);
      if(term == null)
        break Fail27018;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}