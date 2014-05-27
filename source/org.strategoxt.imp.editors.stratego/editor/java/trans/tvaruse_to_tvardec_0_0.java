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

@SuppressWarnings("all") public class tvaruse_to_tvardec_0_0 extends Strategy 
{ 
  public static tvaruse_to_tvardec_0_0 instance = new tvaruse_to_tvardec_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail21294:
    { 
      IStrategoTerm f_4170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21294;
      f_4170 = term.getSubterm(0);
      term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{f_4170, trans.constConstType0});
      if(true)
        return term;
    }
    context.push("tvaruse_to_tvardec_0_0");
    context.popOnFailure();
    return null;
  }
}