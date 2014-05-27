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

@SuppressWarnings("all") public class bigbagof_$Start$Symbol_0_0 extends Strategy 
{ 
  public static bigbagof_$Start$Symbol_0_0 instance = new bigbagof_$Start$Symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_StartSymbol_0_0");
    Fail27312:
    { 
      TermReference i_4464 = new TermReference();
      if(i_4464.value == null)
        i_4464.value = term;
      else
        if(i_4464.value != term && !i_4464.value.match(term))
          break Fail27312;
      Success11069:
      { 
        Fail27313:
        { 
          IStrategoTerm l_4464 = null;
          IStrategoTerm n_4464 = null;
          IStrategoTerm o_4464 = null;
          n_4464 = term;
          l_4464 = generator.const7443;
          o_4464 = n_4464;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4464, l_4464, generator.constCons4561);
          if(term == null)
            break Fail27313;
          if(true)
            break Success11069;
        }
        term = generator.constNil7;
      }
      lifted10118 lifted101180 = new lifted10118();
      lifted101180.i_4464 = i_4464;
      term = filter_1_0.instance.invoke(context, term, lifted101180);
      if(term == null)
        break Fail27312;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}