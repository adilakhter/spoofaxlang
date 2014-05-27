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

@SuppressWarnings("all") public class $Entity_2_0 extends Strategy 
{ 
  public static $Entity_2_0 instance = new $Entity_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_92075, Strategy z_92075)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail76100:
    { 
      IStrategoTerm c_92265 = null;
      IStrategoTerm a_92265 = null;
      IStrategoTerm b_92265 = null;
      IStrategoTerm d_92265 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76100;
      a_92265 = term.getSubterm(0);
      b_92265 = term.getSubterm(1);
      IStrategoList annos2358 = term.getAnnotations();
      c_92265 = annos2358;
      term = y_92075.invoke(context, a_92265);
      if(term == null)
        break Fail76100;
      d_92265 = term;
      term = z_92075.invoke(context, b_92265);
      if(term == null)
        break Fail76100;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{d_92265, term}), checkListAnnos(termFactory, c_92265));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}