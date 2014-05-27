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

@SuppressWarnings("all") public class break_to_label_$Declare$Cookie_0_1 extends Strategy 
{ 
  public static break_to_label_$Declare$Cookie_0_1 instance = new break_to_label_$Declare$Cookie_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_4345)
  { 
    context.push("break_to_label_DeclareCookie_0_1");
    Fail22143:
    { 
      IStrategoTerm term12061 = term;
      Success11931:
      { 
        Fail22144:
        { 
          IStrategoTerm s_4315 = null;
          s_4315 = term;
          term = dr_break_0_2.instance.invoke(context, s_4315, trans.const4358, i_4345);
          if(term == null)
            break Fail22144;
          if(true)
            break Success11931;
        }
        term = term12061;
        IStrategoTerm p_4315 = null;
        p_4315 = term;
        term = dr_break_0_2.instance.invoke(context, p_4315, trans.const4358, i_4345);
        if(term == null)
          break Fail22143;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}