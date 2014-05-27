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

@SuppressWarnings("all") final class lifted6818 extends Strategy 
{ 
  TermReference r_4334;

  TermReference s_4334;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22336:
    { 
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, term, r_4334.value, s_4334.value);
      if(term == null)
        break Fail22336;
      if(true)
        return term;
    }
    return null;
  }
}