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

@SuppressWarnings("all") public class throw_$Declare$Cookie_1_1 extends Strategy 
{ 
  public static throw_$Declare$Cookie_1_1 instance = new throw_$Declare$Cookie_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4345, IStrategoTerm g_4345)
  { 
    context.push("throw_DeclareCookie_1_1");
    Fail22135:
    { 
      IStrategoTerm term12057 = term;
      Success11927:
      { 
        Fail22136:
        { 
          IStrategoTerm y_4314 = null;
          y_4314 = term;
          term = dr_throw_1_2.instance.invoke(context, y_4314, f_4345, g_4345, trans.const4358);
          if(term == null)
            break Fail22136;
          if(true)
            break Success11927;
        }
        term = term12057;
        IStrategoTerm u_4314 = null;
        u_4314 = term;
        term = dr_throw_1_2.instance.invoke(context, u_4314, f_4345, g_4345, trans.const4358);
        if(term == null)
          break Fail22135;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}