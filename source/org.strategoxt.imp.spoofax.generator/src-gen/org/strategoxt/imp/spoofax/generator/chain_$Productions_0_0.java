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

@SuppressWarnings("all") public class chain_$Productions_0_0 extends Strategy 
{ 
  public static chain_$Productions_0_0 instance = new chain_$Productions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Productions_0_0");
    Fail27392:
    { 
      IStrategoTerm r_4478 = null;
      IStrategoTerm u_4478 = null;
      IStrategoTerm w_4478 = null;
      r_4478 = term;
      w_4478 = term;
      Success11093:
      { 
        Fail27393:
        { 
          IStrategoTerm y_4478 = null;
          y_4478 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4478, generator.const7480, r_4478);
          if(term == null)
            break Fail27393;
          if(true)
            break Success11093;
        }
        term = generator.constNil7;
      }
      u_4478 = term;
      term = w_4478;
      term = termFactory.makeTuple(u_4478, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10144.instance);
      if(term == null)
        break Fail27392;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}