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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_4899)
  { 
    context.push("break_to_label_DeclareCookie_0_1");
    Fail23619:
    { 
      IStrategoTerm term12770 = term;
      Success12640:
      { 
        Fail23620:
        { 
          IStrategoTerm k_4869 = null;
          k_4869 = term;
          term = dr_break_0_2.instance.invoke(context, k_4869, trans.const4568, a_4899);
          if(term == null)
            break Fail23620;
          if(true)
            break Success12640;
        }
        term = term12770;
        IStrategoTerm h_4869 = null;
        h_4869 = term;
        term = dr_break_0_2.instance.invoke(context, h_4869, trans.const4568, a_4899);
        if(term == null)
          break Fail23619;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}