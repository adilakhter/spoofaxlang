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
    Fail22811:
    { 
      IStrategoTerm q_4616 = null;
      IStrategoTerm r_4616 = null;
      IStrategoTerm k_4617 = null;
      q_4616 = term;
      IStrategoList annos695 = term.getAnnotations();
      if(annos695.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos695).isEmpty())
        break Fail22811;
      k_4617 = ((IStrategoList)annos695).head();
      IStrategoTerm arg8011 = ((IStrategoList)annos695).tail();
      if(arg8011.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8011).isEmpty())
        break Fail22811;
      term = k_4617;
      Success12153:
      { 
        Fail22812:
        { 
          IStrategoTerm s_4616 = null;
          s_4616 = term;
          IStrategoTerm term12163 = term;
          Success12154:
          { 
            Fail22813:
            { 
              term = termFactory.makeTuple(trans.const4466, term);
              term = eq_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22813;
              { 
                if(true)
                  break Fail22812;
                if(true)
                  break Success12154;
              }
            }
            term = term12163;
          }
          term = s_4616;
          { 
            Success12155:
            { 
              Fail22814:
              { 
                term = is_spx_config_exist_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22814;
                term = trans.constNil4;
                r_4616 = trans.constNil4;
                if(true)
                  break Success12155;
              }
              IStrategoTerm x_4616 = null;
              IStrategoTerm z_4616 = null;
              IStrategoTerm a_4617 = null;
              term = q_4616;
              IStrategoTerm term12165 = term;
              Success12156:
              { 
                Fail22815:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22815;
                  if(true)
                    break Success12156;
                }
                term = term12165;
                IStrategoTerm term12166 = term;
                Success12157:
                { 
                  Fail22816:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22816;
                    if(true)
                      break Success12157;
                  }
                  term = term12166;
                  IStrategoTerm term12167 = term;
                  Success12158:
                  { 
                    Fail22817:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail22817;
                      if(true)
                        break Success12158;
                    }
                    term = term12167;
                    IStrategoTerm term12168 = term;
                    Success12159:
                    { 
                      Fail22818:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail22818;
                        if(true)
                          break Success12159;
                      }
                      term = term12168;
                      IStrategoTerm t_4616 = null;
                      IStrategoTerm u_4616 = null;
                      IStrategoTerm w_4616 = null;
                      t_4616 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail22811;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail22811;
                      u_4616 = ((IStrategoList)term).tail();
                      w_4616 = u_4616;
                      term = report_failure_0_2.instance.invoke(context, w_4616, trans.const4475, t_4616);
                      if(term == null)
                        break Fail22811;
                    }
                  }
                }
              }
              z_4616 = term;
              x_4616 = trans.const4457;
              a_4617 = z_4616;
              term = string_replace_0_2.instance.invoke(context, a_4617, x_4616, trans.const4476);
              if(term == null)
                break Fail22811;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4477, termFactory.makeListCons(term, (IStrategoList)trans.constNil4));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22811;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(q_4616, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4))), (IStrategoList)trans.constNil4);
              r_4616 = term;
            }
            if(true)
              break Success12153;
          }
        }
        IStrategoTerm f_4617 = null;
        IStrategoTerm h_4617 = null;
        IStrategoTerm i_4617 = null;
        term = q_4616;
        IStrategoTerm term12169 = term;
        Success12160:
        { 
          Fail22819:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22819;
            if(true)
              break Success12160;
          }
          term = term12169;
          IStrategoTerm term12170 = term;
          Success12161:
          { 
            Fail22820:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22820;
              if(true)
                break Success12161;
            }
            term = term12170;
            IStrategoTerm term12171 = term;
            Success12162:
            { 
              Fail22821:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22821;
                if(true)
                  break Success12162;
              }
              term = term12171;
              IStrategoTerm term12172 = term;
              Success12163:
              { 
                Fail22822:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22822;
                  if(true)
                    break Success12163;
                }
                term = term12172;
                IStrategoTerm b_4617 = null;
                IStrategoTerm c_4617 = null;
                IStrategoTerm e_4617 = null;
                b_4617 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail22811;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail22811;
                c_4617 = ((IStrategoList)term).tail();
                e_4617 = c_4617;
                term = report_failure_0_2.instance.invoke(context, e_4617, trans.const4475, b_4617);
                if(term == null)
                  break Fail22811;
              }
            }
          }
        }
        h_4617 = term;
        f_4617 = trans.const4457;
        i_4617 = h_4617;
        term = string_replace_0_2.instance.invoke(context, i_4617, f_4617, trans.const4478);
        if(term == null)
          break Fail22811;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constCons2046));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22811;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(q_4616, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4))), (IStrategoList)trans.constNil4);
        r_4616 = term;
      }
      term = r_4616;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}