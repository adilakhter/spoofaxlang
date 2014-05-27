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

@SuppressWarnings("all") final class lifted7028 extends Strategy 
{ 
  TermReference c_4859;

  TermReference d_4859;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23873:
    { 
      term = aux_$No$Analysis_0_2.instance.invoke(context, term, c_4859.value, d_4859.value);
      if(term == null)
        break Fail23873;
      if(true)
        return term;
    }
    return null;
  }
}