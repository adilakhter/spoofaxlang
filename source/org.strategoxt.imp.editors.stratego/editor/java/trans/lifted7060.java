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

@SuppressWarnings("all") final class lifted7060 extends Strategy 
{ 
  TermReference i_4875;

  TermReference j_4875;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23841:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, i_4875.value, j_4875.value);
      if(term == null)
        break Fail23841;
      if(true)
        return term;
    }
    return null;
  }
}