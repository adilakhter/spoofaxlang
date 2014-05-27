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

@SuppressWarnings("all") public class bigbagof_$Default$Def$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Default$Def$File_0_0 instance = new bigbagof_$Default$Def$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_DefaultDefFile_0_0");
    Fail27758:
    { 
      TermReference o_4539 = new TermReference();
      if(o_4539.value == null)
        o_4539.value = term;
      else
        if(o_4539.value != term && !o_4539.value.match(term))
          break Fail27758;
      Success11192:
      { 
        Fail27759:
        { 
          IStrategoTerm r_4539 = null;
          IStrategoTerm t_4539 = null;
          IStrategoTerm u_4539 = null;
          t_4539 = term;
          r_4539 = generator.const7912;
          u_4539 = t_4539;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, u_4539, r_4539, generator.constCons4561);
          if(term == null)
            break Fail27759;
          if(true)
            break Success11192;
        }
        term = generator.constNil7;
      }
      lifted10271 lifted102710 = new lifted10271();
      lifted102710.o_4539 = o_4539;
      term = filter_1_0.instance.invoke(context, term, lifted102710);
      if(term == null)
        break Fail27758;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}