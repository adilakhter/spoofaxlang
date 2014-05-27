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
    Fail22910:
    { 
      IStrategoTerm h_4631 = null;
      IStrategoTerm m_4631 = null;
      IStrategoTerm o_4631 = null;
      IStrategoTerm p_4631 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22910;
      h_4631 = term.getSubterm(0);
      term = write_to_string_0_0.instance.invoke(context, h_4631);
      if(term == null)
        break Fail22910;
      IStrategoTerm term12225 = term;
      Success12202:
      { 
        Fail22911:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22911;
          if(true)
            break Success12202;
        }
        term = term12225;
        IStrategoTerm term12226 = term;
        Success12203:
        { 
          Fail22912:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22912;
            if(true)
              break Success12203;
          }
          term = term12226;
          IStrategoTerm term12227 = term;
          Success12204:
          { 
            Fail22913:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22913;
              if(true)
                break Success12204;
            }
            term = term12227;
            IStrategoTerm term12228 = term;
            Success12205:
            { 
              Fail22914:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22914;
                if(true)
                  break Success12205;
              }
              term = term12228;
              IStrategoTerm i_4631 = null;
              IStrategoTerm j_4631 = null;
              IStrategoTerm l_4631 = null;
              i_4631 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22910;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22910;
              j_4631 = ((IStrategoList)term).tail();
              l_4631 = j_4631;
              term = report_failure_0_2.instance.invoke(context, l_4631, trans.const4505, i_4631);
              if(term == null)
                break Fail22910;
            }
          }
        }
      }
      o_4631 = term;
      m_4631 = trans.const4457;
      p_4631 = o_4631;
      term = string_replace_0_2.instance.invoke(context, p_4631, m_4631, trans.const4472);
      if(term == null)
        break Fail22910;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4506, termFactory.makeListCons(term, (IStrategoList)trans.constNil4));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22910;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}