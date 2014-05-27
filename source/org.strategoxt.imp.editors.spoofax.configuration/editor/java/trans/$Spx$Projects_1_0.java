package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Spx$Projects_1_0 extends Strategy 
{ 
  public static $Spx$Projects_1_0 instance = new $Spx$Projects_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SpxProjects_1_0");
    Fail87752:
    { 
      IStrategoTerm x_17676 = null;
      IStrategoTerm w_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSpxProjects_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87752;
      w_17676 = term.getSubterm(0);
      IStrategoList annos2688 = term.getAnnotations();
      x_17676 = annos2688;
      term = q_17576.invoke(context, w_17676);
      if(term == null)
        break Fail87752;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consSpxProjects_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_17676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}