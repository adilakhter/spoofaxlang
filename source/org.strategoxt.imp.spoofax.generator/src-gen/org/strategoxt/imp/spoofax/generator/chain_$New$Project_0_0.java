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

@SuppressWarnings("all") public class chain_$New$Project_0_0 extends Strategy 
{ 
  public static chain_$New$Project_0_0 instance = new chain_$New$Project_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_NewProject_0_0");
    Fail27626:
    { 
      IStrategoTerm r_4516 = null;
      IStrategoTerm t_4516 = null;
      t_4516 = term;
      Success11156:
      { 
        Fail27627:
        { 
          IStrategoTerm u_4516 = null;
          IStrategoTerm w_4516 = null;
          IStrategoTerm x_4516 = null;
          w_4516 = term;
          u_4516 = generator.const7885;
          x_4516 = w_4516;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4516, u_4516, generator.constCons4561);
          if(term == null)
            break Fail27627;
          if(true)
            break Success11156;
        }
        term = generator.constNil7;
      }
      r_4516 = term;
      term = t_4516;
      term = termFactory.makeTuple(r_4516, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10225.instance);
      if(term == null)
        break Fail27626;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}