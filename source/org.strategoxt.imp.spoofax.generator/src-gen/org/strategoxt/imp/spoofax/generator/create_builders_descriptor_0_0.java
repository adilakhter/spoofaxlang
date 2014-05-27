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

@SuppressWarnings("all") public class create_builders_descriptor_0_0 extends Strategy 
{ 
  public static create_builders_descriptor_0_0 instance = new create_builders_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_builders_descriptor_0_0");
    Fail26227:
    { 
      TermReference x_4314 = new TermReference();
      TermReference y_4314 = new TermReference();
      lifted9407 lifted94070 = new lifted9407();
      lifted94070.x_4314 = x_4314;
      lifted94070.y_4314 = y_4314;
      term = output_initial_descriptor_file_2_0.instance.invoke(context, term, lifted9406.instance, lifted94070);
      if(term == null)
        break Fail26227;
      term = output_descriptor_file_3_0.instance.invoke(context, term, lifted9408.instance, build_derived_builders_descriptor_0_0.instance, _Id.instance);
      if(term == null)
        break Fail26227;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}