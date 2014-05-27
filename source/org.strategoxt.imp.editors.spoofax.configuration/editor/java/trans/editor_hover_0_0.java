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

@SuppressWarnings("all") public class editor_hover_0_0 extends Strategy 
{ 
  public static editor_hover_0_0 instance = new editor_hover_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_hover_0_0");
    Fail87718:
    { 
      IStrategoTerm e_17575 = null;
      IStrategoTerm j_17575 = null;
      IStrategoTerm l_17575 = null;
      IStrategoTerm m_17575 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail87718;
      e_17575 = term.getSubterm(0);
      term = write_to_string_0_0.instance.invoke(context, e_17575);
      if(term == null)
        break Fail87718;
      IStrategoTerm term47312 = term;
      Success47289:
      { 
        Fail87719:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87719;
          if(true)
            break Success47289;
        }
        term = term47312;
        IStrategoTerm term47313 = term;
        Success47290:
        { 
          Fail87720:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87720;
            if(true)
              break Success47290;
          }
          term = term47313;
          IStrategoTerm term47314 = term;
          Success47291:
          { 
            Fail87721:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87721;
              if(true)
                break Success47291;
            }
            term = term47314;
            IStrategoTerm term47315 = term;
            Success47292:
            { 
              Fail87722:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87722;
                if(true)
                  break Success47292;
              }
              term = term47315;
              IStrategoTerm f_17575 = null;
              IStrategoTerm g_17575 = null;
              IStrategoTerm i_17575 = null;
              f_17575 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail87718;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail87718;
              g_17575 = ((IStrategoList)term).tail();
              i_17575 = g_17575;
              term = report_failure_0_2.instance.invoke(context, i_17575, trans.const17892, f_17575);
              if(term == null)
                break Fail87718;
            }
          }
        }
      }
      l_17575 = term;
      j_17575 = trans.const17844;
      m_17575 = l_17575;
      term = string_replace_0_2.instance.invoke(context, m_17575, j_17575, trans.const17859);
      if(term == null)
        break Fail87718;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const17893, termFactory.makeListCons(term, (IStrategoList)trans.constNil14));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87718;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}