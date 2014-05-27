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

@SuppressWarnings("all") public class new_$Declare$Cookie_0_2 extends Strategy 
{ 
  public static new_$Declare$Cookie_0_2 instance = new new_$Declare$Cookie_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_4331, IStrategoTerm p_4331)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("new_DeclareCookie_0_2");
    Fail22235:
    { 
      IStrategoTerm q_4331 = null;
      IStrategoTerm u_4331 = null;
      IStrategoTerm x_4331 = null;
      IStrategoTerm z_4331 = null;
      IStrategoTerm a_4332 = null;
      q_4331 = term;
      u_4331 = term;
      term = dr_label_scope_0_2.instance.invoke(context, u_4331, trans.const4358, o_4331);
      if(term == null)
        break Fail22235;
      term = termFactory.makeAppl(Main._consDR_UNDEFINE_1, new IStrategoTerm[]{p_4331});
      term = bagof_$Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22235;
      term = map_1_0.instance.invoke(context, term, lifted6813.instance);
      if(term == null)
        break Fail22235;
      z_4331 = term;
      x_4331 = trans.const4358;
      a_4332 = z_4331;
      term = termFactory.makeAppl(Main._consDR_UNDEFINE_1, new IStrategoTerm[]{p_4331});
      term = dr_undefine_rule_0_2.instance.invoke(context, a_4332, x_4331, term);
      if(term == null)
        break Fail22235;
      term = q_4331;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}