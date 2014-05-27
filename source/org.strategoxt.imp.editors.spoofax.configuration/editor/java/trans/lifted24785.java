package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24785 extends Strategy 
{ 
  TermReference c_17585;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87847:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, c_17585.value);
      if(term == null)
        break Fail87847;
      if(true)
        return term;
    }
    return null;
  }
}