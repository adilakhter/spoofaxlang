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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4898)
  { 
    context.push("position_of_term_1_0");
    Fail22956:
    { 
      IStrategoTerm term12305 = term;
      Success12236:
      { 
        Fail22957:
        { 
          term = v_4898.invoke(context, term);
          if(term == null)
            break Fail22957;
          term = trans.constNil4;
          if(true)
            break Success12236;
        }
        term = term12305;
        IStrategoTerm l_4759 = null;
        IStrategoTerm args33 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        l_4759 = args33;
        term = position_of_term_1_1.instance.invoke(context, l_4759, v_4898, trans.const4437);
        if(term == null)
          break Fail22956;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}