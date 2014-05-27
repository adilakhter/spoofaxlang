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
    Fail23102:
    { 
      IStrategoTerm v_4782 = null;
      IStrategoTerm w_4782 = null;
      v_4782 = term;
      IStrategoTerm term12425 = term;
      Success12348:
      { 
        Fail23103:
        { 
          term = fetch_library_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23103;
          term = v_4782;
          w_4782 = v_4782;
          if(true)
            break Success12348;
        }
        term = term12425;
        Success12349:
        { 
          Fail23104:
          { 
            IStrategoTerm b_4783 = null;
            IStrategoTerm d_4783 = null;
            IStrategoTerm e_4783 = null;
            term = v_4782;
            IStrategoTerm term12427 = term;
            Success12350:
            { 
              Fail23105:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23105;
                if(true)
                  break Success12350;
              }
              term = term12427;
              IStrategoTerm term12428 = term;
              Success12351:
              { 
                Fail23106:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23106;
                  if(true)
                    break Success12351;
                }
                term = term12428;
                IStrategoTerm term12429 = term;
                Success12352:
                { 
                  Fail23107:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23107;
                    if(true)
                      break Success12352;
                  }
                  term = term12429;
                  IStrategoTerm term12430 = term;
                  Success12353:
                  { 
                    Fail23108:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23108;
                      if(true)
                        break Success12353;
                    }
                    term = term12430;
                    IStrategoTerm x_4782 = null;
                    IStrategoTerm y_4782 = null;
                    IStrategoTerm a_4783 = null;
                    x_4782 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail23104;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail23104;
                    y_4782 = ((IStrategoList)term).tail();
                    a_4783 = y_4782;
                    term = report_failure_0_2.instance.invoke(context, a_4783, trans.const4580, x_4782);
                    if(term == null)
                      break Fail23104;
                  }
                }
              }
            }
            d_4783 = term;
            b_4783 = trans.const4440;
            e_4783 = d_4783;
            term = string_replace_0_2.instance.invoke(context, e_4783, b_4783, trans.const4440);
            if(term == null)
              break Fail23104;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2091);
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23104;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
            term = resolve_import_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23104;
            w_4782 = term;
            if(true)
              break Success12349;
          }
          IStrategoTerm j_4783 = null;
          IStrategoTerm l_4783 = null;
          IStrategoTerm m_4783 = null;
          term = v_4782;
          IStrategoTerm term12431 = term;
          Success12354:
          { 
            Fail23109:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23109;
              if(true)
                break Success12354;
            }
            term = term12431;
            IStrategoTerm term12432 = term;
            Success12355:
            { 
              Fail23110:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23110;
                if(true)
                  break Success12355;
              }
              term = term12432;
              IStrategoTerm term12433 = term;
              Success12356:
              { 
                Fail23111:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23111;
                  if(true)
                    break Success12356;
                }
                term = term12433;
                IStrategoTerm term12434 = term;
                Success12357:
                { 
                  Fail23112:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23112;
                    if(true)
                      break Success12357;
                  }
                  term = term12434;
                  IStrategoTerm f_4783 = null;
                  IStrategoTerm g_4783 = null;
                  IStrategoTerm i_4783 = null;
                  f_4783 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23102;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23102;
                  g_4783 = ((IStrategoList)term).tail();
                  i_4783 = g_4783;
                  term = report_failure_0_2.instance.invoke(context, i_4783, trans.const4580, f_4783);
                  if(term == null)
                    break Fail23102;
                }
              }
            }
          }
          l_4783 = term;
          j_4783 = trans.const4440;
          m_4783 = l_4783;
          term = string_replace_0_2.instance.invoke(context, m_4783, j_4783, trans.const4440);
          if(term == null)
            break Fail23102;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2092);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23102;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          term = resolve_import_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23102;
          w_4782 = term;
        }
      }
      term = w_4782;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}