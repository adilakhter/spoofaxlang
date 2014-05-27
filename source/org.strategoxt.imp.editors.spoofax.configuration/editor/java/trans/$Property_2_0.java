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

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4632, Strategy k_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail22924:
    { 
      IStrategoTerm z_4731 = null;
      IStrategoTerm x_4731 = null;
      IStrategoTerm y_4731 = null;
      IStrategoTerm a_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22924;
      x_4731 = term.getSubterm(0);
      y_4731 = term.getSubterm(1);
      IStrategoList annos701 = term.getAnnotations();
      z_4731 = annos701;
      term = j_4632.invoke(context, x_4731);
      if(term == null)
        break Fail22924;
      a_4732 = term;
      term = k_4632.invoke(context, y_4731);
      if(term == null)
        break Fail22924;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{a_4732, term}), checkListAnnos(termFactory, z_4731));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}