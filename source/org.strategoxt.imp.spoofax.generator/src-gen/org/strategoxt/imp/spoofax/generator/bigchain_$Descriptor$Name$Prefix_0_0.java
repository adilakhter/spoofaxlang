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

@SuppressWarnings("all") public class bigchain_$Descriptor$Name$Prefix_0_0 extends Strategy 
{ 
  public static bigchain_$Descriptor$Name$Prefix_0_0 instance = new bigchain_$Descriptor$Name$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DescriptorNamePrefix_0_0");
    Fail27702:
    { 
      IStrategoTerm g_4530 = null;
      IStrategoTerm i_4530 = null;
      i_4530 = term;
      Success11176:
      { 
        Fail27703:
        { 
          IStrategoTerm j_4530 = null;
          IStrategoTerm l_4530 = null;
          IStrategoTerm m_4530 = null;
          l_4530 = term;
          j_4530 = generator.const7899;
          m_4530 = l_4530;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4530, j_4530, generator.constCons4561);
          if(term == null)
            break Fail27703;
          if(true)
            break Success11176;
        }
        term = generator.constNil7;
      }
      g_4530 = term;
      term = i_4530;
      term = termFactory.makeTuple(g_4530, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10251.instance);
      if(term == null)
        break Fail27702;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}