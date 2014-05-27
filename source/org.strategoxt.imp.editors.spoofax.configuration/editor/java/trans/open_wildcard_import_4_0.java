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

@SuppressWarnings("all") public class open_wildcard_import_4_0 extends Strategy 
{ 
  public static open_wildcard_import_4_0 instance = new open_wildcard_import_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4622, Strategy e_4622, Strategy f_4622, Strategy g_4622)
  { 
    context.push("open_wildcard_import_4_0");
    Fail22847:
    { 
      IStrategoTerm g_4621 = null;
      TermReference h_4621 = new TermReference();
      TermReference i_4621 = new TermReference();
      g_4621 = term;
      IStrategoTerm term12187 = term;
      Success12178:
      { 
        Fail22848:
        { 
          IStrategoTerm j_4621 = null;
          j_4621 = term;
          IStrategoTerm term12188 = term;
          Success12179:
          { 
            Fail22849:
            { 
              term = g_4621;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail22849;
              { 
                if(true)
                  break Fail22848;
                if(true)
                  break Success12179;
              }
            }
            term = term12188;
          }
          term = j_4621;
          { 
            term = d_4622.invoke(context, g_4621);
            if(term == null)
              break Fail22847;
            if(h_4621.value == null)
              h_4621.value = term;
            else
              if(h_4621.value != term && !h_4621.value.match(term))
                break Fail22847;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22847;
            lifted6862 lifted68620 = new lifted6862();
            lifted68620.g_4622 = g_4622;
            lifted68620.e_4622 = e_4622;
            lifted68620.f_4622 = f_4622;
            lifted68620.h_4621 = h_4621;
            lifted68620.i_4621 = i_4621;
            term = list_loop_1_0.instance.invoke(context, term, lifted68620);
            if(term == null)
              break Fail22847;
            IStrategoTerm term12199 = term;
            Success12180:
            { 
              Fail22850:
              { 
                if(i_4621.value == null)
                  break Fail22850;
                term = i_4621.value;
                { 
                  if(true)
                    break Fail22847;
                  if(true)
                    break Success12180;
                }
              }
              term = term12199;
            }
            if(true)
              break Success12178;
          }
        }
        term = term12187;
      }
      term = g_4621;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}