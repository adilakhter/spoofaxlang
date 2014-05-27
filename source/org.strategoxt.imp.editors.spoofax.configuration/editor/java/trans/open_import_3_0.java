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

@SuppressWarnings("all") public class open_import_3_0 extends Strategy 
{ 
  public static open_import_3_0 instance = new open_import_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17564, Strategy o_17564, Strategy p_17564)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail87648:
    { 
      IStrategoTerm c_17564 = null;
      IStrategoTerm d_17564 = null;
      TermReference e_17564 = new TermReference();
      TermReference f_17564 = new TermReference();
      c_17564 = term;
      IStrategoTerm term47268 = term;
      Success47259:
      { 
        Fail87649:
        { 
          IStrategoTerm g_17564 = null;
          g_17564 = term;
          IStrategoTerm term47269 = term;
          Success47260:
          { 
            Fail87650:
            { 
              term = c_17564;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail87650;
              { 
                if(true)
                  break Fail87649;
                if(true)
                  break Success47260;
              }
            }
            term = term47269;
          }
          term = g_17564;
          { 
            term = n_17564.invoke(context, c_17564);
            if(term == null)
              break Fail87648;
            if(e_17564.value == null)
              e_17564.value = term;
            else
              if(e_17564.value != term && !e_17564.value.match(term))
                break Fail87648;
            if(e_17564.value == null)
              break Fail87648;
            term = import_cache_path_0_0.instance.invoke(context, e_17564.value);
            if(term == null)
              break Fail87648;
            d_17564 = term;
            IStrategoTerm term47270 = term;
            Success47261:
            { 
              Fail87651:
              { 
                IStrategoTerm h_17564 = null;
                h_17564 = term;
                IStrategoTerm term47271 = term;
                Success47262:
                { 
                  Fail87652:
                  { 
                    if(e_17564.value == null)
                      break Fail87652;
                    term = $Is$Imported_0_0.instance.invoke(context, e_17564.value);
                    if(term == null)
                      break Fail87652;
                    { 
                      if(true)
                        break Fail87651;
                      if(true)
                        break Success47262;
                    }
                  }
                  term = term47271;
                }
                term = h_17564;
                { 
                  IStrategoTerm i_17564 = null;
                  IStrategoTerm r_17564 = null;
                  IStrategoTerm t_17564 = null;
                  IStrategoTerm u_17564 = null;
                  IStrategoTerm v_17564 = null;
                  IStrategoTerm w_17564 = null;
                  i_17564 = term;
                  t_17564 = term;
                  r_17564 = trans.const17874;
                  term = t_17564;
                  u_17564 = t_17564;
                  if(e_17564.value == null)
                    break Fail87648;
                  term = termFactory.makeTuple(trans.const17875, e_17564.value);
                  term = dr_set_rule_0_3.instance.invoke(context, u_17564, r_17564, e_17564.value, term);
                  if(term == null)
                    break Fail87648;
                  term = i_17564;
                  IStrategoTerm term47272 = term;
                  Success47263:
                  { 
                    Fail87653:
                    { 
                      if(e_17564.value == null)
                        break Fail87653;
                      term = termFactory.makeTuple(d_17564, e_17564.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail87653;
                      term = $Read$From$File_0_0.instance.invoke(context, d_17564);
                      if(term == null)
                        break Fail87653;
                      if(f_17564.value == null)
                        f_17564.value = term;
                      else
                        if(f_17564.value != term && !f_17564.value.match(term))
                          break Fail87653;
                      if(true)
                        break Success47263;
                    }
                    term = term47272;
                    if(e_17564.value == null)
                      break Fail87648;
                    term = o_17564.invoke(context, e_17564.value);
                    if(term == null)
                      break Fail87648;
                    if(f_17564.value == null)
                      f_17564.value = term;
                    else
                      if(f_17564.value != term && !f_17564.value.match(term))
                        break Fail87648;
                    IStrategoTerm term47273 = term;
                    Success47264:
                    { 
                      Fail87654:
                      { 
                        IStrategoTerm j_17564 = null;
                        j_17564 = term;
                        if(e_17564.value == null)
                          break Fail87654;
                        term = file_exists_0_0.instance.invoke(context, e_17564.value);
                        if(term == null)
                          break Fail87654;
                        term = j_17564;
                        { 
                          if(f_17564.value == null)
                            break Fail87648;
                          term = termFactory.makeTuple(d_17564, f_17564.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail87648;
                          if(true)
                            break Success47264;
                        }
                      }
                      term = term47273;
                    }
                  }
                  w_17564 = term;
                  v_17564 = trans.const17872;
                  term = w_17564;
                  lifted24746 lifted247460 = new lifted24746();
                  lifted247460.p_17564 = p_17564;
                  lifted247460.e_17564 = e_17564;
                  lifted247460.f_17564 = f_17564;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted247460, v_17564);
                  if(term == null)
                    break Fail87648;
                  if(true)
                    break Success47261;
                }
              }
              term = term47270;
            }
            if(true)
              break Success47259;
          }
        }
        term = term47268;
      }
      term = c_17564;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}