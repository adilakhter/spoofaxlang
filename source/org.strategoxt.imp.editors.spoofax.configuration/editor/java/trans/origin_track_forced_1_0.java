package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class origin_track_forced_1_0 extends Strategy 
{ 
  public static origin_track_forced_1_0 instance = new origin_track_forced_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4626)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_track_forced_1_0");
    Fail22884:
    { 
      IStrategoTerm t_4626 = null;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4);
      term = SRTS_all.instance.invoke(context, term, q_4626);
      if(term == null)
        break Fail22884;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22884;
      t_4626 = ((IStrategoList)term).head();
      IStrategoTerm arg8030 = ((IStrategoList)term).tail();
      if(arg8030.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8030).isEmpty())
        break Fail22884;
      term = t_4626;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}