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

@SuppressWarnings("all") final class lifted21522 extends Strategy 
{ 
  TermReference c_92030;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76499:
    { 
      lifted21523 lifted215230 = new lifted21523();
      lifted215230.c_92030 = c_92030;
      term = getfirst_1_0.instance.invoke(context, term, lifted215230);
      if(term == null)
        break Fail76499;
      if(true)
        return term;
    }
    return null;
  }
}