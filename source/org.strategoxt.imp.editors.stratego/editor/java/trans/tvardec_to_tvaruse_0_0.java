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

@SuppressWarnings("all") public class tvardec_to_tvaruse_0_0 extends Strategy 
{ 
  public static tvardec_to_tvaruse_0_0 instance = new tvardec_to_tvaruse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail21316:
    { 
      IStrategoTerm r_4173 = null;
      IStrategoTerm s_4173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21316;
      IStrategoTerm arg7641 = term.getSubterm(0);
      r_4173 = arg7641;
      IStrategoList annos674 = arg7641.getAnnotations();
      if(annos674.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos674).isEmpty())
        break Fail21316;
      s_4173 = ((IStrategoList)annos674).head();
      IStrategoTerm arg7642 = ((IStrategoList)annos674).tail();
      if(arg7642.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7642).isEmpty())
        break Fail21316;
      term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{termFactory.annotateTerm(r_4173, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(s_4173, (IStrategoList)trans.constNil3)))});
      if(true)
        return term;
    }
    context.push("tvardec_to_tvaruse_0_0");
    context.popOnFailure();
    return null;
  }
}