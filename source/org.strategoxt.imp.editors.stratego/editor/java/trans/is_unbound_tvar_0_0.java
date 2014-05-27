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
    Fail21291:
    { 
      IStrategoTerm c_4170 = null;
      IStrategoTerm d_4170 = null;
      c_4170 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21291;
      d_4170 = term.getSubterm(0);
      term = d_4170;
      IStrategoTerm term11443 = term;
      Success11442:
      { 
        Fail21292:
        { 
          term = has_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21292;
          { 
            if(true)
              break Fail21291;
            if(true)
              break Success11442;
          }
        }
        term = term11443;
      }
      term = c_4170;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}