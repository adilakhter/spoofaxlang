package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21500 extends Strategy 
{ 
  TermReference n_92016;

  TermReference o_92016;

  Strategy y_92016;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail76531:
    { 
      IStrategoTerm t_92016 = null;
      IStrategoTerm u_92016 = null;
      IStrategoTerm g_92017 = null;
      IStrategoTerm h_92017 = null;
      IStrategoTerm j_92017 = null;
      IStrategoTerm k_92017 = null;
      IStrategoTerm l_92017 = null;
      t_92016 = term;
      if(n_92016.value == null)
        break Fail76531;
      term = n_92016.value;
      u_92016 = n_92016.value;
      j_92017 = term;
      g_92017 = trans.const15448;
      k_92017 = j_92017;
      h_92017 = trans.constCons7205;
      l_92017 = k_92017;
      term = termFactory.makeTuple(trans.const15449, u_92016);
      term = dr_set_rule_0_3.instance.invoke(context, l_92017, g_92017, h_92017, term);
      if(term == null)
        break Fail76531;
      term = t_92016;
      if(o_92016.value == null)
        break Fail76531;
      term = y_92016.invoke(context, o_92016.value);
      if(term == null)
        break Fail76531;
      if(true)
        return term;
    }
    return null;
  }
}