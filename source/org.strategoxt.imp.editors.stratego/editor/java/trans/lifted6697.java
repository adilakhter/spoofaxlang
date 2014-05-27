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

@SuppressWarnings("all") final class lifted6697 extends Strategy 
{ 
  TermReference l_4716;

  Strategy q_4716;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24236:
    { 
      IStrategoTerm o_4716 = null;
      IStrategoTerm p_4716 = null;
      o_4716 = term;
      term = q_4716.invoke(context, term);
      if(term == null)
        break Fail24236;
      term = o_4716;
      p_4716 = o_4716;
      term = origin_equal_0_1.instance.invoke(context, term, l_4716.value);
      if(term == null)
        break Fail24236;
      term = p_4716;
      if(true)
        return term;
    }
    return null;
  }
}