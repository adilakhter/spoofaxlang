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

@SuppressWarnings("all") final class lifted6817 extends Strategy 
{ 
  Strategy o_4758;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24087:
    { 
      lifted6818 lifted68180 = new lifted6818();
      lifted68180.o_4758 = o_4758;
      term = repeat_1_0.instance.invoke(context, term, lifted68180);
      if(term == null)
        break Fail24087;
      if(true)
        return term;
    }
    return null;
  }
}