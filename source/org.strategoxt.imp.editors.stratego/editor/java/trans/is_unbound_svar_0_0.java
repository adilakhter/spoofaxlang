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
    Fail22765:
    { 
      IStrategoTerm s_4723 = null;
      IStrategoTerm t_4723 = null;
      s_4723 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail22765;
      IStrategoTerm arg8024 = term.getSubterm(0);
      if(arg8024.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8024).getConstructor())
        break Fail22765;
      t_4723 = arg8024.getSubterm(0);
      term = t_4723;
      IStrategoTerm term12151 = term;
      Success12150:
      { 
        Fail22766:
        { 
          term = has_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22766;
          { 
            if(true)
              break Fail22765;
            if(true)
              break Success12150;
          }
        }
        term = term12151;
      }
      term = s_4723;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}