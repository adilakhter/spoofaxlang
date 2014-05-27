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

@SuppressWarnings("all") public class create_pp_table_0_0 extends Strategy 
{ 
  public static create_pp_table_0_0 instance = new create_pp_table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_pp_table_0_0");
    Fail26521:
    { 
      IStrategoTerm o_4356 = null;
      IStrategoTerm term10891 = term;
      Success10747:
      { 
        Fail26522:
        { 
          term = get_sdf_main_module_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26522;
          term = termFactory.makeTuple(generator.const7631, term, generator.const7632);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26522;
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26522;
          if(true)
            break Success10747;
        }
        term = term10891;
        IStrategoTerm t_4356 = null;
        IStrategoTerm v_4356 = null;
        IStrategoTerm w_4356 = null;
        IStrategoTerm f_4357 = null;
        IStrategoTerm h_4357 = null;
        IStrategoTerm i_4357 = null;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26521;
        o_4356 = term;
        term = o_4356;
        IStrategoTerm term10892 = term;
        Success10748:
        { 
          Fail26523:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26523;
            if(true)
              break Success10748;
          }
          term = term10892;
          IStrategoTerm term10893 = term;
          Success10749:
          { 
            Fail26524:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26524;
              if(true)
                break Success10749;
            }
            term = term10893;
            IStrategoTerm term10894 = term;
            Success10750:
            { 
              Fail26525:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26525;
                if(true)
                  break Success10750;
              }
              term = term10894;
              IStrategoTerm term10895 = term;
              Success10751:
              { 
                Fail26526:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26526;
                  if(true)
                    break Success10751;
                }
                term = term10895;
                IStrategoTerm p_4356 = null;
                IStrategoTerm q_4356 = null;
                IStrategoTerm s_4356 = null;
                p_4356 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26521;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26521;
                q_4356 = ((IStrategoList)term).tail();
                s_4356 = q_4356;
                term = report_failure_0_2.instance.invoke(context, s_4356, generator.const7633, p_4356);
                if(term == null)
                  break Fail26521;
              }
            }
          }
        }
        v_4356 = term;
        t_4356 = generator.const7143;
        w_4356 = v_4356;
        term = string_replace_0_2.instance.invoke(context, w_4356, t_4356, generator.const7634);
        if(term == null)
          break Fail26521;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7636, termFactory.makeListCons(term, (IStrategoList)generator.constCons4963));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26521;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        h_4357 = term;
        f_4357 = generator.constCons4964;
        i_4357 = h_4357;
        term = termFactory.makeTuple(o_4356, generator.const7632);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26521;
        term = output_text_file_0_2.instance.invoke(context, i_4357, f_4357, term);
        if(term == null)
          break Fail26521;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}