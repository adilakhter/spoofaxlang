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

@SuppressWarnings("all") final class lifted7111 extends Strategy 
{ 
  TermReference w_4897;

  TermReference x_4897;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23790:
    { 
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, term, w_4897.value, x_4897.value);
      if(term == null)
        break Fail23790;
      if(true)
        return term;
    }
    return null;
  }
}