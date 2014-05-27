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

@SuppressWarnings("all") public class apply_rename_0_2 extends Strategy 
{ 
  public static apply_rename_0_2 instance = new apply_rename_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_4741, IStrategoTerm q_4741)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail22852:
    { 
      IStrategoTerm r_4741 = null;
      if(term != p_4741 && !p_4741.match(term))
        break Fail22852;
      term = p_4741;
      IStrategoList annos703 = term.getAnnotations();
      if(annos703.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos703).isEmpty())
        break Fail22852;
      r_4741 = ((IStrategoList)annos703).head();
      IStrategoTerm arg8129 = ((IStrategoList)annos703).tail();
      if(arg8129.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8129).isEmpty())
        break Fail22852;
      term = termFactory.annotateTerm(q_4741, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(r_4741, (IStrategoList)trans.constNil4)));
      if(true)
        return term;
    }
    context.push("apply_rename_0_2");
    context.popOnFailure();
    return null;
  }
}