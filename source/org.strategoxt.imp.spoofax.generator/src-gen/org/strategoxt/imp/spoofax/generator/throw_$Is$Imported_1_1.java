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

@SuppressWarnings("all") public class throw_$Is$Imported_1_1 extends Strategy 
{ 
  public static throw_$Is$Imported_1_1 instance = new throw_$Is$Imported_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4436, IStrategoTerm o_4436)
  { 
    context.push("throw_IsImported_1_1");
    Fail27141:
    { 
      IStrategoTerm r_4436 = null;
      r_4436 = term;
      term = dr_throw_1_2.instance.invoke(context, r_4436, p_4436, o_4436, generator.const7145);
      if(term == null)
        break Fail27141;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}