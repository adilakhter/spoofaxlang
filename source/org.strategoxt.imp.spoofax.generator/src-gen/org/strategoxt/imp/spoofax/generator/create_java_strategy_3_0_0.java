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

@SuppressWarnings("all") public class create_java_strategy_3_0_0 extends Strategy 
{ 
  public static create_java_strategy_3_0_0 instance = new create_java_strategy_3_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_java_strategy_3_0_0");
    Fail26620:
    { 
      IStrategoTerm h_4369 = null;
      IStrategoTerm i_4369 = null;
      IStrategoTerm term10975 = term;
      Success10827:
      { 
        Fail26621:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7750);
          if(term == null)
            break Fail26621;
          if(true)
            break Success10827;
        }
        term = term10975;
        IStrategoTerm r_4369 = null;
        IStrategoTerm n_4369 = null;
        IStrategoTerm p_4369 = null;
        IStrategoTerm q_4369 = null;
        IStrategoTerm x_4369 = null;
        IStrategoTerm z_4369 = null;
        IStrategoTerm a_4370 = null;
        IStrategoTerm b_4370 = null;
        IStrategoTerm c_4370 = null;
        term = get_package_name_text_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26620;
        r_4369 = term;
        h_4369 = term;
        term = string_tokenize_1_0.instance.invoke(context, r_4369, lifted9491.instance);
        if(term == null)
          break Fail26620;
        i_4369 = term;
        term = h_4369;
        IStrategoTerm term10976 = term;
        Success10828:
        { 
          Fail26622:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26622;
            if(true)
              break Success10828;
          }
          term = term10976;
          IStrategoTerm term10977 = term;
          Success10829:
          { 
            Fail26623:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26623;
              if(true)
                break Success10829;
            }
            term = term10977;
            IStrategoTerm term10978 = term;
            Success10830:
            { 
              Fail26624:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26624;
                if(true)
                  break Success10830;
              }
              term = term10978;
              IStrategoTerm term10979 = term;
              Success10831:
              { 
                Fail26625:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26625;
                  if(true)
                    break Success10831;
                }
                term = term10979;
                IStrategoTerm j_4369 = null;
                IStrategoTerm k_4369 = null;
                IStrategoTerm m_4369 = null;
                j_4369 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26620;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26620;
                k_4369 = ((IStrategoList)term).tail();
                m_4369 = k_4369;
                term = report_failure_0_2.instance.invoke(context, m_4369, generator.const7751, j_4369);
                if(term == null)
                  break Fail26620;
              }
            }
          }
        }
        p_4369 = term;
        n_4369 = generator.const7143;
        q_4369 = p_4369;
        term = string_replace_0_2.instance.invoke(context, q_4369, n_4369, generator.const7162);
        if(term == null)
          break Fail26620;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(term, (IStrategoList)generator.constCons5070));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26620;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        z_4369 = term;
        b_4370 = term;
        term = termFactory.makeTuple(i_4369, generator.constCons5068);
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26620;
        a_4370 = term;
        term = b_4370;
        IStrategoList list407;
        list407 = checkListTail(a_4370);
        if(list407 == null)
          break Fail26620;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7128, termFactory.makeListCons(generator.const7134, list407));
        x_4369 = term;
        c_4370 = z_4369;
        term = output_text_file_0_2.instance.invoke(context, c_4370, x_4369, generator.const7753);
        if(term == null)
          break Fail26620;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}