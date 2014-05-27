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

@SuppressWarnings("all") public class reject_ast_from_cache_2_0 extends Strategy 
{ 
  public static reject_ast_from_cache_2_0 instance = new reject_ast_from_cache_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4183, Strategy y_4183)
  { 
    context.push("reject_ast_from_cache_2_0");
    Fail21352:
    { 
      IStrategoTerm v_4183 = null;
      v_4183 = term;
      term = y_4183.invoke(context, v_4183);
      if(term == null)
        break Fail21352;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21352;
      IStrategoTerm term11489 = term;
      Success11456:
      { 
        Fail21353:
        { 
          term = x_4183.invoke(context, term);
          if(term == null)
            break Fail21353;
          { 
            if(true)
              break Fail21352;
            if(true)
              break Success11456;
          }
        }
        term = term11489;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}