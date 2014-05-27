package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class declare_tvar_0_0 extends Strategy 
{ 
  public static declare_tvar_0_0 instance = new declare_tvar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_tvar_0_0");
    Fail23203:
    { 
      IStrategoTerm term12532 = term;
      Success12429:
      { 
        Fail23204:
        { 
          IStrategoTerm g_4806 = null;
          IStrategoTerm h_4806 = null;
          IStrategoTerm k_4806 = null;
          IStrategoTerm l_4806 = null;
          g_4806 = term;
          k_4806 = term;
          term = is_string_0_0.instance.invoke(context, g_4806);
          if(term == null)
            break Fail23204;
          term = k_4806;
          l_4806 = k_4806;
          IStrategoTerm term12533 = term;
          Success12430:
          { 
            Fail23205:
            { 
              term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{g_4806});
              term = declare_definition_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23205;
              term = termFactory.annotateTerm(g_4806, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
              h_4806 = term;
              if(true)
                break Success12430;
            }
            term = term12533;
            IStrategoTerm i_4806 = null;
            IStrategoTerm j_4806 = null;
            IStrategoTerm p_4806 = null;
            i_4806 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail23204;
            j_4806 = term;
            p_4806 = i_4806;
            term = report_with_failure_0_2.instance.invoke(context, p_4806, trans.const4609, j_4806);
            if(term == null)
              break Fail23204;
          }
          term = l_4806;
          if(h_4806 == null)
            break Fail23204;
          term = h_4806;
          if(true)
            break Success12429;
        }
        term = term12532;
        IStrategoTerm u_4805 = null;
        IStrategoTerm v_4805 = null;
        IStrategoTerm w_4805 = null;
        IStrategoTerm z_4805 = null;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail23203;
        v_4805 = term.getSubterm(0);
        u_4805 = term.getSubterm(1);
        z_4805 = term;
        IStrategoTerm term12534 = term;
        Success12431:
        { 
          Fail23206:
          { 
            term = declare_definition_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23206;
            term = termFactory.annotateTerm(v_4805, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
            w_4805 = term;
            if(true)
              break Success12431;
          }
          term = term12534;
          IStrategoTerm x_4805 = null;
          IStrategoTerm y_4805 = null;
          IStrategoTerm d_4806 = null;
          x_4805 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail23203;
          y_4805 = term;
          d_4806 = x_4805;
          term = report_with_failure_0_2.instance.invoke(context, d_4806, trans.const4609, y_4805);
          if(term == null)
            break Fail23203;
        }
        term = z_4805;
        if(w_4805 == null)
          break Fail23203;
        term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{w_4805, u_4805});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}