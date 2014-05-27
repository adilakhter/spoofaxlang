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

@SuppressWarnings("all") public class verify_project_reference_0_0 extends Strategy 
{ 
  public static verify_project_reference_0_0 instance = new verify_project_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("verify_project_reference_0_0");
    Fail87619:
    { 
      IStrategoTerm n_17560 = null;
      IStrategoTerm o_17560 = null;
      IStrategoTerm h_17561 = null;
      n_17560 = term;
      IStrategoList annos2674 = term.getAnnotations();
      if(annos2674.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos2674).isEmpty())
        break Fail87619;
      h_17561 = ((IStrategoList)annos2674).head();
      IStrategoTerm arg29986 = ((IStrategoList)annos2674).tail();
      if(arg29986.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg29986).isEmpty())
        break Fail87619;
      term = h_17561;
      Success47240:
      { 
        Fail87620:
        { 
          IStrategoTerm p_17560 = null;
          p_17560 = term;
          IStrategoTerm term47250 = term;
          Success47241:
          { 
            Fail87621:
            { 
              term = termFactory.makeTuple(trans.const17853, term);
              term = eq_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87621;
              { 
                if(true)
                  break Fail87620;
                if(true)
                  break Success47241;
              }
            }
            term = term47250;
          }
          term = p_17560;
          { 
            Success47242:
            { 
              Fail87622:
              { 
                term = is_spx_config_exist_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87622;
                term = trans.constNil14;
                o_17560 = trans.constNil14;
                if(true)
                  break Success47242;
              }
              IStrategoTerm u_17560 = null;
              IStrategoTerm w_17560 = null;
              IStrategoTerm x_17560 = null;
              term = n_17560;
              IStrategoTerm term47252 = term;
              Success47243:
              { 
                Fail87623:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87623;
                  if(true)
                    break Success47243;
                }
                term = term47252;
                IStrategoTerm term47253 = term;
                Success47244:
                { 
                  Fail87624:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87624;
                    if(true)
                      break Success47244;
                  }
                  term = term47253;
                  IStrategoTerm term47254 = term;
                  Success47245:
                  { 
                    Fail87625:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail87625;
                      if(true)
                        break Success47245;
                    }
                    term = term47254;
                    IStrategoTerm term47255 = term;
                    Success47246:
                    { 
                      Fail87626:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail87626;
                        if(true)
                          break Success47246;
                      }
                      term = term47255;
                      IStrategoTerm q_17560 = null;
                      IStrategoTerm r_17560 = null;
                      IStrategoTerm t_17560 = null;
                      q_17560 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail87619;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail87619;
                      r_17560 = ((IStrategoList)term).tail();
                      t_17560 = r_17560;
                      term = report_failure_0_2.instance.invoke(context, t_17560, trans.const17862, q_17560);
                      if(term == null)
                        break Fail87619;
                    }
                  }
                }
              }
              w_17560 = term;
              u_17560 = trans.const17844;
              x_17560 = w_17560;
              term = string_replace_0_2.instance.invoke(context, x_17560, u_17560, trans.const17863);
              if(term == null)
                break Fail87619;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const17864, termFactory.makeListCons(term, (IStrategoList)trans.constNil14));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87619;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(n_17560, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14))), (IStrategoList)trans.constNil14);
              o_17560 = term;
            }
            if(true)
              break Success47240;
          }
        }
        IStrategoTerm c_17561 = null;
        IStrategoTerm e_17561 = null;
        IStrategoTerm f_17561 = null;
        term = n_17560;
        IStrategoTerm term47256 = term;
        Success47247:
        { 
          Fail87627:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87627;
            if(true)
              break Success47247;
          }
          term = term47256;
          IStrategoTerm term47257 = term;
          Success47248:
          { 
            Fail87628:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87628;
              if(true)
                break Success47248;
            }
            term = term47257;
            IStrategoTerm term47258 = term;
            Success47249:
            { 
              Fail87629:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87629;
                if(true)
                  break Success47249;
              }
              term = term47258;
              IStrategoTerm term47259 = term;
              Success47250:
              { 
                Fail87630:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87630;
                  if(true)
                    break Success47250;
                }
                term = term47259;
                IStrategoTerm y_17560 = null;
                IStrategoTerm z_17560 = null;
                IStrategoTerm b_17561 = null;
                y_17560 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail87619;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail87619;
                z_17560 = ((IStrategoList)term).tail();
                b_17561 = z_17560;
                term = report_failure_0_2.instance.invoke(context, b_17561, trans.const17862, y_17560);
                if(term == null)
                  break Fail87619;
              }
            }
          }
        }
        e_17561 = term;
        c_17561 = trans.const17844;
        f_17561 = e_17561;
        term = string_replace_0_2.instance.invoke(context, f_17561, c_17561, trans.const17865);
        if(term == null)
          break Fail87619;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const17867, termFactory.makeListCons(term, (IStrategoList)trans.constCons8527));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87619;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(n_17560, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14))), (IStrategoList)trans.constNil14);
        o_17560 = term;
      }
      term = o_17560;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}