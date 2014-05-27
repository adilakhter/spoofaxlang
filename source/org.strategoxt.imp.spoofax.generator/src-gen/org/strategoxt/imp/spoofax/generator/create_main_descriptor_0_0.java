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

@SuppressWarnings("all") public class create_main_descriptor_0_0 extends Strategy 
{ 
  public static create_main_descriptor_0_0 instance = new create_main_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_main_descriptor_0_0");
    Fail26123:
    { 
      TermReference x_4302 = new TermReference();
      IStrategoTerm y_4302 = null;
      IStrategoTerm z_4302 = null;
      IStrategoTerm b_4303 = null;
      IStrategoTerm c_4303 = null;
      IStrategoTerm e_4303 = null;
      IStrategoTerm f_4303 = null;
      IStrategoTerm g_4303 = null;
      lifted9366 lifted93660 = new lifted9366();
      lifted93660.x_4302 = x_4302;
      term = output_descriptor_file_3_0.instance.invoke(context, term, main_descriptor_name_0_0.instance, lifted93660, lifted9367.instance);
      if(term == null)
        break Fail26123;
      y_4302 = term;
      if(x_4302.value == null)
        break Fail26123;
      term = x_4302.value;
      z_4302 = x_4302.value;
      e_4303 = term;
      b_4303 = generator.const7251;
      f_4303 = e_4303;
      c_4303 = generator.constCons4561;
      g_4303 = f_4303;
      term = termFactory.makeTuple(generator.const7252, z_4302);
      term = dr_set_rule_0_3.instance.invoke(context, g_4303, b_4303, c_4303, term);
      if(term == null)
        break Fail26123;
      term = y_4302;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}