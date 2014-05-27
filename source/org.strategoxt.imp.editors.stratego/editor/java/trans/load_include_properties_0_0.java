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
    Fail23113:
    { 
      IStrategoTerm x_4783 = null;
      IStrategoTerm term12435 = term;
      Success12358:
      { 
        Fail23114:
        { 
          term = $Memoize$Include$Properties_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23114;
          if(true)
            break Success12358;
        }
        term = term12435;
        IStrategoTerm e_4784 = null;
        IStrategoTerm g_4784 = null;
        IStrategoTerm h_4784 = null;
        IStrategoTerm i_4784 = null;
        IStrategoTerm n_4784 = null;
        IStrategoTerm p_4784 = null;
        IStrategoTerm q_4784 = null;
        term = $Project$Dir_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23113;
        IStrategoTerm term12436 = term;
        Success12359:
        { 
          Fail23115:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23115;
            if(true)
              break Success12359;
          }
          term = term12436;
          IStrategoTerm term12437 = term;
          Success12360:
          { 
            Fail23116:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23116;
              if(true)
                break Success12360;
            }
            term = term12437;
            IStrategoTerm term12438 = term;
            Success12361:
            { 
              Fail23117:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23117;
                if(true)
                  break Success12361;
              }
              term = term12438;
              IStrategoTerm term12439 = term;
              Success12362:
              { 
                Fail23118:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23118;
                  if(true)
                    break Success12362;
                }
                term = term12439;
                IStrategoTerm a_4784 = null;
                IStrategoTerm b_4784 = null;
                IStrategoTerm d_4784 = null;
                a_4784 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail23113;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail23113;
                b_4784 = ((IStrategoList)term).tail();
                d_4784 = b_4784;
                term = report_failure_0_2.instance.invoke(context, d_4784, trans.const4582, a_4784);
                if(term == null)
                  break Fail23113;
              }
            }
          }
        }
        g_4784 = term;
        e_4784 = trans.const4440;
        h_4784 = g_4784;
        term = string_replace_0_2.instance.invoke(context, h_4784, e_4784, trans.const4440);
        if(term == null)
          break Fail23113;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2093);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23113;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
        Success12363:
        { 
          Fail23119:
          { 
            term = java_load_properties_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23119;
            if(true)
              break Success12363;
          }
          term = trans.constNil4;
        }
        x_4783 = term;
        i_4784 = term;
        p_4784 = term;
        n_4784 = trans.const4584;
        q_4784 = p_4784;
        term = termFactory.makeTuple(trans.const4585, x_4783);
        term = dr_set_rule_0_3.instance.invoke(context, q_4784, n_4784, x_4783, term);
        if(term == null)
          break Fail23113;
        term = i_4784;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}