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

@SuppressWarnings("all") public class fold_$Productions_1_0 extends Strategy 
{ 
  public static fold_$Productions_1_0 instance = new fold_$Productions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4477)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Productions_1_0");
    Fail27388:
    { 
      IStrategoTerm u_4477 = null;
      IStrategoTerm y_4477 = null;
      IStrategoTerm a_4478 = null;
      u_4477 = term;
      a_4478 = term;
      Success11091:
      { 
        Fail27389:
        { 
          IStrategoTerm c_4478 = null;
          c_4478 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4478, generator.const7480, u_4477);
          if(term == null)
            break Fail27389;
          if(true)
            break Success11091;
        }
        term = generator.constNil7;
      }
      y_4477 = term;
      term = a_4478;
      term = termFactory.makeTuple(y_4477, term);
      term = x_4477.invoke(context, term, lifted10142.instance);
      if(term == null)
        break Fail27388;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}