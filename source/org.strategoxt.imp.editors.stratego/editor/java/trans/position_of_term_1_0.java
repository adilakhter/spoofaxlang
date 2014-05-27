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

@SuppressWarnings("all") public class position_of_term_1_0 extends Strategy 
{ 
  public static position_of_term_1_0 instance = new position_of_term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4345)
  { 
    context.push("position_of_term_1_0");
    Fail21480:
    { 
      IStrategoTerm term11596 = term;
      Success11527:
      { 
        Fail21481:
        { 
          term = d_4345.invoke(context, term);
          if(term == null)
            break Fail21481;
          term = trans.constNil3;
          if(true)
            break Success11527;
        }
        term = term11596;
        IStrategoTerm t_4205 = null;
        IStrategoTerm args20 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        t_4205 = args20;
        term = position_of_term_1_1.instance.invoke(context, t_4205, d_4345, trans.const4227);
        if(term == null)
          break Fail21480;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}