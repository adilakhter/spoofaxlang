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

@SuppressWarnings("all") public class bagof_$Pack$S$D$F$Table_0_0 extends Strategy 
{ 
  public static bagof_$Pack$S$D$F$Table_0_0 instance = new bagof_$Pack$S$D$F$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_PackSDFTable_0_0");
    Fail27057:
    { 
      TermReference c_4423 = new TermReference();
      if(c_4423.value == null)
        c_4423.value = term;
      else
        if(c_4423.value != term && !c_4423.value.match(term))
          break Fail27057;
      Success11001:
      { 
        Fail27058:
        { 
          IStrategoTerm f_4423 = null;
          IStrategoTerm h_4423 = null;
          IStrategoTerm i_4423 = null;
          h_4423 = term;
          f_4423 = generator.const7022;
          i_4423 = h_4423;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4423, f_4423, generator.constCons4561);
          if(term == null)
            break Fail27058;
          if(true)
            break Success11001;
        }
        term = generator.constNil7;
      }
      lifted10031 lifted100310 = new lifted10031();
      lifted100310.c_4423 = c_4423;
      term = filter_1_0.instance.invoke(context, term, lifted100310);
      if(term == null)
        break Fail27057;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}