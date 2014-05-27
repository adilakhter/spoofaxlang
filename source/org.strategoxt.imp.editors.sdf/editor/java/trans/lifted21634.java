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

@SuppressWarnings("all") final class lifted21634 extends Strategy 
{ 
  public static final lifted21634 instance = new lifted21634();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76345:
    { 
      IStrategoTerm i_92100 = null;
      IStrategoTerm q_92100 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76345;
      q_92100 = term.getSubterm(0);
      IStrategoTerm arg26218 = term.getSubterm(1);
      i_92100 = arg26218;
      term = aux_$Declaration$File_0_2.instance.invoke(context, q_92100, arg26218, i_92100);
      if(term == null)
        break Fail76345;
      if(true)
        return term;
    }
    return null;
  }
}