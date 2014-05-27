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

@SuppressWarnings("all") public class bigbagof_$Pack$S$D$F$Table_0_0 extends Strategy 
{ 
  public static bigbagof_$Pack$S$D$F$Table_0_0 instance = new bigbagof_$Pack$S$D$F$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_PackSDFTable_0_0");
    Fail27052:
    { 
      TermReference c_4422 = new TermReference();
      if(c_4422.value == null)
        c_4422.value = term;
      else
        if(c_4422.value != term && !c_4422.value.match(term))
          break Fail27052;
      Success10999:
      { 
        Fail27053:
        { 
          IStrategoTerm f_4422 = null;
          IStrategoTerm h_4422 = null;
          IStrategoTerm i_4422 = null;
          h_4422 = term;
          f_4422 = generator.const7022;
          i_4422 = h_4422;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, i_4422, f_4422, generator.constCons4561);
          if(term == null)
            break Fail27053;
          if(true)
            break Success10999;
        }
        term = generator.constNil7;
      }
      lifted10028 lifted100280 = new lifted10028();
      lifted100280.c_4422 = c_4422;
      term = filter_1_0.instance.invoke(context, term, lifted100280);
      if(term == null)
        break Fail27052;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}