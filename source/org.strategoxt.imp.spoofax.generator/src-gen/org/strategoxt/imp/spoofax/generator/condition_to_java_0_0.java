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

@SuppressWarnings("all") public class condition_to_java_0_0 extends Strategy 
{ 
  public static condition_to_java_0_0 instance = new condition_to_java_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("condition_to_java_0_0");
    Fail26264:
    { 
      IStrategoTerm term10622 = term;
      IStrategoConstructor cons350 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10536:
      { 
        if(cons350 == SpoofaxGenerator._consToken_1)
        { 
          Fail26265:
          { 
            IStrategoTerm b_4323 = null;
            IStrategoTerm c_4323 = null;
            IStrategoTerm f_4323 = null;
            b_4323 = term.getSubterm(0);
            f_4323 = term;
            IStrategoTerm term10623 = term;
            Success10537:
            { 
              Fail26266:
              { 
                term = write_to_string_0_0.instance.invoke(context, b_4323);
                if(term == null)
                  break Fail26266;
                c_4323 = term;
                if(true)
                  break Success10537;
              }
              term = term10623;
              IStrategoTerm d_4323 = null;
              IStrategoTerm e_4323 = null;
              IStrategoTerm h_4323 = null;
              d_4323 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26265;
              e_4323 = term;
              h_4323 = d_4323;
              term = report_with_failure_0_2.instance.invoke(context, h_4323, generator.const7469, e_4323);
              if(term == null)
                break Fail26265;
            }
            term = f_4323;
            if(c_4323 == null)
              break Fail26265;
            term = termFactory.makeAppl(SpoofaxGenerator._consEq_2, new IStrategoTerm[]{generator.constExprName0, termFactory.makeAppl(SpoofaxGenerator._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consId_1, new IStrategoTerm[]{c_4323})})});
            if(true)
              break Success10536;
          }
          term = term10622;
        }
        Success10538:
        { 
          if(cons350 == SpoofaxGenerator._consConstructor_1)
          { 
            Fail26267:
            { 
              IStrategoTerm y_4322 = null;
              y_4322 = term.getSubterm(0);
              term = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{y_4322}), (IStrategoList)generator.constNil7)})}), generator.constNone0, generator.constId1}), generator.constCons4924});
              if(true)
                break Success10538;
            }
            term = term10622;
          }
          Success10539:
          { 
            if(cons350 == SpoofaxGenerator._consSort_1)
            { 
              Fail26268:
              { 
                IStrategoTerm v_4322 = null;
                v_4322 = term.getSubterm(0);
                term = try_get_sort_name_0_0.instance.invoke(context, v_4322);
                if(term == null)
                  break Fail26268;
                term = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)})}), generator.constNone0, generator.constId1}), generator.constCons4925});
                if(true)
                  break Success10539;
              }
              term = term10622;
            }
            Success10540:
            { 
              if(cons350 == SpoofaxGenerator._consListSort_1)
              { 
                Fail26269:
                { 
                  IStrategoTerm q_4322 = null;
                  q_4322 = term.getSubterm(0);
                  term = try_get_sort_name_0_0.instance.invoke(context, q_4322);
                  if(term == null)
                    break Fail26269;
                  term = termFactory.makeTuple(term, generator.const7184);
                  term = conc_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26269;
                  term = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)})}), generator.constNone0, generator.constId1}), generator.constCons4925});
                  if(true)
                    break Success10540;
                }
                term = term10622;
              }
              Success10541:
              { 
                if(cons350 == SpoofaxGenerator._consOutlineRule_1)
                { 
                  Fail26270:
                  { 
                    IStrategoTerm m_4322 = null;
                    IStrategoTerm n_4322 = null;
                    IStrategoTerm arg6349 = term.getSubterm(0);
                    if(arg6349.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSortAndConstructor_2 != ((IStrategoAppl)arg6349).getConstructor())
                      break Fail26270;
                    IStrategoTerm arg6350 = arg6349.getSubterm(0);
                    if(arg6350.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSort_1 != ((IStrategoAppl)arg6350).getConstructor())
                      break Fail26270;
                    n_4322 = arg6350.getSubterm(0);
                    IStrategoTerm arg6351 = arg6349.getSubterm(1);
                    if(arg6351.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consConstructor_1 != ((IStrategoAppl)arg6351).getConstructor())
                      break Fail26270;
                    m_4322 = arg6351.getSubterm(0);
                    term = try_get_sort_name_0_0.instance.invoke(context, n_4322);
                    if(term == null)
                      break Fail26270;
                    term = termFactory.makeAppl(SpoofaxGenerator._consLazyAnd_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{m_4322}), (IStrategoList)generator.constNil7)})}), generator.constNone0, generator.constId1}), generator.constCons4924}), termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)})}), generator.constNone0, generator.constId1}), generator.constCons4925})});
                    if(true)
                      break Success10541;
                  }
                  term = term10622;
                }
                if(cons350 == SpoofaxGenerator._consOutlineRule_1)
                { 
                  IStrategoTerm j_4322 = null;
                  IStrategoTerm arg6352 = term.getSubterm(0);
                  if(arg6352.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consConstructorOnly_1 != ((IStrategoAppl)arg6352).getConstructor())
                    break Fail26264;
                  IStrategoTerm arg6353 = arg6352.getSubterm(0);
                  if(arg6353.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consConstructor_1 != ((IStrategoAppl)arg6353).getConstructor())
                    break Fail26264;
                  j_4322 = arg6353.getSubterm(0);
                  term = try_get_sort_name_0_0.instance.invoke(context, j_4322);
                  if(term == null)
                    break Fail26264;
                  term = termFactory.makeAppl(SpoofaxGenerator._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)})}), generator.constNone0, generator.constId1}), generator.constCons4925});
                }
                else
                { 
                  break Fail26264;
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