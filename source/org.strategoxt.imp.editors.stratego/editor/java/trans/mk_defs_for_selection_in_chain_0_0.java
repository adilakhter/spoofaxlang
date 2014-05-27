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

@SuppressWarnings("all") public class mk_defs_for_selection_in_chain_0_0 extends Strategy 
{ 
  public static mk_defs_for_selection_in_chain_0_0 instance = new mk_defs_for_selection_in_chain_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("mk_defs_for_selection_in_chain_0_0");
    Fail22745:
    { 
      IStrategoTerm x_4719 = null;
      IStrategoTerm y_4719 = null;
      IStrategoTerm z_4719 = null;
      IStrategoTerm a_4720 = null;
      IStrategoTerm b_4720 = null;
      IStrategoTerm c_4720 = null;
      IStrategoTerm d_4720 = null;
      IStrategoTerm e_4720 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22745;
      a_4720 = term.getSubterm(0);
      x_4719 = term.getSubterm(1);
      e_4720 = term;
      term = reorder_associativity_chain_0_0.instance.invoke(context, x_4719);
      if(term == null)
        break Fail22745;
      IStrategoTerm cons569 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      y_4719 = cons569;
      IStrategoTerm args22 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(args22.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args22).isEmpty())
        break Fail22745;
      b_4720 = ((IStrategoList)args22).head();
      IStrategoTerm arg7999 = ((IStrategoList)args22).tail();
      if(arg7999.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7999).isEmpty())
        break Fail22745;
      z_4719 = ((IStrategoList)arg7999).head();
      IStrategoTerm arg8000 = ((IStrategoList)arg7999).tail();
      if(arg8000.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8000).isEmpty())
        break Fail22745;
      term = termFactory.makeTuple(a_4720, b_4720);
      term = mk_defs_for_selection_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22745;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22745;
      c_4720 = term.getSubterm(0);
      d_4720 = term.getSubterm(1);
      term = e_4720;
      IStrategoTerm mkterm8;
      mkterm8 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{y_4719, (IStrategoTerm)termFactory.makeListCons(d_4720, termFactory.makeListCons(z_4719, (IStrategoList)trans.constNil4))});
      if(mkterm8 == null)
        break Fail22745;
      term = termFactory.makeTuple(c_4720, mkterm8);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}