package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class open_import_3_0 extends Strategy 
{ 
  public static open_import_3_0 instance = new open_import_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_92016, Strategy x_92016, Strategy y_92016)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail75652:
    { 
      IStrategoTerm l_92016 = null;
      IStrategoTerm m_92016 = null;
      TermReference n_92016 = new TermReference();
      TermReference o_92016 = new TermReference();
      l_92016 = term;
      IStrategoTerm term41426 = term;
      Success41426:
      { 
        Fail75653:
        { 
          IStrategoTerm p_92016 = null;
          p_92016 = term;
          IStrategoTerm term41427 = term;
          Success41427:
          { 
            Fail75654:
            { 
              term = l_92016;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail75654;
              { 
                if(true)
                  break Fail75653;
                if(true)
                  break Success41427;
              }
            }
            term = term41427;
          }
          term = p_92016;
          { 
            term = w_92016.invoke(context, l_92016);
            if(term == null)
              break Fail75652;
            if(n_92016.value == null)
              n_92016.value = term;
            else
              if(n_92016.value != term && !n_92016.value.match(term))
                break Fail75652;
            if(n_92016.value == null)
              break Fail75652;
            term = import_cache_path_0_0.instance.invoke(context, n_92016.value);
            if(term == null)
              break Fail75652;
            m_92016 = term;
            IStrategoTerm term41428 = term;
            Success41428:
            { 
              Fail75655:
              { 
                IStrategoTerm q_92016 = null;
                q_92016 = term;
                IStrategoTerm term41429 = term;
                Success41429:
                { 
                  Fail75656:
                  { 
                    if(n_92016.value == null)
                      break Fail75656;
                    term = $Is$Imported_0_0.instance.invoke(context, n_92016.value);
                    if(term == null)
                      break Fail75656;
                    { 
                      if(true)
                        break Fail75655;
                      if(true)
                        break Success41429;
                    }
                  }
                  term = term41429;
                }
                term = q_92016;
                { 
                  IStrategoTerm r_92016 = null;
                  IStrategoTerm a_92017 = null;
                  IStrategoTerm c_92017 = null;
                  IStrategoTerm d_92017 = null;
                  IStrategoTerm e_92017 = null;
                  IStrategoTerm f_92017 = null;
                  r_92016 = term;
                  c_92017 = term;
                  a_92017 = trans.const15450;
                  term = c_92017;
                  d_92017 = c_92017;
                  if(n_92016.value == null)
                    break Fail75652;
                  term = termFactory.makeTuple(trans.const15451, n_92016.value);
                  term = dr_set_rule_0_3.instance.invoke(context, d_92017, a_92017, n_92016.value, term);
                  if(term == null)
                    break Fail75652;
                  term = r_92016;
                  IStrategoTerm term41430 = term;
                  Success41430:
                  { 
                    Fail75657:
                    { 
                      if(n_92016.value == null)
                        break Fail75657;
                      term = termFactory.makeTuple(m_92016, n_92016.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75657;
                      term = $Read$From$File_0_0.instance.invoke(context, m_92016);
                      if(term == null)
                        break Fail75657;
                      if(o_92016.value == null)
                        o_92016.value = term;
                      else
                        if(o_92016.value != term && !o_92016.value.match(term))
                          break Fail75657;
                      if(true)
                        break Success41430;
                    }
                    term = term41430;
                    if(n_92016.value == null)
                      break Fail75652;
                    term = x_92016.invoke(context, n_92016.value);
                    if(term == null)
                      break Fail75652;
                    if(o_92016.value == null)
                      o_92016.value = term;
                    else
                      if(o_92016.value != term && !o_92016.value.match(term))
                        break Fail75652;
                    IStrategoTerm term41431 = term;
                    Success41431:
                    { 
                      Fail75658:
                      { 
                        IStrategoTerm s_92016 = null;
                        s_92016 = term;
                        if(n_92016.value == null)
                          break Fail75658;
                        term = file_exists_0_0.instance.invoke(context, n_92016.value);
                        if(term == null)
                          break Fail75658;
                        term = s_92016;
                        { 
                          if(o_92016.value == null)
                            break Fail75652;
                          term = termFactory.makeTuple(m_92016, o_92016.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75652;
                          if(true)
                            break Success41431;
                        }
                      }
                      term = term41431;
                    }
                  }
                  f_92017 = term;
                  e_92017 = trans.const15448;
                  term = f_92017;
                  lifted21500 lifted215000 = new lifted21500();
                  lifted215000.y_92016 = y_92016;
                  lifted215000.n_92016 = n_92016;
                  lifted215000.o_92016 = o_92016;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted215000, e_92017);
                  if(term == null)
                    break Fail75652;
                  if(true)
                    break Success41428;
                }
              }
              term = term41428;
            }
            if(true)
              break Success41426;
          }
        }
        term = term41426;
      }
      term = l_92016;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}