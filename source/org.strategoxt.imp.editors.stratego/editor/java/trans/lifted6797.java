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

@SuppressWarnings("all") final class lifted6797 extends Strategy 
{ 
  TermReference c_4746;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24119:
    { 
      lifted6798 lifted67980 = new lifted6798();
      lifted67980.c_4746 = c_4746;
      term = oncetd_1_0.instance.invoke(context, term, lifted67980);
      if(term == null)
        break Fail24119;
      if(true)
        return term;
    }
    return null;
  }
}