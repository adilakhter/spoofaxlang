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

@SuppressWarnings("all") final class lifted7002 extends Strategy 
{ 
  TermReference q_4845;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23899:
    { 
      term = aux_$Source$Dir_0_1.instance.invoke(context, term, q_4845.value);
      if(term == null)
        break Fail23899;
      if(true)
        return term;
    }
    return null;
  }
}