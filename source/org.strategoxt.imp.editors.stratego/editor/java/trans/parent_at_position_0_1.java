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

@SuppressWarnings("all") public class parent_at_position_0_1 extends Strategy 
{ 
  public static parent_at_position_0_1 instance = new parent_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_4898)
  { 
    context.push("parent_at_position_0_1");
    Fail22961:
    { 
      IStrategoTerm term12307 = term;
      Success12238:
      { 
        Fail22962:
        { 
          IStrategoTerm k_4760 = null;
          IStrategoTerm l_4760 = null;
          l_4760 = term;
          term = w_4898;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22962;
          k_4760 = ((IStrategoList)term).head();
          IStrategoTerm arg8162 = ((IStrategoList)term).tail();
          if(arg8162.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8162).isEmpty())
            break Fail22962;
          IStrategoTerm arg8164 = ((IStrategoList)arg8162).tail();
          if(arg8164.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8164).isEmpty())
            break Fail22962;
          term = subterm_at_0_1.instance.invoke(context, l_4760, k_4760);
          if(term == null)
            break Fail22962;
          if(true)
            break Success12238;
        }
        term = term12307;
        IStrategoTerm e_4760 = null;
        IStrategoTerm f_4760 = null;
        IStrategoTerm g_4760 = null;
        g_4760 = term;
        term = w_4898;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail22961;
        f_4760 = ((IStrategoList)term).head();
        IStrategoTerm arg8165 = ((IStrategoList)term).tail();
        e_4760 = arg8165;
        if(arg8165.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8165).isEmpty())
          break Fail22961;
        IStrategoTerm arg8167 = ((IStrategoList)arg8165).tail();
        if(arg8167.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8167).isEmpty())
          break Fail22961;
        term = subterm_at_0_1.instance.invoke(context, g_4760, f_4760);
        if(term == null)
          break Fail22961;
        term = this.invoke(context, term, e_4760);
        if(term == null)
          break Fail22961;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}