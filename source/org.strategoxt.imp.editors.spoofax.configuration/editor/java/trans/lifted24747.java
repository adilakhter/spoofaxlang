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

@SuppressWarnings("all") final class lifted24747 extends Strategy 
{ 
  TermReference e_17565;

  TermReference f_17565;

  Strategy d_17566;

  Strategy b_17566;

  Strategy c_17566;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail87878:
    { 
      IStrategoTerm term47276 = term;
      Success47322:
      { 
        Fail87879:
        { 
          IStrategoTerm h_17565 = null;
          h_17565 = term;
          term = d_17566.invoke(context, term);
          if(term == null)
            break Fail87879;
          term = h_17565;
          { 
            IStrategoTerm term47277 = term;
            Success47323:
            { 
              Fail87880:
              { 
                IStrategoTerm h_17566 = null;
                IStrategoTerm j_17566 = null;
                IStrategoTerm m_17565 = null;
                IStrategoTerm o_17565 = null;
                IStrategoTerm p_17565 = null;
                IStrategoTerm w_17565 = null;
                IStrategoTerm y_17565 = null;
                IStrategoTerm z_17565 = null;
                j_17566 = term;
                if(e_17565.value == null)
                  break Fail87880;
                term = e_17565.value;
                IStrategoTerm term47278 = term;
                Success47324:
                { 
                  Fail87881:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87881;
                    if(true)
                      break Success47324;
                  }
                  term = term47278;
                  IStrategoTerm term47279 = term;
                  Success47325:
                  { 
                    Fail87882:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail87882;
                      if(true)
                        break Success47325;
                    }
                    term = term47279;
                    IStrategoTerm term47280 = term;
                    Success47326:
                    { 
                      Fail87883:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail87883;
                        if(true)
                          break Success47326;
                      }
                      term = term47280;
                      IStrategoTerm term47281 = term;
                      Success47327:
                      { 
                        Fail87884:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail87884;
                          if(true)
                            break Success47327;
                        }
                        term = term47281;
                        IStrategoTerm i_17565 = null;
                        IStrategoTerm j_17565 = null;
                        IStrategoTerm l_17565 = null;
                        i_17565 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail87880;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail87880;
                        j_17565 = ((IStrategoList)term).tail();
                        l_17565 = j_17565;
                        term = report_failure_0_2.instance.invoke(context, l_17565, trans.const17876, i_17565);
                        if(term == null)
                          break Fail87880;
                      }
                    }
                  }
                }
                o_17565 = term;
                m_17565 = trans.const17844;
                p_17565 = o_17565;
                term = string_replace_0_2.instance.invoke(context, p_17565, m_17565, trans.const17844);
                if(term == null)
                  break Fail87880;
                h_17566 = term;
                term = j_17566;
                IStrategoTerm term47282 = term;
                Success47328:
                { 
                  Fail87885:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87885;
                    if(true)
                      break Success47328;
                  }
                  term = term47282;
                  IStrategoTerm term47283 = term;
                  Success47329:
                  { 
                    Fail87886:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail87886;
                      if(true)
                        break Success47329;
                    }
                    term = term47283;
                    IStrategoTerm term47284 = term;
                    Success47330:
                    { 
                      Fail87887:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail87887;
                        if(true)
                          break Success47330;
                      }
                      term = term47284;
                      IStrategoTerm term47285 = term;
                      Success47331:
                      { 
                        Fail87888:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail87888;
                          if(true)
                            break Success47331;
                        }
                        term = term47285;
                        IStrategoTerm s_17565 = null;
                        IStrategoTerm t_17565 = null;
                        IStrategoTerm v_17565 = null;
                        s_17565 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail87880;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail87880;
                        t_17565 = ((IStrategoList)term).tail();
                        v_17565 = t_17565;
                        term = report_failure_0_2.instance.invoke(context, v_17565, trans.const17876, s_17565);
                        if(term == null)
                          break Fail87880;
                      }
                    }
                  }
                }
                y_17565 = term;
                w_17565 = trans.const17844;
                z_17565 = y_17565;
                term = string_replace_0_2.instance.invoke(context, z_17565, w_17565, trans.const17877);
                if(term == null)
                  break Fail87880;
                term = (IStrategoTerm)termFactory.makeListCons(h_17566, termFactory.makeListCons(trans.const17846, termFactory.makeListCons(term, (IStrategoList)trans.constNil14)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87880;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
                term = open_import_3_0.instance.invoke(context, term, _Id.instance, b_17566, c_17566);
                if(term == null)
                  break Fail87880;
                if(true)
                  break Success47323;
              }
              term = term47277;
              lifted24749 lifted247490 = new lifted24749();
              lifted247490.f_17565 = f_17565;
              term = try_1_0.instance.invoke(context, term, lifted247490);
              if(term == null)
                break Fail87878;
            }
            if(true)
              break Success47322;
          }
        }
        term = term47276;
      }
      if(true)
        return term;
    }
    return null;
  }
}