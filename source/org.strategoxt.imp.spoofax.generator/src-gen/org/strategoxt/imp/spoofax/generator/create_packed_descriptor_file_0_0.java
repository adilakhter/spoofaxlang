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

@SuppressWarnings("all") public class create_packed_descriptor_file_0_0 extends Strategy 
{ 
  public static create_packed_descriptor_file_0_0 instance = new create_packed_descriptor_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_packed_descriptor_file_0_0");
    Fail26599:
    { 
      TermReference a_4366 = new TermReference();
      TermReference b_4366 = new TermReference();
      IStrategoTerm d_4366 = null;
      IStrategoTerm e_4366 = null;
      e_4366 = term;
      d_4366 = generator.const7147;
      term = e_4366;
      lifted9482 lifted94820 = new lifted9482();
      lifted94820.a_4366 = a_4366;
      lifted94820.b_4366 = b_4366;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94820, d_4366);
      if(term == null)
        break Fail26599;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}