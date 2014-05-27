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

@SuppressWarnings("all") public class svardec_to_svaruse_0_0 extends Strategy 
{ 
  public static svardec_to_svaruse_0_0 instance = new svardec_to_svaruse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail22791:
    { 
      IStrategoTerm h_4727 = null;
      IStrategoTerm i_4727 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22791;
      IStrategoTerm arg8105 = term.getSubterm(0);
      h_4727 = arg8105;
      IStrategoList annos701 = arg8105.getAnnotations();
      if(annos701.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos701).isEmpty())
        break Fail22791;
      i_4727 = ((IStrategoList)annos701).head();
      IStrategoTerm arg8106 = ((IStrategoList)annos701).tail();
      if(arg8106.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8106).isEmpty())
        break Fail22791;
      term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{termFactory.annotateTerm(h_4727, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(i_4727, (IStrategoList)trans.constNil4)))}), trans.constNil4, trans.constNil4});
      if(true)
        return term;
    }
    context.push("svardec_to_svaruse_0_0");
    context.popOnFailure();
    return null;
  }
}