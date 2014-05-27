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

@SuppressWarnings("all") final class lifted21602 extends Strategy 
{ 
  TermReference h_92084;

  TermReference i_92084;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76377:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, h_92084.value, i_92084.value);
      if(term == null)
        break Fail76377;
      if(true)
        return term;
    }
    return null;
  }
}