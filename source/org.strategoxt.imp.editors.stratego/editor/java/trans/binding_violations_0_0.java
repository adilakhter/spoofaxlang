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

@SuppressWarnings("all") public class binding_violations_0_0 extends Strategy 
{ 
  public static binding_violations_0_0 instance = new binding_violations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("binding_violations_0_0");
    Fail21359:
    { 
      IStrategoTerm t_4184 = null;
      IStrategoTerm u_4184 = null;
      IStrategoTerm v_4184 = null;
      IStrategoTerm w_4184 = null;
      IStrategoTerm x_4184 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail21359;
      IStrategoTerm arg7656 = ((IStrategoList)term).head();
      if(arg7656.getTermType() != IStrategoTerm.TUPLE || arg7656.getSubtermCount() != 2)
        break Fail21359;
      t_4184 = arg7656.getSubterm(0);
      u_4184 = arg7656.getSubterm(1);
      v_4184 = ((IStrategoList)term).tail();
      term = binding_violations_0_2.instance.invoke(context, v_4184, t_4184, u_4184);
      if(term == null)
        break Fail21359;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21359;
      x_4184 = term.getSubterm(0);
      w_4184 = term.getSubterm(1);
      term = w_4184;
      IStrategoTerm term11492 = term;
      Success11459:
      { 
        Fail21360:
        { 
          term = this.invoke(context, term);
          if(term == null)
            break Fail21360;
          if(true)
            break Success11459;
        }
        term = term11492;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail21359;
      }
      term = termFactory.makeTuple(x_4184, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21359;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}