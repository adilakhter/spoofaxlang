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

@SuppressWarnings("all") public class elem_of_0_1 extends Strategy 
{ 
  public static elem_of_0_1 instance = new elem_of_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_4735)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("elem_of_0_1");
    Fail22821:
    { 
      IStrategoTerm m_4735 = null;
      m_4735 = term;
      term = termFactory.makeTuple(m_4735, l_4735);
      term = elem_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22821;
      term = m_4735;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}