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

@SuppressWarnings("all") public class bigchain_$Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static bigchain_$Cached$Parse$Table$Descriptor_0_0 instance = new bigchain_$Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CachedParseTableDescriptor_0_0");
    Fail27178:
    { 
      IStrategoTerm j_4442 = null;
      IStrategoTerm l_4442 = null;
      l_4442 = term;
      Success11032:
      { 
        Fail27179:
        { 
          IStrategoTerm m_4442 = null;
          IStrategoTerm o_4442 = null;
          IStrategoTerm p_4442 = null;
          o_4442 = term;
          m_4442 = generator.const7154;
          p_4442 = o_4442;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4442, m_4442, generator.constCons4561);
          if(term == null)
            break Fail27179;
          if(true)
            break Success11032;
        }
        term = generator.constNil7;
      }
      j_4442 = term;
      term = l_4442;
      term = termFactory.makeTuple(j_4442, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10071.instance);
      if(term == null)
        break Fail27178;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}