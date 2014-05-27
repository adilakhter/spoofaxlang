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

@SuppressWarnings("all") public class create_semantic_completion_definition_0_0 extends Strategy 
{ 
  public static create_semantic_completion_definition_0_0 instance = new create_semantic_completion_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_semantic_completion_definition_0_0");
    Fail26508:
    { 
      IStrategoTerm term10880 = term;
      Success10736:
      { 
        Fail26509:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26509;
          if(true)
            break Success10736;
        }
        term = default_package_name_0_0.instance.invoke(context, term10880);
        if(term == null)
          break Fail26508;
      }
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26508;
      term = concat_strings_0_0.instance.invoke(context, generator.constCons4961);
      if(term == null)
        break Fail26508;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}