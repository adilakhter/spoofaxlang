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

@SuppressWarnings("all") public class ast_change_to_text_change_1_1 extends Strategy 
{ 
  public static ast_change_to_text_change_1_1 instance = new ast_change_to_text_change_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4541, IStrategoTerm t_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ast_change_to_text_change_1_1");
    Fail25913:
    { 
      IStrategoTerm term10332 = term;
      IStrategoConstructor cons348 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10259:
      { 
        if(cons348 == SpoofaxGenerator._consREPLACEMENT_3)
        { 
          Fail25914:
          { 
            IStrategoTerm h_4279 = null;
            IStrategoTerm i_4279 = null;
            IStrategoTerm j_4279 = null;
            IStrategoTerm k_4279 = null;
            j_4279 = term.getSubterm(0);
            h_4279 = term.getSubterm(1);
            i_4279 = term.getSubterm(2);
            term = j_4279;
            Success10260:
            { 
              Fail25915:
              { 
                term = get_separator_from_table_0_1.instance.invoke(context, term, t_4541);
                if(term == null)
                  break Fail25915;
                if(true)
                  break Success10260;
              }
              term = generator.const7000;
            }
            k_4279 = term;
            term = termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_2, new IStrategoTerm[]{h_4279, i_4279});
            term = ast_change_to_text_change_1_2.instance.invoke(context, term, s_4541, t_4541, k_4279);
            if(term == null)
              break Fail25914;
            if(true)
              break Success10259;
          }
          term = term10332;
        }
        Success10261:
        { 
          if(cons348 == SpoofaxGenerator._consREPLACEMENT_2)
          { 
            Fail25916:
            { 
              IStrategoTerm b_4279 = null;
              IStrategoTerm c_4279 = null;
              IStrategoTerm d_4279 = null;
              b_4279 = term.getSubterm(0);
              c_4279 = term.getSubterm(1);
              IStrategoTerm term10335 = term;
              Success10262:
              { 
                Fail25917:
                { 
                  term = last_0_0.instance.invoke(context, b_4279);
                  if(term == null)
                    break Fail25917;
                  term = origin_separator_text_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25917;
                  d_4279 = term;
                  if(true)
                    break Success10262;
                }
                term = term10335;
                Success10263:
                { 
                  Fail25918:
                  { 
                    term = fetch_elem_1_0.instance.invoke(context, c_4279, lifted9298.instance);
                    if(term == null)
                      break Fail25918;
                    term = origin_separator_text_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25918;
                    d_4279 = term;
                    if(true)
                      break Success10263;
                  }
                  term = generator.const7000;
                  d_4279 = generator.const7000;
                }
              }
              term = termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_2, new IStrategoTerm[]{b_4279, c_4279});
              term = ast_change_to_text_change_1_2.instance.invoke(context, term, s_4541, t_4541, d_4279);
              if(term == null)
                break Fail25916;
              if(true)
                break Success10261;
            }
            term = term10332;
          }
          Success10264:
          { 
            if(cons348 == SpoofaxGenerator._consDETETION_1)
            { 
              Fail25919:
              { 
                IStrategoTerm s_4278 = null;
                IStrategoTerm t_4278 = null;
                IStrategoTerm u_4278 = null;
                IStrategoTerm v_4278 = null;
                IStrategoTerm w_4278 = null;
                s_4278 = term.getSubterm(0);
                term = support_sublist_1_0.instance.invoke(context, s_4278, lifted9300.instance);
                if(term == null)
                  break Fail25919;
                u_4278 = term;
                term = generator.const7000;
                v_4278 = generator.const7000;
                Success10265:
                { 
                  Fail25920:
                  { 
                    IStrategoTerm x_4278 = null;
                    x_4278 = term;
                    term = origin_separator_offset_with_lo_0_0.instance.invoke(context, s_4278);
                    if(term == null)
                      break Fail25920;
                    t_4278 = term;
                    term = x_4278;
                    { 
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(u_4278, v_4278), termFactory.makeListCons(termFactory.makeTuple(t_4278, generator.const7000), (IStrategoList)generator.constNil7));
                      w_4278 = term;
                      if(true)
                        break Success10265;
                    }
                  }
                  term = termFactory.makeTuple(u_4278, v_4278);
                  w_4278 = term;
                }
                term = w_4278;
                if(true)
                  break Success10264;
              }
              term = term10332;
            }
            Success10266:
            { 
              if(cons348 == SpoofaxGenerator._consINSERT_BEFORE_2)
              { 
                Fail25921:
                { 
                  IStrategoTerm m_4278 = null;
                  IStrategoTerm n_4278 = null;
                  IStrategoTerm o_4278 = null;
                  n_4278 = term.getSubterm(0);
                  m_4278 = term.getSubterm(1);
                  term = n_4278;
                  Success10267:
                  { 
                    Fail25922:
                    { 
                      term = origin_separator_text_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25922;
                      if(true)
                        break Success10267;
                    }
                    term = generator.const7000;
                  }
                  o_4278 = term;
                  term = termFactory.makeAppl(SpoofaxGenerator._consINSERT_BEFORE_2, new IStrategoTerm[]{n_4278, m_4278});
                  term = ast_change_to_text_change_1_2.instance.invoke(context, term, s_4541, t_4541, o_4278);
                  if(term == null)
                    break Fail25921;
                  if(true)
                    break Success10266;
                }
                term = term10332;
              }
              Success10268:
              { 
                if(cons348 == SpoofaxGenerator._consINSERT_BEFORE_3)
                { 
                  Fail25923:
                  { 
                    IStrategoTerm f_4278 = null;
                    IStrategoTerm g_4278 = null;
                    IStrategoTerm h_4278 = null;
                    IStrategoTerm i_4278 = null;
                    h_4278 = term.getSubterm(0);
                    f_4278 = term.getSubterm(1);
                    g_4278 = term.getSubterm(2);
                    term = h_4278;
                    Success10269:
                    { 
                      Fail25924:
                      { 
                        term = get_separator_from_table_0_1.instance.invoke(context, term, t_4541);
                        if(term == null)
                          break Fail25924;
                        if(true)
                          break Success10269;
                      }
                      term = generator.const7000;
                    }
                    i_4278 = term;
                    term = termFactory.makeAppl(SpoofaxGenerator._consINSERT_BEFORE_2, new IStrategoTerm[]{f_4278, g_4278});
                    term = ast_change_to_text_change_1_2.instance.invoke(context, term, s_4541, t_4541, i_4278);
                    if(term == null)
                      break Fail25923;
                    if(true)
                      break Success10268;
                  }
                  term = term10332;
                }
                Success10270:
                { 
                  if(cons348 == SpoofaxGenerator._consINSERT_AT_END_2)
                  { 
                    Fail25925:
                    { 
                      IStrategoTerm z_4277 = null;
                      IStrategoTerm a_4278 = null;
                      IStrategoTerm b_4278 = null;
                      a_4278 = term.getSubterm(0);
                      z_4277 = term.getSubterm(1);
                      term = try_1_0.instance.invoke(context, a_4278, last_0_0.instance);
                      if(term == null)
                        break Fail25925;
                      Success10271:
                      { 
                        Fail25926:
                        { 
                          term = origin_separator_text_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail25926;
                          if(true)
                            break Success10271;
                        }
                        term = generator.const7000;
                      }
                      b_4278 = term;
                      term = termFactory.makeAppl(SpoofaxGenerator._consINSERT_AT_END_2, new IStrategoTerm[]{a_4278, z_4277});
                      term = ast_change_to_text_change_1_2.instance.invoke(context, term, s_4541, t_4541, b_4278);
                      if(term == null)
                        break Fail25925;
                      if(true)
                        break Success10270;
                    }
                    term = term10332;
                  }
                  if(cons348 == SpoofaxGenerator._consINSERT_AT_END_3)
                  { 
                    IStrategoTerm s_4277 = null;
                    IStrategoTerm t_4277 = null;
                    IStrategoTerm u_4277 = null;
                    IStrategoTerm v_4277 = null;
                    u_4277 = term.getSubterm(0);
                    s_4277 = term.getSubterm(1);
                    t_4277 = term.getSubterm(2);
                    term = u_4277;
                    Success10272:
                    { 
                      Fail25927:
                      { 
                        term = get_separator_from_table_0_1.instance.invoke(context, term, t_4541);
                        if(term == null)
                          break Fail25927;
                        if(true)
                          break Success10272;
                      }
                      term = generator.const7000;
                    }
                    v_4277 = term;
                    term = termFactory.makeAppl(SpoofaxGenerator._consINSERT_AT_END_2, new IStrategoTerm[]{s_4277, t_4277});
                    term = ast_change_to_text_change_1_2.instance.invoke(context, term, s_4541, t_4541, v_4277);
                    if(term == null)
                      break Fail25913;
                  }
                  else
                  { 
                    break Fail25913;
                  }
                }
              }
            }
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