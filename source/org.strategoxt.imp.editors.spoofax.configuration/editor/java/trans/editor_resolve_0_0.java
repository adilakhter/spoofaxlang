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

@SuppressWarnings("all") public class editor_resolve_0_0 extends Strategy 
{ 
  public static editor_resolve_0_0 instance = new editor_resolve_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_resolve_0_0");
    Fail22909:
    { 
      IStrategoTerm a_4631 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22909;
      a_4631 = term.getSubterm(0);
      term = resolve_0_0.instance.invoke(context, a_4631);
      if(term == null)
        break Fail22909;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}