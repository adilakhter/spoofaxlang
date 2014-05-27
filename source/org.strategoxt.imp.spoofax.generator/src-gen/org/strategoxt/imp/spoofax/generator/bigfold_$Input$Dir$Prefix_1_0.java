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

@SuppressWarnings("all") public class bigfold_$Input$Dir$Prefix_1_0 extends Strategy 
{ 
  public static bigfold_$Input$Dir$Prefix_1_0 instance = new bigfold_$Input$Dir$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4433)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_InputDirPrefix_1_0");
    Fail27122:
    { 
      IStrategoTerm c_4433 = null;
      IStrategoTerm e_4433 = null;
      e_4433 = term;
      Success11016:
      { 
        Fail27123:
        { 
          IStrategoTerm f_4433 = null;
          IStrategoTerm h_4433 = null;
          IStrategoTerm i_4433 = null;
          h_4433 = term;
          f_4433 = generator.const7147;
          i_4433 = h_4433;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, i_4433, f_4433, generator.constCons4561);
          if(term == null)
            break Fail27123;
          if(true)
            break Success11016;
        }
        term = generator.constNil7;
      }
      c_4433 = term;
      term = e_4433;
      term = termFactory.makeTuple(c_4433, term);
      term = b_4433.invoke(context, term, lifted10051.instance);
      if(term == null)
        break Fail27122;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}