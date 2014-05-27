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
    Fail21315:
    { 
      IStrategoTerm p_4173 = null;
      IStrategoTerm q_4173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21315;
      IStrategoTerm arg7638 = term.getSubterm(0);
      p_4173 = arg7638;
      IStrategoList annos673 = arg7638.getAnnotations();
      if(annos673.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos673).isEmpty())
        break Fail21315;
      q_4173 = ((IStrategoList)annos673).head();
      IStrategoTerm arg7639 = ((IStrategoList)annos673).tail();
      if(arg7639.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7639).isEmpty())
        break Fail21315;
      term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{termFactory.annotateTerm(p_4173, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(q_4173, (IStrategoList)trans.constNil3)))}), trans.constNil3, trans.constNil3});
      if(true)
        return term;
    }
    context.push("svardec_to_svaruse_0_0");
    context.popOnFailure();
    return null;
  }
}