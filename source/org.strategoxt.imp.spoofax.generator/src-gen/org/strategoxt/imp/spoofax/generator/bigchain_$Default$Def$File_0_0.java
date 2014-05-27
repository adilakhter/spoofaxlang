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

@SuppressWarnings("all") public class bigchain_$Default$Def$File_0_0 extends Strategy 
{ 
  public static bigchain_$Default$Def$File_0_0 instance = new bigchain_$Default$Def$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DefaultDefFile_0_0");
    Fail27754:
    { 
      IStrategoTerm u_4538 = null;
      IStrategoTerm w_4538 = null;
      w_4538 = term;
      Success11190:
      { 
        Fail27755:
        { 
          IStrategoTerm x_4538 = null;
          IStrategoTerm z_4538 = null;
          IStrategoTerm a_4539 = null;
          z_4538 = term;
          x_4538 = generator.const7912;
          a_4539 = z_4538;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4539, x_4538, generator.constCons4561);
          if(term == null)
            break Fail27755;
          if(true)
            break Success11190;
        }
        term = generator.constNil7;
      }
      u_4538 = term;
      term = w_4538;
      term = termFactory.makeTuple(u_4538, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10269.instance);
      if(term == null)
        break Fail27754;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}