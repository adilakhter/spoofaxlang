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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_17566, Strategy b_17566, Strategy c_17566, Strategy d_17566)
  { 
    context.push("open_wildcard_import_4_0");
    Fail87655:
    { 
      IStrategoTerm d_17565 = null;
      TermReference e_17565 = new TermReference();
      TermReference f_17565 = new TermReference();
      d_17565 = term;
      IStrategoTerm term47274 = term;
      Success47265:
      { 
        Fail87656:
        { 
          IStrategoTerm g_17565 = null;
          g_17565 = term;
          IStrategoTerm term47275 = term;
          Success47266:
          { 
            Fail87657:
            { 
              term = d_17565;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail87657;
              { 
                if(true)
                  break Fail87656;
                if(true)
                  break Success47266;
              }
            }
            term = term47275;
          }
          term = g_17565;
          { 
            term = a_17566.invoke(context, d_17565);
            if(term == null)
              break Fail87655;
            if(e_17565.value == null)
              e_17565.value = term;
            else
              if(e_17565.value != term && !e_17565.value.match(term))
                break Fail87655;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87655;
            lifted24747 lifted247470 = new lifted24747();
            lifted247470.d_17566 = d_17566;
            lifted247470.b_17566 = b_17566;
            lifted247470.c_17566 = c_17566;
            lifted247470.e_17565 = e_17565;
            lifted247470.f_17565 = f_17565;
            term = list_loop_1_0.instance.invoke(context, term, lifted247470);
            if(term == null)
              break Fail87655;
            IStrategoTerm term47286 = term;
            Success47267:
            { 
              Fail87658:
              { 
                if(f_17565.value == null)
                  break Fail87658;
                term = f_17565.value;
                { 
                  if(true)
                    break Fail87655;
                  if(true)
                    break Success47267;
                }
              }
              term = term47286;
            }
            if(true)
              break Success47265;
          }
        }
        term = term47274;
      }
      term = d_17565;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}