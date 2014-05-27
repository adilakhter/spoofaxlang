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

@SuppressWarnings("all") public class svaruse_to_svardec_0_0 extends Strategy 
{ 
  public static svaruse_to_svardec_0_0 instance = new svaruse_to_svardec_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail21293:
    { 
      IStrategoTerm e_4170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21293;
      IStrategoTerm arg7560 = term.getSubterm(0);
      if(arg7560.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7560).getConstructor())
        break Fail21293;
      e_4170 = arg7560.getSubterm(0);
      term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{e_4170, trans.constConstType0});
      if(true)
        return term;
    }
    context.push("svaruse_to_svardec_0_0");
    context.popOnFailure();
    return null;
  }
}