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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Debug_1_0");
    Fail22943:
    { 
      IStrategoTerm x_4732 = null;
      IStrategoTerm w_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDebug_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22943;
      w_4732 = term.getSubterm(0);
      IStrategoList annos708 = term.getAnnotations();
      x_4732 = annos708;
      term = s_4632.invoke(context, w_4732);
      if(term == null)
        break Fail22943;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDebug_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_4732));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}