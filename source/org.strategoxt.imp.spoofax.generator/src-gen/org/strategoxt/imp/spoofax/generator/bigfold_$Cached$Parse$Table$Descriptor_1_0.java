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

@SuppressWarnings("all") public class bigfold_$Cached$Parse$Table$Descriptor_1_0 extends Strategy 
{ 
  public static bigfold_$Cached$Parse$Table$Descriptor_1_0 instance = new bigfold_$Cached$Parse$Table$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4441)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CachedParseTableDescriptor_1_0");
    Fail27174:
    { 
      IStrategoTerm m_4441 = null;
      IStrategoTerm o_4441 = null;
      o_4441 = term;
      Success11030:
      { 
        Fail27175:
        { 
          IStrategoTerm p_4441 = null;
          IStrategoTerm r_4441 = null;
          IStrategoTerm s_4441 = null;
          r_4441 = term;
          p_4441 = generator.const7154;
          s_4441 = r_4441;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, s_4441, p_4441, generator.constCons4561);
          if(term == null)
            break Fail27175;
          if(true)
            break Success11030;
        }
        term = generator.constNil7;
      }
      m_4441 = term;
      term = o_4441;
      term = termFactory.makeTuple(m_4441, term);
      term = l_4441.invoke(context, term, lifted10069.instance);
      if(term == null)
        break Fail27174;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}