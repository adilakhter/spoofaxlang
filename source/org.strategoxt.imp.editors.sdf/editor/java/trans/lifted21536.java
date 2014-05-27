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

@SuppressWarnings("all") final class lifted21536 extends Strategy 
{ 
  public static final lifted21536 instance = new lifted21536();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76428:
    { 
      term = alltd_1_0.instance.invoke(context, term, declare_globals_0_0.instance);
      if(term == null)
        break Fail76428;
      if(true)
        return term;
    }
    return null;
  }
}