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

@SuppressWarnings("all") public class ppterm_0_0 extends Strategy 
{ 
  public static ppterm_0_0 instance = new ppterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ppterm_0_0");
    Fail21733:
    { 
      IStrategoTerm k_4253 = null;
      term = pp_aterm_box_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21733;
      k_4253 = term;
      term = box2text_string_0_1.instance.invoke(context, k_4253, trans.const4326);
      if(term == null)
        break Fail21733;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}