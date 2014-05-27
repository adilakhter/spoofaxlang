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

@SuppressWarnings("all") public class spx_file_relative_path_0_0 extends Strategy 
{ 
  public static spx_file_relative_path_0_0 instance = new spx_file_relative_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("spx_file_relative_path_0_0");
    Fail25791:
    { 
      IStrategoTerm w_4260 = null;
      IStrategoTerm y_4260 = null;
      IStrategoTerm z_4260 = null;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25791;
      term = lower_case_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25791;
      IStrategoTerm term10239 = term;
      Success10184:
      { 
        Fail25792:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25792;
          if(true)
            break Success10184;
        }
        term = term10239;
        IStrategoTerm term10240 = term;
        Success10185:
        { 
          Fail25793:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25793;
            if(true)
              break Success10185;
          }
          term = term10240;
          IStrategoTerm term10241 = term;
          Success10186:
          { 
            Fail25794:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25794;
              if(true)
                break Success10186;
            }
            term = term10241;
            IStrategoTerm term10242 = term;
            Success10187:
            { 
              Fail25795:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25795;
                if(true)
                  break Success10187;
              }
              term = term10242;
              IStrategoTerm s_4260 = null;
              IStrategoTerm t_4260 = null;
              IStrategoTerm v_4260 = null;
              s_4260 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail25791;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25791;
              t_4260 = ((IStrategoList)term).tail();
              v_4260 = t_4260;
              term = report_failure_0_2.instance.invoke(context, v_4260, generator.const7142, s_4260);
              if(term == null)
                break Fail25791;
            }
          }
        }
      }
      y_4260 = term;
      w_4260 = generator.const7143;
      z_4260 = y_4260;
      term = string_replace_0_2.instance.invoke(context, z_4260, w_4260, generator.const7143);
      if(term == null)
        break Fail25791;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25791;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}