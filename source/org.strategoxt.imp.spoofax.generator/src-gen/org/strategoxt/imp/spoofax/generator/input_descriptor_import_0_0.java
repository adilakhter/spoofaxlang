package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class input_descriptor_import_0_0 extends Strategy 
{ 
  public static input_descriptor_import_0_0 instance = new input_descriptor_import_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("input_descriptor_import_0_0");
    Fail25802:
    { 
      TermReference m_4262 = new TermReference();
      TermReference n_4262 = new TermReference();
      IStrategoTerm term10245 = term;
      IStrategoConstructor cons343 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10190:
      { 
        if(cons343 == SpoofaxGenerator._consImport_1)
        { 
          Fail25803:
          { 
            IStrategoTerm s_4262 = null;
            IStrategoTerm u_4262 = null;
            IStrategoTerm x_4262 = null;
            if(m_4262.value == null)
              m_4262.value = term.getSubterm(0);
            else
              if(m_4262.value != term.getSubterm(0) && !m_4262.value.match(term.getSubterm(0)))
                break Fail25803;
            if(m_4262.value == null)
              break Fail25803;
            term = termFactory.makeTuple(m_4262.value, generator.const7127);
            term = add_extension_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25803;
            term = include_input_dir_prefix_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25803;
            term = file_exists_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25803;
            term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{term});
            u_4262 = term;
            term = parse_table_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25803;
            s_4262 = term;
            x_4262 = u_4262;
            term = parse_xtc_file_report_errors_0_2.instance.invoke(context, x_4262, s_4262, generator.const7012);
            if(term == null)
              break Fail25803;
            IStrategoTerm term10246 = term;
            Success10191:
            { 
              Fail25804:
              { 
                IStrategoTerm o_4262 = null;
                o_4262 = term;
                term = oncetd_1_0.instance.invoke(context, term, lifted9247.instance);
                if(term == null)
                  break Fail25804;
                term = o_4262;
                { 
                  IStrategoTerm z_4262 = null;
                  z_4262 = term;
                  term = fatal_err_0_1.instance.invoke(context, z_4262, generator.const7149);
                  if(term == null)
                    break Fail25803;
                  if(true)
                    break Success10191;
                }
              }
              term = term10246;
            }
            IStrategoTerm term10247 = term;
            Success10192:
            { 
              Fail25805:
              { 
                if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail25805;
                if(m_4262.value == null)
                  m_4262.value = term.getSubterm(0);
                else
                  if(m_4262.value != term.getSubterm(0) && !m_4262.value.match(term.getSubterm(0)))
                    break Fail25805;
                if(true)
                  break Success10192;
              }
              term = term10247;
              IStrategoTerm term10248 = term;
              Success10193:
              { 
                Fail25806:
                { 
                  lifted9248 lifted92480 = new lifted9248();
                  lifted92480.m_4262 = m_4262;
                  term = try_1_0.instance.invoke(context, term, lifted92480);
                  if(term == null)
                    break Fail25806;
                  if(true)
                    break Fail25806;
                  if(true)
                    break Success10193;
                }
                term = term10248;
                IStrategoTerm term10249 = term;
                Success10194:
                { 
                  Fail25807:
                  { 
                    IStrategoTerm p_4262 = null;
                    IStrategoTerm d_4263 = null;
                    p_4262 = term;
                    term = $Input$File_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25807;
                    d_4263 = term;
                    term = has_extension_0_1.instance.invoke(context, d_4263, generator.const7127);
                    if(term == null)
                      break Fail25807;
                    term = p_4262;
                    { 
                      IStrategoTerm f_4263 = null;
                      f_4263 = term;
                      term = fatal_err_0_1.instance.invoke(context, f_4263, generator.const7150);
                      if(term == null)
                        break Fail25803;
                      if(true)
                        break Success10194;
                    }
                  }
                  term = term10249;
                  IStrategoTerm h_4263 = null;
                  h_4263 = term;
                  term = err_0_1.instance.invoke(context, h_4263, generator.const7150);
                  if(term == null)
                    break Fail25803;
                }
              }
            }
            if(true)
              break Success10190;
          }
          term = term10245;
        }
        if(cons343 == SpoofaxGenerator._consImportRenamed_2)
        { 
          if(m_4262.value == null)
            m_4262.value = term.getSubterm(0);
          else
            if(m_4262.value != term.getSubterm(0) && !m_4262.value.match(term.getSubterm(0)))
              break Fail25802;
          if(n_4262.value == null)
            n_4262.value = term.getSubterm(1);
          else
            if(n_4262.value != term.getSubterm(1) && !n_4262.value.match(term.getSubterm(1)))
              break Fail25802;
          if(m_4262.value == null)
            break Fail25802;
          term = termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{m_4262.value});
          term = this.invoke(context, term);
          if(term == null)
            break Fail25802;
          term = fetch_imports_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25802;
          lifted9249 lifted92490 = new lifted9249();
          lifted92490.n_4262 = n_4262;
          term = alltd_1_0.instance.invoke(context, term, lifted92490);
          if(term == null)
            break Fail25802;
        }
        else
        { 
          break Fail25802;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}