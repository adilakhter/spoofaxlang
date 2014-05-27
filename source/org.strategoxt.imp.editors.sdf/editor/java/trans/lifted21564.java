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

@SuppressWarnings("all") final class lifted21564 extends Strategy 
{ 
  public static final lifted21564 instance = new lifted21564();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76416:
    { 
      term = unquoted_1_0.instance.invoke(context, term, lifted21565.instance);
      if(term == null)
        break Fail76416;
      if(true)
        return term;
    }
    return null;
  }
}