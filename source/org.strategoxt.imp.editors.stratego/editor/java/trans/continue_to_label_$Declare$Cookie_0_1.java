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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_4345)
  { 
    context.push("continue_to_label_DeclareCookie_0_1");
    Fail22137:
    { 
      IStrategoTerm term12058 = term;
      Success11928:
      { 
        Fail22138:
        { 
          IStrategoTerm e_4315 = null;
          e_4315 = term;
          term = dr_continue_0_2.instance.invoke(context, e_4315, trans.const4358, h_4345);
          if(term == null)
            break Fail22138;
          if(true)
            break Success11928;
        }
        term = term12058;
        IStrategoTerm b_4315 = null;
        b_4315 = term;
        term = dr_continue_0_2.instance.invoke(context, b_4315, trans.const4358, h_4345);
        if(term == null)
          break Fail22137;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}