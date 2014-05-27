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

@SuppressWarnings("all") public class create_spx_derived_colorer_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_colorer_descriptor_0_0 instance = new create_spx_derived_colorer_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_colorer_descriptor_0_0");
    Fail26217:
    { 
      IStrategoTerm v_4313 = null;
      IStrategoTerm w_4313 = null;
      IStrategoTerm r_4314 = null;
      IStrategoTerm t_4314 = null;
      IStrategoTerm b_4314 = null;
      IStrategoTerm d_4314 = null;
      IStrategoTerm e_4314 = null;
      IStrategoTerm l_4314 = null;
      IStrategoTerm n_4314 = null;
      IStrategoTerm o_4314 = null;
      IStrategoTerm x_4688 = null;
      w_4313 = term;
      v_4313 = generator.const7382;
      term = w_4313;
      t_4314 = term;
      term = v_4313;
      IStrategoTerm term10583 = term;
      Success10502:
      { 
        Fail26218:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26218;
          if(true)
            break Success10502;
        }
        term = term10583;
        IStrategoTerm term10584 = term;
        Success10503:
        { 
          Fail26219:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26219;
            if(true)
              break Success10503;
          }
          term = term10584;
          IStrategoTerm term10585 = term;
          Success10504:
          { 
            Fail26220:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26220;
              if(true)
                break Success10504;
            }
            term = term10585;
            IStrategoTerm term10586 = term;
            Success10505:
            { 
              Fail26221:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26221;
                if(true)
                  break Success10505;
              }
              term = term10586;
              IStrategoTerm x_4313 = null;
              IStrategoTerm y_4313 = null;
              IStrategoTerm a_4314 = null;
              x_4313 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26217;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26217;
              y_4313 = ((IStrategoList)term).tail();
              a_4314 = y_4313;
              term = report_failure_0_2.instance.invoke(context, a_4314, generator.const7383, x_4313);
              if(term == null)
                break Fail26217;
            }
          }
        }
      }
      d_4314 = term;
      b_4314 = generator.const7143;
      e_4314 = d_4314;
      term = string_replace_0_2.instance.invoke(context, e_4314, b_4314, generator.const7159);
      if(term == null)
        break Fail26217;
      r_4314 = term;
      term = t_4314;
      term = build_derived_colorer_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26217;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26217;
      x_4688 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, x_4688);
      if(term == null)
        break Fail26217;
      IStrategoTerm term10587 = term;
      Success10506:
      { 
        Fail26222:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26222;
          if(true)
            break Success10506;
        }
        term = term10587;
        IStrategoTerm term10588 = term;
        Success10507:
        { 
          Fail26223:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26223;
            if(true)
              break Success10507;
          }
          term = term10588;
          IStrategoTerm term10589 = term;
          Success10508:
          { 
            Fail26224:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26224;
              if(true)
                break Success10508;
            }
            term = term10589;
            IStrategoTerm term10590 = term;
            Success10509:
            { 
              Fail26225:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26225;
                if(true)
                  break Success10509;
              }
              term = term10590;
              IStrategoTerm h_4314 = null;
              IStrategoTerm i_4314 = null;
              IStrategoTerm k_4314 = null;
              h_4314 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26217;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26217;
              i_4314 = ((IStrategoList)term).tail();
              k_4314 = i_4314;
              term = report_failure_0_2.instance.invoke(context, k_4314, generator.const7383, h_4314);
              if(term == null)
                break Fail26217;
            }
          }
        }
      }
      n_4314 = term;
      l_4314 = generator.const7143;
      o_4314 = n_4314;
      term = string_replace_0_2.instance.invoke(context, o_4314, l_4314, generator.const7143);
      if(term == null)
        break Fail26217;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(r_4314, termFactory.makeListCons(generator.const7384, termFactory.makeListCons(term, (IStrategoList)generator.constCons4851))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26217;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}