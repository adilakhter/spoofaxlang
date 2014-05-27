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

@SuppressWarnings("all") public class bagof_$Editor$Extensions_0_0 extends Strategy 
{ 
  public static bagof_$Editor$Extensions_0_0 instance = new bagof_$Editor$Extensions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_EditorExtensions_0_0");
    Fail27265:
    { 
      TermReference u_4456 = new TermReference();
      if(u_4456.value == null)
        u_4456.value = term;
      else
        if(u_4456.value != term && !u_4456.value.match(term))
          break Fail27265;
      Success11057:
      { 
        Fail27266:
        { 
          IStrategoTerm x_4456 = null;
          IStrategoTerm z_4456 = null;
          IStrategoTerm a_4457 = null;
          z_4456 = term;
          x_4456 = generator.const7453;
          a_4457 = z_4456;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4457, x_4456, generator.constCons4561);
          if(term == null)
            break Fail27266;
          if(true)
            break Success11057;
        }
        term = generator.constNil7;
      }
      lifted10103 lifted101030 = new lifted10103();
      lifted101030.u_4456 = u_4456;
      term = filter_1_0.instance.invoke(context, term, lifted101030);
      if(term == null)
        break Fail27265;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}