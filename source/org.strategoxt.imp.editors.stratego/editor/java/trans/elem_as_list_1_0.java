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

@SuppressWarnings("all") public class elem_as_list_1_0 extends Strategy 
{ 
  public static elem_as_list_1_0 instance = new elem_as_list_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4167)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("elem_as_list_1_0");
    Fail21272:
    { 
      IStrategoTerm j_4167 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail21272;
      j_4167 = ((IStrategoList)term).head();
      IStrategoTerm arg7534 = ((IStrategoList)term).tail();
      if(arg7534.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7534).isEmpty())
        break Fail21272;
      term = i_4167.invoke(context, j_4167);
      if(term == null)
        break Fail21272;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}