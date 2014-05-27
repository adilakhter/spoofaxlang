package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class position_of_term_1_0 extends Strategy 
{ 
  public static position_of_term_1_0 instance = new position_of_term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_92111)
  { 
    context.push("position_of_term_1_0");
    Fail75700:
    { 
      IStrategoTerm term41464 = term;
      Success41450:
      { 
        Fail75701:
        { 
          term = b_92111.invoke(context, term);
          if(term == null)
            break Fail75701;
          term = trans.constNil11;
          if(true)
            break Success41450;
        }
        term = term41464;
        IStrategoTerm e_92024 = null;
        IStrategoTerm args34 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        e_92024 = args34;
        term = position_of_term_1_1.instance.invoke(context, e_92024, b_92111, trans.const15465);
        if(term == null)
          break Fail75700;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}