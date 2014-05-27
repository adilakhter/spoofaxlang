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

@SuppressWarnings("all") final class lifted21563 extends Strategy 
{ 
  public static final lifted21563 instance = new lifted21563();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76411:
    { 
      term = appl_2_0.instance.invoke(context, term, lifted21564.instance, lifted21566.instance);
      if(term == null)
        break Fail76411;
      if(true)
        return term;
    }
    return null;
  }
}