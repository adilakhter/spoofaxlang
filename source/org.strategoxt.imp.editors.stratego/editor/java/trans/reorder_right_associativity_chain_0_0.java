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

@SuppressWarnings("all") public class reorder_right_associativity_chain_0_0 extends Strategy 
{ 
  public static reorder_right_associativity_chain_0_0 instance = new reorder_right_associativity_chain_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("reorder_right_associativity_chain_0_0");
    Fail22756:
    { 
      IStrategoTerm a_4722 = null;
      IStrategoTerm b_4722 = null;
      IStrategoTerm c_4722 = null;
      IStrategoTerm d_4722 = null;
      IStrategoTerm e_4722 = null;
      c_4722 = term;
      IStrategoTerm cons570 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      b_4722 = cons570;
      IStrategoTerm args23 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(args23.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args23).isEmpty())
        break Fail22756;
      IStrategoTerm arg8002 = ((IStrategoList)args23).tail();
      if(arg8002.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8002).isEmpty())
        break Fail22756;
      IStrategoTerm arg8003 = ((IStrategoList)arg8002).tail();
      if(arg8003.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8003).isEmpty())
        break Fail22756;
      e_4722 = term;
      term = break_right_associativity_chain_0_1.instance.invoke(context, c_4722, b_4722);
      if(term == null)
        break Fail22756;
      a_4722 = term;
      term = broken_child_in_right_associativity_chain_0_1.instance.invoke(context, c_4722, b_4722);
      if(term == null)
        break Fail22756;
      d_4722 = term;
      term = termFactory.makeTuple(c_4722, term);
      term = check_brackets_tail_term_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22756;
      term = e_4722;
      IStrategoTerm mkterm9;
      mkterm9 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{b_4722, (IStrategoTerm)termFactory.makeListCons(a_4722, termFactory.makeListCons(d_4722, (IStrategoList)trans.constNil4))});
      if(mkterm9 == null)
        break Fail22756;
      term = mkterm9;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}