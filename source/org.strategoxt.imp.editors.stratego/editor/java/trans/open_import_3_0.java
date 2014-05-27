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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4752, Strategy e_4752, Strategy f_4752)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail22908:
    { 
      IStrategoTerm s_4751 = null;
      IStrategoTerm t_4751 = null;
      TermReference u_4751 = new TermReference();
      TermReference v_4751 = new TermReference();
      s_4751 = term;
      IStrategoTerm term12267 = term;
      Success12212:
      { 
        Fail22909:
        { 
          IStrategoTerm w_4751 = null;
          w_4751 = term;
          IStrategoTerm term12268 = term;
          Success12213:
          { 
            Fail22910:
            { 
              term = s_4751;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail22910;
              { 
                if(true)
                  break Fail22909;
                if(true)
                  break Success12213;
              }
            }
            term = term12268;
          }
          term = w_4751;
          { 
            term = d_4752.invoke(context, s_4751);
            if(term == null)
              break Fail22908;
            if(u_4751.value == null)
              u_4751.value = term;
            else
              if(u_4751.value != term && !u_4751.value.match(term))
                break Fail22908;
            if(u_4751.value == null)
              break Fail22908;
            term = import_cache_path_0_0.instance.invoke(context, u_4751.value);
            if(term == null)
              break Fail22908;
            t_4751 = term;
            IStrategoTerm term12269 = term;
            Success12214:
            { 
              Fail22911:
              { 
                IStrategoTerm x_4751 = null;
                x_4751 = term;
                IStrategoTerm term12270 = term;
                Success12215:
                { 
                  Fail22912:
                  { 
                    if(u_4751.value == null)
                      break Fail22912;
                    term = $Is$Imported_0_0.instance.invoke(context, u_4751.value);
                    if(term == null)
                      break Fail22912;
                    { 
                      if(true)
                        break Fail22911;
                      if(true)
                        break Success12215;
                    }
                  }
                  term = term12270;
                }
                term = x_4751;
                { 
                  IStrategoTerm y_4751 = null;
                  IStrategoTerm h_4752 = null;
                  IStrategoTerm j_4752 = null;
                  IStrategoTerm k_4752 = null;
                  IStrategoTerm l_4752 = null;
                  IStrategoTerm m_4752 = null;
                  y_4751 = term;
                  j_4752 = term;
                  h_4752 = trans.const4537;
                  term = j_4752;
                  k_4752 = j_4752;
                  if(u_4751.value == null)
                    break Fail22908;
                  term = termFactory.makeTuple(trans.const4538, u_4751.value);
                  term = dr_set_rule_0_3.instance.invoke(context, k_4752, h_4752, u_4751.value, term);
                  if(term == null)
                    break Fail22908;
                  term = y_4751;
                  IStrategoTerm term12271 = term;
                  Success12216:
                  { 
                    Fail22913:
                    { 
                      if(u_4751.value == null)
                        break Fail22913;
                      term = termFactory.makeTuple(t_4751, u_4751.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail22913;
                      term = $Read$From$File_0_0.instance.invoke(context, t_4751);
                      if(term == null)
                        break Fail22913;
                      if(v_4751.value == null)
                        v_4751.value = term;
                      else
                        if(v_4751.value != term && !v_4751.value.match(term))
                          break Fail22913;
                      if(true)
                        break Success12216;
                    }
                    term = term12271;
                    if(u_4751.value == null)
                      break Fail22908;
                    term = e_4752.invoke(context, u_4751.value);
                    if(term == null)
                      break Fail22908;
                    if(v_4751.value == null)
                      v_4751.value = term;
                    else
                      if(v_4751.value != term && !v_4751.value.match(term))
                        break Fail22908;
                    IStrategoTerm term12272 = term;
                    Success12217:
                    { 
                      Fail22914:
                      { 
                        IStrategoTerm z_4751 = null;
                        z_4751 = term;
                        if(u_4751.value == null)
                          break Fail22914;
                        term = file_exists_0_0.instance.invoke(context, u_4751.value);
                        if(term == null)
                          break Fail22914;
                        term = z_4751;
                        { 
                          if(v_4751.value == null)
                            break Fail22908;
                          term = termFactory.makeTuple(t_4751, v_4751.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail22908;
                          if(true)
                            break Success12217;
                        }
                      }
                      term = term12272;
                    }
                  }
                  m_4752 = term;
                  l_4752 = trans.const4473;
                  term = m_4752;
                  lifted6808 lifted68080 = new lifted6808();
                  lifted68080.f_4752 = f_4752;
                  lifted68080.u_4751 = u_4751;
                  lifted68080.v_4751 = v_4751;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted68080, l_4752);
                  if(term == null)
                    break Fail22908;
                  if(true)
                    break Success12214;
                }
              }
              term = term12269;
            }
            if(true)
              break Success12212;
          }
        }
        term = term12267;
      }
      term = s_4751;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}