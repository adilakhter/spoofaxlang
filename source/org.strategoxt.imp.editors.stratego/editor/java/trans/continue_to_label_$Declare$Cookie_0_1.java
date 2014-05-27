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

@SuppressWarnings("all") public class continue_to_label_$Declare$Cookie_0_1 extends Strategy 
{ 
  public static continue_to_label_$Declare$Cookie_0_1 instance = new continue_to_label_$Declare$Cookie_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4898)
  { 
    context.push("continue_to_label_DeclareCookie_0_1");
    Fail23613:
    { 
      IStrategoTerm term12767 = term;
      Success12637:
      { 
        Fail23614:
        { 
          IStrategoTerm w_4868 = null;
          w_4868 = term;
          term = dr_continue_0_2.instance.invoke(context, w_4868, trans.const4568, z_4898);
          if(term == null)
            break Fail23614;
          if(true)
            break Success12637;
        }
        term = term12767;
        IStrategoTerm t_4868 = null;
        t_4868 = term;
        term = dr_continue_0_2.instance.invoke(context, t_4868, trans.const4568, z_4898);
        if(term == null)
          break Fail23613;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}