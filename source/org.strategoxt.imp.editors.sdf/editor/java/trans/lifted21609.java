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

@SuppressWarnings("all") final class lifted21609 extends Strategy 
{ 
  TermReference u_92087;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76370:
    { 
      term = aux_$Project$Dir_0_1.instance.invoke(context, term, u_92087.value);
      if(term == null)
        break Fail76370;
      if(true)
        return term;
    }
    return null;
  }
}