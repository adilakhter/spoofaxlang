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

@SuppressWarnings("all") final class lifted7064 extends Strategy 
{ 
  TermReference l_4876;

  TermReference m_4876;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23837:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, l_4876.value, m_4876.value);
      if(term == null)
        break Fail23837;
      if(true)
        return term;
    }
    return null;
  }
}