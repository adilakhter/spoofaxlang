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
    Fail22139:
    { 
      IStrategoTerm term12059 = term;
      Success11929:
      { 
        Fail22140:
        { 
          IStrategoTerm i_4315 = null;
          i_4315 = term;
          term = dr_continue_0_1.instance.invoke(context, i_4315, trans.const4358);
          if(term == null)
            break Fail22140;
          if(true)
            break Success11929;
        }
        term = term12059;
        IStrategoTerm g_4315 = null;
        g_4315 = term;
        term = dr_continue_0_1.instance.invoke(context, g_4315, trans.const4358);
        if(term == null)
          break Fail22139;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}