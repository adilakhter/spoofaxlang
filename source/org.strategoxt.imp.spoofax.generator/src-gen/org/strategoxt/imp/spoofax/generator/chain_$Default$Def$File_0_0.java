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

@SuppressWarnings("all") public class chain_$Default$Def$File_0_0 extends Strategy 
{ 
  public static chain_$Default$Def$File_0_0 instance = new chain_$Default$Def$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_DefaultDefFile_0_0");
    Fail27756:
    { 
      IStrategoTerm f_4539 = null;
      IStrategoTerm h_4539 = null;
      h_4539 = term;
      Success11191:
      { 
        Fail27757:
        { 
          IStrategoTerm i_4539 = null;
          IStrategoTerm k_4539 = null;
          IStrategoTerm l_4539 = null;
          k_4539 = term;
          i_4539 = generator.const7912;
          l_4539 = k_4539;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4539, i_4539, generator.constCons4561);
          if(term == null)
            break Fail27757;
          if(true)
            break Success11191;
        }
        term = generator.constNil7;
      }
      f_4539 = term;
      term = h_4539;
      term = termFactory.makeTuple(f_4539, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10270.instance);
      if(term == null)
        break Fail27756;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}