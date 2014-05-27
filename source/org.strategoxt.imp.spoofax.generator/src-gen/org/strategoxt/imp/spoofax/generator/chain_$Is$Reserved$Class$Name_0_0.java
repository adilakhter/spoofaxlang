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

@SuppressWarnings("all") public class chain_$Is$Reserved$Class$Name_0_0 extends Strategy 
{ 
  public static chain_$Is$Reserved$Class$Name_0_0 instance = new chain_$Is$Reserved$Class$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsReservedClassName_0_0");
    Fail27206:
    { 
      IStrategoTerm a_4447 = null;
      IStrategoTerm d_4447 = null;
      IStrategoTerm f_4447 = null;
      a_4447 = term;
      f_4447 = term;
      Success11040:
      { 
        Fail27207:
        { 
          IStrategoTerm h_4447 = null;
          h_4447 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4447, generator.const7167, a_4447);
          if(term == null)
            break Fail27207;
          if(true)
            break Success11040;
        }
        term = generator.constNil7;
      }
      d_4447 = term;
      term = f_4447;
      term = termFactory.makeTuple(d_4447, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10081.instance);
      if(term == null)
        break Fail27206;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}