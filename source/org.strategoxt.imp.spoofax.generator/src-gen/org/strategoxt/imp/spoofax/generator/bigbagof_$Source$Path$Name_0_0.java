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

@SuppressWarnings("all") public class bigbagof_$Source$Path$Name_0_0 extends Strategy 
{ 
  public static bigbagof_$Source$Path$Name_0_0 instance = new bigbagof_$Source$Path$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_SourcePathName_0_0");
    Fail27026:
    { 
      TermReference z_4417 = new TermReference();
      TermReference a_4418 = new TermReference();
      if(a_4418.value == null)
        a_4418.value = term;
      else
        if(a_4418.value != term && !a_4418.value.match(term))
          break Fail27026;
      if(z_4417.value == null)
        z_4417.value = term;
      else
        if(z_4417.value != term && !z_4417.value.match(term))
          break Fail27026;
      Success10992:
      { 
        Fail27027:
        { 
          IStrategoTerm e_4418 = null;
          e_4418 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4418, generator.const7018, a_4418.value);
          if(term == null)
            break Fail27027;
          if(true)
            break Success10992;
        }
        term = generator.constNil7;
      }
      lifted10019 lifted100190 = new lifted10019();
      lifted100190.z_4417 = z_4417;
      lifted100190.a_4418 = a_4418;
      term = filter_1_0.instance.invoke(context, term, lifted100190);
      if(term == null)
        break Fail27026;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}