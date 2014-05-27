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

@SuppressWarnings("all") public class ast_change_to_text_change_1_2 extends Strategy 
{ 
  public static ast_change_to_text_change_1_2 instance = new ast_change_to_text_change_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4541, IStrategoTerm v_4541, IStrategoTerm w_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ast_change_to_text_change_1_2");
    Fail25928:
    { 
      IStrategoTerm term10346 = term;
      IStrategoConstructor cons349 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10273:
      { 
        if(cons349 == SpoofaxGenerator._consREPLACEMENT_2)
        { 
          Fail25929:
          { 
            IStrategoTerm s_4280 = null;
            IStrategoTerm t_4280 = null;
            IStrategoTerm u_4280 = null;
            IStrategoTerm v_4280 = null;
            IStrategoTerm d_4281 = null;
            u_4280 = term.getSubterm(0);
            v_4280 = term.getSubterm(1);
            Success10274:
            { 
              Fail25930:
              { 
                IStrategoTerm x_4280 = null;
                x_4280 = term;
                term = v_4280;
                IStrategoTerm term10348 = term;
                Success10275:
                { 
                  Fail25931:
                  { 
                    term = support_sublist_1_0.instance.invoke(context, term, lifted9302.instance);
                    if(term == null)
                      break Fail25931;
                    if(true)
                      break Success10275;
                  }
                  term = support_sublist_1_0.instance.invoke(context, term10348, lifted9303.instance);
                  if(term == null)
                    break Fail25930;
                }
                term = x_4280;
                { 
                  term = origin_offset_with_comments_0_0.instance.invoke(context, u_4280);
                  if(term == null)
                    break Fail25929;
                  s_4280 = term;
                  if(true)
                    break Success10274;
                }
              }
              term = support_sublist_1_0.instance.invoke(context, u_4280, lifted9304.instance);
              if(term == null)
                break Fail25929;
              s_4280 = term;
            }
            term = v_4280;
            Success10276:
            { 
              Fail25932:
              { 
                term = support_sublist_1_0.instance.invoke(context, term, lifted9305.instance);
                if(term == null)
                  break Fail25932;
                if(true)
                  break Success10276;
              }
              term = generator.const7064;
            }
            t_4280 = term;
            term = v_4280;
            IStrategoTerm term10350 = term;
            Success10277:
            { 
              Fail25933:
              { 
                IStrategoTerm a_4281 = null;
                IStrategoTerm b_4281 = null;
                IStrategoTerm g_4687 = null;
                IStrategoTerm h_4687 = null;
                IStrategoTerm k_4687 = null;
                IStrategoTerm l_4687 = null;
                b_4281 = term;
                term = termFactory.makeTuple(w_4541, t_4280);
                term = conc_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25933;
                a_4281 = term;
                k_4687 = b_4281;
                g_4687 = v_4541;
                l_4687 = k_4687;
                h_4687 = a_4281;
                term = construct_list_fragments_1_1.instance.invoke(context, l_4687, u_4541, g_4687);
                if(term == null)
                  break Fail25933;
                term = map_1_0.instance.invoke(context, term, trim_leading_whitespace_0_0.instance);
                if(term == null)
                  break Fail25933;
                term = concat_fragments_0_1.instance.invoke(context, term, h_4687);
                if(term == null)
                  break Fail25933;
                if(true)
                  break Success10277;
              }
              term = construct_text_1_1.instance.invoke(context, term10350, u_4541, v_4541);
              if(term == null)
                break Fail25929;
            }
            d_4281 = term;
            term = origin_indent_node_0_0.instance.invoke(context, u_4280);
            if(term == null)
              break Fail25929;
            term = prefix_lines_0_1.instance.invoke(context, d_4281, term);
            if(term == null)
              break Fail25929;
            term = trim_leading_whitespace_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25929;
            term = termFactory.makeTuple(s_4280, term);
            if(true)
              break Success10273;
          }
          term = term10346;
        }
        Success10278:
        { 
          if(cons349 == SpoofaxGenerator._consINSERT_BEFORE_2)
          { 
            Fail25934:
            { 
              IStrategoTerm e_4280 = null;
              IStrategoTerm g_4280 = null;
              IStrategoTerm h_4280 = null;
              IStrategoTerm i_4280 = null;
              IStrategoTerm j_4280 = null;
              j_4280 = term.getSubterm(0);
              e_4280 = term.getSubterm(1);
              term = origin_indent_node_0_0.instance.invoke(context, j_4280);
              if(term == null)
                break Fail25934;
              h_4280 = term;
              term = j_4280;
              Success10279:
              { 
                Fail25935:
                { 
                  term = origin_separating_ws_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25935;
                  if(true)
                    break Success10279;
                }
                term = generator.const7064;
              }
              term = termFactory.makeTuple(w_4541, term);
              term = conc_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25934;
              g_4280 = term;
              term = construct_list_text_1_2.instance.invoke(context, e_4280, u_4541, v_4541, term);
              if(term == null)
                break Fail25934;
              term = prefix_lines_0_1.instance.invoke(context, term, h_4280);
              if(term == null)
                break Fail25934;
              term = trim_leading_whitespace_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25934;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(g_4280, termFactory.makeListCons(h_4280, (IStrategoList)generator.constNil7)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25934;
              i_4280 = term;
              term = origin_offset_with_comments_0_0.instance.invoke(context, j_4280);
              if(term == null)
                break Fail25934;
              term = $Fst_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25934;
              term = termFactory.makeTuple(term, term);
              term = termFactory.makeTuple(term, i_4280);
              if(true)
                break Success10278;
            }
            term = term10346;
          }
          if(cons349 == SpoofaxGenerator._consINSERT_AT_END_2)
          { 
            IStrategoTerm p_4279 = null;
            IStrategoTerm q_4279 = null;
            IStrategoTerm r_4279 = null;
            IStrategoTerm s_4279 = null;
            IStrategoTerm t_4279 = null;
            IStrategoTerm u_4279 = null;
            u_4279 = term.getSubterm(0);
            q_4279 = term.getSubterm(1);
            term = try_1_0.instance.invoke(context, u_4279, last_0_0.instance);
            if(term == null)
              break Fail25928;
            term = origin_indent_node_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25928;
            p_4279 = term;
            term = u_4279;
            Success10280:
            { 
              Fail25936:
              { 
                term = try_1_0.instance.invoke(context, term, last_0_0.instance);
                if(term == null)
                  break Fail25936;
                term = origin_separating_ws_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25936;
                if(true)
                  break Success10280;
              }
              term = generator.const7064;
            }
            term = termFactory.makeTuple(w_4541, term);
            term = conc_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25928;
            r_4279 = term;
            term = construct_list_text_1_2.instance.invoke(context, q_4279, u_4541, v_4541, term);
            if(term == null)
              break Fail25928;
            term = prefix_lines_0_1.instance.invoke(context, term, p_4279);
            if(term == null)
              break Fail25928;
            s_4279 = term;
            Success10281:
            { 
              Fail25937:
              { 
                IStrategoTerm x_4279 = null;
                x_4279 = term;
                term = u_4279;
                IStrategoTerm term10355 = term;
                Success10282:
                { 
                  Fail25938:
                  { 
                    if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                      break Fail25938;
                    { 
                      if(true)
                        break Fail25937;
                      if(true)
                        break Success10282;
                    }
                  }
                  term = term10355;
                }
                term = x_4279;
                { 
                  term = termFactory.makeTuple(r_4279, s_4279);
                  term = conc_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25928;
                  t_4279 = term;
                  if(true)
                    break Success10281;
                }
              }
              term = s_4279;
              t_4279 = s_4279;
            }
            term = try_1_0.instance.invoke(context, u_4279, last_0_0.instance);
            if(term == null)
              break Fail25928;
            term = origin_offset_with_comments_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25928;
            term = $Snd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25928;
            term = termFactory.makeTuple(term, term);
            term = termFactory.makeTuple(term, t_4279);
          }
          else
          { 
            break Fail25928;
          }
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