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

@SuppressWarnings("all") public class fold_$Start$Symbol_1_0 extends Strategy 
{ 
  public static fold_$Start$Symbol_1_0 instance = new fold_$Start$Symbol_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4463)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_StartSymbol_1_0");
    Fail27306:
    { 
      IStrategoTerm d_4463 = null;
      IStrategoTerm f_4463 = null;
      f_4463 = term;
      Success11066:
      { 
        Fail27307:
        { 
          IStrategoTerm g_4463 = null;
          IStrategoTerm i_4463 = null;
          IStrategoTerm j_4463 = null;
          i_4463 = term;
          g_4463 = generator.const7443;
          j_4463 = i_4463;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4463, g_4463, generator.constCons4561);
          if(term == null)
            break Fail27307;
          if(true)
            break Success11066;
        }
        term = generator.constNil7;
      }
      d_4463 = term;
      term = f_4463;
      term = termFactory.makeTuple(d_4463, term);
      term = c_4463.invoke(context, term, lifted10115.instance);
      if(term == null)
        break Fail27306;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}