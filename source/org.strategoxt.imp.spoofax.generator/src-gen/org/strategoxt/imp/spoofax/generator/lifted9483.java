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

@SuppressWarnings("all") final class lifted9483 extends Strategy 
{ 
  TermReference a_4366;

  TermReference b_4366;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28547:
    { 
      IStrategoTerm term10960 = term;
      Success11285:
      { 
        Fail28548:
        { 
          IStrategoTerm h_4366 = null;
          IStrategoTerm i_4366 = null;
          IStrategoTerm k_4366 = null;
          IStrategoTerm l_4366 = null;
          IStrategoTerm m_4366 = null;
          k_4366 = term;
          h_4366 = generator.const7458;
          l_4366 = k_4366;
          i_4366 = generator.const7459;
          m_4366 = l_4366;
          term = dr_set_rule_0_3.instance.invoke(context, m_4366, h_4366, i_4366, generator.const7727);
          if(term == null)
            break Fail28548;
          term = add_input_dir_prefix_0_0.instance.invoke(context, generator.const7457);
          if(term == null)
            break Fail28548;
          term = packed_descriptor_file_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28548;
          if(b_4366.value == null)
            b_4366.value = term;
          else
            if(b_4366.value != term && !b_4366.value.match(term))
              break Fail28548;
          term = main_descriptor_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28548;
          if(a_4366.value == null)
            a_4366.value = term;
          else
            if(a_4366.value != term && !a_4366.value.match(term))
              break Fail28548;
          if(a_4366.value == null)
            break Fail28548;
          term = input_descriptor_file_0_0.instance.invoke(context, a_4366.value);
          if(term == null)
            break Fail28548;
          term = remove_empty_sections_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28548;
          term = output_packed_descriptor_file_0_1.instance.invoke(context, term, b_4366.value);
          if(term == null)
            break Fail28548;
          if(true)
            break Success11285;
        }
        term = term10960;
        IStrategoTerm s_4366 = null;
        s_4366 = term;
        term = fatal_err_msg_0_1.instance.invoke(context, s_4366, generator.const7728);
        if(term == null)
          break Fail28547;
      }
      if(true)
        return term;
    }
    return null;
  }
}