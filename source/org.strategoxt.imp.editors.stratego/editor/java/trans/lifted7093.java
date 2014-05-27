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

@SuppressWarnings("all") final class lifted7093 extends Strategy 
{ 
  TermReference m_4889;

  TermReference n_4889;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23808:
    { 
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, term, m_4889.value, n_4889.value);
      if(term == null)
        break Fail23808;
      if(true)
        return term;
    }
    return null;
  }
}