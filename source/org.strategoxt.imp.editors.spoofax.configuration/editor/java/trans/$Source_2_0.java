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

@SuppressWarnings("all") public class $Source_2_0 extends Strategy 
{ 
  public static $Source_2_0 instance = new $Source_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4632, Strategy p_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Source_2_0");
    Fail22940:
    { 
      IStrategoTerm n_4732 = null;
      IStrategoTerm l_4732 = null;
      IStrategoTerm m_4732 = null;
      IStrategoTerm o_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSource_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22940;
      l_4732 = term.getSubterm(0);
      m_4732 = term.getSubterm(1);
      IStrategoList annos705 = term.getAnnotations();
      n_4732 = annos705;
      term = o_4632.invoke(context, l_4732);
      if(term == null)
        break Fail22940;
      o_4732 = term;
      term = p_4632.invoke(context, m_4732);
      if(term == null)
        break Fail22940;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consSource_2, new IStrategoTerm[]{o_4732, term}), checkListAnnos(termFactory, n_4732));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}