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

@SuppressWarnings("all") public class all_keys_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static all_keys_$Declare$Cookie_0_0 instance = new all_keys_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("all_keys_DeclareCookie_0_0");
    Fail23623:
    { 
      IStrategoTerm term12772 = term;
      Success12642:
      { 
        Fail23624:
        { 
          IStrategoTerm s_4869 = null;
          s_4869 = term;
          term = dr_all_keys_0_1.instance.invoke(context, s_4869, trans.const4568);
          if(term == null)
            break Fail23624;
          if(true)
            break Success12642;
        }
        term = term12772;
        IStrategoTerm q_4869 = null;
        q_4869 = term;
        term = dr_all_keys_0_1.instance.invoke(context, q_4869, trans.const4568);
        if(term == null)
          break Fail23623;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}