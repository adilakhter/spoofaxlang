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

@SuppressWarnings("all") public class create_jdt_prefs_0_0 extends Strategy 
{ 
  public static create_jdt_prefs_0_0 instance = new create_jdt_prefs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_jdt_prefs_0_0");
    Fail26605:
    { 
      IStrategoTerm term10964 = term;
      Success10816:
      { 
        Fail26606:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7736);
          if(term == null)
            break Fail26606;
          if(true)
            break Success10816;
        }
        term = term10964;
        IStrategoTerm h_4367 = null;
        IStrategoTerm l_4367 = null;
        IStrategoTerm n_4367 = null;
        IStrategoTerm o_4367 = null;
        term = get_package_name_text_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26605;
        h_4367 = term;
        term = string_tokenize_1_0.instance.invoke(context, h_4367, lifted9488.instance);
        if(term == null)
          break Fail26605;
        term = concat_strings_0_0.instance.invoke(context, generator.constCons5062);
        if(term == null)
          break Fail26605;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        n_4367 = term;
        l_4367 = generator.constCons5063;
        o_4367 = n_4367;
        term = output_text_file_0_2.instance.invoke(context, o_4367, l_4367, generator.const7739);
        if(term == null)
          break Fail26605;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}