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

@SuppressWarnings("all") public class binding_violations_0_2 extends Strategy 
{ 
  public static binding_violations_0_2 instance = new binding_violations_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_4738, IStrategoTerm ref_u_4738)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_4738 = new TermReference(ref_t_4738);
    TermReference u_4738 = new TermReference(ref_u_4738);
    context.push("binding_violations_0_2");
    Fail22837:
    { 
      IStrategoTerm v_4738 = null;
      IStrategoTerm w_4738 = null;
      IStrategoTerm x_4738 = null;
      v_4738 = term;
      term = v_4738;
      lifted6779 lifted67790 = new lifted6779();
      lifted67790.t_4738 = t_4738;
      lifted67790.u_4738 = u_4738;
      term = filter_1_0.instance.invoke(context, term, lifted67790);
      if(term == null)
        break Fail22837;
      lifted6780 lifted67800 = new lifted6780();
      lifted67800.t_4738 = t_4738;
      lifted67800.u_4738 = u_4738;
      term = partition_1_0.instance.invoke(context, term, lifted67800);
      if(term == null)
        break Fail22837;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22837;
      w_4738 = term.getSubterm(0);
      x_4738 = term.getSubterm(1);
      term = make_set_0_0.instance.invoke(context, w_4738);
      if(term == null)
        break Fail22837;
      term = termFactory.makeTuple(term, x_4738);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}