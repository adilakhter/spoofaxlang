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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_4344, IStrategoTerm y_4344)
  { 
    context.push("substitute_multiple_0_2");
    Fail21317:
    { 
      IStrategoTerm term11456 = term;
      Success11452:
      { 
        Fail21318:
        { 
          IStrategoTerm z_4173 = null;
          IStrategoTerm a_4174 = null;
          IStrategoTerm b_4174 = null;
          IStrategoTerm c_4174 = null;
          IStrategoTerm d_4174 = null;
          d_4174 = term;
          term = x_4344;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail21318;
          z_4173 = ((IStrategoList)term).head();
          b_4174 = ((IStrategoList)term).tail();
          term = y_4344;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail21318;
          a_4174 = ((IStrategoList)term).head();
          c_4174 = ((IStrategoList)term).tail();
          term = substitute_single_0_2.instance.invoke(context, d_4174, z_4173, a_4174);
          if(term == null)
            break Fail21318;
          term = this.invoke(context, term, b_4174, c_4174);
          if(term == null)
            break Fail21318;
          if(true)
            break Success11452;
        }
        term = term11456;
        IStrategoTerm v_4173 = null;
        v_4173 = term;
        term = x_4344;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail21317;
        term = y_4344;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail21317;
        term = v_4173;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}