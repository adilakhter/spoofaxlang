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

@SuppressWarnings("all") public class chain_$Source$Path$Name_0_0 extends Strategy 
{ 
  public static chain_$Source$Path$Name_0_0 instance = new chain_$Source$Path$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_SourcePathName_0_0");
    Fail27024:
    { 
      IStrategoTerm p_4417 = null;
      IStrategoTerm s_4417 = null;
      IStrategoTerm u_4417 = null;
      p_4417 = term;
      u_4417 = term;
      Success10991:
      { 
        Fail27025:
        { 
          IStrategoTerm w_4417 = null;
          w_4417 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4417, generator.const7018, p_4417);
          if(term == null)
            break Fail27025;
          if(true)
            break Success10991;
        }
        term = generator.constNil7;
      }
      s_4417 = term;
      term = u_4417;
      term = termFactory.makeTuple(s_4417, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10018.instance);
      if(term == null)
        break Fail27024;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}