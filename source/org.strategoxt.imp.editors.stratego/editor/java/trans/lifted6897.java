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

@SuppressWarnings("all") final class lifted6897 extends Strategy 
{ 
  TermReference e_4802;

  TermReference g_4802;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24011:
    { 
      if(e_4802.value == null || g_4802.value == null)
        break Fail24011;
      term = termFactory.makeTuple(e_4802.value, termFactory.annotateTerm(g_4802.value, checkListAnnos(termFactory, trans.constNil4)));
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24011;
      if(true)
        return term;
    }
    return null;
  }
}