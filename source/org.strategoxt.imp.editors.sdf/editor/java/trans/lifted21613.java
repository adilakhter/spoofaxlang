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

@SuppressWarnings("all") final class lifted21613 extends Strategy 
{ 
  TermReference b_92089;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76366:
    { 
      term = aux_$Project$Dir_0_1.instance.invoke(context, term, b_92089.value);
      if(term == null)
        break Fail76366;
      if(true)
        return term;
    }
    return null;
  }
}