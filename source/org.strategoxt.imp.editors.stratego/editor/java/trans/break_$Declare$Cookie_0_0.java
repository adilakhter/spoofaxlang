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

@SuppressWarnings("all") public class break_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static break_$Declare$Cookie_0_0 instance = new break_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_DeclareCookie_0_0");
    Fail22145:
    { 
      IStrategoTerm term12062 = term;
      Success11932:
      { 
        Fail22146:
        { 
          IStrategoTerm w_4315 = null;
          w_4315 = term;
          term = dr_break_0_1.instance.invoke(context, w_4315, trans.const4358);
          if(term == null)
            break Fail22146;
          if(true)
            break Success11932;
        }
        term = term12062;
        IStrategoTerm u_4315 = null;
        u_4315 = term;
        term = dr_break_0_1.instance.invoke(context, u_4315, trans.const4358);
        if(term == null)
          break Fail22145;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}