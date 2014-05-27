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

@SuppressWarnings("all") public class listinj2prodrule_0_0 extends Strategy 
{ 
  public static listinj2prodrule_0_0 instance = new listinj2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("listinj2prodrule_0_0");
    Fail25624:
    { 
      IStrategoTerm term10142 = term;
      IStrategoConstructor cons332 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10109:
      { 
        if(cons332 == SpoofaxGenerator._consprod_3)
        { 
          Fail25625:
          { 
            IStrategoTerm x_4243 = null;
            IStrategoTerm y_4243 = null;
            IStrategoTerm z_4243 = null;
            IStrategoTerm a_4244 = null;
            IStrategoTerm arg6051 = term.getSubterm(0);
            if(arg6051.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6051).isEmpty())
              break Fail25625;
            IStrategoTerm arg6052 = ((IStrategoList)arg6051).head();
            y_4243 = arg6052;
            if(arg6052.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6052).getConstructor())
              break Fail25625;
            IStrategoTerm arg6053 = arg6052.getSubterm(0);
            if(arg6053.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_1 != ((IStrategoAppl)arg6053).getConstructor())
              break Fail25625;
            x_4243 = arg6053.getSubterm(0);
            IStrategoTerm arg6054 = ((IStrategoList)arg6051).tail();
            if(arg6054.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6054).isEmpty())
              break Fail25625;
            IStrategoTerm arg6055 = term.getSubterm(1);
            a_4244 = arg6055;
            if(arg6055.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6055).getConstructor())
              break Fail25625;
            IStrategoTerm arg6056 = arg6055.getSubterm(0);
            if(arg6056.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_star_1 != ((IStrategoAppl)arg6056).getConstructor())
              break Fail25625;
            if(arg6056.getSubterm(0) != x_4243 && !x_4243.match(arg6056.getSubterm(0)))
              break Fail25625;
            term = get_nonterm_of_0_0.instance.invoke(context, y_4243);
            if(term == null)
              break Fail25625;
            z_4243 = term;
            term = get_nonterm_of_0_0.instance.invoke(context, a_4244);
            if(term == null)
              break Fail25625;
            term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{z_4243})}), (IStrategoList)generator.constNil7)});
            if(true)
              break Success10109;
          }
          term = term10142;
        }
        Success10110:
        { 
          if(cons332 == SpoofaxGenerator._consprod_3)
          { 
            Fail25626:
            { 
              IStrategoTerm u_4243 = null;
              IStrategoTerm arg6058 = term.getSubterm(0);
              if(arg6058.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6058).isEmpty())
                break Fail25626;
              u_4243 = term.getSubterm(1);
              term = is_list_symbol_0_0.instance.invoke(context, u_4243);
              if(term == null)
                break Fail25626;
              term = get_nonterm_of_0_0.instance.invoke(context, u_4243);
              if(term == null)
                break Fail25626;
              term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term}), generator.constCons4613});
              if(true)
                break Success10110;
            }
            term = term10142;
          }
          Success10111:
          { 
            if(cons332 == SpoofaxGenerator._consprod_3)
            { 
              Fail25627:
              { 
                IStrategoTerm p_4243 = null;
                IStrategoTerm q_4243 = null;
                IStrategoTerm r_4243 = null;
                IStrategoTerm arg6060 = term.getSubterm(0);
                if(arg6060.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6060).isEmpty())
                  break Fail25627;
                IStrategoTerm arg6061 = ((IStrategoList)arg6060).head();
                if(arg6061.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6061).getConstructor())
                  break Fail25627;
                r_4243 = arg6061.getSubterm(0);
                IStrategoTerm arg6062 = ((IStrategoList)arg6060).tail();
                if(arg6062.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6062).isEmpty())
                  break Fail25627;
                IStrategoTerm arg6063 = term.getSubterm(1);
                if(arg6063.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6063).getConstructor())
                  break Fail25627;
                IStrategoTerm arg6064 = arg6063.getSubterm(0);
                if(arg6064.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_1 != ((IStrategoAppl)arg6064).getConstructor())
                  break Fail25627;
                if(arg6064.getSubterm(0) != r_4243 && !r_4243.match(arg6064.getSubterm(0)))
                  break Fail25627;
                term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{r_4243});
                term = sym2tree_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25627;
                p_4243 = term;
                term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consiter_1, new IStrategoTerm[]{r_4243})});
                term = get_nonterm_of_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25627;
                q_4243 = term;
                term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consiter_star_1, new IStrategoTerm[]{r_4243})});
                term = get_nonterm_of_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25627;
                term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{q_4243}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constConsTerm0, (IStrategoTerm)termFactory.makeListCons(p_4243, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term})}), (IStrategoList)generator.constNil7))}), (IStrategoList)generator.constNil7)});
                if(true)
                  break Success10111;
              }
              term = term10142;
            }
            Success10112:
            { 
              if(cons332 == SpoofaxGenerator._consprod_3)
              { 
                Fail25628:
                { 
                  IStrategoTerm k_4243 = null;
                  IStrategoTerm l_4243 = null;
                  IStrategoTerm m_4243 = null;
                  IStrategoTerm arg6066 = term.getSubterm(0);
                  if(arg6066.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6066).isEmpty())
                    break Fail25628;
                  m_4243 = ((IStrategoList)arg6066).head();
                  IStrategoTerm arg6067 = ((IStrategoList)arg6066).tail();
                  if(arg6067.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6067).isEmpty())
                    break Fail25628;
                  IStrategoTerm arg6068 = term.getSubterm(1);
                  if(arg6068.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_1 != ((IStrategoAppl)arg6068).getConstructor())
                    break Fail25628;
                  if(arg6068.getSubterm(0) != m_4243 && !m_4243.match(arg6068.getSubterm(0)))
                    break Fail25628;
                  term = sym2tree_0_0.instance.invoke(context, m_4243);
                  if(term == null)
                    break Fail25628;
                  k_4243 = term;
                  term = termFactory.makeAppl(SpoofaxGenerator._consiter_1, new IStrategoTerm[]{m_4243});
                  term = get_nonterm_of_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25628;
                  l_4243 = term;
                  term = termFactory.makeAppl(SpoofaxGenerator._consiter_star_1, new IStrategoTerm[]{m_4243});
                  term = get_nonterm_of_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25628;
                  term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{l_4243}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constConsTerm0, (IStrategoTerm)termFactory.makeListCons(k_4243, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term})}), (IStrategoList)generator.constNil7))}), (IStrategoList)generator.constNil7)});
                  if(true)
                    break Success10112;
                }
                term = term10142;
              }
              Success10113:
              { 
                if(cons332 == SpoofaxGenerator._consprod_3)
                { 
                  Fail25629:
                  { 
                    IStrategoTerm e_4243 = null;
                    IStrategoTerm f_4243 = null;
                    IStrategoTerm g_4243 = null;
                    IStrategoTerm h_4243 = null;
                    IStrategoTerm i_4243 = null;
                    g_4243 = term.getSubterm(0);
                    e_4243 = term.getSubterm(1);
                    term = is_list_symbol_0_0.instance.invoke(context, e_4243);
                    if(term == null)
                      break Fail25629;
                    term = get_nonterm_of_0_0.instance.invoke(context, e_4243);
                    if(term == null)
                      break Fail25629;
                    f_4243 = term;
                    term = filter_1_0.instance.invoke(context, g_4243, lifted9160.instance);
                    if(term == null)
                      break Fail25629;
                    term = map_1_0.instance.invoke(context, term, lifted9161.instance);
                    if(term == null)
                      break Fail25629;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25629;
                    h_4243 = ((IStrategoList)term).head();
                    IStrategoTerm arg6071 = ((IStrategoList)term).tail();
                    if(arg6071.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6071).isEmpty())
                      break Fail25629;
                    i_4243 = ((IStrategoList)arg6071).head();
                    IStrategoTerm arg6072 = ((IStrategoList)arg6071).tail();
                    if(arg6072.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6072).isEmpty())
                      break Fail25629;
                    term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{f_4243}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constConcTerm0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{h_4243})}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{i_4243})}), (IStrategoList)generator.constNil7))}), (IStrategoList)generator.constNil7)});
                    if(true)
                      break Success10113;
                  }
                  term = term10142;
                }
                Success10114:
                { 
                  if(cons332 == SpoofaxGenerator._consprod_3)
                  { 
                    Fail25630:
                    { 
                      IStrategoTerm x_4242 = null;
                      IStrategoTerm y_4242 = null;
                      IStrategoTerm z_4242 = null;
                      IStrategoTerm a_4243 = null;
                      IStrategoTerm b_4243 = null;
                      IStrategoTerm arg6073 = term.getSubterm(0);
                      if(arg6073.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6073).isEmpty())
                        break Fail25630;
                      IStrategoTerm arg6074 = ((IStrategoList)arg6073).head();
                      z_4242 = arg6074;
                      if(arg6074.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6074).getConstructor())
                        break Fail25630;
                      IStrategoTerm arg6075 = arg6074.getSubterm(0);
                      if(arg6075.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_sep_2 != ((IStrategoAppl)arg6075).getConstructor())
                        break Fail25630;
                      x_4242 = arg6075.getSubterm(0);
                      y_4242 = arg6075.getSubterm(1);
                      IStrategoTerm arg6076 = ((IStrategoList)arg6073).tail();
                      if(arg6076.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6076).isEmpty())
                        break Fail25630;
                      IStrategoTerm arg6077 = term.getSubterm(1);
                      b_4243 = arg6077;
                      if(arg6077.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6077).getConstructor())
                        break Fail25630;
                      IStrategoTerm arg6078 = arg6077.getSubterm(0);
                      if(arg6078.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_star_sep_2 != ((IStrategoAppl)arg6078).getConstructor())
                        break Fail25630;
                      if(arg6078.getSubterm(0) != x_4242 && !x_4242.match(arg6078.getSubterm(0)))
                        break Fail25630;
                      if(arg6078.getSubterm(1) != y_4242 && !y_4242.match(arg6078.getSubterm(1)))
                        break Fail25630;
                      term = is_empty_sym_0_0.instance.invoke(context, y_4242);
                      if(term == null)
                        break Fail25630;
                      term = get_nonterm_of_0_0.instance.invoke(context, z_4242);
                      if(term == null)
                        break Fail25630;
                      a_4243 = term;
                      term = get_nonterm_of_0_0.instance.invoke(context, b_4243);
                      if(term == null)
                        break Fail25630;
                      term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{a_4243})}), (IStrategoList)generator.constNil7)});
                      if(true)
                        break Success10114;
                    }
                    term = term10142;
                  }
                  if(cons332 == SpoofaxGenerator._consprod_3)
                  { 
                    IStrategoTerm q_4242 = null;
                    IStrategoTerm r_4242 = null;
                    IStrategoTerm s_4242 = null;
                    IStrategoTerm t_4242 = null;
                    IStrategoTerm u_4242 = null;
                    IStrategoTerm arg6080 = term.getSubterm(0);
                    if(arg6080.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6080).isEmpty())
                      break Fail25624;
                    IStrategoTerm arg6081 = ((IStrategoList)arg6080).head();
                    if(arg6081.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6081).getConstructor())
                      break Fail25624;
                    t_4242 = arg6081.getSubterm(0);
                    IStrategoTerm arg6082 = ((IStrategoList)arg6080).tail();
                    if(arg6082.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6082).isEmpty())
                      break Fail25624;
                    IStrategoTerm arg6083 = term.getSubterm(1);
                    r_4242 = arg6083;
                    if(arg6083.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6083).getConstructor())
                      break Fail25624;
                    IStrategoTerm arg6084 = arg6083.getSubterm(0);
                    if(arg6084.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_sep_2 != ((IStrategoAppl)arg6084).getConstructor())
                      break Fail25624;
                    if(arg6084.getSubterm(0) != t_4242 && !t_4242.match(arg6084.getSubterm(0)))
                      break Fail25624;
                    u_4242 = arg6084.getSubterm(1);
                    term = is_empty_sym_0_0.instance.invoke(context, u_4242);
                    if(term == null)
                      break Fail25624;
                    term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{t_4242});
                    term = sym2tree_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25624;
                    q_4242 = term;
                    term = get_nonterm_of_0_0.instance.invoke(context, r_4242);
                    if(term == null)
                      break Fail25624;
                    s_4242 = term;
                    term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consiter_star_sep_2, new IStrategoTerm[]{t_4242, u_4242})});
                    term = get_nonterm_of_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25624;
                    term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{s_4242}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constConsTerm0, (IStrategoTerm)termFactory.makeListCons(q_4242, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term})}), (IStrategoList)generator.constNil7))}), (IStrategoList)generator.constNil7)});
                  }
                  else
                  { 
                    break Fail25624;
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