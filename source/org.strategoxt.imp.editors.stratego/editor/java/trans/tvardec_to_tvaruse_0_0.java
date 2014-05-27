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
    Fail22792:
    { 
      IStrategoTerm j_4727 = null;
      IStrategoTerm k_4727 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22792;
      IStrategoTerm arg8108 = term.getSubterm(0);
      j_4727 = arg8108;
      IStrategoList annos702 = arg8108.getAnnotations();
      if(annos702.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos702).isEmpty())
        break Fail22792;
      k_4727 = ((IStrategoList)annos702).head();
      IStrategoTerm arg8109 = ((IStrategoList)annos702).tail();
      if(arg8109.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8109).isEmpty())
        break Fail22792;
      term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{termFactory.annotateTerm(j_4727, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(k_4727, (IStrategoList)trans.constNil4)))});
      if(true)
        return term;
    }
    context.push("tvardec_to_tvaruse_0_0");
    context.popOnFailure();
    return null;
  }
}