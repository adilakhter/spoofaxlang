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

@SuppressWarnings("all") public class resugar_$Let_0_0 extends Strategy 
{ 
  public static resugar_$Let_0_0 instance = new resugar_$Let_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("resugar_Let_0_0");
    Fail22812:
    { 
      IStrategoTerm b_4733 = null;
      IStrategoTerm c_4733 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22812;
      b_4733 = term.getSubterm(0);
      c_4733 = term.getSubterm(1);
      term = origin_term_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22812;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22812;
      term = termFactory.makeAppl(Main._consLet_2, new IStrategoTerm[]{b_4733, c_4733});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}