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

@SuppressWarnings("all") public class open_import_3_0 extends Strategy 
{ 
  public static open_import_3_0 instance = new open_import_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4198, Strategy m_4198, Strategy n_4198)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail21432:
    { 
      IStrategoTerm a_4198 = null;
      IStrategoTerm b_4198 = null;
      TermReference c_4198 = new TermReference();
      TermReference d_4198 = new TermReference();
      a_4198 = term;
      IStrategoTerm term11558 = term;
      Success11503:
      { 
        Fail21433:
        { 
          IStrategoTerm e_4198 = null;
          e_4198 = term;
          IStrategoTerm term11559 = term;
          Success11504:
          { 
            Fail21434:
            { 
              term = a_4198;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail21434;
              { 
                if(true)
                  break Fail21433;
                if(true)
                  break Success11504;
              }
            }
            term = term11559;
          }
          term = e_4198;
          { 
            term = l_4198.invoke(context, a_4198);
            if(term == null)
              break Fail21432;
            if(c_4198.value == null)
              c_4198.value = term;
            else
              if(c_4198.value != term && !c_4198.value.match(term))
                break Fail21432;
            if(c_4198.value == null)
              break Fail21432;
            term = import_cache_path_0_0.instance.invoke(context, c_4198.value);
            if(term == null)
              break Fail21432;
            b_4198 = term;
            IStrategoTerm term11560 = term;
            Success11505:
            { 
              Fail21435:
              { 
                IStrategoTerm f_4198 = null;
                f_4198 = term;
                IStrategoTerm term11561 = term;
                Success11506:
                { 
                  Fail21436:
                  { 
                    if(c_4198.value == null)
                      break Fail21436;
                    term = $Is$Imported_0_0.instance.invoke(context, c_4198.value);
                    if(term == null)
                      break Fail21436;
                    { 
                      if(true)
                        break Fail21435;
                      if(true)
                        break Success11506;
                    }
                  }
                  term = term11561;
                }
                term = f_4198;
                { 
                  IStrategoTerm g_4198 = null;
                  IStrategoTerm p_4198 = null;
                  IStrategoTerm r_4198 = null;
                  IStrategoTerm s_4198 = null;
                  IStrategoTerm t_4198 = null;
                  IStrategoTerm u_4198 = null;
                  g_4198 = term;
                  r_4198 = term;
                  p_4198 = trans.const4327;
                  term = r_4198;
                  s_4198 = r_4198;
                  if(c_4198.value == null)
                    break Fail21432;
                  term = termFactory.makeTuple(trans.const4328, c_4198.value);
                  term = dr_set_rule_0_3.instance.invoke(context, s_4198, p_4198, c_4198.value, term);
                  if(term == null)
                    break Fail21432;
                  term = g_4198;
                  IStrategoTerm term11562 = term;
                  Success11507:
                  { 
                    Fail21437:
                    { 
                      if(c_4198.value == null)
                        break Fail21437;
                      term = termFactory.makeTuple(b_4198, c_4198.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21437;
                      term = $Read$From$File_0_0.instance.invoke(context, b_4198);
                      if(term == null)
                        break Fail21437;
                      if(d_4198.value == null)
                        d_4198.value = term;
                      else
                        if(d_4198.value != term && !d_4198.value.match(term))
                          break Fail21437;
                      if(true)
                        break Success11507;
                    }
                    term = term11562;
                    if(c_4198.value == null)
                      break Fail21432;
                    term = m_4198.invoke(context, c_4198.value);
                    if(term == null)
                      break Fail21432;
                    if(d_4198.value == null)
                      d_4198.value = term;
                    else
                      if(d_4198.value != term && !d_4198.value.match(term))
                        break Fail21432;
                    IStrategoTerm term11563 = term;
                    Success11508:
                    { 
                      Fail21438:
                      { 
                        IStrategoTerm h_4198 = null;
                        h_4198 = term;
                        if(c_4198.value == null)
                          break Fail21438;
                        term = file_exists_0_0.instance.invoke(context, c_4198.value);
                        if(term == null)
                          break Fail21438;
                        term = h_4198;
                        { 
                          if(d_4198.value == null)
                            break Fail21432;
                          term = termFactory.makeTuple(b_4198, d_4198.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail21432;
                          if(true)
                            break Success11508;
                        }
                      }
                      term = term11563;
                    }
                  }
                  u_4198 = term;
                  t_4198 = trans.const4263;
                  term = u_4198;
                  lifted6537 lifted65370 = new lifted6537();
                  lifted65370.n_4198 = n_4198;
                  lifted65370.c_4198 = c_4198;
                  lifted65370.d_4198 = d_4198;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted65370, t_4198);
                  if(term == null)
                    break Fail21432;
                  if(true)
                    break Success11505;
                }
              }
              term = term11560;
            }
            if(true)
              break Success11503;
          }
        }
        term = term11558;
      }
      term = a_4198;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}