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

@SuppressWarnings("all") final class lifted6910 extends Strategy 
{ 
  public static final lifted6910 instance = new lifted6910();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24007:
    { 
      IStrategoTerm e_4803 = null;
      IStrategoTerm f_4803 = null;
      IStrategoTerm g_4803 = null;
      IStrategoTerm a_4804 = null;
      IStrategoTerm c_4804 = null;
      IStrategoTerm d_4804 = null;
      f_4803 = term;
      term = $Outer$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24007;
      e_4803 = term;
      g_4803 = term;
      c_4804 = term;
      a_4804 = trans.const4568;
      d_4804 = c_4804;
      term = termFactory.makeTuple(trans.const4569, e_4803);
      term = dr_set_rule_0_3.instance.invoke(context, d_4804, a_4804, f_4803, term);
      if(term == null)
        break Fail24007;
      term = g_4803;
      if(true)
        return term;
    }
    return null;
  }
}