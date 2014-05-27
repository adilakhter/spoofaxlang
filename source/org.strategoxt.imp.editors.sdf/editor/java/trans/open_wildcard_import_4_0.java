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

@SuppressWarnings("all") public class open_wildcard_import_4_0 extends Strategy 
{ 
  public static open_wildcard_import_4_0 instance = new open_wildcard_import_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_92018, Strategy k_92018, Strategy l_92018, Strategy m_92018)
  { 
    context.push("open_wildcard_import_4_0");
    Fail75659:
    { 
      IStrategoTerm m_92017 = null;
      TermReference n_92017 = new TermReference();
      TermReference o_92017 = new TermReference();
      m_92017 = term;
      IStrategoTerm term41432 = term;
      Success41432:
      { 
        Fail75660:
        { 
          IStrategoTerm p_92017 = null;
          p_92017 = term;
          IStrategoTerm term41433 = term;
          Success41433:
          { 
            Fail75661:
            { 
              term = m_92017;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail75661;
              { 
                if(true)
                  break Fail75660;
                if(true)
                  break Success41433;
              }
            }
            term = term41433;
          }
          term = p_92017;
          { 
            term = j_92018.invoke(context, m_92017);
            if(term == null)
              break Fail75659;
            if(n_92017.value == null)
              n_92017.value = term;
            else
              if(n_92017.value != term && !n_92017.value.match(term))
                break Fail75659;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75659;
            lifted21501 lifted215010 = new lifted21501();
            lifted215010.m_92018 = m_92018;
            lifted215010.k_92018 = k_92018;
            lifted215010.l_92018 = l_92018;
            lifted215010.n_92017 = n_92017;
            lifted215010.o_92017 = o_92017;
            term = list_loop_1_0.instance.invoke(context, term, lifted215010);
            if(term == null)
              break Fail75659;
            IStrategoTerm term41444 = term;
            Success41434:
            { 
              Fail75662:
              { 
                if(o_92017.value == null)
                  break Fail75662;
                term = o_92017.value;
                { 
                  if(true)
                    break Fail75659;
                  if(true)
                    break Success41434;
                }
              }
              term = term41444;
            }
            if(true)
              break Success41432;
          }
        }
        term = term41432;
      }
      term = m_92017;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}