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

@SuppressWarnings("all") final class lifted6818 extends Strategy 
{ 
  Strategy o_4758;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24088:
    { 
      lifted6819 lifted68190 = new lifted6819();
      lifted68190.o_4758 = o_4758;
      term = preserve_annos_1_0.instance.invoke(context, term, lifted68190);
      if(term == null)
        break Fail24088;
      if(true)
        return term;
    }
    return null;
  }
}