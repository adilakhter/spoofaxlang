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

@SuppressWarnings("all") public class fold_$Input$Dir$Prefix_1_0 extends Strategy 
{ 
  public static fold_$Input$Dir$Prefix_1_0 instance = new fold_$Input$Dir$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4433)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_InputDirPrefix_1_0");
    Fail27124:
    { 
      IStrategoTerm o_4433 = null;
      IStrategoTerm q_4433 = null;
      q_4433 = term;
      Success11017:
      { 
        Fail27125:
        { 
          IStrategoTerm r_4433 = null;
          IStrategoTerm t_4433 = null;
          IStrategoTerm u_4433 = null;
          t_4433 = term;
          r_4433 = generator.const7147;
          u_4433 = t_4433;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4433, r_4433, generator.constCons4561);
          if(term == null)
            break Fail27125;
          if(true)
            break Success11017;
        }
        term = generator.constNil7;
      }
      o_4433 = term;
      term = q_4433;
      term = termFactory.makeTuple(o_4433, term);
      term = n_4433.invoke(context, term, lifted10052.instance);
      if(term == null)
        break Fail27124;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}