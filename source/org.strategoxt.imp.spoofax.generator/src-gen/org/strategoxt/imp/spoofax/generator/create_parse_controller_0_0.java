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

@SuppressWarnings("all") public class create_parse_controller_0_0 extends Strategy 
{ 
  public static create_parse_controller_0_0 instance = new create_parse_controller_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_parse_controller_0_0");
    Fail26598:
    { 
      TermReference n_4365 = new TermReference();
      TermReference o_4365 = new TermReference();
      TermReference p_4365 = new TermReference();
      TermReference q_4365 = new TermReference();
      TermReference r_4365 = new TermReference();
      TermReference n_4689 = new TermReference();
      TermReference o_4689 = new TermReference();
      TermReference p_4689 = new TermReference();
      TermReference q_4689 = new TermReference();
      term = get_main_class_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26598;
      term = termFactory.makeTuple(term, generator.const7671);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26598;
      if(p_4365.value == null)
        p_4365.value = term;
      else
        if(p_4365.value != term && !p_4365.value.match(term))
          break Fail26598;
      if(p_4365.value == null)
        break Fail26598;
      term = termFactory.makeTuple(p_4365.value, generator.const7726);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26598;
      if(q_4365.value == null)
        q_4365.value = term;
      else
        if(q_4365.value != term && !q_4365.value.match(term))
          break Fail26598;
      term = get_package_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26598;
      if(o_4365.value == null)
        o_4365.value = term;
      else
        if(o_4365.value != term && !o_4365.value.match(term))
          break Fail26598;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26598;
      if(n_4365.value == null)
        n_4365.value = term;
      else
        if(n_4365.value != term && !n_4365.value.match(term))
          break Fail26598;
      create_parse_controller_0_0_fragment_0 create_parse_controller_0_0_fragment_00 = new create_parse_controller_0_0_fragment_0();
      create_parse_controller_0_0_fragment_00.n_4365 = n_4365;
      create_parse_controller_0_0_fragment_00.q_4689 = q_4689;
      create_parse_controller_0_0_fragment_00.p_4689 = p_4689;
      create_parse_controller_0_0_fragment_00.o_4689 = o_4689;
      create_parse_controller_0_0_fragment_00.n_4689 = n_4689;
      create_parse_controller_0_0_fragment_00.o_4365 = o_4365;
      create_parse_controller_0_0_fragment_00.p_4365 = p_4365;
      create_parse_controller_0_0_fragment_00.q_4365 = q_4365;
      create_parse_controller_0_0_fragment_00.r_4365 = r_4365;
      term = create_parse_controller_0_0_fragment_00.invoke(context, term);
      if(term == null)
        break Fail26598;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}