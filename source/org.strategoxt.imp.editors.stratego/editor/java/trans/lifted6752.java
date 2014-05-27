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

@SuppressWarnings("all") final class lifted6752 extends Strategy 
{ 
  public static final lifted6752 instance = new lifted6752();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24191:
    { 
      IStrategoTerm j_4731 = null;
      j_4731 = term;
      term = has_extension_0_1.instance.invoke(context, j_4731, trans.const4467);
      if(term == null)
        break Fail24191;
      if(true)
        return term;
    }
    return null;
  }
}