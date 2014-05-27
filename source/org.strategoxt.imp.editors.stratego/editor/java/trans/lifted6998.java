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

@SuppressWarnings("all") final class lifted6998 extends Strategy 
{ 
  TermReference j_4844;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23903:
    { 
      term = aux_$Source$Dir_0_1.instance.invoke(context, term, j_4844.value);
      if(term == null)
        break Fail23903;
      if(true)
        return term;
    }
    return null;
  }
}