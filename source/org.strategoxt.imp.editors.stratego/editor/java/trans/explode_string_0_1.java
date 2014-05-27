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

@SuppressWarnings("all") public class explode_string_0_1 extends Strategy 
{ 
  public static explode_string_0_1 instance = new explode_string_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4765)
  { 
    context.push("explode_string_0_1");
    Fail23009:
    { 
      term = explode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23009;
      term = explode_string_p__0_1.instance.invoke(context, term, j_4765);
      if(term == null)
        break Fail23009;
      term = map_1_0.instance.invoke(context, term, implode_string_0_0.instance);
      if(term == null)
        break Fail23009;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}