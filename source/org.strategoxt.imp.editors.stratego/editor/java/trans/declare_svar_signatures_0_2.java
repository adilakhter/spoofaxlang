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

@SuppressWarnings("all") public class declare_svar_signatures_0_2 extends Strategy 
{ 
  public static declare_svar_signatures_0_2 instance = new declare_svar_signatures_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_4251, IStrategoTerm s_4251)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_svar_signatures_0_2");
    Fail21726:
    { 
      IStrategoTerm t_4251 = null;
      IStrategoTerm w_4251 = null;
      IStrategoTerm y_4251 = null;
      IStrategoTerm z_4251 = null;
      t_4251 = term;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21726;
      if(term.getSubterm(0) != s_4251 && !s_4251.match(term.getSubterm(0)))
        break Fail21726;
      y_4251 = term;
      w_4251 = trans.const4358;
      z_4251 = y_4251;
      term = termFactory.makeTuple(trans.const4359, r_4251);
      term = dr_set_rule_0_3.instance.invoke(context, z_4251, w_4251, t_4251, term);
      if(term == null)
        break Fail21726;
      term = t_4251;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}