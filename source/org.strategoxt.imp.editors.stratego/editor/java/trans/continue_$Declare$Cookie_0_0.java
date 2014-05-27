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

@SuppressWarnings("all") public class continue_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static continue_$Declare$Cookie_0_0 instance = new continue_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("continue_DeclareCookie_0_0");
    Fail23615:
    { 
      IStrategoTerm term12768 = term;
      Success12638:
      { 
        Fail23616:
        { 
          IStrategoTerm a_4869 = null;
          a_4869 = term;
          term = dr_continue_0_1.instance.invoke(context, a_4869, trans.const4568);
          if(term == null)
            break Fail23616;
          if(true)
            break Success12638;
        }
        term = term12768;
        IStrategoTerm y_4868 = null;
        y_4868 = term;
        term = dr_continue_0_1.instance.invoke(context, y_4868, trans.const4568);
        if(term == null)
          break Fail23615;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}