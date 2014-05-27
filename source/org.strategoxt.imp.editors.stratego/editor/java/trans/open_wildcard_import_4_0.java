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

@SuppressWarnings("all") public class open_wildcard_import_4_0 extends Strategy 
{ 
  public static open_wildcard_import_4_0 instance = new open_wildcard_import_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4199, Strategy z_4199, Strategy a_4200, Strategy b_4200)
  { 
    context.push("open_wildcard_import_4_0");
    Fail21439:
    { 
      IStrategoTerm b_4199 = null;
      TermReference c_4199 = new TermReference();
      TermReference d_4199 = new TermReference();
      b_4199 = term;
      IStrategoTerm term11564 = term;
      Success11509:
      { 
        Fail21440:
        { 
          IStrategoTerm e_4199 = null;
          e_4199 = term;
          IStrategoTerm term11565 = term;
          Success11510:
          { 
            Fail21441:
            { 
              term = b_4199;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail21441;
              { 
                if(true)
                  break Fail21440;
                if(true)
                  break Success11510;
              }
            }
            term = term11565;
          }
          term = e_4199;
          { 
            term = y_4199.invoke(context, b_4199);
            if(term == null)
              break Fail21439;
            if(c_4199.value == null)
              c_4199.value = term;
            else
              if(c_4199.value != term && !c_4199.value.match(term))
                break Fail21439;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21439;
            lifted6538 lifted65380 = new lifted6538();
            lifted65380.b_4200 = b_4200;
            lifted65380.z_4199 = z_4199;
            lifted65380.a_4200 = a_4200;
            lifted65380.c_4199 = c_4199;
            lifted65380.d_4199 = d_4199;
            term = list_loop_1_0.instance.invoke(context, term, lifted65380);
            if(term == null)
              break Fail21439;
            IStrategoTerm term11576 = term;
            Success11511:
            { 
              Fail21442:
              { 
                if(d_4199.value == null)
                  break Fail21442;
                term = d_4199.value;
                { 
                  if(true)
                    break Fail21439;
                  if(true)
                    break Success11511;
                }
              }
              term = term11576;
            }
            if(true)
              break Success11509;
          }
        }
        term = term11564;
      }
      term = b_4199;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}