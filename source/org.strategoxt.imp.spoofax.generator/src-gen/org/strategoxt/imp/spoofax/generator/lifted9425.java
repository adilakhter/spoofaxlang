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

@SuppressWarnings("all") final class lifted9425 extends Strategy 
{ 
  public static final lifted9425 instance = new lifted9425();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28651:
    { 
      IStrategoTerm j_4319 = null;
      IStrategoTerm p_4319 = null;
      IStrategoTerm q_4319 = null;
      IStrategoTerm s_4319 = null;
      IStrategoTerm t_4319 = null;
      IStrategoTerm u_4319 = null;
      term = verbose_msg_1_0.instance.invoke(context, term, lifted9426.instance);
      if(term == null)
        break Fail28651;
      term = add_input_dir_prefix_0_0.instance.invoke(context, generator.const7457);
      if(term == null)
        break Fail28651;
      j_4319 = term;
      s_4319 = term;
      p_4319 = generator.const7458;
      t_4319 = s_4319;
      q_4319 = generator.const7459;
      u_4319 = t_4319;
      term = dr_set_rule_0_3.instance.invoke(context, u_4319, p_4319, q_4319, generator.const7460);
      if(term == null)
        break Fail28651;
      term = main_descriptor_name_0_0.instance.invoke(context, j_4319);
      if(term == null)
        break Fail28651;
      term = input_descriptor_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28651;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9427.instance, main_descriptor_name_0_0.instance);
      if(term == null)
        break Fail28651;
      if(true)
        return term;
    }
    return null;
  }
}