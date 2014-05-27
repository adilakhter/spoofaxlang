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

@SuppressWarnings("all") final class lifted21533 extends Strategy 
{ 
  public static final lifted21533 instance = new lifted21533();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76430:
    { 
      IStrategoTerm l_92047 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._conssymbol_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76430;
      l_92047 = term.getSubterm(1);
      term = declare_simple_global_0_0.instance.invoke(context, l_92047);
      if(term == null)
        break Fail76430;
      if(true)
        return term;
    }
    return null;
  }
}