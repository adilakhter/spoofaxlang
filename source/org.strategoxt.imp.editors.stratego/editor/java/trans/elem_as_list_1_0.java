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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4721)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("elem_as_list_1_0");
    Fail22748:
    { 
      IStrategoTerm b_4721 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22748;
      b_4721 = ((IStrategoList)term).head();
      IStrategoTerm arg8001 = ((IStrategoList)term).tail();
      if(arg8001.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8001).isEmpty())
        break Fail22748;
      term = a_4721.invoke(context, b_4721);
      if(term == null)
        break Fail22748;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}