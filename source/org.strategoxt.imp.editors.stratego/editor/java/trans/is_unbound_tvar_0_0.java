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

@SuppressWarnings("all") public class is_unbound_tvar_0_0 extends Strategy 
{ 
  public static is_unbound_tvar_0_0 instance = new is_unbound_tvar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_unbound_tvar_0_0");
    Fail22767:
    { 
      IStrategoTerm u_4723 = null;
      IStrategoTerm v_4723 = null;
      u_4723 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22767;
      v_4723 = term.getSubterm(0);
      term = v_4723;
      IStrategoTerm term12152 = term;
      Success12151:
      { 
        Fail22768:
        { 
          term = has_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22768;
          { 
            if(true)
              break Fail22767;
            if(true)
              break Success12151;
          }
        }
        term = term12152;
      }
      term = u_4723;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}