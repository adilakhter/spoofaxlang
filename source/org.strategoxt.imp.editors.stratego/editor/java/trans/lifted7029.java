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

@SuppressWarnings("all") final class lifted7029 extends Strategy 
{ 
  TermReference k_4859;

  TermReference l_4859;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23872:
    { 
      term = aux_$No$Analysis_0_2.instance.invoke(context, term, k_4859.value, l_4859.value);
      if(term == null)
        break Fail23872;
      if(true)
        return term;
    }
    return null;
  }
}