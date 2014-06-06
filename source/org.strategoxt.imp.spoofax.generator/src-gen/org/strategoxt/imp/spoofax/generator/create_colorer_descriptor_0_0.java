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

@SuppressWarnings("all") public class create_colorer_descriptor_0_0 extends Strategy 
{ 
  public static create_colorer_descriptor_0_0 instance = new create_colorer_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_colorer_descriptor_0_0");
    Fail26207:
    { 
      term = output_initial_descriptor_file_2_0.instance.invoke(context, term, lifted9401.instance, build_derived_colorer_descriptor_0_0.instance);
      if(term == null)
        break Fail26207;
      term = output_descriptor_file_3_0.instance.invoke(context, term, lifted9403.instance, build_derived_colorer_descriptor_0_0.instance, _Id.instance);
      if(term == null)
        break Fail26207;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}