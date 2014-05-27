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

@SuppressWarnings("all") public class bigchain_$Start$Symbol_0_0 extends Strategy 
{ 
  public static bigchain_$Start$Symbol_0_0 instance = new bigchain_$Start$Symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_StartSymbol_0_0");
    Fail27308:
    { 
      IStrategoTerm o_4463 = null;
      IStrategoTerm q_4463 = null;
      q_4463 = term;
      Success11067:
      { 
        Fail27309:
        { 
          IStrategoTerm r_4463 = null;
          IStrategoTerm t_4463 = null;
          IStrategoTerm u_4463 = null;
          t_4463 = term;
          r_4463 = generator.const7443;
          u_4463 = t_4463;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, u_4463, r_4463, generator.constCons4561);
          if(term == null)
            break Fail27309;
          if(true)
            break Success11067;
        }
        term = generator.constNil7;
      }
      o_4463 = term;
      term = q_4463;
      term = termFactory.makeTuple(o_4463, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10116.instance);
      if(term == null)
        break Fail27308;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}