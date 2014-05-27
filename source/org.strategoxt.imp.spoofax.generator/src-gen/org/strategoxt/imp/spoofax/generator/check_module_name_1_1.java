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

@SuppressWarnings("all") public class check_module_name_1_1 extends Strategy 
{ 
  public static check_module_name_1_1 instance = new check_module_name_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4224, IStrategoTerm u_4224)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("check_module_name_1_1");
    Fail25486:
    { 
      IStrategoTerm v_4224 = null;
      IStrategoTerm w_4224 = null;
      IStrategoTerm x_4224 = null;
      v_4224 = term;
      x_4224 = term;
      term = get_module_name_from_asfix_0_0.instance.invoke(context, v_4224);
      if(term == null)
        break Fail25486;
      w_4224 = term;
      term = x_4224;
      Success10050:
      { 
        Fail25487:
        { 
          IStrategoTerm y_4224 = null;
          y_4224 = term;
          term = termFactory.makeTuple(w_4224, u_4224);
          term = z_4224.invoke(context, term);
          if(term == null)
            break Fail25487;
          term = y_4224;
          if(true)
            break Success10050;
        }
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7026, termFactory.makeListCons(w_4224, termFactory.makeListCons(generator.const7025, termFactory.makeListCons(u_4224, (IStrategoList)generator.constCons4562))));
        term = fatal_error_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25486;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}