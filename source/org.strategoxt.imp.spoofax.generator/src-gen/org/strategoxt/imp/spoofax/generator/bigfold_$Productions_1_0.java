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

@SuppressWarnings("all") public class bigfold_$Productions_1_0 extends Strategy 
{ 
  public static bigfold_$Productions_1_0 instance = new bigfold_$Productions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4477)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Productions_1_0");
    Fail27386:
    { 
      IStrategoTerm i_4477 = null;
      IStrategoTerm m_4477 = null;
      IStrategoTerm o_4477 = null;
      i_4477 = term;
      o_4477 = term;
      Success11090:
      { 
        Fail27387:
        { 
          IStrategoTerm q_4477 = null;
          q_4477 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4477, generator.const7480, i_4477);
          if(term == null)
            break Fail27387;
          if(true)
            break Success11090;
        }
        term = generator.constNil7;
      }
      m_4477 = term;
      term = o_4477;
      term = termFactory.makeTuple(m_4477, term);
      term = l_4477.invoke(context, term, lifted10141.instance);
      if(term == null)
        break Fail27386;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}