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

@SuppressWarnings("all") final class lifted6888 extends Strategy 
{ 
  TermReference o_4800;

  TermReference n_4800;

  TermReference p_4800;

  TermReference q_4800;

  TermReference r_4800;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24018:
    { 
      IStrategoTerm v_4800 = null;
      IStrategoTerm w_4800 = null;
      w_4800 = term;
      if(o_4800.value == null)
        break Fail24018;
      term = redeclare_definition_0_0.instance.invoke(context, o_4800.value);
      if(term == null)
        break Fail24018;
      v_4800 = term;
      term = w_4800;
      if(n_4800.value == null)
        break Fail24018;
      term = termFactory.annotateTerm(n_4800.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(v_4800, (IStrategoList)trans.constNil4)));
      if(p_4800.value == null)
        p_4800.value = term;
      else
        if(p_4800.value != term && !p_4800.value.match(term))
          break Fail24018;
      if(q_4800.value == null)
        break Fail24018;
      term = declare_bodies_top_0_0.instance.invoke(context, q_4800.value);
      if(term == null)
        break Fail24018;
      if(r_4800.value == null)
        r_4800.value = term;
      else
        if(r_4800.value != term && !r_4800.value.match(term))
          break Fail24018;
      if(true)
        return term;
    }
    return null;
  }
}