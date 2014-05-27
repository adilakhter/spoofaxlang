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
    Fail22835:
    { 
      IStrategoTerm l_4738 = null;
      IStrategoTerm m_4738 = null;
      IStrategoTerm n_4738 = null;
      IStrategoTerm o_4738 = null;
      IStrategoTerm p_4738 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22835;
      IStrategoTerm arg8123 = ((IStrategoList)term).head();
      if(arg8123.getTermType() != IStrategoTerm.TUPLE || arg8123.getSubtermCount() != 2)
        break Fail22835;
      l_4738 = arg8123.getSubterm(0);
      m_4738 = arg8123.getSubterm(1);
      n_4738 = ((IStrategoList)term).tail();
      term = binding_violations_0_2.instance.invoke(context, n_4738, l_4738, m_4738);
      if(term == null)
        break Fail22835;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22835;
      p_4738 = term.getSubterm(0);
      o_4738 = term.getSubterm(1);
      term = o_4738;
      IStrategoTerm term12201 = term;
      Success12168:
      { 
        Fail22836:
        { 
          term = this.invoke(context, term);
          if(term == null)
            break Fail22836;
          if(true)
            break Success12168;
        }
        term = term12201;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail22835;
      }
      term = termFactory.makeTuple(p_4738, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22835;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}