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

@SuppressWarnings("all") public class resolve_import_decl_0_0 extends Strategy 
{ 
  public static resolve_import_decl_0_0 instance = new resolve_import_decl_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("resolve_import_decl_0_0");
    Fail21626:
    { 
      IStrategoTerm d_4229 = null;
      IStrategoTerm e_4229 = null;
      d_4229 = term;
      IStrategoTerm term11716 = term;
      Success11639:
      { 
        Fail21627:
        { 
          term = fetch_library_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21627;
          term = d_4229;
          e_4229 = d_4229;
          if(true)
            break Success11639;
        }
        term = term11716;
        Success11640:
        { 
          Fail21628:
          { 
            IStrategoTerm j_4229 = null;
            IStrategoTerm l_4229 = null;
            IStrategoTerm m_4229 = null;
            term = d_4229;
            IStrategoTerm term11718 = term;
            Success11641:
            { 
              Fail21629:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21629;
                if(true)
                  break Success11641;
              }
              term = term11718;
              IStrategoTerm term11719 = term;
              Success11642:
              { 
                Fail21630:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21630;
                  if(true)
                    break Success11642;
                }
                term = term11719;
                IStrategoTerm term11720 = term;
                Success11643:
                { 
                  Fail21631:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21631;
                    if(true)
                      break Success11643;
                  }
                  term = term11720;
                  IStrategoTerm term11721 = term;
                  Success11644:
                  { 
                    Fail21632:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21632;
                      if(true)
                        break Success11644;
                    }
                    term = term11721;
                    IStrategoTerm f_4229 = null;
                    IStrategoTerm g_4229 = null;
                    IStrategoTerm i_4229 = null;
                    f_4229 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail21628;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail21628;
                    g_4229 = ((IStrategoList)term).tail();
                    i_4229 = g_4229;
                    term = report_failure_0_2.instance.invoke(context, i_4229, trans.const4370, f_4229);
                    if(term == null)
                      break Fail21628;
                  }
                }
              }
            }
            l_4229 = term;
            j_4229 = trans.const4230;
            m_4229 = l_4229;
            term = string_replace_0_2.instance.invoke(context, m_4229, j_4229, trans.const4230);
            if(term == null)
              break Fail21628;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2010);
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21628;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
            term = resolve_import_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21628;
            e_4229 = term;
            if(true)
              break Success11640;
          }
          IStrategoTerm r_4229 = null;
          IStrategoTerm t_4229 = null;
          IStrategoTerm u_4229 = null;
          term = d_4229;
          IStrategoTerm term11722 = term;
          Success11645:
          { 
            Fail21633:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21633;
              if(true)
                break Success11645;
            }
            term = term11722;
            IStrategoTerm term11723 = term;
            Success11646:
            { 
              Fail21634:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21634;
                if(true)
                  break Success11646;
              }
              term = term11723;
              IStrategoTerm term11724 = term;
              Success11647:
              { 
                Fail21635:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21635;
                  if(true)
                    break Success11647;
                }
                term = term11724;
                IStrategoTerm term11725 = term;
                Success11648:
                { 
                  Fail21636:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21636;
                    if(true)
                      break Success11648;
                  }
                  term = term11725;
                  IStrategoTerm n_4229 = null;
                  IStrategoTerm o_4229 = null;
                  IStrategoTerm q_4229 = null;
                  n_4229 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21626;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21626;
                  o_4229 = ((IStrategoList)term).tail();
                  q_4229 = o_4229;
                  term = report_failure_0_2.instance.invoke(context, q_4229, trans.const4370, n_4229);
                  if(term == null)
                    break Fail21626;
                }
              }
            }
          }
          t_4229 = term;
          r_4229 = trans.const4230;
          u_4229 = t_4229;
          term = string_replace_0_2.instance.invoke(context, u_4229, r_4229, trans.const4230);
          if(term == null)
            break Fail21626;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2011);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21626;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = resolve_import_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21626;
          e_4229 = term;
        }
      }
      term = e_4229;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}