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

@SuppressWarnings("all") final class lifted6809 extends Strategy 
{ 
  TermReference u_4752;

  TermReference v_4752;

  Strategy t_4753;

  Strategy r_4753;

  Strategy s_4753;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24097:
    { 
      IStrategoTerm term12275 = term;
      Success12767:
      { 
        Fail24098:
        { 
          IStrategoTerm x_4752 = null;
          x_4752 = term;
          term = t_4753.invoke(context, term);
          if(term == null)
            break Fail24098;
          term = x_4752;
          { 
            IStrategoTerm term12276 = term;
            Success12768:
            { 
              Fail24099:
              { 
                IStrategoTerm x_4753 = null;
                IStrategoTerm z_4753 = null;
                IStrategoTerm c_4753 = null;
                IStrategoTerm e_4753 = null;
                IStrategoTerm f_4753 = null;
                IStrategoTerm m_4753 = null;
                IStrategoTerm o_4753 = null;
                IStrategoTerm p_4753 = null;
                z_4753 = term;
                if(u_4752.value == null)
                  break Fail24099;
                term = u_4752.value;
                IStrategoTerm term12277 = term;
                Success12769:
                { 
                  Fail24100:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail24100;
                    if(true)
                      break Success12769;
                  }
                  term = term12277;
                  IStrategoTerm term12278 = term;
                  Success12770:
                  { 
                    Fail24101:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail24101;
                      if(true)
                        break Success12770;
                    }
                    term = term12278;
                    IStrategoTerm term12279 = term;
                    Success12771:
                    { 
                      Fail24102:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail24102;
                        if(true)
                          break Success12771;
                      }
                      term = term12279;
                      IStrategoTerm term12280 = term;
                      Success12772:
                      { 
                        Fail24103:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail24103;
                          if(true)
                            break Success12772;
                        }
                        term = term12280;
                        IStrategoTerm y_4752 = null;
                        IStrategoTerm z_4752 = null;
                        IStrategoTerm b_4753 = null;
                        y_4752 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail24099;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail24099;
                        z_4752 = ((IStrategoList)term).tail();
                        b_4753 = z_4752;
                        term = report_failure_0_2.instance.invoke(context, b_4753, trans.const4539, y_4752);
                        if(term == null)
                          break Fail24099;
                      }
                    }
                  }
                }
                e_4753 = term;
                c_4753 = trans.const4440;
                f_4753 = e_4753;
                term = string_replace_0_2.instance.invoke(context, f_4753, c_4753, trans.const4440);
                if(term == null)
                  break Fail24099;
                x_4753 = term;
                term = z_4753;
                IStrategoTerm term12281 = term;
                Success12773:
                { 
                  Fail24104:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail24104;
                    if(true)
                      break Success12773;
                  }
                  term = term12281;
                  IStrategoTerm term12282 = term;
                  Success12774:
                  { 
                    Fail24105:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail24105;
                      if(true)
                        break Success12774;
                    }
                    term = term12282;
                    IStrategoTerm term12283 = term;
                    Success12775:
                    { 
                      Fail24106:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail24106;
                        if(true)
                          break Success12775;
                      }
                      term = term12283;
                      IStrategoTerm term12284 = term;
                      Success12776:
                      { 
                        Fail24107:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail24107;
                          if(true)
                            break Success12776;
                        }
                        term = term12284;
                        IStrategoTerm i_4753 = null;
                        IStrategoTerm j_4753 = null;
                        IStrategoTerm l_4753 = null;
                        i_4753 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail24099;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail24099;
                        j_4753 = ((IStrategoList)term).tail();
                        l_4753 = j_4753;
                        term = report_failure_0_2.instance.invoke(context, l_4753, trans.const4539, i_4753);
                        if(term == null)
                          break Fail24099;
                      }
                    }
                  }
                }
                o_4753 = term;
                m_4753 = trans.const4440;
                p_4753 = o_4753;
                term = string_replace_0_2.instance.invoke(context, p_4753, m_4753, trans.const4501);
                if(term == null)
                  break Fail24099;
                term = (IStrategoTerm)termFactory.makeListCons(x_4753, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24099;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
                term = open_import_3_0.instance.invoke(context, term, _Id.instance, r_4753, s_4753);
                if(term == null)
                  break Fail24099;
                if(true)
                  break Success12768;
              }
              term = term12276;
              lifted6811 lifted68110 = new lifted6811();
              lifted68110.v_4752 = v_4752;
              term = try_1_0.instance.invoke(context, term, lifted68110);
              if(term == null)
                break Fail24097;
            }
            if(true)
              break Success12767;
          }
        }
        term = term12275;
      }
      if(true)
        return term;
    }
    return null;
  }
}