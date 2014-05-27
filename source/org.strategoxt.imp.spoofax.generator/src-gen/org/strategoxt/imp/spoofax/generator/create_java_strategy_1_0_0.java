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

@SuppressWarnings("all") public class create_java_strategy_1_0_0 extends Strategy 
{ 
  public static create_java_strategy_1_0_0 instance = new create_java_strategy_1_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_java_strategy_1_0_0");
    Fail26608:
    { 
      IStrategoTerm p_4367 = null;
      IStrategoTerm q_4367 = null;
      IStrategoTerm term10965 = term;
      Success10817:
      { 
        Fail26609:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7740);
          if(term == null)
            break Fail26609;
          if(true)
            break Success10817;
        }
        term = term10965;
        IStrategoTerm z_4367 = null;
        IStrategoTerm v_4367 = null;
        IStrategoTerm x_4367 = null;
        IStrategoTerm y_4367 = null;
        IStrategoTerm f_4368 = null;
        IStrategoTerm h_4368 = null;
        IStrategoTerm i_4368 = null;
        IStrategoTerm j_4368 = null;
        IStrategoTerm k_4368 = null;
        term = get_package_name_text_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26608;
        z_4367 = term;
        p_4367 = term;
        term = string_tokenize_1_0.instance.invoke(context, z_4367, lifted9489.instance);
        if(term == null)
          break Fail26608;
        q_4367 = term;
        term = p_4367;
        IStrategoTerm term10966 = term;
        Success10818:
        { 
          Fail26610:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26610;
            if(true)
              break Success10818;
          }
          term = term10966;
          IStrategoTerm term10967 = term;
          Success10819:
          { 
            Fail26611:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26611;
              if(true)
                break Success10819;
            }
            term = term10967;
            IStrategoTerm term10968 = term;
            Success10820:
            { 
              Fail26612:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26612;
                if(true)
                  break Success10820;
              }
              term = term10968;
              IStrategoTerm term10969 = term;
              Success10821:
              { 
                Fail26613:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26613;
                  if(true)
                    break Success10821;
                }
                term = term10969;
                IStrategoTerm r_4367 = null;
                IStrategoTerm s_4367 = null;
                IStrategoTerm u_4367 = null;
                r_4367 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26608;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26608;
                s_4367 = ((IStrategoList)term).tail();
                u_4367 = s_4367;
                term = report_failure_0_2.instance.invoke(context, u_4367, generator.const7741, r_4367);
                if(term == null)
                  break Fail26608;
              }
            }
          }
        }
        x_4367 = term;
        v_4367 = generator.const7143;
        y_4367 = x_4367;
        term = string_replace_0_2.instance.invoke(context, y_4367, v_4367, generator.const7162);
        if(term == null)
          break Fail26608;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(term, (IStrategoList)generator.constCons5067));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26608;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        h_4368 = term;
        j_4368 = term;
        term = termFactory.makeTuple(q_4367, generator.constCons5068);
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26608;
        i_4368 = term;
        term = j_4368;
        IStrategoList list405;
        list405 = checkListTail(i_4368);
        if(list405 == null)
          break Fail26608;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7128, termFactory.makeListCons(generator.const7134, list405));
        f_4368 = term;
        k_4368 = h_4368;
        term = output_text_file_0_2.instance.invoke(context, k_4368, f_4368, generator.const7745);
        if(term == null)
          break Fail26608;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}