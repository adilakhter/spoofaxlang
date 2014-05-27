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

@SuppressWarnings("all") final class lifted6904 extends Strategy 
{ 
  public static final lifted6904 instance = new lifted6904();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24005:
    { 
      TermReference a_4803 = new TermReference();
      IStrategoTerm d_4803 = null;
      IStrategoTerm u_4803 = null;
      term = termFactory.makeTuple(term, trans.const4437);
      if(a_4803.value == null)
        a_4803.value = term;
      else
        if(a_4803.value != term && !a_4803.value.match(term))
          break Fail24005;
      lifted6905 lifted69050 = new lifted6905();
      lifted69050.a_4803 = a_4803;
      term = try_1_0.instance.invoke(context, term, lifted69050);
      if(term == null)
        break Fail24005;
      d_4803 = term;
      u_4803 = term;
      term = dr_undefine_rule_0_2.instance.invoke(context, u_4803, trans.const4568, a_4803.value);
      if(term == null)
        break Fail24005;
      term = d_4803;
      if(true)
        return term;
    }
    return null;
  }
}