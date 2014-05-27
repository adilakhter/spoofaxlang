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

@SuppressWarnings("all") public class create_main_adapters_0_0 extends Strategy 
{ 
  public static create_main_adapters_0_0 instance = new create_main_adapters_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_main_adapters_0_0");
    Fail26498:
    { 
      IStrategoTerm term10873 = term;
      Success10729:
      { 
        Fail26499:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26499;
          if(true)
            break Success10729;
        }
        term = default_package_name_0_0.instance.invoke(context, term10873);
        if(term == null)
          break Fail26498;
      }
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26498;
      term = concat_strings_0_0.instance.invoke(context, generator.constCons4955);
      if(term == null)
        break Fail26498;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}