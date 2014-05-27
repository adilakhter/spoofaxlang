package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class propose_completion_0_0 extends Strategy 
{ 
  public static propose_completion_0_0 instance = new propose_completion_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("propose_completion_0_0");
    Fail75892:
    { 
      IStrategoTerm term41693 = term;
      IStrategoConstructor cons1783 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41617:
      { 
        if(cons1783 == Main._conssort_1)
        { 
          Fail75893:
          { 
            IStrategoTerm m_92054 = null;
            IStrategoTerm n_92054 = null;
            IStrategoTerm o_92054 = null;
            IStrategoTerm r_92054 = null;
            IStrategoTerm arg25992 = term.getSubterm(0);
            if(arg25992.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)arg25992).getConstructor())
              break Fail75893;
            n_92054 = arg25992.getSubterm(0);
            r_92054 = term;
            IStrategoTerm term41694 = term;
            Success41618:
            { 
              Fail75894:
              { 
                term = all_keys_$Declaration_0_0.instance.invoke(context, n_92054);
                if(term == null)
                  break Fail75894;
                m_92054 = term;
                term = all_keys_$Usage_0_0.instance.invoke(context, n_92054);
                if(term == null)
                  break Fail75894;
                o_92054 = term;
                if(true)
                  break Success41618;
              }
              term = term41694;
              IStrategoTerm p_92054 = null;
              IStrategoTerm q_92054 = null;
              IStrategoTerm t_92054 = null;
              p_92054 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail75893;
              q_92054 = term;
              t_92054 = p_92054;
              term = report_with_failure_0_2.instance.invoke(context, t_92054, trans.const15542, q_92054);
              if(term == null)
                break Fail75893;
            }
            term = r_92054;
            if(m_92054 == null || o_92054 == null)
              break Fail75893;
            term = termFactory.makeTuple(m_92054, termFactory.annotateTerm(o_92054, checkListAnnos(termFactory, trans.constNil11)));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75893;
            if(true)
              break Success41617;
          }
          term = term41693;
        }
        if(cons1783 == Main._consNOCONTEXT_1)
        { 
          IStrategoTerm c_92054 = null;
          IStrategoTerm d_92054 = null;
          IStrategoTerm e_92054 = null;
          IStrategoTerm h_92054 = null;
          IStrategoTerm arg25993 = term.getSubterm(0);
          if(arg25993.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)arg25993).getConstructor())
            break Fail75892;
          d_92054 = arg25993.getSubterm(0);
          h_92054 = term;
          IStrategoTerm term41695 = term;
          Success41619:
          { 
            Fail75895:
            { 
              term = all_keys_$Declaration_0_0.instance.invoke(context, d_92054);
              if(term == null)
                break Fail75895;
              c_92054 = term;
              term = all_keys_$Usage_0_0.instance.invoke(context, d_92054);
              if(term == null)
                break Fail75895;
              e_92054 = term;
              if(true)
                break Success41619;
            }
            term = term41695;
            IStrategoTerm f_92054 = null;
            IStrategoTerm g_92054 = null;
            IStrategoTerm j_92054 = null;
            f_92054 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail75892;
            g_92054 = term;
            j_92054 = f_92054;
            term = report_with_failure_0_2.instance.invoke(context, j_92054, trans.const15542, g_92054);
            if(term == null)
              break Fail75892;
          }
          term = h_92054;
          if(c_92054 == null || e_92054 == null)
            break Fail75892;
          term = termFactory.makeTuple(c_92054, termFactory.annotateTerm(e_92054, checkListAnnos(termFactory, trans.constNil11)));
          term = make$Conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75892;
        }
        else
        { 
          break Fail75892;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}