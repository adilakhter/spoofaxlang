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

@SuppressWarnings("all") public class bigchain_$Input$Dir$Prefix_0_0 extends Strategy 
{ 
  public static bigchain_$Input$Dir$Prefix_0_0 instance = new bigchain_$Input$Dir$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_InputDirPrefix_0_0");
    Fail27126:
    { 
      IStrategoTerm z_4433 = null;
      IStrategoTerm b_4434 = null;
      b_4434 = term;
      Success11018:
      { 
        Fail27127:
        { 
          IStrategoTerm c_4434 = null;
          IStrategoTerm e_4434 = null;
          IStrategoTerm f_4434 = null;
          e_4434 = term;
          c_4434 = generator.const7147;
          f_4434 = e_4434;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4434, c_4434, generator.constCons4561);
          if(term == null)
            break Fail27127;
          if(true)
            break Success11018;
        }
        term = generator.constNil7;
      }
      z_4433 = term;
      term = b_4434;
      term = termFactory.makeTuple(z_4433, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10053.instance);
      if(term == null)
        break Fail27126;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}