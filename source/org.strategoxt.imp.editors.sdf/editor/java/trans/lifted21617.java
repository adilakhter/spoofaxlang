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

@SuppressWarnings("all") final class lifted21617 extends Strategy 
{ 
  public static final lifted21617 instance = new lifted21617();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76362:
    { 
      IStrategoTerm a_92092 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76362;
      a_92092 = term.getSubterm(0);
      IStrategoTerm arg26210 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, a_92092, arg26210);
      if(term == null)
        break Fail76362;
      if(true)
        return term;
    }
    return null;
  }
}