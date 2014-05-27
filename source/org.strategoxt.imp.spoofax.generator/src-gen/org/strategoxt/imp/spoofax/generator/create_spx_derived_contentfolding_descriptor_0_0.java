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

@SuppressWarnings("all") public class create_spx_derived_contentfolding_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_contentfolding_descriptor_0_0 instance = new create_spx_derived_contentfolding_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_contentfolding_descriptor_0_0");
    Fail26145:
    { 
      IStrategoTerm d_4307 = null;
      IStrategoTerm e_4307 = null;
      IStrategoTerm z_4307 = null;
      IStrategoTerm b_4308 = null;
      IStrategoTerm j_4307 = null;
      IStrategoTerm l_4307 = null;
      IStrategoTerm m_4307 = null;
      IStrategoTerm t_4307 = null;
      IStrategoTerm v_4307 = null;
      IStrategoTerm w_4307 = null;
      IStrategoTerm f_4688 = null;
      e_4307 = term;
      d_4307 = generator.const7277;
      term = e_4307;
      b_4308 = term;
      term = d_4307;
      IStrategoTerm term10531 = term;
      Success10452:
      { 
        Fail26146:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26146;
          if(true)
            break Success10452;
        }
        term = term10531;
        IStrategoTerm term10532 = term;
        Success10453:
        { 
          Fail26147:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26147;
            if(true)
              break Success10453;
          }
          term = term10532;
          IStrategoTerm term10533 = term;
          Success10454:
          { 
            Fail26148:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26148;
              if(true)
                break Success10454;
            }
            term = term10533;
            IStrategoTerm term10534 = term;
            Success10455:
            { 
              Fail26149:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26149;
                if(true)
                  break Success10455;
              }
              term = term10534;
              IStrategoTerm f_4307 = null;
              IStrategoTerm g_4307 = null;
              IStrategoTerm i_4307 = null;
              f_4307 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26145;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26145;
              g_4307 = ((IStrategoList)term).tail();
              i_4307 = g_4307;
              term = report_failure_0_2.instance.invoke(context, i_4307, generator.const7279, f_4307);
              if(term == null)
                break Fail26145;
            }
          }
        }
      }
      l_4307 = term;
      j_4307 = generator.const7143;
      m_4307 = l_4307;
      term = string_replace_0_2.instance.invoke(context, m_4307, j_4307, generator.const7159);
      if(term == null)
        break Fail26145;
      z_4307 = term;
      term = b_4308;
      term = build_derived_folding_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26145;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26145;
      f_4688 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, f_4688);
      if(term == null)
        break Fail26145;
      IStrategoTerm term10535 = term;
      Success10456:
      { 
        Fail26150:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26150;
          if(true)
            break Success10456;
        }
        term = term10535;
        IStrategoTerm term10536 = term;
        Success10457:
        { 
          Fail26151:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26151;
            if(true)
              break Success10457;
          }
          term = term10536;
          IStrategoTerm term10537 = term;
          Success10458:
          { 
            Fail26152:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26152;
              if(true)
                break Success10458;
            }
            term = term10537;
            IStrategoTerm term10538 = term;
            Success10459:
            { 
              Fail26153:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26153;
                if(true)
                  break Success10459;
              }
              term = term10538;
              IStrategoTerm p_4307 = null;
              IStrategoTerm q_4307 = null;
              IStrategoTerm s_4307 = null;
              p_4307 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26145;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26145;
              q_4307 = ((IStrategoList)term).tail();
              s_4307 = q_4307;
              term = report_failure_0_2.instance.invoke(context, s_4307, generator.const7279, p_4307);
              if(term == null)
                break Fail26145;
            }
          }
        }
      }
      v_4307 = term;
      t_4307 = generator.const7143;
      w_4307 = v_4307;
      term = string_replace_0_2.instance.invoke(context, w_4307, t_4307, generator.const7143);
      if(term == null)
        break Fail26145;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(z_4307, termFactory.makeListCons(generator.const7247, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26145;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}