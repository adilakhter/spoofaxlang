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

@SuppressWarnings("all") final class lifted21512 extends Strategy 
{ 
  public static final lifted21512 instance = new lifted21512();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76507:
    { 
      IStrategoList annos2354 = term.getAnnotations();
      term = SRTS_one.instance.invoke(context, annos2354, lifted21513.instance);
      if(term == null)
        break Fail76507;
      if(true)
        return term;
    }
    return null;
  }
}