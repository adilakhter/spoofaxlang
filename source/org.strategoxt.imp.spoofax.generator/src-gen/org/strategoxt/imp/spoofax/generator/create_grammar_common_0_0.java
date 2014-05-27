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

@SuppressWarnings("all") public class create_grammar_common_0_0 extends Strategy 
{ 
  public static create_grammar_common_0_0 instance = new create_grammar_common_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_grammar_common_0_0");
    Fail26629:
    { 
      Success10833:
      { 
        Fail26630:
        { 
          term = conc_strings_0_0.instance.invoke(context, generator.const7759);
          if(term == null)
            break Fail26630;
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26630;
          if(true)
            break Success10833;
        }
        IStrategoTerm r_4370 = null;
        IStrategoTerm t_4370 = null;
        IStrategoTerm u_4370 = null;
        term = concat_strings_0_0.instance.invoke(context, generator.constCons5071);
        if(term == null)
          break Fail26629;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        t_4370 = term;
        r_4370 = generator.constCons4964;
        u_4370 = t_4370;
        term = output_text_file_0_2.instance.invoke(context, u_4370, r_4370, generator.const7761);
        if(term == null)
          break Fail26629;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}