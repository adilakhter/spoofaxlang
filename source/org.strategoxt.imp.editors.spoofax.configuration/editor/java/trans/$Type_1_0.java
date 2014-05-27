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

@SuppressWarnings("all") public class $Type_1_0 extends Strategy 
{ 
  public static $Type_1_0 instance = new $Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Type_1_0");
    Fail22925:
    { 
      IStrategoTerm d_4732 = null;
      IStrategoTerm c_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22925;
      c_4732 = term.getSubterm(0);
      IStrategoList annos702 = term.getAnnotations();
      d_4732 = annos702;
      term = l_4632.invoke(context, c_4732);
      if(term == null)
        break Fail22925;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_4732));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}