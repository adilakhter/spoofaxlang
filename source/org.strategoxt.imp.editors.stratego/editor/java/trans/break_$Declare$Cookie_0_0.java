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
    Fail23621:
    { 
      IStrategoTerm term12771 = term;
      Success12641:
      { 
        Fail23622:
        { 
          IStrategoTerm o_4869 = null;
          o_4869 = term;
          term = dr_break_0_1.instance.invoke(context, o_4869, trans.const4568);
          if(term == null)
            break Fail23622;
          if(true)
            break Success12641;
        }
        term = term12771;
        IStrategoTerm m_4869 = null;
        m_4869 = term;
        term = dr_break_0_1.instance.invoke(context, m_4869, trans.const4568);
        if(term == null)
          break Fail23621;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}