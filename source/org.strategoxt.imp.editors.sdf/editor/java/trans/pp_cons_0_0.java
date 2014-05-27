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

@SuppressWarnings("all") public class pp_cons_0_0 extends Strategy 
{ 
  public static pp_cons_0_0 instance = new pp_cons_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_cons_0_0");
    Fail75756:
    { 
      TermReference c_92030 = new TermReference();
      Success41493:
      { 
        Fail75757:
        { 
          IStrategoTerm d_92030 = null;
          d_92030 = term;
          lifted21522 lifted215220 = new lifted21522();
          lifted215220.c_92030 = c_92030;
          term = attrs_1_0.instance.invoke(context, term, lifted215220);
          if(term == null)
            break Fail75757;
          term = d_92030;
          { 
            IStrategoTerm i_92030 = null;
            IStrategoTerm k_92030 = null;
            IStrategoTerm l_92030 = null;
            if(c_92030.value == null)
              break Fail75756;
            term = un_double_quote_0_0.instance.invoke(context, c_92030.value);
            if(term == null)
              break Fail75756;
            IStrategoTerm term41508 = term;
            Success41494:
            { 
              Fail75758:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75758;
                if(true)
                  break Success41494;
              }
              term = term41508;
              IStrategoTerm term41509 = term;
              Success41495:
              { 
                Fail75759:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75759;
                  if(true)
                    break Success41495;
                }
                term = term41509;
                IStrategoTerm term41510 = term;
                Success41496:
                { 
                  Fail75760:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75760;
                    if(true)
                      break Success41496;
                  }
                  term = term41510;
                  IStrategoTerm term41511 = term;
                  Success41497:
                  { 
                    Fail75761:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75761;
                      if(true)
                        break Success41497;
                    }
                    term = term41511;
                    IStrategoTerm e_92030 = null;
                    IStrategoTerm f_92030 = null;
                    IStrategoTerm h_92030 = null;
                    e_92030 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75756;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75756;
                    f_92030 = ((IStrategoList)term).tail();
                    h_92030 = f_92030;
                    term = report_failure_0_2.instance.invoke(context, h_92030, trans.const15482, e_92030);
                    if(term == null)
                      break Fail75756;
                  }
                }
              }
            }
            k_92030 = term;
            i_92030 = trans.const15453;
            l_92030 = k_92030;
            term = string_replace_0_2.instance.invoke(context, l_92030, i_92030, trans.const15483);
            if(term == null)
              break Fail75756;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const15484, termFactory.makeListCons(term, (IStrategoList)trans.constNil11));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75756;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
            if(true)
              break Success41493;
          }
        }
        term = trans.const15485;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}