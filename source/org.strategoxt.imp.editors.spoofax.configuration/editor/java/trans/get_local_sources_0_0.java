package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_local_sources_0_0 extends Strategy 
{ 
  public static get_local_sources_0_0 instance = new get_local_sources_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_local_sources_0_0");
    Fail22766:
    { 
      IStrategoTerm term12132 = term;
      Success12124:
      { 
        Fail22767:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail22767;
          term = trans.constNil4;
          if(true)
            break Success12124;
        }
        term = term12132;
        IStrategoTerm j_4612 = null;
        IStrategoTerm k_4612 = null;
        IStrategoTerm l_4612 = null;
        IStrategoTerm m_4612 = null;
        IStrategoTerm n_4612 = null;
        IStrategoTerm q_4612 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail22766;
        IStrategoTerm arg8001 = ((IStrategoList)term).head();
        if(arg8001.getTermType() != IStrategoTerm.APPL || Main._consSource_2 != ((IStrategoAppl)arg8001).getConstructor())
          break Fail22766;
        j_4612 = arg8001.getSubterm(0);
        k_4612 = arg8001.getSubterm(1);
        l_4612 = ((IStrategoList)term).tail();
        q_4612 = term;
        IStrategoTerm term12133 = term;
        Success12125:
        { 
          Fail22768:
          { 
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(j_4612, k_4612), (IStrategoList)trans.constNil4);
            m_4612 = term;
            term = this.invoke(context, l_4612);
            if(term == null)
              break Fail22768;
            term = termFactory.makeTuple(term, m_4612);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22768;
            n_4612 = term;
            if(true)
              break Success12125;
          }
          term = term12133;
          IStrategoTerm o_4612 = null;
          IStrategoTerm p_4612 = null;
          IStrategoTerm u_4612 = null;
          o_4612 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail22766;
          p_4612 = term;
          u_4612 = o_4612;
          term = report_with_failure_0_2.instance.invoke(context, u_4612, trans.const4461, p_4612);
          if(term == null)
            break Fail22766;
        }
        term = q_4612;
        if(n_4612 == null)
          break Fail22766;
        term = n_4612;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}