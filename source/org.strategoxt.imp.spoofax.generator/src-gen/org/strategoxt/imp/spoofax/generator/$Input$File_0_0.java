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

@SuppressWarnings("all") public class $Input$File_0_0 extends Strategy 
{ 
  public static $Input$File_0_0 instance = new $Input$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("InputFile_0_0");
    Fail27531:
    { 
      TermReference x_4500 = new TermReference();
      IStrategoTerm a_4501 = null;
      IStrategoTerm c_4501 = null;
      IStrategoTerm d_4501 = null;
      if(x_4500.value == null)
        x_4500.value = term;
      else
        if(x_4500.value != term && !x_4500.value.match(term))
          break Fail27531;
      c_4501 = term;
      a_4501 = generator.const7868;
      d_4501 = c_4501;
      term = dr_lookup_rule_0_2.instance.invoke(context, d_4501, a_4501, generator.constCons4561);
      if(term == null)
        break Fail27531;
      lifted10194 lifted101940 = new lifted10194();
      lifted101940.x_4500 = x_4500;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101940);
      if(term == null)
        break Fail27531;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}