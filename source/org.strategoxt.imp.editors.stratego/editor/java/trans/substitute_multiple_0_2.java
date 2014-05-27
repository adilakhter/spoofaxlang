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

@SuppressWarnings("all") public class substitute_multiple_0_2 extends Strategy 
{ 
  public static substitute_multiple_0_2 instance = new substitute_multiple_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_4898, IStrategoTerm q_4898)
  { 
    context.push("substitute_multiple_0_2");
    Fail22793:
    { 
      IStrategoTerm term12165 = term;
      Success12161:
      { 
        Fail22794:
        { 
          IStrategoTerm r_4727 = null;
          IStrategoTerm s_4727 = null;
          IStrategoTerm t_4727 = null;
          IStrategoTerm u_4727 = null;
          IStrategoTerm v_4727 = null;
          v_4727 = term;
          term = p_4898;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22794;
          r_4727 = ((IStrategoList)term).head();
          t_4727 = ((IStrategoList)term).tail();
          term = q_4898;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22794;
          s_4727 = ((IStrategoList)term).head();
          u_4727 = ((IStrategoList)term).tail();
          term = substitute_single_0_2.instance.invoke(context, v_4727, r_4727, s_4727);
          if(term == null)
            break Fail22794;
          term = this.invoke(context, term, t_4727, u_4727);
          if(term == null)
            break Fail22794;
          if(true)
            break Success12161;
        }
        term = term12165;
        IStrategoTerm n_4727 = null;
        n_4727 = term;
        term = p_4898;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail22793;
        term = q_4898;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail22793;
        term = n_4727;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}