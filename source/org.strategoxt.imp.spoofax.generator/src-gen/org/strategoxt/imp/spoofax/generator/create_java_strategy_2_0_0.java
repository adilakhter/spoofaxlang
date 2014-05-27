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

@SuppressWarnings("all") public class create_java_strategy_2_0_0 extends Strategy 
{ 
  public static create_java_strategy_2_0_0 instance = new create_java_strategy_2_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_java_strategy_2_0_0");
    Fail26614:
    { 
      IStrategoTerm l_4368 = null;
      IStrategoTerm m_4368 = null;
      IStrategoTerm term10970 = term;
      Success10822:
      { 
        Fail26615:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7746);
          if(term == null)
            break Fail26615;
          if(true)
            break Success10822;
        }
        term = term10970;
        IStrategoTerm v_4368 = null;
        IStrategoTerm r_4368 = null;
        IStrategoTerm t_4368 = null;
        IStrategoTerm u_4368 = null;
        IStrategoTerm b_4369 = null;
        IStrategoTerm d_4369 = null;
        IStrategoTerm e_4369 = null;
        IStrategoTerm f_4369 = null;
        IStrategoTerm g_4369 = null;
        term = get_package_name_text_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26614;
        v_4368 = term;
        l_4368 = term;
        term = string_tokenize_1_0.instance.invoke(context, v_4368, lifted9490.instance);
        if(term == null)
          break Fail26614;
        m_4368 = term;
        term = l_4368;
        IStrategoTerm term10971 = term;
        Success10823:
        { 
          Fail26616:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26616;
            if(true)
              break Success10823;
          }
          term = term10971;
          IStrategoTerm term10972 = term;
          Success10824:
          { 
            Fail26617:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26617;
              if(true)
                break Success10824;
            }
            term = term10972;
            IStrategoTerm term10973 = term;
            Success10825:
            { 
              Fail26618:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26618;
                if(true)
                  break Success10825;
              }
              term = term10973;
              IStrategoTerm term10974 = term;
              Success10826:
              { 
                Fail26619:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26619;
                  if(true)
                    break Success10826;
                }
                term = term10974;
                IStrategoTerm n_4368 = null;
                IStrategoTerm o_4368 = null;
                IStrategoTerm q_4368 = null;
                n_4368 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26614;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26614;
                o_4368 = ((IStrategoList)term).tail();
                q_4368 = o_4368;
                term = report_failure_0_2.instance.invoke(context, q_4368, generator.const7747, n_4368);
                if(term == null)
                  break Fail26614;
              }
            }
          }
        }
        t_4368 = term;
        r_4368 = generator.const7143;
        u_4368 = t_4368;
        term = string_replace_0_2.instance.invoke(context, u_4368, r_4368, generator.const7162);
        if(term == null)
          break Fail26614;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(term, (IStrategoList)generator.constCons5069));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26614;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        d_4369 = term;
        f_4369 = term;
        term = termFactory.makeTuple(m_4368, generator.constCons5068);
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26614;
        e_4369 = term;
        term = f_4369;
        IStrategoList list406;
        list406 = checkListTail(e_4369);
        if(list406 == null)
          break Fail26614;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7128, termFactory.makeListCons(generator.const7134, list406));
        b_4369 = term;
        g_4369 = d_4369;
        term = output_text_file_0_2.instance.invoke(context, g_4369, b_4369, generator.const7749);
        if(term == null)
          break Fail26614;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}