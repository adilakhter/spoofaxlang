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

@SuppressWarnings("all") final class lifted21501 extends Strategy 
{ 
  TermReference n_92017;

  TermReference o_92017;

  Strategy m_92018;

  Strategy k_92018;

  Strategy l_92018;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail76519:
    { 
      IStrategoTerm term41434 = term;
      Success41933:
      { 
        Fail76520:
        { 
          IStrategoTerm q_92017 = null;
          q_92017 = term;
          term = m_92018.invoke(context, term);
          if(term == null)
            break Fail76520;
          term = q_92017;
          { 
            IStrategoTerm term41435 = term;
            Success41934:
            { 
              Fail76521:
              { 
                IStrategoTerm q_92018 = null;
                IStrategoTerm s_92018 = null;
                IStrategoTerm v_92017 = null;
                IStrategoTerm x_92017 = null;
                IStrategoTerm y_92017 = null;
                IStrategoTerm f_92018 = null;
                IStrategoTerm h_92018 = null;
                IStrategoTerm i_92018 = null;
                s_92018 = term;
                if(n_92017.value == null)
                  break Fail76521;
                term = n_92017.value;
                IStrategoTerm term41436 = term;
                Success41935:
                { 
                  Fail76522:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76522;
                    if(true)
                      break Success41935;
                  }
                  term = term41436;
                  IStrategoTerm term41437 = term;
                  Success41936:
                  { 
                    Fail76523:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76523;
                      if(true)
                        break Success41936;
                    }
                    term = term41437;
                    IStrategoTerm term41438 = term;
                    Success41937:
                    { 
                      Fail76524:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76524;
                        if(true)
                          break Success41937;
                      }
                      term = term41438;
                      IStrategoTerm term41439 = term;
                      Success41938:
                      { 
                        Fail76525:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76525;
                          if(true)
                            break Success41938;
                        }
                        term = term41439;
                        IStrategoTerm r_92017 = null;
                        IStrategoTerm s_92017 = null;
                        IStrategoTerm u_92017 = null;
                        r_92017 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76521;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76521;
                        s_92017 = ((IStrategoList)term).tail();
                        u_92017 = s_92017;
                        term = report_failure_0_2.instance.invoke(context, u_92017, trans.const15452, r_92017);
                        if(term == null)
                          break Fail76521;
                      }
                    }
                  }
                }
                x_92017 = term;
                v_92017 = trans.const15453;
                y_92017 = x_92017;
                term = string_replace_0_2.instance.invoke(context, y_92017, v_92017, trans.const15453);
                if(term == null)
                  break Fail76521;
                q_92018 = term;
                term = s_92018;
                IStrategoTerm term41440 = term;
                Success41939:
                { 
                  Fail76526:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76526;
                    if(true)
                      break Success41939;
                  }
                  term = term41440;
                  IStrategoTerm term41441 = term;
                  Success41940:
                  { 
                    Fail76527:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76527;
                      if(true)
                        break Success41940;
                    }
                    term = term41441;
                    IStrategoTerm term41442 = term;
                    Success41941:
                    { 
                      Fail76528:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76528;
                        if(true)
                          break Success41941;
                      }
                      term = term41442;
                      IStrategoTerm term41443 = term;
                      Success41942:
                      { 
                        Fail76529:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76529;
                          if(true)
                            break Success41942;
                        }
                        term = term41443;
                        IStrategoTerm b_92018 = null;
                        IStrategoTerm c_92018 = null;
                        IStrategoTerm e_92018 = null;
                        b_92018 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76521;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76521;
                        c_92018 = ((IStrategoList)term).tail();
                        e_92018 = c_92018;
                        term = report_failure_0_2.instance.invoke(context, e_92018, trans.const15452, b_92018);
                        if(term == null)
                          break Fail76521;
                      }
                    }
                  }
                }
                h_92018 = term;
                f_92018 = trans.const15453;
                i_92018 = h_92018;
                term = string_replace_0_2.instance.invoke(context, i_92018, f_92018, trans.const15454);
                if(term == null)
                  break Fail76521;
                term = (IStrategoTerm)termFactory.makeListCons(q_92018, termFactory.makeListCons(trans.const15455, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76521;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
                term = open_import_3_0.instance.invoke(context, term, _Id.instance, k_92018, l_92018);
                if(term == null)
                  break Fail76521;
                if(true)
                  break Success41934;
              }
              term = term41435;
              lifted21503 lifted215030 = new lifted21503();
              lifted215030.o_92017 = o_92017;
              term = try_1_0.instance.invoke(context, term, lifted215030);
              if(term == null)
                break Fail76519;
            }
            if(true)
              break Success41933;
          }
        }
        term = term41434;
      }
      if(true)
        return term;
    }
    return null;
  }
}