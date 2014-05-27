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

@SuppressWarnings("all") public class is_unbound_svar_0_0 extends Strategy 
{ 
  public static is_unbound_svar_0_0 instance = new is_unbound_svar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_unbound_svar_0_0");
    Fail21289:
    { 
      IStrategoTerm a_4170 = null;
      IStrategoTerm b_4170 = null;
      a_4170 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21289;
      IStrategoTerm arg7557 = term.getSubterm(0);
      if(arg7557.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7557).getConstructor())
        break Fail21289;
      b_4170 = arg7557.getSubterm(0);
      term = b_4170;
      IStrategoTerm term11442 = term;
      Success11441:
      { 
        Fail21290:
        { 
          term = has_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21290;
          { 
            if(true)
              break Fail21289;
            if(true)
              break Success11441;
          }
        }
        term = term11442;
      }
      term = a_4170;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}