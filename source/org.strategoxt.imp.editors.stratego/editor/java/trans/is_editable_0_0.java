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

@SuppressWarnings("all") public class is_editable_0_0 extends Strategy 
{ 
  public static is_editable_0_0 instance = new is_editable_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_editable_0_0");
    Fail21422:
    { 
      IStrategoTerm term11556 = term;
      Success11501:
      { 
        Fail21423:
        { 
          IStrategoTerm b_4197 = null;
          b_4197 = term;
          term = string_ends_with_0_1.instance.invoke(context, b_4197, trans.const4325);
          if(term == null)
            break Fail21423;
          { 
            if(true)
              break Fail21422;
            if(true)
              break Success11501;
          }
        }
        term = term11556;
      }
      IStrategoTerm term11557 = term;
      Success11502:
      { 
        Fail21424:
        { 
          IStrategoTerm d_4197 = null;
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21424;
          d_4197 = term;
          term = string_ends_with_0_1.instance.invoke(context, d_4197, trans.const4281);
          if(term == null)
            break Fail21424;
          { 
            if(true)
              break Fail21422;
            if(true)
              break Success11502;
          }
        }
        term = term11557;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}