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
    Fail21727:
    { 
      IStrategoTerm term11823 = term;
      Success11720:
      { 
        Fail21728:
        { 
          IStrategoTerm o_4252 = null;
          IStrategoTerm p_4252 = null;
          IStrategoTerm s_4252 = null;
          IStrategoTerm t_4252 = null;
          o_4252 = term;
          s_4252 = term;
          term = is_string_0_0.instance.invoke(context, o_4252);
          if(term == null)
            break Fail21728;
          term = s_4252;
          t_4252 = s_4252;
          IStrategoTerm term11824 = term;
          Success11721:
          { 
            Fail21729:
            { 
              term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{o_4252});
              term = declare_definition_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21729;
              term = termFactory.annotateTerm(o_4252, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
              p_4252 = term;
              if(true)
                break Success11721;
            }
            term = term11824;
            IStrategoTerm q_4252 = null;
            IStrategoTerm r_4252 = null;
            IStrategoTerm x_4252 = null;
            q_4252 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail21728;
            r_4252 = term;
            x_4252 = q_4252;
            term = report_with_failure_0_2.instance.invoke(context, x_4252, trans.const4399, r_4252);
            if(term == null)
              break Fail21728;
          }
          term = t_4252;
          if(p_4252 == null)
            break Fail21728;
          term = p_4252;
          if(true)
            break Success11720;
        }
        term = term11823;
        IStrategoTerm c_4252 = null;
        IStrategoTerm d_4252 = null;
        IStrategoTerm e_4252 = null;
        IStrategoTerm h_4252 = null;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail21727;
        d_4252 = term.getSubterm(0);
        c_4252 = term.getSubterm(1);
        h_4252 = term;
        IStrategoTerm term11825 = term;
        Success11722:
        { 
          Fail21730:
          { 
            term = declare_definition_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21730;
            term = termFactory.annotateTerm(d_4252, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
            e_4252 = term;
            if(true)
              break Success11722;
          }
          term = term11825;
          IStrategoTerm f_4252 = null;
          IStrategoTerm g_4252 = null;
          IStrategoTerm l_4252 = null;
          f_4252 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail21727;
          g_4252 = term;
          l_4252 = f_4252;
          term = report_with_failure_0_2.instance.invoke(context, l_4252, trans.const4399, g_4252);
          if(term == null)
            break Fail21727;
        }
        term = h_4252;
        if(e_4252 == null)
          break Fail21727;
        term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{e_4252, c_4252});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}