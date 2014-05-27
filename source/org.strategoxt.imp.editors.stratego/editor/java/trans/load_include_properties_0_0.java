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

@SuppressWarnings("all") public class load_include_properties_0_0 extends Strategy 
{ 
  public static load_include_properties_0_0 instance = new load_include_properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("load_include_properties_0_0");
    Fail21637:
    { 
      IStrategoTerm f_4230 = null;
      IStrategoTerm term11726 = term;
      Success11649:
      { 
        Fail21638:
        { 
          term = $Memoize$Include$Properties_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21638;
          if(true)
            break Success11649;
        }
        term = term11726;
        IStrategoTerm m_4230 = null;
        IStrategoTerm o_4230 = null;
        IStrategoTerm p_4230 = null;
        IStrategoTerm q_4230 = null;
        IStrategoTerm v_4230 = null;
        IStrategoTerm x_4230 = null;
        IStrategoTerm y_4230 = null;
        term = $Project$Dir_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21637;
        IStrategoTerm term11727 = term;
        Success11650:
        { 
          Fail21639:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21639;
            if(true)
              break Success11650;
          }
          term = term11727;
          IStrategoTerm term11728 = term;
          Success11651:
          { 
            Fail21640:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21640;
              if(true)
                break Success11651;
            }
            term = term11728;
            IStrategoTerm term11729 = term;
            Success11652:
            { 
              Fail21641:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21641;
                if(true)
                  break Success11652;
              }
              term = term11729;
              IStrategoTerm term11730 = term;
              Success11653:
              { 
                Fail21642:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21642;
                  if(true)
                    break Success11653;
                }
                term = term11730;
                IStrategoTerm i_4230 = null;
                IStrategoTerm j_4230 = null;
                IStrategoTerm l_4230 = null;
                i_4230 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail21637;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail21637;
                j_4230 = ((IStrategoList)term).tail();
                l_4230 = j_4230;
                term = report_failure_0_2.instance.invoke(context, l_4230, trans.const4372, i_4230);
                if(term == null)
                  break Fail21637;
              }
            }
          }
        }
        o_4230 = term;
        m_4230 = trans.const4230;
        p_4230 = o_4230;
        term = string_replace_0_2.instance.invoke(context, p_4230, m_4230, trans.const4230);
        if(term == null)
          break Fail21637;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2012);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21637;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
        Success11654:
        { 
          Fail21643:
          { 
            term = java_load_properties_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21643;
            if(true)
              break Success11654;
          }
          term = trans.constNil3;
        }
        f_4230 = term;
        q_4230 = term;
        x_4230 = term;
        v_4230 = trans.const4374;
        y_4230 = x_4230;
        term = termFactory.makeTuple(trans.const4375, f_4230);
        term = dr_set_rule_0_3.instance.invoke(context, y_4230, v_4230, f_4230, term);
        if(term == null)
          break Fail21637;
        term = q_4230;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}