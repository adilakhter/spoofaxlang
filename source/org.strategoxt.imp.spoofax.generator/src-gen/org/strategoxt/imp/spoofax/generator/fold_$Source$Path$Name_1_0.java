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

@SuppressWarnings("all") public class fold_$Source$Path$Name_1_0 extends Strategy 
{ 
  public static fold_$Source$Path$Name_1_0 instance = new fold_$Source$Path$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4416)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_SourcePathName_1_0");
    Fail27020:
    { 
      IStrategoTerm s_4416 = null;
      IStrategoTerm w_4416 = null;
      IStrategoTerm y_4416 = null;
      s_4416 = term;
      y_4416 = term;
      Success10989:
      { 
        Fail27021:
        { 
          IStrategoTerm a_4417 = null;
          a_4417 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4417, generator.const7018, s_4416);
          if(term == null)
            break Fail27021;
          if(true)
            break Success10989;
        }
        term = generator.constNil7;
      }
      w_4416 = term;
      term = y_4416;
      term = termFactory.makeTuple(w_4416, term);
      term = v_4416.invoke(context, term, lifted10016.instance);
      if(term == null)
        break Fail27020;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}