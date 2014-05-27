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

@SuppressWarnings("all") public class innermost_scope_$Source$Path$Name_1_0 extends Strategy 
{ 
  public static innermost_scope_$Source$Path$Name_1_0 instance = new innermost_scope_$Source$Path$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4413)
  { 
    context.push("innermost_scope_SourcePathName_1_0");
    Fail26980:
    { 
      IStrategoTerm f_4413 = null;
      f_4413 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, f_4413, d_4413, generator.const7018);
      if(term == null)
        break Fail26980;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}