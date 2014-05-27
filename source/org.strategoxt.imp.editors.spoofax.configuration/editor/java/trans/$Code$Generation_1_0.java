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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CodeGeneration_1_0");
    Fail22941:
    { 
      IStrategoTerm r_4732 = null;
      IStrategoTerm q_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCodeGeneration_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22941;
      q_4732 = term.getSubterm(0);
      IStrategoList annos706 = term.getAnnotations();
      r_4732 = annos706;
      term = q_4632.invoke(context, q_4732);
      if(term == null)
        break Fail22941;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCodeGeneration_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_4732));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}