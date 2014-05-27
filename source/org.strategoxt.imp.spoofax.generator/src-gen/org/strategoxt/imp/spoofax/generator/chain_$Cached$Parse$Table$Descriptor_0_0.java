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

@SuppressWarnings("all") public class chain_$Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static chain_$Cached$Parse$Table$Descriptor_0_0 instance = new chain_$Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CachedParseTableDescriptor_0_0");
    Fail27180:
    { 
      IStrategoTerm u_4442 = null;
      IStrategoTerm w_4442 = null;
      w_4442 = term;
      Success11033:
      { 
        Fail27181:
        { 
          IStrategoTerm x_4442 = null;
          IStrategoTerm z_4442 = null;
          IStrategoTerm a_4443 = null;
          z_4442 = term;
          x_4442 = generator.const7154;
          a_4443 = z_4442;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4443, x_4442, generator.constCons4561);
          if(term == null)
            break Fail27181;
          if(true)
            break Success11033;
        }
        term = generator.constNil7;
      }
      u_4442 = term;
      term = w_4442;
      term = termFactory.makeTuple(u_4442, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10072.instance);
      if(term == null)
        break Fail27180;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}