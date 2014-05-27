package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parent_at_position_0_1 extends Strategy 
{ 
  public static parent_at_position_0_1 instance = new parent_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4646)
  { 
    context.push("parent_at_position_0_1");
    Fail22893:
    { 
      IStrategoTerm term12221 = term;
      Success12198:
      { 
        Fail22894:
        { 
          IStrategoTerm x_4628 = null;
          IStrategoTerm y_4628 = null;
          y_4628 = term;
          term = k_4646;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22894;
          x_4628 = ((IStrategoList)term).head();
          IStrategoTerm arg8031 = ((IStrategoList)term).tail();
          if(arg8031.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8031).isEmpty())
            break Fail22894;
          IStrategoTerm arg8033 = ((IStrategoList)arg8031).tail();
          if(arg8033.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8033).isEmpty())
            break Fail22894;
          term = subterm_at_0_1.instance.invoke(context, y_4628, x_4628);
          if(term == null)
            break Fail22894;
          if(true)
            break Success12198;
        }
        term = term12221;
        IStrategoTerm r_4628 = null;
        IStrategoTerm s_4628 = null;
        IStrategoTerm t_4628 = null;
        t_4628 = term;
        term = k_4646;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail22893;
        s_4628 = ((IStrategoList)term).head();
        IStrategoTerm arg8034 = ((IStrategoList)term).tail();
        r_4628 = arg8034;
        if(arg8034.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8034).isEmpty())
          break Fail22893;
        IStrategoTerm arg8036 = ((IStrategoList)arg8034).tail();
        if(arg8036.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8036).isEmpty())
          break Fail22893;
        term = subterm_at_0_1.instance.invoke(context, t_4628, s_4628);
        if(term == null)
          break Fail22893;
        term = this.invoke(context, term, r_4628);
        if(term == null)
          break Fail22893;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}