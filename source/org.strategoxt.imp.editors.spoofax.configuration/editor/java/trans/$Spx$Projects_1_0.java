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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SpxProjects_1_0");
    Fail22944:
    { 
      IStrategoTerm a_4733 = null;
      IStrategoTerm z_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSpxProjects_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22944;
      z_4732 = term.getSubterm(0);
      IStrategoList annos709 = term.getAnnotations();
      a_4733 = annos709;
      term = t_4632.invoke(context, z_4732);
      if(term == null)
        break Fail22944;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consSpxProjects_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_4733));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}