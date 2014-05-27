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

@SuppressWarnings("all") public class break_bp_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static break_bp_$Declare$Cookie_0_0 instance = new break_bp_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_bp_DeclareCookie_0_0");
    Fail23617:
    { 
      IStrategoTerm term12769 = term;
      Success12639:
      { 
        Fail23618:
        { 
          IStrategoTerm e_4869 = null;
          e_4869 = term;
          term = dr_break_bp_0_1.instance.invoke(context, e_4869, trans.const4568);
          if(term == null)
            break Fail23618;
          if(true)
            break Success12639;
        }
        term = term12769;
        IStrategoTerm c_4869 = null;
        c_4869 = term;
        term = dr_break_bp_0_1.instance.invoke(context, c_4869, trans.const4568);
        if(term == null)
          break Fail23617;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}