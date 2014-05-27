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

@SuppressWarnings("all") public class configure_main_descriptor_0_0 extends Strategy 
{ 
  public static configure_main_descriptor_0_0 instance = new configure_main_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("configure_main_descriptor_0_0");
    Fail26237:
    { 
      IStrategoTerm l_4316 = null;
      IStrategoTerm m_4316 = null;
      IStrategoTerm g_4317 = null;
      IStrategoTerm h_4317 = null;
      IStrategoTerm j_4317 = null;
      IStrategoTerm k_4317 = null;
      IStrategoTerm l_4317 = null;
      IStrategoTerm n_4317 = null;
      IStrategoTerm x_4317 = null;
      IStrategoTerm j_4318 = null;
      IStrategoTerm v_4318 = null;
      term = current_main_descriptor_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26237;
      l_4316 = term;
      m_4316 = term;
      j_4317 = term;
      g_4317 = generator.const7251;
      k_4317 = j_4317;
      h_4317 = generator.constCons4561;
      l_4317 = k_4317;
      term = termFactory.makeTuple(generator.const7252, m_4316);
      term = dr_set_rule_0_3.instance.invoke(context, l_4317, g_4317, h_4317, term);
      if(term == null)
        break Fail26237;
      term = l_4316;
      n_4317 = l_4316;
      Success10518:
      { 
        Fail26238:
        { 
          term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26238;
          { 
            term = generator.const7437;
            if(true)
              break Success10518;
          }
        }
        term = generator.const7438;
      }
      term = require_option_1_1.instance.invoke(context, n_4317, lifted9411.instance, term);
      if(term == null)
        break Fail26237;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9413.instance, get_sdf_main_module_0_0.instance);
      if(term == null)
        break Fail26237;
      x_4317 = term;
      Success10519:
      { 
        Fail26239:
        { 
          term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26239;
          { 
            term = generator.const7441;
            if(true)
              break Success10519;
          }
        }
        term = generator.const7442;
      }
      term = require_option_1_1.instance.invoke(context, x_4317, lifted9415.instance, term);
      if(term == null)
        break Fail26237;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9416.instance, $Start$Symbol_0_0.instance);
      if(term == null)
        break Fail26237;
      j_4318 = term;
      Success10520:
      { 
        Fail26240:
        { 
          term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26240;
          { 
            term = generator.const7446;
            if(true)
              break Success10520;
          }
        }
        term = generator.const7447;
      }
      term = require_option_1_1.instance.invoke(context, j_4318, lifted9418.instance, term);
      if(term == null)
        break Fail26237;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9419.instance, $Base$Package_0_0.instance);
      if(term == null)
        break Fail26237;
      v_4318 = term;
      Success10521:
      { 
        Fail26241:
        { 
          term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26241;
          { 
            term = generator.const7451;
            if(true)
              break Success10521;
          }
        }
        term = generator.const7452;
      }
      term = require_option_1_1.instance.invoke(context, v_4318, lifted9421.instance, term);
      if(term == null)
        break Fail26237;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9422.instance, $Editor$Extensions_0_0.instance);
      if(term == null)
        break Fail26237;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}