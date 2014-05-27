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

@SuppressWarnings("all") final class lifted7100 extends Strategy 
{ 
  TermReference e_4893;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23801:
    { 
      term = aux_$Content$Proposals_0_1.instance.invoke(context, term, e_4893.value);
      if(term == null)
        break Fail23801;
      if(true)
        return term;
    }
    return null;
  }
}