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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4344)
  { 
    context.push("fetch_by_origin_0_1");
    Fail21238:
    { 
      IStrategoTerm term11412 = term;
      Success11412:
      { 
        Fail21239:
        { 
          term = fetch_by_origin_1_1.instance.invoke(context, term, _Id.instance, s_4344);
          if(term == null)
            break Fail21239;
          if(true)
            break Success11412;
        }
        term = term11412;
        IStrategoTerm p_4162 = null;
        p_4162 = term;
        term = fetch_by_origin_1_1.instance.invoke(context, p_4162, _Id.instance, s_4344);
        if(term == null)
          break Fail21238;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}