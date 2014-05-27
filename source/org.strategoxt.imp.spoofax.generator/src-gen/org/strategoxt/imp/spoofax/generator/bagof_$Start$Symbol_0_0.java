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

@SuppressWarnings("all") public class bagof_$Start$Symbol_0_0 extends Strategy 
{ 
  public static bagof_$Start$Symbol_0_0 instance = new bagof_$Start$Symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_StartSymbol_0_0");
    Fail27317:
    { 
      TermReference i_4465 = new TermReference();
      if(i_4465.value == null)
        i_4465.value = term;
      else
        if(i_4465.value != term && !i_4465.value.match(term))
          break Fail27317;
      Success11071:
      { 
        Fail27318:
        { 
          IStrategoTerm l_4465 = null;
          IStrategoTerm n_4465 = null;
          IStrategoTerm o_4465 = null;
          n_4465 = term;
          l_4465 = generator.const7443;
          o_4465 = n_4465;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4465, l_4465, generator.constCons4561);
          if(term == null)
            break Fail27318;
          if(true)
            break Success11071;
        }
        term = generator.constNil7;
      }
      lifted10121 lifted101210 = new lifted10121();
      lifted101210.i_4465 = i_4465;
      term = filter_1_0.instance.invoke(context, term, lifted101210);
      if(term == null)
        break Fail27317;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}