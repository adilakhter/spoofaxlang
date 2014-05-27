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

@SuppressWarnings("all") public class create_spx_colorer_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_colorer_descriptor_0_0 instance = new create_spx_colorer_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_colorer_descriptor_0_0");
    Fail26208:
    { 
      IStrategoTerm v_4312 = null;
      IStrategoTerm w_4312 = null;
      IStrategoTerm r_4313 = null;
      IStrategoTerm t_4313 = null;
      IStrategoTerm b_4313 = null;
      IStrategoTerm d_4313 = null;
      IStrategoTerm e_4313 = null;
      IStrategoTerm l_4313 = null;
      IStrategoTerm n_4313 = null;
      IStrategoTerm o_4313 = null;
      IStrategoTerm w_4688 = null;
      w_4312 = term;
      v_4312 = generator.const7379;
      term = w_4312;
      t_4313 = term;
      term = v_4312;
      IStrategoTerm term10575 = term;
      Success10494:
      { 
        Fail26209:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26209;
          if(true)
            break Success10494;
        }
        term = term10575;
        IStrategoTerm term10576 = term;
        Success10495:
        { 
          Fail26210:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26210;
            if(true)
              break Success10495;
          }
          term = term10576;
          IStrategoTerm term10577 = term;
          Success10496:
          { 
            Fail26211:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26211;
              if(true)
                break Success10496;
            }
            term = term10577;
            IStrategoTerm term10578 = term;
            Success10497:
            { 
              Fail26212:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26212;
                if(true)
                  break Success10497;
              }
              term = term10578;
              IStrategoTerm x_4312 = null;
              IStrategoTerm y_4312 = null;
              IStrategoTerm a_4313 = null;
              x_4312 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26208;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26208;
              y_4312 = ((IStrategoList)term).tail();
              a_4313 = y_4312;
              term = report_failure_0_2.instance.invoke(context, a_4313, generator.const7380, x_4312);
              if(term == null)
                break Fail26208;
            }
          }
        }
      }
      d_4313 = term;
      b_4313 = generator.const7143;
      e_4313 = d_4313;
      term = string_replace_0_2.instance.invoke(context, e_4313, b_4313, generator.const7159);
      if(term == null)
        break Fail26208;
      r_4313 = term;
      term = t_4313;
      term = build_colorer_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26208;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26208;
      w_4688 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, w_4688);
      if(term == null)
        break Fail26208;
      IStrategoTerm term10579 = term;
      Success10498:
      { 
        Fail26213:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26213;
          if(true)
            break Success10498;
        }
        term = term10579;
        IStrategoTerm term10580 = term;
        Success10499:
        { 
          Fail26214:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26214;
            if(true)
              break Success10499;
          }
          term = term10580;
          IStrategoTerm term10581 = term;
          Success10500:
          { 
            Fail26215:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26215;
              if(true)
                break Success10500;
            }
            term = term10581;
            IStrategoTerm term10582 = term;
            Success10501:
            { 
              Fail26216:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26216;
                if(true)
                  break Success10501;
              }
              term = term10582;
              IStrategoTerm h_4313 = null;
              IStrategoTerm i_4313 = null;
              IStrategoTerm k_4313 = null;
              h_4313 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26208;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26208;
              i_4313 = ((IStrategoList)term).tail();
              k_4313 = i_4313;
              term = report_failure_0_2.instance.invoke(context, k_4313, generator.const7380, h_4313);
              if(term == null)
                break Fail26208;
            }
          }
        }
      }
      n_4313 = term;
      l_4313 = generator.const7143;
      o_4313 = n_4313;
      term = string_replace_0_2.instance.invoke(context, o_4313, l_4313, generator.const7143);
      if(term == null)
        break Fail26208;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(r_4313, termFactory.makeListCons(generator.const7246, termFactory.makeListCons(term, (IStrategoList)generator.constCons4851))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26208;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}