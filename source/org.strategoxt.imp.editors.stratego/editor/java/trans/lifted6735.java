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

@SuppressWarnings("all") final class lifted6735 extends Strategy 
{ 
  public static final lifted6735 instance = new lifted6735();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24207:
    { 
      IStrategoTerm term12163 = term;
      Success12828:
      { 
        Fail24208:
        { 
          IStrategoTerm v_4726 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail24208;
          v_4726 = term.getSubterm(0);
          term = v_4726;
          if(true)
            break Success12828;
        }
        term = collect_vars_scope_0_0.instance.invoke(context, term12163);
        if(term == null)
          break Fail24207;
      }
      if(true)
        return term;
    }
    return null;
  }
}