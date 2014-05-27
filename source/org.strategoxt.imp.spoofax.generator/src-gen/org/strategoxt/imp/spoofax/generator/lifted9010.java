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

@SuppressWarnings("all") final class lifted9010 extends Strategy 
{ 
  TermReference o_4220;

  TermReference p_4220;

  TermReference q_4220;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29030:
    { 
      IStrategoTerm term10041 = term;
      Success11426:
      { 
        Fail29031:
        { 
          IStrategoTerm w_4220 = null;
          IStrategoTerm r_4220 = null;
          term = process_options_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail29031;
          w_4220 = term;
          term = include_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail29031;
          term = pack_sdf_0_1.instance.invoke(context, w_4220, term);
          if(term == null)
            break Fail29031;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail29031;
          if(o_4220.value == null)
            o_4220.value = term.getSubterm(0);
          else
            if(o_4220.value != term.getSubterm(0) && !o_4220.value.match(term.getSubterm(0)))
              break Fail29031;
          if(p_4220.value == null)
            p_4220.value = term.getSubterm(1);
          else
            if(p_4220.value != term.getSubterm(1) && !p_4220.value.match(term.getSubterm(1)))
              break Fail29031;
          if(o_4220.value == null)
            break Fail29031;
          term = maybe_create_depfile_0_0.instance.invoke(context, o_4220.value);
          if(term == null)
            break Fail29031;
          if(p_4220.value == null)
            break Fail29031;
          term = p_4220.value;
          r_4220 = p_4220.value;
          IStrategoTerm term10042 = term;
          Success11427:
          { 
            Fail29032:
            { 
              term = get_config_0_0.instance.invoke(context, generator.const6985);
              if(term == null)
                break Fail29032;
              term = termFactory.makeTuple(term, generator.const6986);
              term = fopen_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail29032;
              if(true)
                break Success11427;
            }
            term = stdout_stream_0_0.instance.invoke(context, term10042);
            if(term == null)
              break Fail29031;
          }
          if(q_4220.value == null)
            q_4220.value = term;
          else
            if(q_4220.value != term && !q_4220.value.match(term))
              break Fail29031;
          term = r_4220;
          IStrategoTerm term10043 = term;
          Success11428:
          { 
            Fail29033:
            { 
              IStrategoTerm s_4220 = null;
              s_4220 = term;
              term = of_config_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail29033;
              if(term.getTermType() != IStrategoTerm.STRING || !"txt".equals(((IStrategoString)term).stringValue()))
                break Fail29033;
              term = s_4220;
              { 
                term = asfix_yield_0_1.instance.invoke(context, term, q_4220.value);
                if(term == null)
                  break Fail29031;
                term = xtc_exit_0_0.instance.invoke(context, generator.const6964);
                if(term == null)
                  break Fail29031;
                if(true)
                  break Success11428;
              }
            }
            term = term10043;
            IStrategoTerm term10044 = term;
            Success11429:
            { 
              Fail29034:
              { 
                IStrategoTerm t_4220 = null;
                t_4220 = term;
                term = of_config_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail29034;
                if(term.getTermType() != IStrategoTerm.STRING || !"ast".equals(((IStrategoString)term).stringValue()))
                  break Fail29034;
                term = t_4220;
                { 
                  term = implode_asfix_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail29031;
                  if(true)
                    break Success11429;
                }
              }
              term = term10044;
              IStrategoTerm u_4220 = null;
              u_4220 = term;
              term = of_config_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail29031;
              if(term.getTermType() != IStrategoTerm.STRING || !"asfix".equals(((IStrategoString)term).stringValue()))
                break Fail29031;
              term = u_4220;
            }
          }
          term = write_to_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail29031;
          if(true)
            break Success11426;
        }
        term = term10041;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const6988, termFactory.makeListCons(term, (IStrategoList)generator.constCons4541));
        term = fatal_error_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail29030;
      }
      if(true)
        return term;
    }
    return null;
  }
}