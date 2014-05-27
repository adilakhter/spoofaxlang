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

@SuppressWarnings("all") public class fetch_by_origin_0_1 extends Strategy 
{ 
  public static fetch_by_origin_0_1 instance = new fetch_by_origin_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4898)
  { 
    context.push("fetch_by_origin_0_1");
    Fail22714:
    { 
      IStrategoTerm term12121 = term;
      Success12121:
      { 
        Fail22715:
        { 
          term = fetch_by_origin_1_1.instance.invoke(context, term, _Id.instance, k_4898);
          if(term == null)
            break Fail22715;
          if(true)
            break Success12121;
        }
        term = term12121;
        IStrategoTerm h_4716 = null;
        h_4716 = term;
        term = fetch_by_origin_1_1.instance.invoke(context, h_4716, _Id.instance, k_4898);
        if(term == null)
          break Fail22714;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}