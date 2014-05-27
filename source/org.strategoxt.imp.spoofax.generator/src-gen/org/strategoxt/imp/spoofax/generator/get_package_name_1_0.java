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

@SuppressWarnings("all") public class get_package_name_1_0 extends Strategy 
{ 
  public static get_package_name_1_0 instance = new get_package_name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4393)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_package_name_1_0");
    Fail26733:
    { 
      IStrategoTerm term11147 = term;
      Success10911:
      { 
        Fail26734:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26734;
          if(true)
            break Success10911;
        }
        term = m_4393.invoke(context, term11147);
        if(term == null)
          break Fail26733;
      }
      term = string_tokenize_1_0.instance.invoke(context, term, lifted9529.instance);
      if(term == null)
        break Fail26733;
      term = map_1_0.instance.invoke(context, term, lifted9530.instance);
      if(term == null)
        break Fail26733;
      term = termFactory.makeAppl(SpoofaxGenerator._consPackageName_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}