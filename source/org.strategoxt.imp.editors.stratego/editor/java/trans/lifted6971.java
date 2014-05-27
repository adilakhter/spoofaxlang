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

@SuppressWarnings("all") final class lifted6971 extends Strategy 
{ 
  TermReference s_4831;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23930:
    { 
      term = aux_$Project$Dir_0_1.instance.invoke(context, term, s_4831.value);
      if(term == null)
        break Fail23930;
      if(true)
        return term;
    }
    return null;
  }
}