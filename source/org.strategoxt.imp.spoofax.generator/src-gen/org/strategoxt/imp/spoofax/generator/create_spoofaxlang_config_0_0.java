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

@SuppressWarnings("all") public class create_spoofaxlang_config_0_0 extends Strategy 
{ 
  public static create_spoofaxlang_config_0_0 instance = new create_spoofaxlang_config_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spoofaxlang_config_0_0");
    Fail26426:
    { 
      Success10660:
      { 
        Fail26427:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7569);
          if(term == null)
            break Fail26427;
          term = verbose_msg_2_0.instance.invoke(context, term, lifted9477.instance, lifted9478.instance);
          if(term == null)
            break Fail26427;
          if(true)
            break Success10660;
        }
        IStrategoTerm r_4340 = null;
        IStrategoTerm t_4340 = null;
        IStrategoTerm u_4340 = null;
        term = concat_strings_0_0.instance.invoke(context, generator.constCons4952);
        if(term == null)
          break Fail26426;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        t_4340 = term;
        r_4340 = generator.constNil7;
        u_4340 = t_4340;
        term = output_text_file_0_2.instance.invoke(context, u_4340, r_4340, generator.const7569);
        if(term == null)
          break Fail26426;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}