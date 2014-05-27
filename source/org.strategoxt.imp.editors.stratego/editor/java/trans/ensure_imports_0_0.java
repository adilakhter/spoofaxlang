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

@SuppressWarnings("all") public class ensure_imports_0_0 extends Strategy 
{ 
  public static ensure_imports_0_0 instance = new ensure_imports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ensure_imports_0_0");
    Fail22809:
    { 
      IStrategoTerm w_4732 = null;
      w_4732 = term;
      term = collect_all_1_0.instance.invoke(context, term, lifted6757.instance);
      if(term == null)
        break Fail22809;
      term = map_1_0.instance.invoke(context, term, declare_globals_0_0.instance);
      if(term == null)
        break Fail22809;
      term = w_4732;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}