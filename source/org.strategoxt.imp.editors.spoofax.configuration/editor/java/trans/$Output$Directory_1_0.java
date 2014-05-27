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

@SuppressWarnings("all") public class $Output$Directory_1_0 extends Strategy 
{ 
  public static $Output$Directory_1_0 instance = new $Output$Directory_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OutputDirectory_1_0");
    Fail87739:
    { 
      IStrategoTerm g_17676 = null;
      IStrategoTerm f_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consOutputDirectory_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87739;
      f_17676 = term.getSubterm(0);
      IStrategoList annos2683 = term.getAnnotations();
      g_17676 = annos2683;
      term = k_17576.invoke(context, f_17676);
      if(term == null)
        break Fail87739;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consOutputDirectory_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_17676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}