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

@SuppressWarnings("all") public class $Code$Generation_1_0 extends Strategy 
{ 
  public static $Code$Generation_1_0 instance = new $Code$Generation_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CodeGeneration_1_0");
    Fail87749:
    { 
      IStrategoTerm o_17676 = null;
      IStrategoTerm n_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCodeGeneration_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87749;
      n_17676 = term.getSubterm(0);
      IStrategoList annos2685 = term.getAnnotations();
      o_17676 = annos2685;
      term = n_17576.invoke(context, n_17676);
      if(term == null)
        break Fail87749;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCodeGeneration_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_17676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}