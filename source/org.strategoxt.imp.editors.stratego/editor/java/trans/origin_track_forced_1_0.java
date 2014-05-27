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

@SuppressWarnings("all") public class origin_track_forced_1_0 extends Strategy 
{ 
  public static origin_track_forced_1_0 instance = new origin_track_forced_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4204)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_track_forced_1_0");
    Fail21476:
    { 
      IStrategoTerm o_4204 = null;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
      term = SRTS_all.instance.invoke(context, term, l_4204);
      if(term == null)
        break Fail21476;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail21476;
      o_4204 = ((IStrategoList)term).head();
      IStrategoTerm arg7694 = ((IStrategoList)term).tail();
      if(arg7694.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7694).isEmpty())
        break Fail21476;
      term = o_4204;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}