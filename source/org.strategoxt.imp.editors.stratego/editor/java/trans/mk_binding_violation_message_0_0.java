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
    Fail22841:
    { 
      IStrategoTerm g_4739 = null;
      IStrategoTerm l_4739 = null;
      IStrategoTerm n_4739 = null;
      IStrategoTerm o_4739 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22841;
      g_4739 = term.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, g_4739);
      if(term == null)
        break Fail22841;
      IStrategoTerm term12205 = term;
      Success12171:
      { 
        Fail22842:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22842;
          if(true)
            break Success12171;
        }
        term = term12205;
        IStrategoTerm term12206 = term;
        Success12172:
        { 
          Fail22843:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22843;
            if(true)
              break Success12172;
          }
          term = term12206;
          IStrategoTerm term12207 = term;
          Success12173:
          { 
            Fail22844:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22844;
              if(true)
                break Success12173;
            }
            term = term12207;
            IStrategoTerm term12208 = term;
            Success12174:
            { 
              Fail22845:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22845;
                if(true)
                  break Success12174;
              }
              term = term12208;
              IStrategoTerm h_4739 = null;
              IStrategoTerm i_4739 = null;
              IStrategoTerm k_4739 = null;
              h_4739 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22841;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22841;
              i_4739 = ((IStrategoList)term).tail();
              k_4739 = i_4739;
              term = report_failure_0_2.instance.invoke(context, k_4739, trans.const4495, h_4739);
              if(term == null)
                break Fail22841;
            }
          }
        }
      }
      n_4739 = term;
      l_4739 = trans.const4440;
      o_4739 = n_4739;
      term = string_replace_0_2.instance.invoke(context, o_4739, l_4739, trans.const4496);
      if(term == null)
        break Fail22841;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4498, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22841;
      term = termFactory.makeTuple(g_4739, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}