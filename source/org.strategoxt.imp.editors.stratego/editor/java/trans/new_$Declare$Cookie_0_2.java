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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_4885, IStrategoTerm h_4885)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("new_DeclareCookie_0_2");
    Fail23711:
    { 
      IStrategoTerm i_4885 = null;
      IStrategoTerm m_4885 = null;
      IStrategoTerm p_4885 = null;
      IStrategoTerm r_4885 = null;
      IStrategoTerm s_4885 = null;
      i_4885 = term;
      m_4885 = term;
      term = dr_label_scope_0_2.instance.invoke(context, m_4885, trans.const4568, g_4885);
      if(term == null)
        break Fail23711;
      term = termFactory.makeAppl(Main._consDR_UNDEFINE_1, new IStrategoTerm[]{h_4885});
      term = bagof_$Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23711;
      term = map_1_0.instance.invoke(context, term, lifted7084.instance);
      if(term == null)
        break Fail23711;
      r_4885 = term;
      p_4885 = trans.const4568;
      s_4885 = r_4885;
      term = termFactory.makeAppl(Main._consDR_UNDEFINE_1, new IStrategoTerm[]{h_4885});
      term = dr_undefine_rule_0_2.instance.invoke(context, s_4885, p_4885, term);
      if(term == null)
        break Fail23711;
      term = i_4885;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}