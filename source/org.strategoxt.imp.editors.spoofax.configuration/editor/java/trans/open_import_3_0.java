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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4620, Strategy r_4620, Strategy s_4620)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail22840:
    { 
      IStrategoTerm f_4620 = null;
      IStrategoTerm g_4620 = null;
      TermReference h_4620 = new TermReference();
      TermReference i_4620 = new TermReference();
      f_4620 = term;
      IStrategoTerm term12181 = term;
      Success12172:
      { 
        Fail22841:
        { 
          IStrategoTerm j_4620 = null;
          j_4620 = term;
          IStrategoTerm term12182 = term;
          Success12173:
          { 
            Fail22842:
            { 
              term = f_4620;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail22842;
              { 
                if(true)
                  break Fail22841;
                if(true)
                  break Success12173;
              }
            }
            term = term12182;
          }
          term = j_4620;
          { 
            term = q_4620.invoke(context, f_4620);
            if(term == null)
              break Fail22840;
            if(h_4620.value == null)
              h_4620.value = term;
            else
              if(h_4620.value != term && !h_4620.value.match(term))
                break Fail22840;
            if(h_4620.value == null)
              break Fail22840;
            term = import_cache_path_0_0.instance.invoke(context, h_4620.value);
            if(term == null)
              break Fail22840;
            g_4620 = term;
            IStrategoTerm term12183 = term;
            Success12174:
            { 
              Fail22843:
              { 
                IStrategoTerm k_4620 = null;
                k_4620 = term;
                IStrategoTerm term12184 = term;
                Success12175:
                { 
                  Fail22844:
                  { 
                    if(h_4620.value == null)
                      break Fail22844;
                    term = $Is$Imported_0_0.instance.invoke(context, h_4620.value);
                    if(term == null)
                      break Fail22844;
                    { 
                      if(true)
                        break Fail22843;
                      if(true)
                        break Success12175;
                    }
                  }
                  term = term12184;
                }
                term = k_4620;
                { 
                  IStrategoTerm l_4620 = null;
                  IStrategoTerm u_4620 = null;
                  IStrategoTerm w_4620 = null;
                  IStrategoTerm x_4620 = null;
                  IStrategoTerm y_4620 = null;
                  IStrategoTerm z_4620 = null;
                  l_4620 = term;
                  w_4620 = term;
                  u_4620 = trans.const4487;
                  term = w_4620;
                  x_4620 = w_4620;
                  if(h_4620.value == null)
                    break Fail22840;
                  term = termFactory.makeTuple(trans.const4488, h_4620.value);
                  term = dr_set_rule_0_3.instance.invoke(context, x_4620, u_4620, h_4620.value, term);
                  if(term == null)
                    break Fail22840;
                  term = l_4620;
                  IStrategoTerm term12185 = term;
                  Success12176:
                  { 
                    Fail22845:
                    { 
                      if(h_4620.value == null)
                        break Fail22845;
                      term = termFactory.makeTuple(g_4620, h_4620.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail22845;
                      term = $Read$From$File_0_0.instance.invoke(context, g_4620);
                      if(term == null)
                        break Fail22845;
                      if(i_4620.value == null)
                        i_4620.value = term;
                      else
                        if(i_4620.value != term && !i_4620.value.match(term))
                          break Fail22845;
                      if(true)
                        break Success12176;
                    }
                    term = term12185;
                    if(h_4620.value == null)
                      break Fail22840;
                    term = r_4620.invoke(context, h_4620.value);
                    if(term == null)
                      break Fail22840;
                    if(i_4620.value == null)
                      i_4620.value = term;
                    else
                      if(i_4620.value != term && !i_4620.value.match(term))
                        break Fail22840;
                    IStrategoTerm term12186 = term;
                    Success12177:
                    { 
                      Fail22846:
                      { 
                        IStrategoTerm m_4620 = null;
                        m_4620 = term;
                        if(h_4620.value == null)
                          break Fail22846;
                        term = file_exists_0_0.instance.invoke(context, h_4620.value);
                        if(term == null)
                          break Fail22846;
                        term = m_4620;
                        { 
                          if(i_4620.value == null)
                            break Fail22840;
                          term = termFactory.makeTuple(g_4620, i_4620.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail22840;
                          if(true)
                            break Success12177;
                        }
                      }
                      term = term12186;
                    }
                  }
                  z_4620 = term;
                  y_4620 = trans.const4485;
                  term = z_4620;
                  lifted6861 lifted68610 = new lifted6861();
                  lifted68610.s_4620 = s_4620;
                  lifted68610.h_4620 = h_4620;
                  lifted68610.i_4620 = i_4620;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted68610, y_4620);
                  if(term == null)
                    break Fail22840;
                  if(true)
                    break Success12174;
                }
              }
              term = term12183;
            }
            if(true)
              break Success12172;
          }
        }
        term = term12181;
      }
      term = f_4620;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}