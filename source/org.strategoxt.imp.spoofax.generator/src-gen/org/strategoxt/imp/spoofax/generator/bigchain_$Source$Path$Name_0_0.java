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

@SuppressWarnings("all") public class bigchain_$Source$Path$Name_0_0 extends Strategy 
{ 
  public static bigchain_$Source$Path$Name_0_0 instance = new bigchain_$Source$Path$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_SourcePathName_0_0");
    Fail27022:
    { 
      IStrategoTerm e_4417 = null;
      IStrategoTerm h_4417 = null;
      IStrategoTerm j_4417 = null;
      e_4417 = term;
      j_4417 = term;
      Success10990:
      { 
        Fail27023:
        { 
          IStrategoTerm l_4417 = null;
          l_4417 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, l_4417, generator.const7018, e_4417);
          if(term == null)
            break Fail27023;
          if(true)
            break Success10990;
        }
        term = generator.constNil7;
      }
      h_4417 = term;
      term = j_4417;
      term = termFactory.makeTuple(h_4417, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10017.instance);
      if(term == null)
        break Fail27022;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}