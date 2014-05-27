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

@SuppressWarnings("all") public class bigchain_$Editor$Extensions_0_0 extends Strategy 
{ 
  public static bigchain_$Editor$Extensions_0_0 instance = new bigchain_$Editor$Extensions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_EditorExtensions_0_0");
    Fail27256:
    { 
      IStrategoTerm a_4455 = null;
      IStrategoTerm c_4455 = null;
      c_4455 = term;
      Success11053:
      { 
        Fail27257:
        { 
          IStrategoTerm d_4455 = null;
          IStrategoTerm f_4455 = null;
          IStrategoTerm g_4455 = null;
          f_4455 = term;
          d_4455 = generator.const7453;
          g_4455 = f_4455;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4455, d_4455, generator.constCons4561);
          if(term == null)
            break Fail27257;
          if(true)
            break Success11053;
        }
        term = generator.constNil7;
      }
      a_4455 = term;
      term = c_4455;
      term = termFactory.makeTuple(a_4455, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10098.instance);
      if(term == null)
        break Fail27256;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}