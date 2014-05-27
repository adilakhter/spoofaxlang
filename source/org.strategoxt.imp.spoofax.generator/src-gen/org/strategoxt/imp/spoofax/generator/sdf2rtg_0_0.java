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

@SuppressWarnings("all") public class sdf2rtg_0_0 extends Strategy 
{ 
  public static sdf2rtg_0_0 instance = new sdf2rtg_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sdf2rtg_0_0");
    Fail26783:
    { 
      IStrategoTerm m_4402 = null;
      IStrategoTerm n_4402 = null;
      IStrategoTerm o_4402 = null;
      IStrategoTerm s_4402 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26783;
      m_4402 = term.getSubterm(0);
      s_4402 = term;
      IStrategoTerm term11188 = term;
      Success10951:
      { 
        Fail26784:
        { 
          IStrategoTerm term11189 = term;
          Success10952:
          { 
            Fail26785:
            { 
              IStrategoTerm u_4402 = null;
              u_4402 = m_4402;
              term = guarantee_extension_0_1.instance.invoke(context, u_4402, generator.const7920);
              if(term == null)
                break Fail26785;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26785;
              term = verbose_msg_2_0.instance.invoke(context, term, lifted9547.instance, _Id.instance);
              if(term == null)
                break Fail26785;
              term = parse_rtg_file_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26785;
              o_4402 = term;
              if(true)
                break Success10952;
            }
            term = term11189;
            IStrategoTerm z_4402 = null;
            term = verbose_msg_1_0.instance.invoke(context, term, lifted9549.instance);
            if(term == null)
              break Fail26784;
            IStrategoTerm term11190 = term;
            Success10953:
            { 
              Fail26786:
              { 
                IStrategoTerm p_4402 = null;
                p_4402 = term;
                term = $F$I$L$E_1_0.instance.invoke(context, term, lifted9550.instance);
                if(term == null)
                  break Fail26786;
                term = p_4402;
                { 
                  IStrategoTerm y_4402 = null;
                  y_4402 = term;
                  term = fatal_err_0_1.instance.invoke(context, y_4402, generator.const7923);
                  if(term == null)
                    break Fail26784;
                  if(true)
                    break Success10953;
                }
              }
              term = term11190;
            }
            term = xtc_new_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26784;
            z_4402 = term;
            n_4402 = term;
            term = termFactory.makeTuple(m_4402, z_4402, generator.constCons5157);
            term = sdf2table_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26784;
            term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{n_4402});
            term = xtc_transform_1_0.instance.invoke(context, term, lifted9551.instance);
            if(term == null)
              break Fail26784;
            term = read_from_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26784;
            term = topdown_1_0.instance.invoke(context, term, lifted9552.instance);
            if(term == null)
              break Fail26784;
            term = core_sdf_grammar2rtg_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26784;
            o_4402 = term;
          }
          if(true)
            break Success10951;
        }
        term = term11188;
        IStrategoTerm q_4402 = null;
        IStrategoTerm r_4402 = null;
        IStrategoTerm c_4403 = null;
        q_4402 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26783;
        r_4402 = term;
        c_4403 = q_4402;
        term = report_with_failure_0_2.instance.invoke(context, c_4403, generator.const7924, r_4402);
        if(term == null)
          break Fail26783;
      }
      term = s_4402;
      if(o_4402 == null)
        break Fail26783;
      term = o_4402;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}