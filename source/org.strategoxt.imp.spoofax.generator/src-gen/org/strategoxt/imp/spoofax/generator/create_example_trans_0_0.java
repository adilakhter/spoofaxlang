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

@SuppressWarnings("all") public class create_example_trans_0_0 extends Strategy 
{ 
  public static create_example_trans_0_0 instance = new create_example_trans_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_example_trans_0_0");
    Fail26632:
    { 
      TermReference v_4370 = new TermReference();
      TermReference w_4370 = new TermReference();
      create_example_trans_0_0_fragment_0 create_example_trans_0_0_fragment_00 = new create_example_trans_0_0_fragment_0();
      create_example_trans_0_0_fragment_00.v_4370 = v_4370;
      create_example_trans_0_0_fragment_00.w_4370 = w_4370;
      term = create_example_trans_0_0_fragment_00.invoke(context, term);
      if(term == null)
        break Fail26632;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}