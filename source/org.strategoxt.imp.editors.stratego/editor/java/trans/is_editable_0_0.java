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
    Fail22898:
    { 
      IStrategoTerm term12265 = term;
      Success12210:
      { 
        Fail22899:
        { 
          IStrategoTerm t_4750 = null;
          t_4750 = term;
          term = string_ends_with_0_1.instance.invoke(context, t_4750, trans.const4535);
          if(term == null)
            break Fail22899;
          { 
            if(true)
              break Fail22898;
            if(true)
              break Success12210;
          }
        }
        term = term12265;
      }
      IStrategoTerm term12266 = term;
      Success12211:
      { 
        Fail22900:
        { 
          IStrategoTerm v_4750 = null;
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22900;
          v_4750 = term;
          term = string_ends_with_0_1.instance.invoke(context, v_4750, trans.const4491);
          if(term == null)
            break Fail22900;
          { 
            if(true)
              break Fail22898;
            if(true)
              break Success12211;
          }
        }
        term = term12266;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}