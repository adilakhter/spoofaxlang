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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Includes_1_0");
    Fail22945:
    { 
      IStrategoTerm d_4733 = null;
      IStrategoTerm c_4733 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consIncludes_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22945;
      c_4733 = term.getSubterm(0);
      IStrategoList annos710 = term.getAnnotations();
      d_4733 = annos710;
      term = u_4632.invoke(context, c_4733);
      if(term == null)
        break Fail22945;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consIncludes_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_4733));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}