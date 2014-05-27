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
    Fail22147:
    { 
      IStrategoTerm term12063 = term;
      Success11933:
      { 
        Fail22148:
        { 
          IStrategoTerm a_4316 = null;
          a_4316 = term;
          term = dr_all_keys_0_1.instance.invoke(context, a_4316, trans.const4358);
          if(term == null)
            break Fail22148;
          if(true)
            break Success11933;
        }
        term = term12063;
        IStrategoTerm y_4315 = null;
        y_4315 = term;
        term = dr_all_keys_0_1.instance.invoke(context, y_4315, trans.const4358);
        if(term == null)
          break Fail22147;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}