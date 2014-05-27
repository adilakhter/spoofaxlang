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

@SuppressWarnings("all") public class $Includes_1_0 extends Strategy 
{ 
  public static $Includes_1_0 instance = new $Includes_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Includes_1_0");
    Fail87753:
    { 
      IStrategoTerm a_17677 = null;
      IStrategoTerm z_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consIncludes_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87753;
      z_17676 = term.getSubterm(0);
      IStrategoList annos2689 = term.getAnnotations();
      a_17677 = annos2689;
      term = r_17576.invoke(context, z_17676);
      if(term == null)
        break Fail87753;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consIncludes_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_17677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}