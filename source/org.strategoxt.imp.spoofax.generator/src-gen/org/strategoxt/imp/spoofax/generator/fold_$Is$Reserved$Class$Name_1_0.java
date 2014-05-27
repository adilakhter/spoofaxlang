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

@SuppressWarnings("all") public class fold_$Is$Reserved$Class$Name_1_0 extends Strategy 
{ 
  public static fold_$Is$Reserved$Class$Name_1_0 instance = new fold_$Is$Reserved$Class$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4446)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsReservedClassName_1_0");
    Fail27202:
    { 
      IStrategoTerm d_4446 = null;
      IStrategoTerm h_4446 = null;
      IStrategoTerm j_4446 = null;
      d_4446 = term;
      j_4446 = term;
      Success11038:
      { 
        Fail27203:
        { 
          IStrategoTerm l_4446 = null;
          l_4446 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4446, generator.const7167, d_4446);
          if(term == null)
            break Fail27203;
          if(true)
            break Success11038;
        }
        term = generator.constNil7;
      }
      h_4446 = term;
      term = j_4446;
      term = termFactory.makeTuple(h_4446, term);
      term = g_4446.invoke(context, term, lifted10079.instance);
      if(term == null)
        break Fail27202;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}