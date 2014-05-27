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

@SuppressWarnings("all") public class origin_track_forced_1_0 extends Strategy 
{ 
  public static origin_track_forced_1_0 instance = new origin_track_forced_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_92022)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_track_forced_1_0");
    Fail75696:
    { 
      IStrategoTerm z_92022 = null;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil11);
      term = SRTS_all.instance.invoke(context, term, w_92022);
      if(term == null)
        break Fail75696;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail75696;
      z_92022 = ((IStrategoList)term).head();
      IStrategoTerm arg25899 = ((IStrategoList)term).tail();
      if(arg25899.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25899).isEmpty())
        break Fail75696;
      term = z_92022;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}