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

@SuppressWarnings("all") final class lifted6829 extends Strategy 
{ 
  TermReference m_4339;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22325:
    { 
      term = aux_$Content$Proposals_0_1.instance.invoke(context, term, m_4339.value);
      if(term == null)
        break Fail22325;
      if(true)
        return term;
    }
    return null;
  }
}