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

@SuppressWarnings("all") public class java_to_path_0_0 extends Strategy 
{ 
  public static java_to_path_0_0 instance = new java_to_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("java_to_path_0_0");
    Fail25738:
    { 
      IStrategoTerm f_4255 = null;
      IStrategoTerm g_4255 = null;
      IStrategoTerm j_4255 = null;
      IStrategoTerm k_4255 = null;
      g_4255 = term;
      k_4255 = term;
      term = to_package_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25738;
      j_4255 = term;
      term = k_4255;
      IStrategoList list388;
      list388 = checkListTail(j_4255);
      if(list388 == null)
        break Fail25738;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7128, termFactory.makeListCons(generator.const7134, list388));
      term = create_dirs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25738;
      f_4255 = term;
      term = class_name_0_0.instance.invoke(context, g_4255);
      if(term == null)
        break Fail25738;
      term = termFactory.makeTuple(f_4255, generator.const7009, term, generator.const7136);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25738;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}