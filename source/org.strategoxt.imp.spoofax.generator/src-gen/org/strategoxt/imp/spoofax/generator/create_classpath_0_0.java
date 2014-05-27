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

@SuppressWarnings("all") public class create_classpath_0_0 extends Strategy 
{ 
  public static create_classpath_0_0 instance = new create_classpath_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_classpath_0_0");
    Fail26666:
    { 
      Success10865:
      { 
        Fail26667:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7816);
          if(term == null)
            break Fail26667;
          if(true)
            break Success10865;
        }
        IStrategoTerm z_4383 = null;
        IStrategoTerm b_4384 = null;
        IStrategoTerm c_4384 = null;
        term = concat_strings_0_0.instance.invoke(context, generator.constCons5111);
        if(term == null)
          break Fail26666;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        b_4384 = term;
        z_4383 = generator.constNil7;
        c_4384 = b_4384;
        term = output_text_file_0_2.instance.invoke(context, c_4384, z_4383, generator.const7816);
        if(term == null)
          break Fail26666;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}