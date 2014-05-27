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

@SuppressWarnings("all") public class $Debug_1_0 extends Strategy 
{ 
  public static $Debug_1_0 instance = new $Debug_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Debug_1_0");
    Fail87751:
    { 
      IStrategoTerm u_17676 = null;
      IStrategoTerm t_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDebug_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87751;
      t_17676 = term.getSubterm(0);
      IStrategoList annos2687 = term.getAnnotations();
      u_17676 = annos2687;
      term = p_17576.invoke(context, t_17676);
      if(term == null)
        break Fail87751;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDebug_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_17676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}