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

@SuppressWarnings("all") public class chain_$Start$Symbol_0_0 extends Strategy 
{ 
  public static chain_$Start$Symbol_0_0 instance = new chain_$Start$Symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_StartSymbol_0_0");
    Fail27310:
    { 
      IStrategoTerm z_4463 = null;
      IStrategoTerm b_4464 = null;
      b_4464 = term;
      Success11068:
      { 
        Fail27311:
        { 
          IStrategoTerm c_4464 = null;
          IStrategoTerm e_4464 = null;
          IStrategoTerm f_4464 = null;
          e_4464 = term;
          c_4464 = generator.const7443;
          f_4464 = e_4464;
          term = dr_lookup_rule_0_2.instance.invoke(context, f_4464, c_4464, generator.constCons4561);
          if(term == null)
            break Fail27311;
          if(true)
            break Success11068;
        }
        term = generator.constNil7;
      }
      z_4463 = term;
      term = b_4464;
      term = termFactory.makeTuple(z_4463, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10117.instance);
      if(term == null)
        break Fail27310;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}