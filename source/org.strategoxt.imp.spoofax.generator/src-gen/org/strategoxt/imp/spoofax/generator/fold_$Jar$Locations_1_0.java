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

@SuppressWarnings("all") public class fold_$Jar$Locations_1_0 extends Strategy 
{ 
  public static fold_$Jar$Locations_1_0 instance = new fold_$Jar$Locations_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4511)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_JarLocations_1_0");
    Fail27596:
    { 
      IStrategoTerm g_4511 = null;
      IStrategoTerm i_4511 = null;
      i_4511 = term;
      Success11147:
      { 
        Fail27597:
        { 
          IStrategoTerm j_4511 = null;
          IStrategoTerm l_4511 = null;
          IStrategoTerm m_4511 = null;
          l_4511 = term;
          j_4511 = generator.const7880;
          m_4511 = l_4511;
          term = dr_lookup_rule_0_2.instance.invoke(context, m_4511, j_4511, generator.constCons4561);
          if(term == null)
            break Fail27597;
          if(true)
            break Success11147;
        }
        term = generator.constNil7;
      }
      g_4511 = term;
      term = i_4511;
      term = termFactory.makeTuple(g_4511, term);
      term = f_4511.invoke(context, term, lifted10214.instance);
      if(term == null)
        break Fail27596;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}