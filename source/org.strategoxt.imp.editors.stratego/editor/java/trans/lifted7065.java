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

@SuppressWarnings("all") final class lifted7065 extends Strategy 
{ 
  TermReference e_4876;

  TermReference d_4876;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23836:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, e_4876.value, d_4876.value);
      if(term == null)
        break Fail23836;
      if(true)
        return term;
    }
    return null;
  }
}