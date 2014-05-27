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

@SuppressWarnings("all") final class lifted6788 extends Strategy 
{ 
  TermReference w_4740;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24143:
    { 
      term = apply_rename_0_1.instance.invoke(context, term, w_4740.value);
      if(term == null)
        break Fail24143;
      if(true)
        return term;
    }
    return null;
  }
}