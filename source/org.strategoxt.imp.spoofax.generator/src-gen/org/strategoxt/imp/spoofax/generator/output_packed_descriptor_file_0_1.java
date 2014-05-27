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

@SuppressWarnings("all") public class output_packed_descriptor_file_0_1 extends Strategy 
{ 
  public static output_packed_descriptor_file_0_1 instance = new output_packed_descriptor_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4254)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_packed_descriptor_file_0_1");
    Fail25731:
    { 
      IStrategoTerm d_4254 = null;
      IStrategoTerm e_4254 = null;
      IStrategoTerm l_4254 = null;
      IStrategoTerm n_4254 = null;
      e_4254 = term;
      IStrategoTerm term10224 = term;
      Success10173:
      { 
        Fail25732:
        { 
          term = generator.const7132;
          d_4254 = generator.const7132;
          term = termFactory.makeTuple(term, generator.const7009, b_4254);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25732;
          if(true)
            break Success10173;
        }
        term = term10224;
        TermReference f_4254 = new TermReference();
        if(f_4254.value == null)
          f_4254.value = term;
        else
          if(f_4254.value != term && !f_4254.value.match(term))
            break Fail25731;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail25731;
        lifted9210 lifted92100 = new lifted9210();
        lifted92100.f_4254 = f_4254;
        term = report_failure_1_0.instance.invoke(context, term, lifted92100);
        if(term == null)
          break Fail25731;
      }
      term = write_to_string_0_0.instance.invoke(context, e_4254);
      if(term == null)
        break Fail25731;
      l_4254 = term;
      if(d_4254 == null)
        break Fail25731;
      term = (IStrategoTerm)termFactory.makeListCons(d_4254, (IStrategoList)generator.constNil7);
      term = print_filename_0_2.instance.invoke(context, l_4254, term, b_4254);
      if(term == null)
        break Fail25731;
      n_4254 = term;
      if(d_4254 == null)
        break Fail25731;
      term = (IStrategoTerm)termFactory.makeListCons(d_4254, (IStrategoList)generator.constNil7);
      term = output_text_file_p__0_2.instance.invoke(context, n_4254, term, b_4254);
      if(term == null)
        break Fail25731;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}