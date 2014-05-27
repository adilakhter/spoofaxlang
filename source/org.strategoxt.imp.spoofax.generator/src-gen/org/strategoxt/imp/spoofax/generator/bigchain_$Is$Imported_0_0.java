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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail27152:
    { 
      IStrategoTerm f_4438 = null;
      IStrategoTerm i_4438 = null;
      IStrategoTerm k_4438 = null;
      f_4438 = term;
      k_4438 = term;
      Success11025:
      { 
        Fail27153:
        { 
          IStrategoTerm m_4438 = null;
          m_4438 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4438, generator.const7145, f_4438);
          if(term == null)
            break Fail27153;
          if(true)
            break Success11025;
        }
        term = generator.constNil7;
      }
      i_4438 = term;
      term = k_4438;
      term = termFactory.makeTuple(i_4438, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10062.instance);
      if(term == null)
        break Fail27152;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}