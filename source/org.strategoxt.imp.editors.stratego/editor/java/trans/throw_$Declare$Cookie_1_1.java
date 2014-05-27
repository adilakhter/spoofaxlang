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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4898, IStrategoTerm y_4898)
  { 
    context.push("throw_DeclareCookie_1_1");
    Fail23611:
    { 
      IStrategoTerm term12766 = term;
      Success12636:
      { 
        Fail23612:
        { 
          IStrategoTerm q_4868 = null;
          q_4868 = term;
          term = dr_throw_1_2.instance.invoke(context, q_4868, x_4898, y_4898, trans.const4568);
          if(term == null)
            break Fail23612;
          if(true)
            break Success12636;
        }
        term = term12766;
        IStrategoTerm m_4868 = null;
        m_4868 = term;
        term = dr_throw_1_2.instance.invoke(context, m_4868, x_4898, y_4898, trans.const4568);
        if(term == null)
          break Fail23611;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}