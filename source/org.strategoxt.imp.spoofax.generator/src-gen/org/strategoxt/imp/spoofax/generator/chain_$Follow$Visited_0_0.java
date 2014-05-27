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

@SuppressWarnings("all") public class chain_$Follow$Visited_0_0 extends Strategy 
{ 
  public static chain_$Follow$Visited_0_0 instance = new chain_$Follow$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_FollowVisited_0_0");
    Fail27444:
    { 
      IStrategoTerm x_4486 = null;
      IStrategoTerm a_4487 = null;
      IStrategoTerm c_4487 = null;
      x_4486 = term;
      c_4487 = term;
      Success11107:
      { 
        Fail27445:
        { 
          IStrategoTerm e_4487 = null;
          e_4487 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4487, generator.const7485, x_4486);
          if(term == null)
            break Fail27445;
          if(true)
            break Success11107;
        }
        term = generator.constNil7;
      }
      a_4487 = term;
      term = c_4487;
      term = termFactory.makeTuple(a_4487, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10162.instance);
      if(term == null)
        break Fail27444;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}