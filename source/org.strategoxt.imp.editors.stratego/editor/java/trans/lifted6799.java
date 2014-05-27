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

@SuppressWarnings("all") final class lifted6799 extends Strategy 
{ 
  public static final lifted6799 instance = new lifted6799();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24114:
    { 
      IStrategoTerm p_4746 = null;
      IStrategoTerm r_4746 = null;
      IStrategoTerm s_4746 = null;
      IStrategoTerm term12237 = term;
      Success12777:
      { 
        Fail24115:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24115;
          if(true)
            break Success12777;
        }
        term = term12237;
        IStrategoTerm term12238 = term;
        Success12778:
        { 
          Fail24116:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24116;
            if(true)
              break Success12778;
          }
          term = term12238;
          IStrategoTerm term12239 = term;
          Success12779:
          { 
            Fail24117:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24117;
              if(true)
                break Success12779;
            }
            term = term12239;
            IStrategoTerm term12240 = term;
            Success12780:
            { 
              Fail24118:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24118;
                if(true)
                  break Success12780;
              }
              term = term12240;
              IStrategoTerm l_4746 = null;
              IStrategoTerm m_4746 = null;
              IStrategoTerm o_4746 = null;
              l_4746 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24114;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24114;
              m_4746 = ((IStrategoList)term).tail();
              o_4746 = m_4746;
              term = report_failure_0_2.instance.invoke(context, o_4746, trans.const4522, l_4746);
              if(term == null)
                break Fail24114;
            }
          }
        }
      }
      r_4746 = term;
      p_4746 = trans.const4440;
      s_4746 = r_4746;
      term = string_replace_0_2.instance.invoke(context, s_4746, p_4746, trans.const4523);
      if(term == null)
        break Fail24114;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4524, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24114;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      if(true)
        return term;
    }
    return null;
  }
}