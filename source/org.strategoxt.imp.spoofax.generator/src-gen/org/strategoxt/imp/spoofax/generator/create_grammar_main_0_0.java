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

@SuppressWarnings("all") public class create_grammar_main_0_0 extends Strategy 
{ 
  public static create_grammar_main_0_0 instance = new create_grammar_main_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_grammar_main_0_0");
    Fail26627:
    { 
      IStrategoTerm e_4370 = null;
      IStrategoTerm term10980 = term;
      Success10832:
      { 
        Fail26628:
        { 
          term = get_sdf_main_module_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26628;
          term = termFactory.makeTuple(generator.const7631, term, generator.const7008);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26628;
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26628;
          if(true)
            break Success10832;
        }
        term = term10980;
        IStrategoTerm j_4370 = null;
        IStrategoTerm l_4370 = null;
        IStrategoTerm n_4370 = null;
        IStrategoTerm o_4370 = null;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26627;
        e_4370 = term;
        term = $Start$Symbol_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26627;
        j_4370 = term;
        term = termFactory.makeTuple(generator.const7754, e_4370, generator.const7755, e_4370, generator.const7756, j_4370, generator.const7757, j_4370, generator.const7758);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26627;
        n_4370 = term;
        l_4370 = generator.constCons4964;
        o_4370 = n_4370;
        term = termFactory.makeTuple(e_4370, generator.const7008);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26627;
        term = output_text_file_0_2.instance.invoke(context, o_4370, l_4370, term);
        if(term == null)
          break Fail26627;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}