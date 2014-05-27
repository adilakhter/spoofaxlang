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

@SuppressWarnings("all") public class generate_syntax_templates_0_0 extends Strategy 
{ 
  public static generate_syntax_templates_0_0 instance = new generate_syntax_templates_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_syntax_templates_0_0");
    Fail75715:
    { 
      IStrategoTerm r_92025 = null;
      IStrategoTerm s_92025 = null;
      IStrategoTerm t_92025 = null;
      IStrategoTerm v_92025 = null;
      IStrategoTerm h_92026 = null;
      IStrategoTerm k_92026 = null;
      IStrategoTerm b_92026 = null;
      IStrategoTerm d_92026 = null;
      IStrategoTerm e_92026 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail75715;
      t_92025 = term.getSubterm(0);
      r_92025 = term.getSubterm(3);
      h_92026 = r_92025;
      term = guarantee_extension_0_1.instance.invoke(context, h_92026, trans.const15467);
      if(term == null)
        break Fail75715;
      s_92025 = term;
      term = t_92025;
      IStrategoTerm term41468 = term;
      Success41454:
      { 
        Fail75716:
        { 
          term = collect_all_1_0.instance.invoke(context, term, lifted21517.instance);
          if(term == null)
            break Fail75716;
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75716;
          IStrategoTerm term41469 = term;
          Success41455:
          { 
            Fail75717:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail75717;
              { 
                if(true)
                  break Fail75716;
                if(true)
                  break Success41455;
              }
            }
            term = term41469;
          }
          if(true)
            break Success41454;
        }
        term = collect_all_1_0.instance.invoke(context, term41468, lifted21518.instance);
        if(term == null)
          break Fail75715;
      }
      term = filter_1_0.instance.invoke(context, term, prod_to_template_0_0.instance);
      if(term == null)
        break Fail75715;
      k_92026 = term;
      term = separate_by_0_1.instance.invoke(context, k_92026, trans.const15453);
      if(term == null)
        break Fail75715;
      v_92025 = term;
      term = v_92025;
      IStrategoTerm term41470 = term;
      Success41456:
      { 
        Fail75718:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75718;
          if(true)
            break Success41456;
        }
        term = term41470;
        IStrategoTerm term41471 = term;
        Success41457:
        { 
          Fail75719:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75719;
            if(true)
              break Success41457;
          }
          term = term41471;
          IStrategoTerm term41472 = term;
          Success41458:
          { 
            Fail75720:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75720;
              if(true)
                break Success41458;
            }
            term = term41472;
            IStrategoTerm term41473 = term;
            Success41459:
            { 
              Fail75721:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75721;
                if(true)
                  break Success41459;
              }
              term = term41473;
              IStrategoTerm x_92025 = null;
              IStrategoTerm y_92025 = null;
              IStrategoTerm a_92026 = null;
              x_92025 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail75715;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail75715;
              y_92025 = ((IStrategoList)term).tail();
              a_92026 = y_92025;
              term = report_failure_0_2.instance.invoke(context, a_92026, trans.const15468, x_92025);
              if(term == null)
                break Fail75715;
            }
          }
        }
      }
      d_92026 = term;
      b_92026 = trans.const15453;
      e_92026 = d_92026;
      term = string_replace_0_2.instance.invoke(context, e_92026, b_92026, trans.const15469);
      if(term == null)
        break Fail75715;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const15470, termFactory.makeListCons(term, (IStrategoList)trans.constNil11));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail75715;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
      term = termFactory.makeTuple(s_92025, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}