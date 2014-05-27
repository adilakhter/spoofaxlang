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

@SuppressWarnings("all") public class current_main_descriptor_file_0_0 extends Strategy 
{ 
  public static current_main_descriptor_file_0_0 instance = new current_main_descriptor_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("current_main_descriptor_file_0_0");
    Fail26242:
    { 
      IStrategoTerm term10608 = term;
      Success10522:
      { 
        Fail26243:
        { 
          IStrategoTerm m_4319 = null;
          m_4319 = term;
          term = dr_scope_1_1.instance.invoke(context, m_4319, lifted9424.instance, generator.const7147);
          if(term == null)
            break Fail26243;
          if(true)
            break Success10522;
        }
        term = term10608;
        IStrategoTerm y_4319 = null;
        IStrategoTerm k_4319 = null;
        IStrategoTerm z_4319 = null;
        IStrategoTerm a_4320 = null;
        IStrategoTerm c_4320 = null;
        IStrategoTerm d_4320 = null;
        IStrategoTerm e_4320 = null;
        term = main_descriptor_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26242;
        term = termFactory.makeTuple(generator.const7461, term, generator.const7047);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26242;
        y_4319 = term;
        term = warn_0_1.instance.invoke(context, y_4319, generator.const7462);
        if(term == null)
          break Fail26242;
        k_4319 = term;
        c_4320 = term;
        z_4319 = generator.const7463;
        d_4320 = c_4320;
        a_4320 = generator.constCons4561;
        e_4320 = d_4320;
        term = dr_set_rule_0_3.instance.invoke(context, e_4320, z_4319, a_4320, generator.const7464);
        if(term == null)
          break Fail26242;
        term = default_main_descriptor_0_0.instance.invoke(context, k_4319);
        if(term == null)
          break Fail26242;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}