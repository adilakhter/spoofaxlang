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

@SuppressWarnings("all") public class mk_binding_violation_message_0_0 extends Strategy 
{ 
  public static mk_binding_violation_message_0_0 instance = new mk_binding_violation_message_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("mk_binding_violation_message_0_0");
    Fail21365:
    { 
      IStrategoTerm o_4185 = null;
      IStrategoTerm t_4185 = null;
      IStrategoTerm v_4185 = null;
      IStrategoTerm w_4185 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21365;
      o_4185 = term.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, o_4185);
      if(term == null)
        break Fail21365;
      IStrategoTerm term11496 = term;
      Success11462:
      { 
        Fail21366:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21366;
          if(true)
            break Success11462;
        }
        term = term11496;
        IStrategoTerm term11497 = term;
        Success11463:
        { 
          Fail21367:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21367;
            if(true)
              break Success11463;
          }
          term = term11497;
          IStrategoTerm term11498 = term;
          Success11464:
          { 
            Fail21368:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21368;
              if(true)
                break Success11464;
            }
            term = term11498;
            IStrategoTerm term11499 = term;
            Success11465:
            { 
              Fail21369:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21369;
                if(true)
                  break Success11465;
              }
              term = term11499;
              IStrategoTerm p_4185 = null;
              IStrategoTerm q_4185 = null;
              IStrategoTerm s_4185 = null;
              p_4185 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21365;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21365;
              q_4185 = ((IStrategoList)term).tail();
              s_4185 = q_4185;
              term = report_failure_0_2.instance.invoke(context, s_4185, trans.const4285, p_4185);
              if(term == null)
                break Fail21365;
            }
          }
        }
      }
      v_4185 = term;
      t_4185 = trans.const4230;
      w_4185 = v_4185;
      term = string_replace_0_2.instance.invoke(context, w_4185, t_4185, trans.const4286);
      if(term == null)
        break Fail21365;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4288, termFactory.makeListCons(term, (IStrategoList)trans.constCons1979));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21365;
      term = termFactory.makeTuple(o_4185, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}