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

@SuppressWarnings("all") final class lifted21517 extends Strategy 
{ 
  public static final lifted21517 instance = new lifted21517();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76504:
    { 
      IStrategoTerm i_92026 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._conscontext_free_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76504;
      i_92026 = term.getSubterm(0);
      term = i_92026;
      if(true)
        return term;
    }
    return null;
  }
}